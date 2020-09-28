package com.apicasadocodigo.casadocodigo.model;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.OffsetDateTime;
import java.util.Objects;

@Entity
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private OffsetDateTime instance;

    @Column(unique = true)
    private String email;

    private String name;

    private String description;

    @Deprecated
    public Author() {
    }

    public Author(String email, String name, String description){

        this.email = email;
        this.name = name;
        this.description = description;

        this.instance = OffsetDateTime.now();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public OffsetDateTime getInstancee() {
        return instance;
    }

    public void setInstancee(OffsetDateTime instancee) {
        this.instance = instancee;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Author)) return false;
        Author author = (Author) o;
        return getId().equals(author.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
