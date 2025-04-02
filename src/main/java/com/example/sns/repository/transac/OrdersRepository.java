package com.example.sns.repository.transac;

import com.example.sns.model.transac.OrdersModel;
import com.example.sns.projection.bank1.TransactionsProjection;
import com.example.sns.projection.transac.OrdersProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrdersRepository extends JpaRepository<OrdersModel, Long> {
    //@Query("SELECT o.id AS id, o.client_id AS client_id, o.order_date AS order_date, o.order_time AS order_time, o.total AS total, o.status AS status, o.bank_name AS bank_name, o.tracking_id AS tracking_id FROM OrdersModel o")
    List<OrdersProjection> findAllProjectedBy();
}
