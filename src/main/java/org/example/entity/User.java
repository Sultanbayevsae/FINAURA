package org.example.entity;
import jakarta.persistence.*;

import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder


public class User {
    private Long id;
    private String name;
    private String lastname;
    private int age;
    private String email;
    private String password;
    private String phoneNumber;
    private String passportId;
    private List<Card> cards;
}
