package com.bank.account_service.entities;

import com.bank.account_service.enumirations.CurrencyType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class Account {

    @Id
    long account_number;
    long balance;
    long owner_id;

    @Enumerated(EnumType.STRING)
    CurrencyType currency_type;

}
