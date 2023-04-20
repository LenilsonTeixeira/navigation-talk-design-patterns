package com.lteixeira.externalapi.api.receitafederal;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.lteixeira.externalapi.enumeration.CPFStatus;

public record ReceitaFederalResponse(@JsonProperty("cpf") String cpf, @JsonProperty("status") CPFStatus status) { }
