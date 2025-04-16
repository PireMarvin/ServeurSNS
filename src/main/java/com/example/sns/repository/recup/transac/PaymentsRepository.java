package com.example.sns.repository.recup.transac;

import com.example.sns.model.recup.transac.PaymentsModel;
import com.example.sns.projection.transac.PaymentsProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PaymentsRepository extends JpaRepository<PaymentsModel, Long> {

    //@Query("SELECT p.id AS id, p.order_id AS order_id, p.amount AS amount, p.status AS status, p.payment_date AS payment_date, p.payment_method AS payment_method FROM PaymentsModel p")
    List<PaymentsProjection> findAllProjectedBy();
}
