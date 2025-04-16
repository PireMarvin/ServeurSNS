package com.example.sns.projection.bank1;

public interface ExternalTransactionsProjection {

    int getexternalTransactionId();
    int getlocalTransactionId();
    String getStatus();
}
