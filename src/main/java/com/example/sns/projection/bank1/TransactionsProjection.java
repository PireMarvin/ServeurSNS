package com.example.sns.projection.bank1;

import java.sql.Timestamp;

public interface TransactionsProjection {

    int getTransactionId();
    Timestamp getTransactionDatetime();
    int getDebitAccountId();
    String getCreditBankName();
    String getCreditAccountNumber();
    String getAuthenticationType();
    double getTransferredAmount();
    String getNewDebitAccountState();
    int getAgeAtRequest();

}