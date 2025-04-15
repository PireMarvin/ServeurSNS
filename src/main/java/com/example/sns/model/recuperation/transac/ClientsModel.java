package com.example.sns.model.recuperation.transac;

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

public class ClientsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "phone", nullable = false)
    private String phone;

    @Column(name = "address_id", nullable = false)
    private int addressID;

    @Column(name = "registration_date")
    private Date registrationDate;

    @Column(name = "gender", nullable = false)
    private char gender;

    @Column(name = "birth_date", nullable = false)
    private Date birthDate;

    @Column(name = "marital_status", nullable = false)
    private String maritalStatus;

    @Column(name = "monthly_salary", nullable = false)
    private double monthlySalary;

    @Column(name = "role", nullable = false)
    private String role;
}
