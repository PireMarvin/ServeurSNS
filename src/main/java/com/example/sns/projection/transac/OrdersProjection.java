package com.example.sns.projection.transac;

import java.sql.Timestamp;
import java.util.Date;

public interface OrdersProjection {

    int getId();
    int getClient_id();
    Date getOrder_date();
    Timestamp getOrder_time();
    double getTotal();
    String getStatus();
    String getBank_name();
    String getTracking_id();
}
