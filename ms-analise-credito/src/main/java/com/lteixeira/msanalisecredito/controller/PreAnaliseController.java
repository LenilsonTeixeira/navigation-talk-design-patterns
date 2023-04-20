package com.lteixeira.msanalisecredito.controller;

import com.lteixeira.msanalisecredito.service.PreAnaliseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pre-analise")
public class PreAnaliseController {

    @Autowired
    private PreAnaliseService preAnaliseService;

    @GetMapping("/{cpf}")
    public PreAnaliseCreditoResponse getPreAnalise(@PathVariable("cpf") String cpf) {

        return preAnaliseService.executar(PreAnaliseRequest.with(cpf));

    }
}
