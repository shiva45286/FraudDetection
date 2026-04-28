package com.example.Smarttraffic.model;

import jakarta.persistence.*;

@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userId;
    private double amount;
    private String location;
    private long timestamp;
    private boolean fraud;

    public Long getId() { return id; }

    public String getUserId() { return userId; }
    public void setUserId(String userId) { this.userId = userId; }

    public double getAmount() { return amount; }
    public void setAmount(double amount) { this.amount = amount; }

    public String getLocation() { return location; }
    public void setLocation(String location) { this.location = location; }

    public long getTimestamp() { return timestamp; }
    public void setTimestamp(long timestamp) { this.timestamp = timestamp; }

    public boolean isFraud() { return fraud; }
    public void setFraud(boolean fraud) { this.fraud = fraud; }
}