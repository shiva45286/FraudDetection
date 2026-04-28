package com.example.Smarttraffic.controller;

import com.example.Smarttraffic.model.Transaction;
import com.example.Smarttraffic.repository.TransactionRepository;
import com.example.Smarttraffic.service.FraudService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class FraudController {

    private final TransactionRepository repo;
    private final FraudService service;

    public FraudController(TransactionRepository repo, FraudService service) {
        this.repo = repo;
        this.service = service;
    }

    @PostMapping("/add")
    public Transaction add(@RequestBody Transaction tx) {
        tx.setFraud(service.checkFraud(tx));
        return repo.save(tx);
    }

    @GetMapping("/all")
    public List<Transaction> getAll() {
        return repo.findAll();
    }

    @GetMapping("/user/{id}")
    public List<Transaction> getUser(@PathVariable String id) {
        return repo.findByUserId(id);
    }
}