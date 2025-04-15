package com.example.sns.model.ajout.activities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "order_lines")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ADDOrder_linesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int ID;

    @Column(name = "order_id")
    private int order_id;

    @Column(name = "product_id")
    private int product_id;

    @Column(name = "quantity")
    private int quantity;
}
