package com.cartoesesolucoes.promo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class MovimentosException extends RuntimeException {

	public MovimentosException(Long idcliente) {
		super("Clientes "+idcliente+ " don't have movimentos");
	}

}
