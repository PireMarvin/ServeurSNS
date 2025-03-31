package com.example.sns.model.transac;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "adresses")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

public class AdressesModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "street", nullable = false)
    private String street;

    @Column(name = "number", nullable = false)
    private String number;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "postal_code", nullable = false)
    private String postalCode;

    @Column(name = "country", nullable = false)
    private String country;
}
