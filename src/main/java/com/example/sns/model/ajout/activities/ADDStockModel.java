package com.example.sns.model.ajout.activities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "stock")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ADDStockModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "product_id", nullable = false)
    private int productId;

    @Column(name = "quantity", nullable = false)
    private int quantity;

    @Column(name = "min_stock", nullable = false)
    private int minStock;

    @Column(name = "max_stock", nullable = false)
    private int maxStock;
}
