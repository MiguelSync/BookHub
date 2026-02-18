package com.backend.enums;

public enum BookEnum {

    STATUS_DISPONIVEL(1, "Disponível");

    final int value;
    final String description;

    BookEnum(int value, String description) {
        this.value = value;
        this.description = description;
    }

    public int getValue() {
        return this.value;
    }

    public String getDescription() {
        return this.description;
    }
}
