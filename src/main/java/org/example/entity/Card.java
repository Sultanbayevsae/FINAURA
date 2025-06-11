package org.example.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

@Entity


public class Card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cardId;
    private String cardNumber;
    private String cardPassword;
    private String cardholderName;
    private LocalDateTime createDate;
    @Embedded
    private CardDetail cardDetail;
    private LocalDateTime expiryDate;

    @ManyToOne
    @JoinColumn(name = "user_id") // foreign key column nomi
    private User user;
}
