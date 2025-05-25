// src/com/spareparts/dao/OrderDAOImpl.java
package com.spareparts.dao;

import com.spareparts.model.Order;
import com.spareparts.model.OrderDetail;
import com.spareparts.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class OrderDAOImpl implements OrderDAO {
    @Override
    public List<Order> getAllOrders() throws SQLException {
        List<Order> orders = new ArrayList<>();
        String sql = "SELECT o.OrderID, o.CustomerID, c.CustomerName, o.OrderDate, o.TotalAmount, o.Discount " +
                     "FROM orders o JOIN customerdetails c ON o.CustomerID = c.CustomerID";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Order order = new Order();
                order.setOrderID(rs.getInt("OrderID"));
                order.setCustomerID(rs.getInt("CustomerID"));
                order.setCustomerName(rs.getString("CustomerName"));
                order.setOrderDate(rs.getDate("OrderDate"));
                order.setTotalAmount(rs.getDouble("TotalAmount"));
                order.setDiscount(rs.getDouble("Discount"));
                orders.add(order);
            }
        }
        return orders;
    }

    @Override
    public Order getOrderById(int orderId) throws SQLException {
        String sql = "SELECT o.OrderID, o.CustomerID, c.CustomerName, o.OrderDate, o.TotalAmount, o.Discount " +
                     "FROM orders o JOIN customerdetails c ON o.CustomerID = c.CustomerID WHERE o.OrderID = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, orderId);
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    Order order = new Order();
                    order.setOrderID(rs.getInt("OrderID"));
                    order.setCustomerID(rs.getInt("CustomerID"));
                    order.setCustomerName(rs.getString("CustomerName"));
                    order.setOrderDate(rs.getDate("OrderDate"));
                    order.setTotalAmount(rs.getDouble("TotalAmount"));
                    order.setDiscount(rs.getDouble("Discount"));
                    return order;
                }
            }
        }
        return null;
    }

    @Override
    public List<OrderDetail> getOrderDetails(int orderId) throws SQLException {
        List<OrderDetail> details = new ArrayList<>();
        String sql = "SELECT OrderDetailID, OrderID, ItemID, Quantity, UnitPrice FROM orderdetails WHERE OrderID = ?";
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, orderId);
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    OrderDetail detail = new OrderDetail();
                    detail.setOrderDetailID(rs.getInt("OrderDetailID"));
                    detail.setOrderID(rs.getInt("OrderID"));
                    detail.setItemID(rs.getInt("ItemID"));
                    detail.setQuantity(rs.getInt("Quantity"));
                    detail.setUnitPrice(rs.getDouble("UnitPrice"));
                    details.add(detail);
                }
            }
        }
        return details;
    }

    @Override
    public void createOrder(Order order, List<OrderDetail> orderDetails) throws SQLException {
        Connection conn = null;
        PreparedStatement orderStmt = null;
        PreparedStatement detailStmt = null;
        ResultSet generatedKeys = null;

        try {
            conn = DBConnection.getConnection();
            conn.setAutoCommit(false);

            String orderSql = "INSERT INTO orders (CustomerID, TotalAmount, Discount) VALUES (?, ?, ?)";
            orderStmt = conn.prepareStatement(orderSql, Statement.RETURN_GENERATED_KEYS);
            orderStmt.setInt(1, order.getCustomerID());
            orderStmt.setDouble(2, order.getTotalAmount());
            orderStmt.setDouble(3, order.getDiscount());
            orderStmt.executeUpdate();

            generatedKeys = orderStmt.getGeneratedKeys();
            if (generatedKeys.next()) {
                order.setOrderID(generatedKeys.getInt(1));
            }

            String detailSql = "INSERT INTO orderdetails (OrderID, ItemID, Quantity, UnitPrice) VALUES (?, ?, ?, ?)";
            detailStmt = conn.prepareStatement(detailSql);
            for (OrderDetail detail : orderDetails) {
                detailStmt.setInt(1, order.getOrderID());
                detailStmt.setInt(2, detail.getItemID());
                detailStmt.setInt(3, detail.getQuantity());
                detailStmt.setDouble(4, detail.getUnitPrice());
                detailStmt.executeUpdate();
            }

            conn.commit();
        } catch (SQLException e) {
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            throw e;
        } finally {
            if (generatedKeys != null) generatedKeys.close();
            if (detailStmt != null) detailStmt.close();
            if (orderStmt != null) orderStmt.close();
            if (conn != null) {
                conn.setAutoCommit(true);
                conn.close();
            }
        }
    }

    @Override
    public void updateOrder(Order order, List<OrderDetail> orderDetails) throws SQLException {
        Connection conn = null;
        PreparedStatement orderStmt = null;
        PreparedStatement deleteStmt = null;
        PreparedStatement detailStmt = null;

        try {
            conn = DBConnection.getConnection();
            conn.setAutoCommit(false);

            String orderSql = "UPDATE orders SET CustomerID = ?, TotalAmount = ?, Discount = ? WHERE OrderID = ?";
            orderStmt = conn.prepareStatement(orderSql);
            orderStmt.setInt(1, order.getCustomerID());
            orderStmt.setDouble(2, order.getTotalAmount());
            orderStmt.setDouble(3, order.getDiscount());
            orderStmt.setInt(4, order.getOrderID());
            orderStmt.executeUpdate();

            String deleteSql = "DELETE FROM orderdetails WHERE OrderID = ?";
            deleteStmt = conn.prepareStatement(deleteSql);
            deleteStmt.setInt(1, order.getOrderID());
            deleteStmt.executeUpdate();

            String detailSql = "INSERT INTO orderdetails (OrderID, ItemID, Quantity, UnitPrice) VALUES (?, ?, ?, ?)";
            detailStmt = conn.prepareStatement(detailSql);
            for (OrderDetail detail : orderDetails) {
                detailStmt.setInt(1, order.getOrderID());
                detailStmt.setInt(2, detail.getItemID());
                detailStmt.setInt(3, detail.getQuantity());
                detailStmt.setDouble(4, detail.getUnitPrice());
                detailStmt.executeUpdate();
            }

            conn.commit();
        } catch (SQLException e) {
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            throw e;
        } finally {
            if (detailStmt != null) detailStmt.close();
            if (deleteStmt != null) deleteStmt.close();
            if (orderStmt != null) orderStmt.close();
            if (conn != null) {
                conn.setAutoCommit(true);
                conn.close();
            }
        }
    }

    @Override
    public void deleteOrder(int orderId) throws SQLException {
        Connection conn = null;
        PreparedStatement deleteDetailsStmt = null;
        PreparedStatement deleteOrderStmt = null;

        try {
            conn = DBConnection.getConnection();
            conn.setAutoCommit(false);

            String deleteDetailsSql = "DELETE FROM orderdetails WHERE OrderID = ?";
            deleteDetailsStmt = conn.prepareStatement(deleteDetailsSql);
            deleteDetailsStmt.setInt(1, orderId);
            deleteDetailsStmt.executeUpdate();

            String deleteOrderSql = "DELETE FROM orders WHERE OrderID = ?";
            deleteOrderStmt = conn.prepareStatement(deleteOrderSql);
            deleteOrderStmt.setInt(1, orderId);
            deleteOrderStmt.executeUpdate();

            conn.commit();
        } catch (SQLException e) {
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
            throw e;
        } finally {
            if (deleteDetailsStmt != null) deleteDetailsStmt.close();
            if (deleteOrderStmt != null) deleteOrderStmt.close();
            if (conn != null) {
                conn.setAutoCommit(true);
                conn.close();
            }
        }
    }
}