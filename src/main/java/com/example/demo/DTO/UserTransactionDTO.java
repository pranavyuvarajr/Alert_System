package com.example.demo.DTO;

import lombok.Data;
import lombok.Getter;

@Getter
public class UserTransactionDTO {
    private Integer id;
    private Double amount;
    private String place;
    private String platform;
}
