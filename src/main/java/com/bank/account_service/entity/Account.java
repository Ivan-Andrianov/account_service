package com.bank.account_service.entity;

import com.bank.account_service.enumiration.CurrencyType;
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
