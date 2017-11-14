package com.cartoesesolucoes.promo.services;

import com.cartoesesolucoes.promo.exception.ClientesDiscountNotFoundException;
import com.cartoesesolucoes.promo.exception.ClientesNotFoundException;
import com.cartoesesolucoes.promo.models.Clientes;

import java.util.List;
import java.util.Optional;

public interface IClientesService {


    /**
     * Check if client existe
     * @param idcliente
     * @return
     */
    boolean ClientExists(Long idcliente);


    /**
     * check exist cliente
     *
     * @param idcliente
     * @return
     */
    Optional<Clientes> getClient(Long idcliente);


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
