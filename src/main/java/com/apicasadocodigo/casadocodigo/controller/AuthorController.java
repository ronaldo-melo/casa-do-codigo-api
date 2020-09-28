package com.apicasadocodigo.casadocodigo.controller;

import com.apicasadocodigo.casadocodigo.model.Author;
import com.apicasadocodigo.casadocodigo.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorController {

    @Autowired
    private AuthorRepository authorRepository;

    @GetMapping
    public List<Author> findAll() {
        return authorRepository.findAll();
    }

}
