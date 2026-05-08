package com.supermarket.analytics.model;

import com.google.cloud.firestore.annotation.DocumentId;
import com.google.cloud.Timestamp;

public class Product {
    @DocumentId
    private String id;
    private String name;
    private Double price;
    private Integer stock;
    private Integer sales;
    private Timestamp createdAt;

    private String category;   // NEW
    private String imageUrl;   // NEW

    public Product() {
        this.price = 0.0;
        this.stock = 0;
        this.sales = 0;
    }

    public Product(String name, Double price, Integer stock, Integer sales, String category, String imageUrl) {
        this.name = name;
        this.price = price;
        this.stock = stock;
        this.sales = sales;
        this.category = category;
        this.imageUrl = imageUrl;
    }

    // Getters and Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
