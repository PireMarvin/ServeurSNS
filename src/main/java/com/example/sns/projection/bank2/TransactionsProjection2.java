package com.example.sns.projection.bank2;

import java.sql.Timestamp;

public interface TransactionsProjection2 {

    String getTransactionId();
    Timestamp getTransactionDatetime();
    int getDebitAccountId();
    String getCreditBankName();
    String getCreditAccountNumber();
    String getAuthenticationType();
    double getTransferredAmount();
    String getNewDebitAccountState();
    int getAgeAtRequest();

}