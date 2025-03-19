package com.example.sns.model.services;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Table(name = "Stocks")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class StocksModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Nom", nullable = false)
    private String nom;

    @Column(name = "ProduitId", nullable = false)
    private int produitId;

    @Column(name = "quantité", nullable = false)
    private int quantite;

    @Column(name = "stockMin", nullable = false)
    private int stockMin;

    @Column(name = "StockMax", nullable = false)
    private int stockMax;

    @Column(name = "DateMaj", nullable = false)
    private Date dateMaj;
}
