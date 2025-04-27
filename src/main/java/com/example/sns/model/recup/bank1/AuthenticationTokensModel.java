package com.example.sns.model.recup.bank1;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "authentication_tokens")
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthenticationTokensModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "authentication_id")
    private String authenticationId;

    @Column(name = "transaction_id")
    private String transactionId;

    @Column(name = "auth_token")
    private String authToken;

    @Column(name = "status")
    private String status;
}
