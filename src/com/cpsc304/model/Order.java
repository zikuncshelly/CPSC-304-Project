package com.cpsc304.model;

import java.sql.Date;
import java.sql.Time;
import java.util.Map;

public abstract class Order {

    protected Customer customer;
    protected int orderID;
    protected Date date;
    protected Time time;
    protected double amount;
    protected String status;
    protected Restaurant restOrderedAt;
    protected Map<Food, Integer> quantity;

    public Order(Customer customer, int orderID, Date date, Time time, double amount, String status, Restaurant restOrderedAt, Map<Food, Integer> quantity) {
        this.customer = customer;
        this.orderID = orderID;
        this.date = date;
        this.time = time;
        this.amount = amount;
        this.status = status;
        this.restOrderedAt = restOrderedAt;
        this.quantity = quantity;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getOrderID() {
        return orderID;
    }

    public void setOrderID(int orderID) {
        this.orderID = orderID;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Time getTime() {
        return time;
    }

    public void setTime(Time time) {
        this.time = time;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Restaurant getRestOrderedAt() {
        return restOrderedAt;
    }

    public void setRestOrderedAt(Restaurant restOrderedAt) {
        this.restOrderedAt = restOrderedAt;
    }

    public Map<Food, Integer> getQuantity() {
        return quantity;
    }

    public void setQuantity(Map<Food, Integer> quantity) {
        this.quantity = quantity;
    }
}
