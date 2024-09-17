package com.dio.devAPI2024.controller.dto;

import com.dio.devAPI2024.domain.model.Account;

import java.math.BigDecimal;
public record AccountDto(Long id, String number, String agency, BigDecimal balance, BigDecimal limit) {

    // Constructor that maps from Account entity to AccountDto
    public AccountDto(Account model) {
        this(model.getId(), model.getNumber(), model.getAgency(), model.getBalance(), model.getCredit_limit());
    }

    // Method that converts AccountDto back to Account entity
    public Account toModel() {
        Account model = new Account();
        model.setId(this.id);
        model.setNumber(this.number);
        model.setAgency(this.agency);
        model.setBalance(this.balance);
        model.setCredit_limit(this.limit);
        return model;
    }
}
