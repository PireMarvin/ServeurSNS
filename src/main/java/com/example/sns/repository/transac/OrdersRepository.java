package com.example.sns.repository.transac;

import com.example.sns.model.transac.OrdersModel;
import com.example.sns.projection.bank1.TransactionsProjection;
import com.example.sns.projection.transac.OrdersProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrdersRepository extends JpaRepository<OrdersModel, Long> {

    List<OrdersProjection> findAllProjectedBy();
}
