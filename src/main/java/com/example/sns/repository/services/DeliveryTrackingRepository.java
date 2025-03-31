package com.example.sns.repository.services;

import com.example.sns.model.services.DeliveryTrackingModel;
import com.example.sns.projection.services.DeliveryTrackingProjection;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DeliveryTrackingRepository extends JpaRepository<DeliveryTrackingModel, Long> {

    List<DeliveryTrackingProjection> findAllProjectedBy();
}
