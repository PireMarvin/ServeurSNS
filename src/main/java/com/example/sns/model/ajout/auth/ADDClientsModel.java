package com.example.sns.model.ajout.auth;

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
@Document(collection = "clients")
public class ADDClientsModel {
    @Id
    @Field("_id")
    private ObjectId id;

    private int ageAtRequest;
    private Date birthDate;
    private String gender;
    private Date requestDateTime;
}
