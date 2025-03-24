package com.example.sns.projection.bank1;

import java.sql.Date;

public interface ClientsProjection {

    int getClient_id();
    String getAccount_number();
    String getGender();
    Date getBirth_date();
    String getMarital_status();
    double getMonthly_income();
    String getBank_name();
}
