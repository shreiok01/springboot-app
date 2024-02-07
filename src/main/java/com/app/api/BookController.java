package com.app.api;

import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
class BookController {

  private final BookRepository repository;

  BookController(BookRepository repository) {
    this.repository = repository;
  }


  @GetMapping("/books")
  List<Book> all() {
    return repository.findAll();
  }

  @PostMapping("/books")
  Book newBook(@RequestBody Book newBook) {
    return repository.save(newBook);
  }
}
