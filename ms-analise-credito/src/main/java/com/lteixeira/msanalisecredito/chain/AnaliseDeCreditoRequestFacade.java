package com.lteixeira.msanalisecredito.chain;

import com.lteixeira.msanalisecredito.controller.PreAnaliseRequest;
import com.lteixeira.msanalisecredito.external.cliente.ClienteResponse;
import com.lteixeira.msanalisecredito.external.receitafederal.ReceitaFederalResponse;
import com.lteixeira.msanalisecredito.external.score.ScoreResponse;
import lombok.Data;

@Data
public class AnaliseDeCreditoRequestFacade {

    private PreAnaliseRequest request;

    private ClienteResponse clienteResponse;
    private ReceitaFederalResponse receitaFederalResponse;
    private ScoreResponse scoreResponse;

    private AnaliseDeCreditoRequestFacade(PreAnaliseRequest request) {
        this.request = request;
    }

    public static AnaliseDeCreditoRequestFacade with(PreAnaliseRequest request) {
        return new AnaliseDeCreditoRequestFacade(request);
    }
}
