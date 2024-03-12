package com.bank.account_service.entity;

import com.bank.account_service.enumiration.CardType;
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
