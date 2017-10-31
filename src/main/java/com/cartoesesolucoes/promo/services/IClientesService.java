package com.cartoesesolucoes.promo.services;

import com.cartoesesolucoes.promo.models.Clientes;

import java.util.Optional;


public interface IClientesService {


    /**
     * Check if client existe
     * @param idcliente
     * @return
     */
    boolean ClientExists(Long idcliente);


    /**
     * Return descontos field from client
     *
     * @param idcliente
     * @return
     */
    String ClientDiscount(Long idcliente);






}
