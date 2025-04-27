package com.example.sns.projection.transac;

import java.sql.Date;

public interface PaymentsProjection {

    Long getId();
    int getOrderId();
    double getAmount();
    String getStatus();
    Date getPaymentDate();
    String getPaymentMethod();
}
