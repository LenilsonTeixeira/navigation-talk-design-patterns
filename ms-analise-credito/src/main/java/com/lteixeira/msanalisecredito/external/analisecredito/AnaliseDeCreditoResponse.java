package com.lteixeira.msanalisecredito.external.analisecredito;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class AnaliseDeCreditoResponse {
    @JsonProperty("numeroProposta")
    private String numeroProposta;

    @JsonProperty("cpf")
    private String cpf;

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("propostaStatus")
    private String propostaStatus;
}
