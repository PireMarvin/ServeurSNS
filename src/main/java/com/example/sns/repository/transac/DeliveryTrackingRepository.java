package com.example.sns.repository.transac;

import com.example.sns.model.transac.DeliveryTrackingModel;
import com.example.sns.projection.bank1.TransactionsProjection;
import com.example.sns.projection.transac.DeliveryTrackingProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DeliveryTrackingRepository extends JpaRepository<DeliveryTrackingModel, Long> {

    List<DeliveryTrackingProjection> findAllProjectedBy();
}
