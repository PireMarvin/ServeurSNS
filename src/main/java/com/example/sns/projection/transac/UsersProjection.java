package com.example.sns.projection.transac;

import java.sql.Date;

public interface UsersProjection {

    Long getId();
    Integer getAddressId();
    Date getRegistrationDate();
    String getGender();
    Date getBirthDate();
    String getMaritalStatus();
    Double getMonthlySalary();
}
