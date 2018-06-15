package com.cpsc304.model;

import java.sql.Time;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Restaurant {

    private RestaurantManager manager;
    private double rating;
    private Time openTime;
    private Time closeTime;
    private String name;
    private int id;
    private boolean deliveryOption;
    private String type;
    private Address address;
    private Map<String, Food> offers;
    private Set<Courier> resCouriers;

    public Restaurant(RestaurantManager manager, double rating, Time openTime, Time closeTime, String name, int id, boolean deliveryOption, String type, Address address, Map<String, Food> offers) {
        this.manager = manager;
        this.rating = rating;
        this.openTime = openTime;
        this.closeTime = closeTime;
        this.name = name;
        this.id = id;
        this.deliveryOption = deliveryOption;
        this.type = type;
        this.address = address;
        this.offers = offers;
        resCouriers = new HashSet<>();
    }

    public RestaurantManager getManager() {
        return manager;
    }

    public void setManager(RestaurantManager manager) {
        this.manager = manager;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public Time getOpenTime() {
        return openTime;
    }

    public void setOpenTime(Time openTime) {
        this.openTime = openTime;
    }

    public Time getCloseTime() {
        return closeTime;
    }

    public void setCloseTime(Time closeTime) {
        this.closeTime = closeTime;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isDeliveryOption() {
        return deliveryOption;
    }

    public void setDeliveryOption(boolean deliveryOption) {
        this.deliveryOption = deliveryOption;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public void addFood(Food food) {
        offers.put(food.getName(), food);
    }

    public void deleteFood(Food food) {
        offers.remove(food.getName());
    }

    public Map<String, Food> getOffers() {
        return offers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Restaurant)) return false;

        Restaurant that = (Restaurant) o;

        return id == that.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
