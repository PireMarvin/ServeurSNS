package com.example.sns.projection.transac;

import java.sql.Date;

public interface PaymentsProjection {

    int getId();
    int getOrder_id();
    double getAmount();
    String getStatus();
    Date getPayment_date();
    String getPayment_method();
}
