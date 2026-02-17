package com.backend.exception;

public class NonExistentBookException extends RuntimeException {

    public NonExistentBookException(Long id) {
        super("Livro não encontrado para o ID " + id.intValue());
    }
}
