package com.example.sns.repository.transac;

import com.example.sns.model.transac.PaymentsModel;
import com.example.sns.projection.bank1.TransactionsProjection;
import com.example.sns.projection.transac.PaymentsProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentsRepository extends JpaRepository<PaymentsModel, Long> {

    List<PaymentsProjection> findAllProjectedBy();
}
