package com.cartoesesolucoes.promo.services.impl;

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
    public Optional<Clientes> ClientExists(Long idcliente) {

        return Optional.of (clientesRepository.findOne (idcliente));


    }

    @Override
    public String ClientDiscount(Long idcliente) {

        if (!ClientExists (idcliente).isPresent ()) return "0"; // default value
        return clientesRepository.findOne (idcliente).getDescontos ();


    }
}
