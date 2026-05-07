package com.example.demo.Repository;

import com.example.demo.Entity.Alerts;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertRepository extends JpaRepository<Alerts, Integer> {
}
