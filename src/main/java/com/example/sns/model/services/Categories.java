package com.example.sns.model.services;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDate;

@Entity
@Table(name = "Adresses")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class Categories {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "Nom", nullable = false)
    private String nom;

    @Column(name = "Description")
    private String description;
}
