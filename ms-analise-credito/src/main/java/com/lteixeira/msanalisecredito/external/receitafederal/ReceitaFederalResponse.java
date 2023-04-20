package com.lteixeira.msanalisecredito.external.receitafederal;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ReceitaFederalResponse {
    @JsonProperty("cpf")
    private String cpf;

    @JsonProperty("status")
    private String status;
}
