package com.lteixeira.msanalisecredito.external.score;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "scoreService", url = "${external.api.url}")
public interface ObterScoreHttpClient {

    @GetMapping("/score/{cpf}")
    ScoreResponse obterScore(@PathVariable("cpf") String cpf);
}
