package com.example.sns.projection.auth;

import org.bson.types.ObjectId;
import org.springframework.core.annotation.AliasFor;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

public interface ClientProjection {

    ObjectId getId();

    Integer getAgeAtRequest();
    Date getBirthDate();
    Integer getGender();
    Date getRequestDateTime();
}
