package com.example.sns.projection.transac;

import java.sql.Timestamp;
import java.sql.Date;

public interface OrdersProjection {

    Long getId();
    int getClientId();
    Date getOrderDate();
    Timestamp getOrderTime();
    double getTotal();
    String getStatus();
    String getBankName();
    String getTrackingId();
    int getAddressId();
}
