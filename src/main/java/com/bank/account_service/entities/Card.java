package com.bank.account_service.entities;

import com.bank.account_service.enumirations.CardType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Card {

    @Id
    long card_number;
    long balance;
    long owner_id;

    @Enumerated(EnumType.STRING)
    private CardType type;

}
