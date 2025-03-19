package com.example.sns.repository.transac;

import com.example.sns.model.transac.DeliveryTrackingModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeliveryTrackingRepository extends JpaRepository<DeliveryTrackingModel, Long> {
}
