package com.lteixeira.externalapi.api.receitafederal;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.lteixeira.externalapi.enumeration.CPFStatus.ATIVO;

@RestController
@RequestMapping("situacao-cadastral")
public class ReceitaFederalController {

    @GetMapping
    public ReceitaFederalResponse consultarCpf(@Valid DadosPessoaFisicaRequest dadosPessoaFisicaRequest) {
        return new ReceitaFederalResponse(dadosPessoaFisicaRequest.getCpf(), ATIVO);
    }
}
