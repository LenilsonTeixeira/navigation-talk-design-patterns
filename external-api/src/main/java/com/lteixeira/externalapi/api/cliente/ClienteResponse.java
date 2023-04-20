package com.lteixeira.externalapi.api.cliente;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.LocalDate;

public record ClienteResponse(@JsonProperty("cpf") String cpf, @JsonProperty("nome") String nome, @JsonProperty("dataAniversario") LocalDate dataAniversario) { }
