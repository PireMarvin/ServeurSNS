package com.example.sns.repository.transac;

import com.example.sns.model.transac.PaymentsModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentsRepository extends JpaRepository<PaymentsModel, Long> {
}
