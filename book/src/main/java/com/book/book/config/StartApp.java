package com.book.book.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.book.book.entity.Author;
import com.book.book.entity.Book;
import com.book.book.service.AuthServ;
import com.book.book.service.BookServ;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private AuthServ authServ;
    @Autowired
    private BookServ bookServ;
    @Override
    public void run(String... args) throws Exception {
        if(authServ.findall().isEmpty()){
            Author author1=new Author();
            author1.setName("ashraf");
            Author author2=new Author();
            author2.setName("ahmed");
            Author author3=new Author();
            author3.setName("mohamed");
            authServ.insertAllAuthor(Arrays.asList(author1,author2,author3));
            Book book1= new Book();
            book1.setName("علم النفس");
            book1.setAuthor(author1);
            book1.setPrice(300);
            bookServ.insertAllBook(Arrays.asList(book1));
            Book book2= new Book();
            book2.setName("علم الاجتماع");
            book2.setAuthor(author1);
            book2.setPrice(400);
            bookServ.insertAllBook(Arrays.asList(book2));
            Book book3= new Book();
            book3.setName("علم السياسه");
            book3.setAuthor(author1);
            book3.setPrice(400);
            bookServ.insertAllBook(Arrays.asList(book3));
           
        }
    }

    
}
