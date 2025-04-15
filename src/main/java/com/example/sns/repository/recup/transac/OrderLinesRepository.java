package com.example.sns.repository.recup.transac;

import com.example.sns.model.recuperation.transac.OrderLinesModel;
import com.example.sns.projection.transac.OrderLinesProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OrderLinesRepository extends JpaRepository<OrderLinesModel, Long /*OrderItemId*/> {

    List<OrderLinesProjection> findAllProjectedBy();
}
