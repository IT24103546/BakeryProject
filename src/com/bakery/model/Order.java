package com.bakery.model;

public class Order {
    private int orderId;
    private String customerName;
    private String item;
    private int quantity;

    // Constructor
    public Order(int orderId, String customerName, String item, int quantity) {
        this.orderId = orderId;
        this.customerName = customerName;
        this.item = item;
        this.quantity = quantity;
    }

    // Getters and Setters
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

