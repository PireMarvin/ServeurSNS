package com.example.sns.projection.bank1;

import java.sql.Date;

public interface BankClientsProjection {

    int getClient_id();
    String getGender();
    Date getBirth_date();
    String getMarital_status();
    double getMonthly_income();
    String getBank_name();
}
