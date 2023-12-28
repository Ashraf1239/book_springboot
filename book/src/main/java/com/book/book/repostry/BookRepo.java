package com.book.book.repostry;

import com.book.book.base.BaseRepo;
import com.book.book.entity.Book;
import java.util.Optional;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepo extends BaseRepo<Book, Long> {
  @Override
  @EntityGraph(attributePaths = { "author" })
  Optional<Book> findById(Long id);
}
