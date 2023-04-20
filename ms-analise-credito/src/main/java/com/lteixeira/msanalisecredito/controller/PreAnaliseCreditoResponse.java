package com.lteixeira.msanalisecredito.controller;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class PreAnaliseCreditoResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty("identificador")
    private String identificador;

    @JsonProperty("numeroProposta")
    private String numeroProposta;

    @JsonProperty("cpf")
    private String cpf;

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("propostaStatus")
    private String propostaStatus;
}
