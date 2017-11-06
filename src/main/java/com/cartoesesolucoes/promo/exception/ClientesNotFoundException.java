package com.cartoesesolucoes.promo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ClientesNotFoundException extends RuntimeException {

    public ClientesNotFoundException(Long idcliente) {
        super("could not found cliente for Id : " + idcliente);
    }
}
