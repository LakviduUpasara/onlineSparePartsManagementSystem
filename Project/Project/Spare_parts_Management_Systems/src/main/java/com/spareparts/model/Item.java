package com.spareparts.model;

public class Item {
    private int itemID;
    private String itemName;
    private String itemBrand;
    private int qty;
    private double buyPrice;
    private double sellPrice;
    private String imagePath;

    // Constructor
    public Item() {}

    // Getters and Setters
    public int getItemID() { return itemID; }
    public void setItemID(int itemID) { this.itemID = itemID; }
    public String getItemName() { return itemName; }
    public void setItemName(String itemName) { this.itemName = itemName; }
    public String getItemBrand() { return itemBrand; }
    public void setItemBrand(String itemBrand) { this.itemBrand = itemBrand; }
    public int getQty() { return qty; }
    public void setQty(int qty) { this.qty = qty; }
    public double getBuyPrice() { return buyPrice; }
    public void setBuyPrice(double buyPrice) { this.buyPrice = buyPrice; }
    public double getSellPrice() { return sellPrice; }
    public void setSellPrice(double sellPrice) { this.sellPrice = sellPrice; }
    public String getImagePath() { return imagePath; }
    public void setImagePath(String imagePath) { this.imagePath = imagePath; }

    // Validation (Encapsulation)
    public void validate() throws IllegalArgumentException {
        if (itemName == null || itemName.trim().isEmpty()) {
            throw new IllegalArgumentException("Item name is required");
        }
        if (qty < 0) {
            throw new IllegalArgumentException("Quantity cannot be negative");
        }
        if (buyPrice < 0) {
            throw new IllegalArgumentException("Buy price cannot be negative");
        }
        if (sellPrice < 0) {
            throw new IllegalArgumentException("Sell price cannot be negative");
        }
    }
}