package com.cartoesesolucoes.promo.controller;

import com.cartoesesolucoes.promo.models.Clientes;
import com.cartoesesolucoes.promo.services.IClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {


    private IClientesService clientesService;

    @Autowired
    public HomeController(IClientesService clientesService) {
        this.clientesService = clientesService;
    }

    @GetMapping("/")
    public String index(){
        return "index";
    }

    @GetMapping("/international")
    public String international(){

        return "index";
    }

    @RequestMapping("/list")
    public String list(Model model) {
        List<Clientes> users=clientesService.getAllClientes ();
        model.addAttribute("users", users);
        return "clientes";
    }


}
