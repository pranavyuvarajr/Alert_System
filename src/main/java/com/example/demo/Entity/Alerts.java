package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@RequiredArgsConstructor
public class Alerts {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private Integer userId;
    private String message;
    private Boolean isFraud;

    @OneToOne
    @JoinColumn(name = "transaction_id")
    private Transactions transactions;

    public Alerts(Integer userId, String message, Boolean isFraud) {
        this.userId = userId;
        this.message = message;
        this.isFraud = isFraud;
    }
}
