package com.example.sns.model.transac;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Table(name = "stock")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class StocksModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "update_date")
    private Date update_date;

    @Column(name = "product_id", nullable = false)
    private int product_id;

    @Column(name = "quantity", nullable = false)
    private int quantity;

    @Column(name = "min_stock", nullable = false)
    private int min_stock;

    @Column(name = "max_stock", nullable = false)
    private int max_stock;
}
