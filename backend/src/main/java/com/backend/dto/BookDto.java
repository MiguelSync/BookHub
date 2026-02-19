package com.backend.dto;

public record BookDto(
    Long id,
    String title,
    Integer status
) {}
