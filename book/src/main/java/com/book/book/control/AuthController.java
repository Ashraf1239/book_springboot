package com.book.book.control;

import com.book.book.entity.Author;
import com.book.book.service.AuthServ;

import jakarta.validation.Valid;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/author")
public class AuthController {

  @Autowired
  private AuthServ authServ;
  @GetMapping("/{id}")
  public ResponseEntity<?> getById(@PathVariable Long id) {
    return ResponseEntity.ok(authServ.getById(id));
  }
  @GetMapping()
  public ResponseEntity<?> findall() {
    return ResponseEntity.ok(authServ.findall());
  }
  @PostMapping()
  @Transactional
  public ResponseEntity<?> insertAuthor(@RequestBody @Valid List<Author> authors) {
    return ResponseEntity.ok(authServ.insertAllAuthor(authors));
  }

  public ResponseEntity<?> updateAuthor(@RequestBody @Valid Author author) {
    return ResponseEntity.ok(authServ.updateAuthor(author));
  }
  @DeleteMapping("/{id}")
  public ResponseEntity<?> deleteAuth(@PathVariable Long id) {
    authServ.deleteAuth(id);
    return ResponseEntity.ok(null);
  }
}
