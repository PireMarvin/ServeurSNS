package com.example.sns.projection.services;

import java.sql.Date;

public interface StocksProjection {

    int getId();
    String getNom();
    int getProduitId();
    int getQuantite();
    int getStockMin();
    int getStockMax();
    Date getDateMaj();
}
