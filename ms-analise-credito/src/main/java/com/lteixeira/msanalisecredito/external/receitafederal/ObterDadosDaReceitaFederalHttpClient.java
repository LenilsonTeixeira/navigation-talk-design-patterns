package com.lteixeira.msanalisecredito.external.receitafederal;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.cloud.openfeign.SpringQueryMap;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "receitaFederalService", url = "${external.api.url}")
public interface ObterDadosDaReceitaFederalHttpClient {

    @GetMapping("/situacao-cadastral")
    ReceitaFederalResponse obterDadosCadastrais(@SpringQueryMap ReceitaFederalRequest receitaFederalRequest);
}
