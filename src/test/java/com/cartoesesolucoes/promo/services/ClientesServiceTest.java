package com.cartoesesolucoes.promo.services;

import com.cartoesesolucoes.promo.PromoApplication;
import com.cartoesesolucoes.promo.models.Clientes;
import com.cartoesesolucoes.promo.services.IClientesService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = PromoApplication.class)
public class ClientesServiceTest {



    @Autowired
    private IClientesService ClientesService;



    @Test
    public void mustReturnFalseForNotExistClient() throws Exception {
        assertFalse (ClientesService.ClientExists (1l));

    }






}