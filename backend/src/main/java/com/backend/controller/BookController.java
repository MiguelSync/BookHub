package com.backend.controller;

import com.backend.dto.BookDto;
import com.backend.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/getBook")
    public ResponseEntity<BookDto> getBook(@RequestBody Integer id) {
        BookDto bookDto = bookService.getBook(id.longValue());
        return ResponseEntity.status(HttpStatus.OK).body(bookDto);
    }

    @PostMapping("/store")
    public ResponseEntity<BookDto> store(@RequestBody BookDto bookDto) {
        BookDto response = bookService.store(bookDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> delete(@RequestBody Integer id) {
        bookService.delete(id.longValue());
        return ResponseEntity.status(HttpStatus.OK).body("Livro deletado com sucesso!");
    }
}
