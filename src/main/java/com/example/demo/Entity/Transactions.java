package com.example.demo.Entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Setter
@Getter
@RequiredArgsConstructor
public class Transactions {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private LocalDateTime date;
    private Double amount;
    private String place;
    private String platform;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private Users users;

    public Transactions(Double amount, String place, String platform) {
        this.amount = amount;
        this.place = place;
        this.platform = platform;
    }
}
