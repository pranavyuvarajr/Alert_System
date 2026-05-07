package com.example.demo.Service;

import com.example.demo.DTO.UserTransactionDTO;
import com.example.demo.Entity.Transactions;
import com.example.demo.Repository.AlertRepository;
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
    private final AlertService alertService;

    public Object saveTransaction(UserTransactionDTO userTransactionDTO) {
        Transactions transactions = new Transactions(userTransactionDTO.getAmount(), userTransactionDTO.getPlace(), userTransactionDTO.getPlatform());
        transactions.setUsers(userService.getUser(userTransactionDTO.getId()));
        transactions.setDate(LocalDateTime.now());
        transactionRepository.save(transactions);

        if(transactions.getAmount() > 50000 || transactions.getDate().getHour() < 6) {
            return alertService.alert(transactions);
        }

        return transactions;
    }

    public List<Transactions> getTransactions() {
        return transactionRepository.findAll();
    }
}
