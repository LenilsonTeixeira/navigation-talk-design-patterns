package com.lteixeira.externalapi.api.analisecredito;

import com.lteixeira.externalapi.enumeration.PropostaStatus;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
@RequestMapping("analise-credito")
public class AnaliseCreditoController {

    @PostMapping
    public AnaliseCreditoResponse realizarAnalise(@RequestBody @Valid AnaliseRequest analiseRequest) {

        Integer numeroProposta = new Random().nextInt(1000000);

        if (analiseRequest.getScore() > 650) {
            return new AnaliseCreditoResponse(numeroProposta.toString(), analiseRequest.getCpf(), analiseRequest.getNome(), PropostaStatus.APROVADA);
        }
        return new AnaliseCreditoResponse(numeroProposta.toString(), analiseRequest.getCpf(), analiseRequest.getNome(), PropostaStatus.NEGADA);
    }
}
