package com.backend.exception;

import com.backend.entity.BookEntity;

public class NotAvaiableBookException extends RuntimeException {
    public NotAvaiableBookException(BookEntity bookEntity) {
      super("O livro " + bookEntity.getId() + " - " + bookEntity.getTitle() + " não está disponível!");
    }
}
