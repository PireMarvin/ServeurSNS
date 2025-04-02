package com.example.sns.projection.transac;

import java.sql.Date;

public interface StocksProjection {

    int getId();
    int getProductId();
    int getQuantity();
    int getMinStock();
    int getMaxStock();
    Date getUpdateDate();
}
