package com.cartoesesolucoes.promo.api;


import com.cartoesesolucoes.promo.exception.ClientesNotFoundException;
import com.cartoesesolucoes.promo.models.Clientes;
import com.cartoesesolucoes.promo.services.IClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/clientService")
public class ClientRestController {

    private IClientesService clientesService;


    @Autowired
    public ClientRestController(IClientesService clientesService) {
        this.clientesService = clientesService;
    }



    /**
     * /clientService/cliente/1
     *
     * Method to show All Informations of the Customer
     *
     * @param clienteId
     * @return
     */
    // MediaType.APPLICATION_JSON_VALUE
    @RequestMapping(method = RequestMethod.GET, value = "/cliente/{clienteId}")
    Clientes getClienteInformation(@PathVariable Long clienteId)  {
        return this.clientesService.getClient (clienteId)
                .orElseThrow (() -> new ClientesNotFoundException (clienteId));
    }

    
    /**
     * /clientService/cliente/1
     *
     * Method to show All Informations of the Customer
     *
     * @param clienteId
     * @return
     */
    // MediaType.APPLICATION_JSON_VALUE
    @RequestMapping(method = RequestMethod.GET, value = "/clienteDiscount/{clienteId}")
    String getDiscount(@PathVariable Long clienteId)  {
        return this.clientesService.getDiscountClient(clienteId);
    } 
    
    
}
