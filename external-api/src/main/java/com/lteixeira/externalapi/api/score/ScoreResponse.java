package com.lteixeira.externalapi.api.score;

import com.fasterxml.jackson.annotation.JsonProperty;

public record ScoreResponse(@JsonProperty("cpf") String cpf, @JsonProperty("score") Integer score) { }
