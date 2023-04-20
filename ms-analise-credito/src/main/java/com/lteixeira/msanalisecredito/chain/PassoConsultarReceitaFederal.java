package com.lteixeira.msanalisecredito.chain;

import com.lteixeira.msanalisecredito.controller.PreAnaliseCreditoResponse;
import com.lteixeira.msanalisecredito.external.receitafederal.ObterDadosDaReceitaFederalHttpClient;
import com.lteixeira.msanalisecredito.external.receitafederal.ReceitaFederalRequest;
import com.lteixeira.msanalisecredito.external.receitafederal.ReceitaFederalResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PassoConsultarReceitaFederal implements PropostaAnaliseDeCreditoChain {

    @Autowired
    private PassoConsultaAnaliseDeCredito passoConsultaAnaliseDeCredito;

    @Autowired
    private ObterDadosDaReceitaFederalHttpClient obterDadosDaReceitaFederalHttpClient;

    @Override
    public PreAnaliseCreditoResponse execute(AnaliseDeCreditoRequestFacade facade) {

        log.info("Realizando consulta na Receita Federal");

        ReceitaFederalRequest receitaFederalRequest = ReceitaFederalRequest
                .builder()
                .cpf(facade.getClienteResponse().getCpf())
                .dataNascimento(facade.getClienteResponse().getDataAniversario())
                .build();

        ReceitaFederalResponse receitaFederalResponse = obterDadosDaReceitaFederalHttpClient.obterDadosCadastrais(receitaFederalRequest);

        facade.setReceitaFederalResponse(receitaFederalResponse);

        return next().execute(facade);
    }

    @Override
    public PropostaAnaliseDeCreditoChain next() {
        return this.passoConsultaAnaliseDeCredito;
    }
}
