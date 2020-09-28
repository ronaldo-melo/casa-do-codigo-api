package com.apicasadocodigo.casadocodigo.request;

import com.apicasadocodigo.casadocodigo.model.Author;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class AuthorRequest {

    @Email
    @NotNull
    private String email;

    @NotNull
    @NotBlank
    private String name;

    @NotNull
    @NotBlank
    @Column(length = 400)
    private String description;

    public AuthorRequest(String email, String name, String description) {
        this.email = email;
        this.name = name;
        this.description = description;
    }

    public Author toModel(){
        return new Author(email, name, description);
    }

}
