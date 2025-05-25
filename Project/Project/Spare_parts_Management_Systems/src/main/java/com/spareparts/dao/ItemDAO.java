package com.spareparts.dao;

import com.spareparts.model.Item;
import java.sql.SQLException;
import java.util.List;

public interface ItemDAO {
    List<Item> getAllItems() throws SQLException;
    Item getItemById(int id) throws SQLException;
    void addItem(Item item) throws SQLException;
    void updateItem(Item item) throws SQLException;
    void deleteItem(int id) throws SQLException;
}