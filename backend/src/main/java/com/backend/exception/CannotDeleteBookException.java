package com.backend.exception;

public class CannotDeleteBookException extends RuntimeException {
    public CannotDeleteBookException() {

      super("O livro não pode ser excluído pois não está disponível no momento!");
    }
}
