package com.cartoesesolucoes.promo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cartoesesolucoes.promo.exception.MovimentosException;
import com.cartoesesolucoes.promo.models.Clientes;
import com.cartoesesolucoes.promo.models.Movimentos;
import com.cartoesesolucoes.promo.services.IMovimentosService;

import java.util.List;

@RestController
@RequestMapping(value = "/movimentosService")
public class MovimentosRestController {

	private IMovimentosService movimentosService;
	
	
	 @Autowired
	public MovimentosRestController(IMovimentosService movimentosService ){
		this.movimentosService = movimentosService;
	}
	
	
	 /**
     * /movimentosService/movimentos/1
     *
     * Method to return all movimentos of customer
     *
     * @param clienteId
     * @return
     */
    // MediaType.APPLICATION_JSON_VALUE
    @RequestMapping(method = RequestMethod.GET, value = "/movimentos/{clienteId}")
	List<Movimentos> getMovimentosClientes(@PathVariable Long clienteId)  {

        return this.movimentosService.movimentsConsult(clienteId)
                .orElseThrow (() -> new MovimentosException (clienteId));
    }

}
