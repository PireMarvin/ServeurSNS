package com.example.sns.projection.bank1;

import java.sql.Date;

public interface BankClientsProjection {

    Long getClientId();
    String getGender();
    Date getBirthDate();
    String getMaritalStatus();
    double getMonthlyIncome();
    String getBankName();
}
