package com.spareparts.dao;

import com.spareparts.model.Item;
import com.spareparts.util.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ItemDAOImpl implements ItemDAO {
    @Override
    public List<Item> getAllItems() throws SQLException {
        List<Item> itemList = new ArrayList<>();
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM itemdetails")) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                Item item = new Item();
                item.setItemID(rs.getInt("itemID"));
                item.setItemName(rs.getString("itemName"));
                item.setItemBrand(rs.getString("itemBrand"));
                item.setQty(rs.getInt("qty"));
                item.setBuyPrice(rs.getDouble("buyPrice"));
                item.setSellPrice(rs.getDouble("sellPrice"));
                item.setImagePath(rs.getString("Image_path"));
                itemList.add(item);
            }
        }
        return itemList;
    }

    @Override
    public Item getItemById(int id) throws SQLException {
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement("SELECT * FROM itemdetails WHERE itemID = ?")) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Item item = new Item();
                item.setItemID(rs.getInt("itemID"));
                item.setItemName(rs.getString("itemName"));
                item.setItemBrand(rs.getString("itemBrand"));
                item.setQty(rs.getInt("qty"));
                item.setBuyPrice(rs.getDouble("buyPrice"));
                item.setSellPrice(rs.getDouble("sellPrice"));
                item.setImagePath(rs.getString("Image_path"));
                return item;
            }
            
            return null;
        }
    }

    @Override
    public void addItem(Item item) throws SQLException {
        item.validate();
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(
                     "INSERT INTO itemdetails (itemName, itemBrand, qty, buyPrice, sellPrice, Image_path) VALUES (?, ?, ?, ?, ?, ?)")) {
            stmt.setString(1, item.getItemName());
            stmt.setString(2, item.getItemBrand());
            stmt.setInt(3, item.getQty());
            stmt.setDouble(4, item.getBuyPrice());
            stmt.setDouble(5, item.getSellPrice());
            stmt.setString(6, item.getImagePath());
            stmt.executeUpdate();
        }
    }

    @Override
    public void updateItem(Item item) throws SQLException {
        item.validate();
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(
                     "UPDATE itemdetails SET itemName = ?, itemBrand = ?, qty = ?, buyPrice = ?, sellPrice = ?, Image_path = ? WHERE itemID = ?")) {
            stmt.setString(1, item.getItemName());
            stmt.setString(2, item.getItemBrand());
            stmt.setInt(3, item.getQty());
            stmt.setDouble(4, item.getBuyPrice());
            stmt.setDouble(5, item.getSellPrice());
            stmt.setString(6, item.getImagePath());
            stmt.setInt(7, item.getItemID());
            stmt.executeUpdate();
        }
    }

    @Override
    public void deleteItem(int id) throws SQLException {
        try (Connection conn = DBConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement("DELETE FROM itemdetails WHERE itemID = ?")) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}