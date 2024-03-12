package com.bank.account_service.entities;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    String name;
    String lastname;
    LocalDateTime birth_date;

    @OneToMany
    List<Account> accounts = new ArrayList<>();

    @OneToMany
    @JoinColumn(name = "owner_id")
    List<Card> cards = new ArrayList<>();
}
