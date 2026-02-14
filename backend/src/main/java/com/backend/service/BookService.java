package com.backend.service;

import com.backend.dto.BookDto;
import com.backend.entity.BookEntity;
import com.backend.enums.BookEnum;
import com.backend.exception.NonExistentBookException;
import com.backend.mapper.BookMapper;
import com.backend.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BookService {

    @Autowired
    BookMapper bookMapper;
    BookRepository bookRepository;

    /**
     * Return a specific book by his ID
     * @param id ID of the book
     * @return Book DTO
     */
    public BookDto getBook(Integer id) {
        BookEntity bookEntity = bookRepository.findById(id.longValue()).orElseThrow(() -> new NonExistentBookException());
        return bookMapper.toDto(bookEntity);
    }

    /**
     * Save a new book
     * @param bookDto Book DTO from request
     * @return Book DTO saved
     */
    public BookDto store(BookDto bookDto) {
        BookEntity bookEntity = bookMapper.toClass(bookDto);
        bookEntity.setStatus(BookEnum.STATUS_DISPONIVEL.getValue());
        bookRepository.save(bookEntity);
        return bookMapper.toDto(bookEntity);
    }
}
