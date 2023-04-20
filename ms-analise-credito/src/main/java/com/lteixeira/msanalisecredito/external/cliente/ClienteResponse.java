package com.lteixeira.msanalisecredito.external.cliente;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.time.LocalDate;

@Data
public class ClienteResponse {
    @JsonProperty("cpf")
    private String cpf;

    @JsonProperty("nome")
    private String nome;

    @JsonProperty("dataAniversario")
    private LocalDate dataAniversario;
}
