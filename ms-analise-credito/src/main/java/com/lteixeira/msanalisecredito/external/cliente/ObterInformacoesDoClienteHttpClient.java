package com.lteixeira.msanalisecredito.external.cliente;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "clienteService", url = "${external.api.url}")
public interface ObterInformacoesDoClienteHttpClient {

    @GetMapping("/clientes/{cpf}")
    ClienteResponse obterInformacoes(@PathVariable("cpf") String cpf);
}
