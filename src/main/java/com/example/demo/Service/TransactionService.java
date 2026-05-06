package com.example.demo.Service;

import com.example.demo.DTO.UserTransactionDTO;
import com.example.demo.Entity.Transactions;
import com.example.demo.Repository.TransactionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@RequiredArgsConstructor
public class TransactionService {
    private final TransactionRepository transactionRepository;
    private final UserService userService;

    public Transactions saveTransaction(UserTransactionDTO userTransactionDTO) {
        Transactions transactions = new Transactions(userTransactionDTO.getAmount(), userTransactionDTO.getPlace(), userTransactionDTO.getPlatform());
        transactions.setUsers(userService.getUser(userTransactionDTO.getId()));
        transactions.setDate(LocalDateTime.now());
        transactionRepository.save(transactions);
        return transactions;
    }

    public List<Transactions> getTransactions() {
        return transactionRepository.findAll();
    }
}
