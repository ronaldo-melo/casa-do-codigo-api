package com.apicasadocodigo.casadocodigo.util;

import com.apicasadocodigo.casadocodigo.model.Author;
import com.apicasadocodigo.casadocodigo.request.AuthorRequest;

public class AuthorRequestToModel {

    public static Author toAuthor(AuthorRequest requestBody){
        return requestBody.toModel();
    }

}
