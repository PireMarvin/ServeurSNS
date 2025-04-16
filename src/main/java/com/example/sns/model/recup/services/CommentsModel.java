package com.example.sns.model.recup.services;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Table(name = "delivery_tracking")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CommentsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "product_id")
    private int productId;

    @Column(name = "rating", nullable = false)
    private short rating;

    @Column(name = "created_at")
    private Date createdAt;

    @Column(name = "comment")
    private String comment;
}
