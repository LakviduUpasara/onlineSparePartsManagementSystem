package com.spareparts.controller;

import com.spareparts.model.Supplier;
import com.spareparts.util.DBConnection;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class SupplierController {

    private static boolean isSuccess;
    private static Connection con = null;
    private static Statement stmt = null;
    private static ResultSet rs = null;

    public static boolean addSupplier(String name, String contact, String address) {
        
    	boolean isSuccess = false;

        try {
            con = DBConnection.getConnection();
            stmt = con.createStatement();

            String sql = "INSERT INTO Supplier_Details VALUES (0, '" + name + "', '" + contact + "', '" + address + "')";
            int result = stmt.executeUpdate(sql);

            if (result > 0) {
                isSuccess = true;
            }
            else 
            {
                isSuccess = false;

            }
        } catch (Exception e) {
        	
            e.printStackTrace();
        }

        return isSuccess;
    }

    public static List<Supplier> getAllSuppliers() {
        List<Supplier> suppliers = new ArrayList<>();

        try {
            con = DBConnection.getConnection();
            stmt = con.createStatement();

            String sql = "SELECT * FROM Supplier_Details";
            rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("SupplierID");
                String name = rs.getString("SupplierName");
                String contact = rs.getString("ContactNumber");
                String address = rs.getString("Address");

                Supplier supplier = new Supplier(id, name, contact, address);
                suppliers.add(supplier);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return suppliers;
    }

    public static Supplier getSupplierById(String id) {
        Supplier supplier = null;

        try {
            con = DBConnection.getConnection();
            stmt = con.createStatement();

            String sql = "SELECT * FROM Supplier_Details WHERE SupplierID = '" + id + "'";
            rs = stmt.executeQuery(sql);

            if (rs.next()) {
                int sid = rs.getInt("SupplierID");
                String name = rs.getString("SupplierName");
                String contact = rs.getString("ContactNumber");
                String address = rs.getString("Address");

                supplier = new Supplier(sid, name, contact, address);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return supplier;
    }

    public static boolean updateSupplier(String id, String name, String contact, String address) {
        boolean isSuccess = false;

        try {
            con = DBConnection.getConnection();
            stmt = con.createStatement();

            String sql = "UPDATE Supplier_Details SET SupplierName = '" + name + "', ContactNumber = '" + contact + "', Address = '" + address + "' WHERE SupplierID = '" + id + "'";
            int result = stmt.executeUpdate(sql);

            if (result > 0) {
                isSuccess = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return isSuccess;
    }

    public static boolean deleteSupplier(String id) {
        boolean isSuccess = false;

        try {
            con = DBConnection.getConnection();
            stmt = con.createStatement();

            String sql = "DELETE FROM Supplier_Details WHERE SupplierID = '" + id + "'";
            int result = stmt.executeUpdate(sql);

            if (result > 0) {
                isSuccess = true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return isSuccess;
    }
}
