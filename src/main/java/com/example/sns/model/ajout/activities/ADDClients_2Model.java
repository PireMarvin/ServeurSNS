package com.example.sns.model.ajout.activities;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Table(name = "clients_2")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ADDClients_2Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "client_id")
    private int clientId;

    @Column(name = "gender", nullable = false)
    private String gender;

    @Column(name = "birth_date", nullable = false)
    private Date birthDate;

    @Column(name = "marital_status", nullable = false)
    private String maritalStatus;

    @Column(name = "monthly_income", nullable = false)
    private double monthlyIncome;

    @Column(name = "bank_name")
    private String bankName;

}

