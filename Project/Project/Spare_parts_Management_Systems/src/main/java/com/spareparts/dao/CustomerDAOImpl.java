// src/com/spareparts/dao/CustomerDAOImpl.java
package com.spareparts.dao;

import com.spareparts.model.Customer;
import com.spareparts.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAOImpl implements CustomerDAO {
    @Override
    public List<Customer> getAllCustomers() throws SQLException {
        List<Customer> customerList = new ArrayList<>();
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM customerdetails")) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Customer customer = new Customer();
                customer.setCustomerID(rs.getInt("CustomerID"));
                customer.setCustomerName(rs.getString("CustomerName"));
                customer.setAddress(rs.getString("Address"));
                customer.setContactNumber(rs.getString("ContactNumber"));
                customerList.add(customer);
            }
        }
        return customerList;
    }

    @Override
    public Customer getCustomerById(int id) throws SQLException {
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM customerdetails WHERE CustomerID = ?")) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Customer customer = new Customer();
                customer.setCustomerID(rs.getInt("CustomerID"));
                customer.setCustomerName(rs.getString("CustomerName"));
                customer.setAddress(rs.getString("Address"));
                customer.setContactNumber(rs.getString("ContactNumber"));
                return customer;
            }
            return null;
        }
    }
}