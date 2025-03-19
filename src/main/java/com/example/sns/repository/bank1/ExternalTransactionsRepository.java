package com.example.sns.repository.bank1;

import com.example.sns.model.bank1.ExternalTransactionsModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExternalTransactionsRepository extends JpaRepository<ExternalTransactionsModel, Long> {
}
