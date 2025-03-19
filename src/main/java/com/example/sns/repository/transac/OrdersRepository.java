package com.example.sns.repository.transac;

import com.example.sns.model.transac.OrdersModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<OrdersModel, Long> {
}
