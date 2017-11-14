package com.cartoesesolucoes.promo.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.cartoesesolucoes.promo.models.Clientes;
import com.cartoesesolucoes.promo.repositories.IClientesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



import com.cartoesesolucoes.promo.models.Movimentos;
import com.cartoesesolucoes.promo.repositories.IMovimentosRepository;
import com.cartoesesolucoes.promo.services.IMovimentosService;


@Service
public class MovimentosServiceImpl implements IMovimentosService {

	@Autowired
	IMovimentosRepository movimentosRepository;

	@Autowired
	IClientesRepository iClientesRepository;


	@Override
	public Optional <List<Movimentos>> movimentsConsult(Long idClient) {

		List<Movimentos> result = new ArrayList <> ();

		 iClientesRepository.findByidCliente (idClient)
				 .ifPresent (x -> {
					 Optional <List <Movimentos>> byClientes = movimentosRepository.findByClientes (x);
					 if(byClientes.isPresent ())
				 	          		result.addAll (byClientes.get ());
				 	        });
		return Optional.of (result);


	}
	
}
