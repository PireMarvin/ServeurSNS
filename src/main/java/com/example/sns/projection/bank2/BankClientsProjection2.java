package com.example.sns.projection.bank2;

import java.sql.Date;

public interface BankClientsProjection2 {

    Long getClientId();
    String getGender();
    Date getBirthDate();
    String getMaritalStatus();
    double getMonthlyIncome();
    String getBankName();
}
