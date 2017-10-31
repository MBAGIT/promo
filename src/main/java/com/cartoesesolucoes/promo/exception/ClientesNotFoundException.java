package com.cartoesesolucoes.promo.exception;


public class ClientesNotFoundException extends Throwable {

    public ClientesNotFoundException(Long idcliente) {
        super("could not found client for Id : " + idcliente);
    }
}
