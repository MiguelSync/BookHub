package com.backend.exception;

public class NonExistentBookException extends RuntimeException {

    public NonExistentBookException() {
        super("Livro não encontrado!");
    }
}
