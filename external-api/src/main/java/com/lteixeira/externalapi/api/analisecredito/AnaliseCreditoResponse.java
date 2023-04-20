package com.lteixeira.externalapi.api.analisecredito;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lteixeira.externalapi.enumeration.PropostaStatus;

public record AnaliseCreditoResponse(@JsonInclude(JsonInclude.Include.NON_EMPTY)
                                 @JsonProperty("numeroProposta")
                                 String numeroProposta,
                                     @JsonProperty("cpf")
                                 String cpf,
                                     @JsonProperty("nome")
                                 String nome,
                                     @JsonProperty("propostaStatus")
                                 PropostaStatus propostaStatus
) {
}
