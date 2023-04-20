package com.lteixeira.msanalisecredito.controller;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class PreAnaliseRequest {

    @JsonProperty("cpf")
    private String cpf;

    public static PreAnaliseRequest with(String cpf) {
        return new PreAnaliseRequest(cpf);
    }
}
