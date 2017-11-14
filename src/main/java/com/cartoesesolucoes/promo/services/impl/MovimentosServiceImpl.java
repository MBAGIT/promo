package com.cartoesesolucoes.promo.services.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.cartoesesolucoes.promo.models.Movimentos;
import com.cartoesesolucoes.promo.repositories.IMovimentosRepository;
import com.cartoesesolucoes.promo.services.IMovimentosService;


@Service
public class MovimentosServiceImpl implements IMovimentosService {

	@Autowired
	IMovimentosRepository movimentosRepository; 

	
	@Override
	public Optional <Movimentos> movimentsConsult(Long idClient) {
	
		return movimentosRepository.getMovementsOfClientes(idClient) ;
		
	}
	
}
