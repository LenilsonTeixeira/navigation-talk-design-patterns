package com.lteixeira.msanalisecredito.service;

import com.lteixeira.msanalisecredito.controller.PreAnaliseCreditoResponse;
import com.lteixeira.msanalisecredito.controller.PreAnaliseRequest;
import com.lteixeira.msanalisecredito.chain.AnaliseDeCreditoRequestFacade;
import com.lteixeira.msanalisecredito.chain.PassoConsultarInformacoesDoCliente;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class PreAnaliseService {

    @Autowired
    private PassoConsultarInformacoesDoCliente passoConsultarInformacoesDoCliente;

    public PreAnaliseCreditoResponse executar(PreAnaliseRequest analiseDeCreditoRequest) {
        log.info("Preparando para realizar processamento no fluxo de consulta de pré análise");
        return passoConsultarInformacoesDoCliente.execute(AnaliseDeCreditoRequestFacade.with(analiseDeCreditoRequest));
    }
}
