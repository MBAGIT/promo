package com.cartoesesolucoes.promo.services.impl;

import com.cartoesesolucoes.promo.exception.ClientesNotFoundException;
import com.cartoesesolucoes.promo.models.Clientes;
import com.cartoesesolucoes.promo.repositories.ClientesRepository;
import com.cartoesesolucoes.promo.services.ClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ClientesServiceImpl implements ClientesService {

    @Autowired
    private ClientesRepository clientesRepository;



    @Override
    public boolean ClientExists(Long idcliente) {

        return clientesRepository.findByidCliente (idcliente).isPresent ();


    }

    @Override
    public String ClientDiscount(Long idcliente) {

        return clientesRepository.findByidCliente (idcliente).get ().getDescontos ();
    }
}
