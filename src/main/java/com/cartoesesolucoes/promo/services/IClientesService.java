package com.cartoesesolucoes.promo.services;

import com.cartoesesolucoes.promo.exception.ClientesNotFoundException;
import com.cartoesesolucoes.promo.models.Clientes;

import java.util.List;

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

    /**
     * Find all Clientes
     *
     * @return java.util.List {@link Clientes}
     */
    List<Clientes> getAllClientes();

    /**
     * search by idClientes
     *
     * @param id
     * @return
     */
    Clientes findById(Long id) throws ClientesNotFoundException;

    /**
     * save Clientes
     *
     * @param clientes
     */
    void save(Clientes clientes);


    /**
     * delete Clientes
     * @param id
     */
    void delete(Long id );






}
