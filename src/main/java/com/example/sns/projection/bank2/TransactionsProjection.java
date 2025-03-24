package com.example.sns.projection.bank2;

import java.sql.Timestamp;

public interface TransactionsProjection {

    int getTransaction_id();
    Timestamp getTimestamp();
    int getDebit_account_id();
    String getCredit_bank_name();
    String getCredit_account_number();
    String getAuthentication_type();
    double getTransferred_amount();
    String getNew_debit_account_state();
    int getAge_at_request();

}