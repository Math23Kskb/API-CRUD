package com.dio.devAPI2024.controller.dto;

import com.dio.devAPI2024.domain.model.Card;

import java.math.BigDecimal;
public record CardDto(Long id, String number, BigDecimal limit) {

    // Constructor that maps from Card entity to CardDto
    public CardDto(Card model) {
        this(model.getId(), model.getNumber(), model.getLimit());
    }

    // Method that converts CardDto back to Card entity
    public Card toModel() {
        Card model = new Card();
        model.setId(this.id);
        model.setNumber(this.number);
        model.setLimit(this.limit);
        return model;
    }
}
