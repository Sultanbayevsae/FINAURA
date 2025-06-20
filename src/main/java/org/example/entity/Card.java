package org.example.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Card {
    private Long cardId;
    private String cardNumber;
    private String cardPassword;
    private String cardholderName;
    private LocalDateTime createDate;
    private CardType cardType;
    private LocalDateTime expiryDate;
}


