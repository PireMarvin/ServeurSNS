package com.example.sns.model.services;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Adresses")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class AdressesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Rue", nullable = false)
    private String rue;

    @Column(name = "Numero", nullable = false)
    private String numero;

    @Column(name = "Ville", nullable = false)
    private String ville;

    @Column(name = "CodePostal", nullable = false)
    private String codePostal;

    @Column(name = "Pays", nullable = false)
    private String pays;
}
