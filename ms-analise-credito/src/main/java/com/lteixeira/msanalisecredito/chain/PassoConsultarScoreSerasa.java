package com.lteixeira.msanalisecredito.chain;

import com.lteixeira.msanalisecredito.controller.PreAnaliseCreditoResponse;
import com.lteixeira.msanalisecredito.external.score.ObterScoreHttpClient;
import com.lteixeira.msanalisecredito.external.score.ScoreResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PassoConsultarScoreSerasa implements PropostaAnaliseDeCreditoChain {
    @Autowired
    private PassoConsultarReceitaFederal passoConsultarReceitaFederal;

    @Autowired
    private ObterScoreHttpClient obterScoreHttpClient;

    @Override
    public PreAnaliseCreditoResponse execute(AnaliseDeCreditoRequestFacade facade) {

        log.info("Realizando consulta de Score no Serasa");

        ScoreResponse scoreResponse = obterScoreHttpClient.obterScore(facade.getClienteResponse().getCpf());

        facade.setScoreResponse(scoreResponse);

        return next().execute(facade);
    }

    @Override
    public PropostaAnaliseDeCreditoChain next() {
        return this.passoConsultarReceitaFederal;
    }
}
