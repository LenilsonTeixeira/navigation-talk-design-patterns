package com.lteixeira.msanalisecredito.external.analisecredito;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "analiseDeCreditoService", url = "${external.api.url}")
public interface ObterResultadoAnaliseDeCreditoHttpClient {

    @PostMapping("/analise-credito")
    AnaliseDeCreditoResponse obterResultadoAnaliseDeCredito(@RequestBody AnaliseDeCreditoRequest analiseDeCreditoRequest);
}
