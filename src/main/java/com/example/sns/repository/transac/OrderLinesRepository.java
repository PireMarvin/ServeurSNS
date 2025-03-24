package com.example.sns.repository.transac;

import com.example.sns.model.transac.OrderLinesModel;
import com.example.sns.projection.bank1.TransactionsProjection;
import com.example.sns.projection.transac.OrderLinesProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderLinesRepository extends JpaRepository<OrderLinesModel, Long> {

    List<OrderLinesProjection> findAllProjectedBy();
}
