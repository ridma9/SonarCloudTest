package org.example;

public class Item {
    private String itemName;
    private int itemId;
    private int itemqty;

    public Item(String itemName, int itemId, int itemqty) {
        this.itemName = itemName;
        this.itemId = itemId;
        this.itemqty = itemqty;
    }

    public Item() {
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getItemqty() {
        return itemqty;
    }

    public void setItemqty(int itemqty) {
        this.itemqty = itemqty;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemName='" + itemName + '\'' +
                ", itemId=" + itemId +
                ", itemqty=" + itemqty +
                '}';
    }
}
