package com.example.sns.repository.bank1;

import com.example.sns.model.bank1.TransactionsModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionsRepository extends JpaRepository<TransactionsModel, Long> {
}
