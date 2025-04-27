package com.example.sns.projection.transac;

public interface OrderLinesProjection {

    //int getOrderItemId();
    
    Long getId();
    int getOrderId();
    int getProductId();
    int getQuantity();
}
