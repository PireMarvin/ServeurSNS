package com.example.sns.projection.transac;

import java.sql.Date;

public interface ClientsProjection {

    int getId();
    int getAddressID();
    Date getRegistrationDate();
    char getGender();
    Date getBirthDate();
    String getMaritalStatus();
    double getMonthlySalary();
}
