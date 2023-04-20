package com.lteixeira.externalapi.api.cliente;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("clientes")
public class ClienteController {

    @GetMapping("/{cpf}")
    public ClienteResponse obterInformacoesDoCliente(@PathVariable("cpf") String cpf) {
        return new ClienteResponse(cpf, "Lenilson Teixeira", LocalDate.of(1991,4,26));
    }
}
