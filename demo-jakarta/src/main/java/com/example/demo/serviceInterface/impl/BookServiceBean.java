package com.example.demo.serviceInterface.impl;

import com.example.demo.model.Book;
import com.example.demo.repository.BookRepository;
import com.example.demo.serviceInterface.BookService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import java.util.Optional;

/**
* Generated by Springboot-3layer-Generator at Feb 26, 2023, 4:08:20 PM
*/
@Service
public class BookServiceBean implements BookService {

    @Autowired
    private BookRepository repository;

    @Override
    public Book create(Book entity) {
        return repository.save(entity);
    }

    @Override
    public Book update(Book entity) {
        return repository.save(entity);
    }

    @Override
    public Page<Book> find(Book entity, Pageable pageable) {
        Example<Book> example = Example.of(entity);
        return repository.findAll(example,pageable);
    }

    @Override
    public Optional<Book> getOne(java.lang.Integer primaryKey) {
        return repository.findById(primaryKey);
    }

    @Override
    public void delete(java.lang.Integer primaryKey) {
        repository.deleteById(primaryKey);
    }
}