package com.bank.account_service.enumirations;

public enum CurrencyType {
    RUBLE, DOLLAR, EURO, YUAN;

    @Override
    public String toString() {
        return this.name();
    }
}
