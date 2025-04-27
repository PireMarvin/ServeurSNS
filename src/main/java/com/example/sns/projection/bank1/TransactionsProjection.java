package com.example.sns.projection.bank1;

import java.sql.Date;
import java.sql.Timestamp;

public interface TransactionsProjection {

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