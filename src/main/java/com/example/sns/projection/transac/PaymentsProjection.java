package com.example.sns.projection.transac;

import java.sql.Date;

public interface PaymentsProjection {

    int getId();
    int getOrderId();
    double getAmount();
    String getStatus();
    Date getPaymentDate();
    String getPaymentMethod();
}
