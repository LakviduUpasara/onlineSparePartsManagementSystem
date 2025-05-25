// src/com/spareparts/controller/OrderController.java
package com.spareparts.controller;

import com.spareparts.dao.ItemDAO;
import com.spareparts.dao.OrderDAO;
import com.spareparts.model.Item;
import com.spareparts.model.Order;
import com.spareparts.model.OrderDetail;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;
import java.util.List;

public class OrderController {
    private final OrderDAO orderDAO;
    private final ItemDAO itemDAO;

    public OrderController(OrderDAO orderDAO, ItemDAO itemDAO) {
        this.orderDAO = orderDAO;
        this.itemDAO = itemDAO;
    }

    public List<Order> getAllOrders() throws SQLException {
        return orderDAO.getAllOrders();
    }

    public Order getOrderById(int orderId) throws SQLException {
        return orderDAO.getOrderById(orderId);
    }

    public List<OrderDetail> getOrderDetails(int orderId) throws SQLException {
        return orderDAO.getOrderDetails(orderId);
    }

    public boolean createOrder(int customerId, List<OrderDetail> orderDetails, double discount, HttpServletRequest request) throws SQLException {
        Order order = new Order();
        order.setCustomerID(customerId);
        order.setDiscount(discount);

        double totalAmount = 0;
        for (OrderDetail detail : orderDetails) {
            Item item = itemDAO.getItemById(detail.getItemID());
            if (item == null) {
                request.setAttribute("error", "Item ID " + detail.getItemID() + " not found.");
                return false;
            }
            if (detail.getQuantity() > item.getQty()) {
                request.setAttribute("error", "Insufficient stock for " + item.getItemName() + ". Available: " + item.getQty());
                return false;
            }
            detail.setUnitPrice(item.getSellPrice());
            totalAmount += detail.getQuantity() * item.getSellPrice();
        }
        totalAmount -= (totalAmount * discount / 100);
        order.setTotalAmount(totalAmount);

        orderDAO.createOrder(order, orderDetails);

        for (OrderDetail detail : orderDetails) {
            Item item = itemDAO.getItemById(detail.getItemID());
            item.setQty(item.getQty() - detail.getQuantity());
            itemDAO.updateItem(item);
        }

        return true;
    }

    public boolean updateOrder(int orderId, int customerId, List<OrderDetail> orderDetails, double discount, HttpServletRequest request) throws SQLException {
        Order order = orderDAO.getOrderById(orderId);
        if (order == null) {
            request.setAttribute("error", "Order ID " + orderId + " not found.");
            return false;
        }

        List<OrderDetail> oldDetails = orderDAO.getOrderDetails(orderId);
        for (OrderDetail oldDetail : oldDetails) {
            Item item = itemDAO.getItemById(oldDetail.getItemID());
            item.setQty(item.getQty() + oldDetail.getQuantity());
            itemDAO.updateItem(item);
        }

        order.setCustomerID(customerId);
        order.setDiscount(discount);

        double totalAmount = 0;
        for (OrderDetail detail : orderDetails) {
            Item item = itemDAO.getItemById(detail.getItemID());
            if (item == null) {
                request.setAttribute("error", "Item ID " + detail.getItemID() + " not found.");
                return false;
            }
            if (detail.getQuantity() > item.getQty()) {
                request.setAttribute("error", "Insufficient stock for " + item.getItemName() + ". Available: " + item.getQty());
                return false;
            }
            detail.setUnitPrice(item.getSellPrice());
            totalAmount += detail.getQuantity() * item.getSellPrice();
        }
        totalAmount -= (totalAmount * discount / 100);
        order.setTotalAmount(totalAmount);

        orderDAO.updateOrder(order, orderDetails);

        for (OrderDetail detail : orderDetails) {
            Item item = itemDAO.getItemById(detail.getItemID());
            item.setQty(item.getQty() - detail.getQuantity());
            itemDAO.updateItem(item);
        }

        return true;
    }

    public boolean deleteOrder(int orderId, HttpServletRequest request) throws SQLException {
        Order order = orderDAO.getOrderById(orderId);
        if (order == null) {
            request.setAttribute("error", "Order ID " + orderId + " not found.");
            return false;
        }

        List<OrderDetail> orderDetails = orderDAO.getOrderDetails(orderId);
        for (OrderDetail detail : orderDetails) {
            Item item = itemDAO.getItemById(detail.getItemID());
            item.setQty(item.getQty() + detail.getQuantity());
            itemDAO.updateItem(item);
        }

        orderDAO.deleteOrder(orderId);
        return true;
    }
}