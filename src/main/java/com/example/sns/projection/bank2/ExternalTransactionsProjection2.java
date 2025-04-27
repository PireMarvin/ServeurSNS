package com.example.sns.projection.bank2;

public interface ExternalTransactionsProjection2 {

    Long getexternalTransactionId();
    int getlocalTransactionId();
    String getStatus();
}
