package com.apicasadocodigo.casadocodigo.controller;

import com.apicasadocodigo.casadocodigo.model.Author;
import com.apicasadocodigo.casadocodigo.repository.AuthorRepository;
import com.apicasadocodigo.casadocodigo.request.AuthorRequest;
import com.apicasadocodigo.casadocodigo.util.AuthorRequestToModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
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

    @PostMapping
    public ResponseEntity<?> save(@RequestBody @Valid AuthorRequest requestBody, UriComponentsBuilder builder) {

        Author newAuthor = AuthorRequestToModel.toAuthor(requestBody);
        authorRepository.save(newAuthor);
        URI addressConsult = builder.path("/authors/{id}").build(newAuthor.getId());

        return ResponseEntity.created(addressConsult).build();
    }
}
