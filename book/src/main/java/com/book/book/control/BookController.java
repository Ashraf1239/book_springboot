package com.book.book.control;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.book.book.entity.Book;
import com.book.book.service.BookServ;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookServ bookServ;
    @GetMapping("/{id}")
    public ResponseEntity<?> getById(@PathVariable Long id) {
      return ResponseEntity.ok(bookServ.getById(id));
    }
    @GetMapping()
    public ResponseEntity<?> findall() {
      return ResponseEntity.ok(bookServ.findall());
    }
    @PostMapping("")
    public ResponseEntity<?> insertBook(@RequestBody @Valid Book book) {
      return ResponseEntity.ok(bookServ.insertAllBook(Arrays.asList(book)));
    }
  
    public ResponseEntity<?> updateBook(@RequestBody @Valid Book Book) {
      return ResponseEntity.ok(bookServ.updateBook(Book));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteAuth(@PathVariable Long id) {
        bookServ.deleteAuth(id);
      return ResponseEntity.ok(null);
    }
}
