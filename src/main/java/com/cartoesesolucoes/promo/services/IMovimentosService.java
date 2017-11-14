package com.cartoesesolucoes.promo.services;

import java.util.Optional;

import com.cartoesesolucoes.promo.exception.MovimentosException;
import com.cartoesesolucoes.promo.models.Movimentos;

public interface IMovimentosService {
	
	Optional <Movimentos> movimentsConsult(Long idClient) ;

}
