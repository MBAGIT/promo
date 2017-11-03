package com.cartoesesolucoes.promo.controller;

import com.cartoesesolucoes.promo.exception.ClientesNotFoundException;
import com.cartoesesolucoes.promo.models.Clientes;
import com.cartoesesolucoes.promo.services.IClientesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("cliente")
public class ClienteController {


    private IClientesService clientesService;

    @Autowired
    public ClienteController(IClientesService clientesService) {
        this.clientesService = clientesService;
    }

    @RequestMapping("/")
    public String index() {
        return "redirect:/list";
    }

    @RequestMapping("/list")
    public String list(Model model) {
        List<Clientes> clientes=clientesService.getAllClientes ();
        model.addAttribute("clientes", clientes);
        return "cliente/clientes";
    }

    @RequestMapping("/toAdd")
    public String toAdd() {
        return "cliente/AddCliente";
    }

    @RequestMapping("/add")
    public String add(Clientes clientes) {
        clientesService.save(clientes);
        return "redirect:/list";
    }

    @RequestMapping("/toEdit")
    public String toEdit(Model model,Long id) throws ClientesNotFoundException {
        Clientes clientes=clientesService.findById (id);
        model.addAttribute("clientes", clientes);
        return "cliente/editCliente";
    }

    @RequestMapping("/edit")
    public String edit(Clientes clientes) {
        clientesService.save (clientes);
        return "redirect:/list";
    }


    @RequestMapping("/delete")
    public String delete(Long id) {
        clientesService.delete(id);
        return "redirect:/list";
    }
}
