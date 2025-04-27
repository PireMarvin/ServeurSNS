package com.example.sns.model.ajout.activities;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Table(name = "users")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ADDUsersModel {
    @Id
    private Long id;

    @Column(name = "address_id")
    private int addressId;

    @Column(name = "registration_date")
    private Date registrationDate;

    @Column(name = "gender")
    private String gender;

    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "marital_status")
    private String maritalStatus;

    @Column(name = "monthly_salary")
    private double monthlySalary;
}
