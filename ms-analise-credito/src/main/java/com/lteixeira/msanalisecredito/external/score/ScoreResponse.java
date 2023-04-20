package com.lteixeira.msanalisecredito.external.score;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class ScoreResponse {
    @JsonProperty("cpf")
    private String cpf;

    @JsonProperty("score")
    private Integer score;
}
