package com.example.demo.Controller;

import com.example.demo.DTO.UserTransactionDTO;
import com.example.demo.Entity.Transactions;
import com.example.demo.Service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/transaction")
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService transactionService;

    @PostMapping
    public Transactions saveTransaction(@RequestBody UserTransactionDTO userTransactionDTO) {
        return transactionService.saveTransaction(userTransactionDTO);
    }

    @GetMapping
    public List<Transactions> getTransactions() {
        return transactionService.getTransactions();
    }
}
