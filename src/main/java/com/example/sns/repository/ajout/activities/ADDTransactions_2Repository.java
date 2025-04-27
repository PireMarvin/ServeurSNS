package com.example.sns.repository.ajout.activities;

import com.example.sns.model.ajout.activities.ADDTransactions_1Model;
import com.example.sns.model.ajout.activities.ADDTransactions_2Model;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ADDTransactions_2Repository extends JpaRepository<ADDTransactions_2Model, Long> {

    Optional<ADDTransactions_2Model> findById(String transactionId);
}
