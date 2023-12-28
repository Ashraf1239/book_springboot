package com.book.book.repostry;

import com.book.book.base.BaseRepo;
import com.book.book.entity.Author;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthRep extends BaseRepo<Author, Long> {}
