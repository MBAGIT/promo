package com.cartoesesolucoes.promo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {


    @GetMapping("/")
    public String index(){return "index";}

    @GetMapping("/client")
    public String redirectClients(){
        return "redirect:/cliente/list";
    }

    @GetMapping("/international")
    public String international(){ return "index";}




}
