package com.cartoesesolucoes.promo.services;

import com.cartoesesolucoes.promo.models.Clientes;

import java.util.Optional;

/**
 * Created by Mohamed on 31/10/2017.
 */
public interface ClientesService {


    /**
     * Check if client existe
     * @param idcliente
     * @return
     */
    Optional<Clientes> ClientExists(Long idcliente);


    /**
     * Return descontos field from client
     *
     * @param idcliente
     * @return
     */
    String ClientDiscount(Long idcliente);






}
