package com.backend.controller;

import com.backend.dto.BookDto;
import com.backend.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    public ResponseEntity<BookDto> getBook(@RequestBody int value) {
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }

    @PostMapping("/store")
    public ResponseEntity<BookDto> store(@RequestBody BookDto bookDto) {
        BookDto response = bookService.store(bookDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }
}
