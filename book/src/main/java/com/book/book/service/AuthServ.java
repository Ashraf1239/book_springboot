package com.book.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.book.book.entity.Author;
import com.book.book.repostry.AuthRep;

@Service
public class AuthServ {
    @Autowired
    private AuthRep authRep;

    public Author getById ( Long id){

        return authRep.findById(id).orElseThrow(); 
    } 

    public List<Author> findall (){
        return authRep.findAll();
    }
    public Author insertAuthor(Author author){
        if(author.getId() !=null){
            throw new RuntimeException();
        }
        return authRep.save(author);
    }
    public List<Author> insertAllAuthor(List<Author> authors){
        
        return authRep.saveAll(authors);
    }
    public Author updateAuthor (Author author){
        Author obj= getById(author.getId());
        obj.setName(author.getName());
        return authRep.save(obj);
    }
    public void deleteAuth(Long id)
    {
         authRep.deleteById(id);
    }

    
}
