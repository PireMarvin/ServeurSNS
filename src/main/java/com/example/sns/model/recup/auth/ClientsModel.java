package com.example.sns.model.recup.auth;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Document(collection = "Clients")

public class ClientsModel {
    @Id
    @Field("_id")
    private ObjectId id;

    private int ageAtRequest;
    private String bankId;
    private Date birthDate;
    private String cardNumber;
    private String clientId;
    private String clientName;
    private Object eidauth;
    private String email;
    private int gender;
    private String nationalRegistryNumber;
    private String passwordHash;
    private String refreshToken;
    private Date refreshTokenExpiry;
    private Date requestDateTime;
    private int role;
    private String smsauth;
}
