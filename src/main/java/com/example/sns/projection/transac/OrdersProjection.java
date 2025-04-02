package com.example.sns.projection.transac;

import java.sql.Timestamp;
import java.util.Date;

public interface OrdersProjection {

    int getId();
    int getClientId();
    Date getOrderDate();
    Timestamp getOrderTime();
    double getTotal();
    String getStatus();
    String getBankName();
    String getTrackingId();
}
