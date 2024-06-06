package com.codeWithSrb.DesignPattern.strategy;

public class Item {

    private int itemId;
    private String itemName;
    private String itemCategory;
    private int itemsCost;

    public Item(int itemId, String itemName, String itemCategory, int itemsCost) {
        this.itemId = itemId;
        this.itemName = itemName;
        this.itemCategory = itemCategory;
        this.itemsCost = itemsCost;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemCategory() {
        return itemCategory;
    }

    public void setItemCategory(String itemCategory) {
        this.itemCategory = itemCategory;
    }

    public int getItemsCost() {
        return itemsCost;
    }

    public void setItemsCost(int itemsCost) {
        this.itemsCost = itemsCost;
    }
}
