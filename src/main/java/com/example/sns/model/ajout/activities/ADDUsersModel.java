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
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "address_id", nullable = false)
    private int address_id;

    @Column(name = "registration_date")
    private Date registration_date;

    @Column(name = "gender", nullable = false)
    private String gender;

    @Column(name = "birth_date", nullable = false)
    private Date birth_date;

    @Column(name = "marital_status", nullable = false)
    private String marital_status;

    @Column(name = "monthly_salary", nullable = false)
    private double monthly_salary;
}
