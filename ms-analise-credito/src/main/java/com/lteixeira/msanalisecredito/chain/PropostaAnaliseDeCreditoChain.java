package com.lteixeira.msanalisecredito.chain;

import com.lteixeira.msanalisecredito.controller.PreAnaliseCreditoResponse;

public interface PropostaAnaliseDeCreditoChain {

    PreAnaliseCreditoResponse execute(AnaliseDeCreditoRequestFacade analiseDeCreditoRequestFacade);

    PropostaAnaliseDeCreditoChain next();

    default PreAnaliseCreditoResponse response(String cpf, String nome, String numeroProposta, String propostaStatus, String identificador) {
        return PreAnaliseCreditoResponse.builder()
                .cpf(cpf)
                .nome(nome)
                .numeroProposta(numeroProposta)
                .propostaStatus(propostaStatus)
                .identificador(identificador)
                .build();
    }
}
