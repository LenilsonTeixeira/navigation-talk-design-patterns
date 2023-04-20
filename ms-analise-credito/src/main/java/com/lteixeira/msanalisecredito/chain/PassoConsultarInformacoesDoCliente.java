package com.lteixeira.msanalisecredito.chain;

import com.lteixeira.msanalisecredito.controller.PreAnaliseCreditoResponse;
import com.lteixeira.msanalisecredito.external.cliente.ClienteResponse;
import com.lteixeira.msanalisecredito.external.cliente.ObterInformacoesDoClienteHttpClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PassoConsultarInformacoesDoCliente implements PropostaAnaliseDeCreditoChain {

    @Autowired
    private PassoConsultarScoreSerasa passoConsultarScoreSerasa;

    @Autowired
    private ObterInformacoesDoClienteHttpClient obterInformacoesDoClienteHttpClient;

    @Override
    public PreAnaliseCreditoResponse execute(AnaliseDeCreditoRequestFacade facade) {

        log.info("Realizando consulta de informações do cliente");

        ClienteResponse clienteResponse = obterInformacoesDoClienteHttpClient.obterInformacoes(facade.getRequest().getCpf());

        facade.setClienteResponse(clienteResponse);

        return next().execute(facade);
    }

    @Override
    public PropostaAnaliseDeCreditoChain next() {
        return this.passoConsultarScoreSerasa;
    }
}
