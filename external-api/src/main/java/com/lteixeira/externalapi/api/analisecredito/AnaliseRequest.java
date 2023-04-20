package com.lteixeira.externalapi.api.analisecredito;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lteixeira.externalapi.annotation.MaiorIdade;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AnaliseRequest {
    @JsonProperty("cpf")
    private String cpf;

    @JsonProperty("nome")
    private String nome;

    @MaiorIdade
    @JsonFormat(pattern = "dd/MM/yyyy")
    @JsonProperty("dataNascimento")
    private LocalDate dataNascimento;

    @JsonProperty("score")
    private Integer score;
}
