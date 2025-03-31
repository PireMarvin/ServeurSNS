package com.example.sns.model.transac;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "products")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class ProduitsModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "price", nullable = false)
    private double price;

    @Column(name = "category_id", nullable = false)
    private int category_id;

    @Column(name = "stock_id",nullable = false)
    private int stockId;

    @Column(name = "description")
    private String description;
}
