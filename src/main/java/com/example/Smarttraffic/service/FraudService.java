package com.example.Smarttraffic.service;

import com.example.Smarttraffic.model.Transaction;
import org.springframework.stereotype.Service;

@Service
public class FraudService {

    public boolean checkFraud(Transaction tx) {
        return tx.getAmount() > 50000 ||
                tx.getLocation().equalsIgnoreCase("Unknown");
    }
}