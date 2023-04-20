package com.lteixeira.externalapi.api.receitafederal;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.lteixeira.externalapi.annotation.MaiorIdade;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DadosPessoaFisicaRequest {

    @JsonProperty("cpf")
    @CPF(message = "Deve informar um CPF válido")
    private String cpf;

    @MaiorIdade
    @JsonFormat(pattern = "dd/MM/yyyy")
    @JsonProperty("dataNascimento")
    @NotNull(message = "Data de aniversário é obrigatória")
    private LocalDate dataNascimento;
}
