package com.cartoesesolucoes.promo.services.impl;

import com.cartoesesolucoes.promo.models.Clientes;
import com.cartoesesolucoes.promo.repositories.IClientesRepository;
import com.cartoesesolucoes.promo.services.IClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientesServiceImpl implements IClientesService {

    @Autowired
    private IClientesRepository clientesRepository;



    @Override
    public boolean ClientExists(Long idcliente) {

        return clientesRepository.findByidCliente (idcliente).isPresent ();


    }

    @Override
    public String ClientDiscount(Long idcliente) {

        return clientesRepository.findByidCliente (idcliente).get ().getDescontos ();
    }

    @Override
    public List<Clientes> getAllClientes() {
        return clientesRepository.findAll ();
    }
}
