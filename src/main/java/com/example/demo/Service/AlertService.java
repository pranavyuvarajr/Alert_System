package com.example.demo.Service;

import com.example.demo.Entity.Alerts;
import com.example.demo.Entity.Transactions;
import com.example.demo.Repository.AlertRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AlertService {
    private final AlertRepository alertRepository;

    public Alerts alert(Transactions transactions) {
        String message = "This user brought at something " + transactions.getAmount();
        Alerts alerts = new Alerts(transactions.getUsers().getId(), message, true);
        alerts.setTransactions(transactions);
        alertRepository.save(alerts);
        return alerts;
    }
}
