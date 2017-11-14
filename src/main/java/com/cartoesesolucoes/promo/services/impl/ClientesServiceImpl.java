package com.cartoesesolucoes.promo.services.impl;

import com.cartoesesolucoes.promo.exception.ClientesDiscountNotFoundException;
import com.cartoesesolucoes.promo.exception.ClientesNotFoundException;
import com.cartoesesolucoes.promo.models.Clientes;
import com.cartoesesolucoes.promo.repositories.IClientesRepository;
import com.cartoesesolucoes.promo.services.IClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClientesServiceImpl implements IClientesService {

    @Autowired
    private IClientesRepository clientesRepository;



    @Override
    public boolean ClientExists(Long idcliente) {

        return clientesRepository.findByidCliente (idcliente).isPresent ();


    }

    @Override
    public Optional<Clientes> getClient(Long idcliente) {

        return clientesRepository.findByidCliente (idcliente);

    }
    
   @Override
   public String getDiscountClient(Long idcliente){
	  return clientesRepository.getDiscountClientes (idcliente);
   }

    @Override
    public String ClientDiscount(Long idcliente) throws ClientesDiscountNotFoundException  {
  
    	if(clientesRepository.getDiscountClientes (idcliente)!= null){
        return clientesRepository.getDiscountClientes (idcliente);
    	}else{
    		throw new ClientesDiscountNotFoundException(idcliente);
    	}
    }

    @Override
    public List<Clientes> getAllClientes() {
        return clientesRepository.findAll ();
    }

    @Override
    public Clientes findById(Long id) throws ClientesNotFoundException {

        Optional <Clientes> byidCliente = clientesRepository.findByidCliente (id);
        if( byidCliente.isPresent ()){
            return byidCliente.get ();
        }else{
            throw  new ClientesNotFoundException (id);
        }
    }

    @Override
    public void save(Clientes clientes) {
        clientesRepository.save (clientes);
    }

    @Override
    public void delete(Long id) {
        clientesRepository.delete (id);
    }
}
