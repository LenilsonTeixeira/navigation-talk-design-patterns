package com.lteixeira.msanalisecredito.external.receitafederal;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class ReceitaFederalRequest {

    @JsonProperty("cpf")
    private String cpf;

    @JsonFormat(pattern = "dd/MM/yyyy")
    @JsonProperty("dataNascimento")
    private LocalDate dataNascimento;
}
