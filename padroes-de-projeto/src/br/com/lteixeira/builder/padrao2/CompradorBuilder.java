package br.com.lteixeira.builder.padrao2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class CompradorBuilder {

    private Comprador comprador;

    public static CompradorBuilder builder() {
        return new CompradorBuilder();
    }

    public CompradorBuilder() {
        this.comprador = new Comprador();
    }

    public CompradorBuilder adicionarNome(String nome) {
        this.comprador.setNome(nome);
        return this;
    }

    public CompradorBuilder adicionarCpf(String cpf) {
        this.comprador.setCpf(cpf);
        return this;
    }

    public CompradorBuilder adicionarRg(String rg) {
        this.comprador.setRg(rg);
        return this;
    }

    public CompradorBuilder adicionarTelefone(String telefone) {
        this.comprador.setTelefone(telefone);
        return this;
    }

    public CompradorBuilder adicionarEmail(String email) {
        this.comprador.setEmail(email);
        return this;
    }

    public CompradorBuilder adicionarDataNascimento(String dataNascimento) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        this.comprador.setDataNascimento(LocalDate.parse(dataNascimento, formatter));
        return this;
    }

    public Comprador get() {
        return this.comprador;
    }
}
