package com.example.sns.model.ajout.activities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "adresses")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ADDAdressesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "addresses")
    private int addresses_id;

    @Column(name = "city", nullable = false)
    private String city;

    @Column(name = "country", nullable = false)
    private String country;

}
