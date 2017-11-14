package com.cartoesesolucoes.promo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;


@ResponseStatus(HttpStatus.NOT_FOUND)
public class ClientesDiscountNotFoundException extends RuntimeException{

	    
	    public ClientesDiscountNotFoundException(Long idClient){
	    	super("Client for Id: "+idClient +" don't have discount");
	    }
}
