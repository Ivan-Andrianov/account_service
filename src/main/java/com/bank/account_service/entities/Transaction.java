package com.bank.account_service.entities;

import com.bank.account_service.enumirations.TransactionExecutionStatus;
import com.bank.account_service.enumirations.TransactionType;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@Entity
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long id;
    long amount;
    LocalDateTime date;

    @Enumerated(EnumType.STRING)
    TransactionType type;

    @Enumerated(EnumType.STRING)
    TransactionExecutionStatus status;
}
