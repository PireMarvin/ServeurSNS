package com.example.sns.model.services;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Table(name = "Adresses")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Clients {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Nom", nullable = false)
    private String nom;

    @Column(name = "Email", nullable = false)
    private String email;

    @Column(name = "Téléphone", nullable = false)
    private String telphone;

    @Column(name = "AdressID", nullable = false)
    private int adressID;

    @Column(name = "DateInscription")
    private Date dateInscription;

    @Column(name = "Sexe", nullable = false)
    private char sexe;

    @Column(name = "DateNaissance", nullable = false)
    private Date dateNaissance;

    @Column(name = "EtatCivil", nullable = false)
    private String etatCivil;

    @Column(name = "SalaireMensuel", nullable = false)
    private double salaireMensuel;
}
