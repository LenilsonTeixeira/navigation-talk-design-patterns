package com.lteixeira.msanalisecredito.chain;

import com.lteixeira.msanalisecredito.controller.PreAnaliseCreditoResponse;
import com.lteixeira.msanalisecredito.external.analisecredito.AnaliseDeCreditoRequest;
import com.lteixeira.msanalisecredito.external.analisecredito.AnaliseDeCreditoResponse;
import com.lteixeira.msanalisecredito.external.analisecredito.ObterResultadoAnaliseDeCreditoHttpClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
public class PassoConsultaAnaliseDeCredito implements PropostaAnaliseDeCreditoChain {

    @Autowired
    private ObterResultadoAnaliseDeCreditoHttpClient obterResultadoAnaliseDeCreditoHttpClient;

    @Override
    public PreAnaliseCreditoResponse execute(AnaliseDeCreditoRequestFacade facade) {

        log.info("Consultando API de análise de crédito");

        AnaliseDeCreditoRequest analiseDeCreditoRequest = AnaliseDeCreditoRequest
                .builder()
                .cpf(facade.getClienteResponse().getCpf())
                .nome(facade.getClienteResponse().getNome())
                .dataNascimento(facade.getClienteResponse().getDataAniversario())
                .score(facade.getScoreResponse().getScore())
                .build();

         AnaliseDeCreditoResponse analiseDeCreditoResponse = obterResultadoAnaliseDeCreditoHttpClient.obterResultadoAnaliseDeCredito(analiseDeCreditoRequest);

         String identificador = UUID.randomUUID().toString();
         String cpf = analiseDeCreditoResponse.getCpf();
         String nome = analiseDeCreditoResponse.getNome();
         String numeroProposta = analiseDeCreditoResponse.getNumeroProposta();
         String statusProposta = analiseDeCreditoResponse.getPropostaStatus();

         return response(cpf, nome, numeroProposta, statusProposta, identificador);
    }

    @Override
    public PropostaAnaliseDeCreditoChain next() {
        throw new UnsupportedOperationException("Final do fluxo de análise de crédito");
    }

}
