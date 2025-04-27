package com.example.sns.projection.bank1;

public interface ExternalTransactionsProjection {

    Long getExternalTransactionId();
    int getLocalTransactionId();
    String getStatus();
}
