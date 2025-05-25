// src/com/spareparts/dao/OrderDAO.java
package com.spareparts.dao;

import com.spareparts.model.Order;
import com.spareparts.model.OrderDetail;

import java.sql.SQLException;
import java.util.List;

public interface OrderDAO {
    List<Order> getAllOrders() throws SQLException;
    Order getOrderById(int orderId) throws SQLException;
    List<OrderDetail> getOrderDetails(int orderId) throws SQLException;
    void createOrder(Order order, List<OrderDetail> orderDetails) throws SQLException;
    void updateOrder(Order order, List<OrderDetail> orderDetails) throws SQLException;
    void deleteOrder(int orderId) throws SQLException;
}

