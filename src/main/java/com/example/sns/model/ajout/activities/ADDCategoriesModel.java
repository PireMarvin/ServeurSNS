package com.example.sns.model.ajout.activities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "categories")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ADDCategoriesModel {
    @Id
    private Long ID;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "description")
    private String description;

}
