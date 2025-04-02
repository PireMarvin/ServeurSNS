package com.example.sns.projection.transac;

public interface OrderLinesProjection {

    //int getOrderItemId();
    
    int getId();
    int getOrderId();
    int getProductId();
    int getQuantity();
}
