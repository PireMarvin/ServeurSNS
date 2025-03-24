package com.example.sns.projection.transac;

import java.time.LocalDate;

public interface DeliveryTrackingProjection {

    int getId();
    int getOrderId();
    LocalDate getShipmentDate();
    LocalDate getEstimateDeliveryDate();
    int getAddressId();
}
