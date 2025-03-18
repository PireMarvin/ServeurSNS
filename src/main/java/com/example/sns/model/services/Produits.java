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

public class Produits {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Nom", nullable = false)
    private String nom;

    @Column(name = "Prix", nullable = false)
    private double prix;

    @Column(name = "CategorieId", nullable = false)
    private int categorieId;

    @Column(name = "StockId",nullable = false)
    private int stockId;

    @Column(name = "Description")
    private String description;
}
