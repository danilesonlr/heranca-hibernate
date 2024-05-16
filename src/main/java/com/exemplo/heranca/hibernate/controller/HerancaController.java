package com.exemplo.heranca.hibernate.controller;


import com.exemplo.heranca.hibernate.model.Pessoa;
import com.exemplo.heranca.hibernate.service.HerancaService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class HerancaController {

    private HerancaService herancaService;

    public HerancaController(HerancaService herancaService) {
        this.herancaService = herancaService;
    }


    @GetMapping
    public List<Pessoa> getHeranca(){
        herancaService.popularBanco();
        return herancaService.getDados();
       // return "teste";
    }

 /*   @GetMapping("/login")
    public String login() {
        return "login"; // Nome do arquivo HTML sem extensão
    }*/
}
