package com.example.sns.repository.ajout.activities;

import com.example.sns.model.ajout.activities.ADDTransactions_1Model;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ADDTransactions_1Repository extends JpaRepository<ADDTransactions_1Model, Long> {

    Optional<ADDTransactions_1Model> findById(String transactionId);

}
