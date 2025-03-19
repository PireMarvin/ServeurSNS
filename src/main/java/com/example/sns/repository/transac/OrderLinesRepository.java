package com.example.sns.repository.transac;

import com.example.sns.model.transac.OrderLinesModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderLinesRepository extends JpaRepository<OrderLinesModel, Long> {
}
