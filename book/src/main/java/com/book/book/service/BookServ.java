package com.book.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.book.entity.Book;
import com.book.book.repostry.BookRepo;

@Service
public class BookServ {
    @Autowired
    private BookRepo bookRepo;

    public Book getById ( Long id){

        return bookRepo.findById(id).orElseThrow(); 
    } 

    public List<Book> findall (){
        return bookRepo.findAll();
    }
    public Book insertBook(Book Book){
        if(Book.getId() !=null){
            throw new RuntimeException();
        }
        return bookRepo.save(Book);
    }
    public List<Book> insertAllBook(List<Book>Books){
        
        return bookRepo.saveAll(Books);
    }
    public Book updateBook (Book book){
        Book obj= getById(book.getId());
        obj.setName(book.getName());
        return bookRepo.save(obj);
    }
    public void deleteAuth(Long id)
    {
        bookRepo.deleteById(id);
    }

}
