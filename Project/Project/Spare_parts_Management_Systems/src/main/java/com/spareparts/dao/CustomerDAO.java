// src/com/spareparts/dao/CustomerDAO.java
package com.spareparts.dao;

import com.spareparts.model.Customer;
import java.sql.SQLException;
import java.util.List;

public interface CustomerDAO {
    List<Customer> getAllCustomers() throws SQLException;
    Customer getCustomerById(int id) throws SQLException;
}