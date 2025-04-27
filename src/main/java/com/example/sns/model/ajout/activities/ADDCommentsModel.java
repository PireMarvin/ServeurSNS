package com.example.sns.model.ajout.activities;

import jakarta.persistence.*;
import lombok.*;

import java.sql.Date;

@Entity
@Table(name = "Comments")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ADDCommentsModel {
    @Id
    private int ID;

    @Column(name = "customer_id")
    private int customerId;

    @Column(name = "product_id")
    private int productId;

    @Column(name = "rating", nullable = false)
    private short rating;

    @Column(name = "created_at", nullable = false)
    private Date createdAt;
}
