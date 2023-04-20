package br.com.lteixeira.builder.padrao2;


public class App {
    public static void main(String[] args) {
        Comprador comprador = CompradorBuilder.builder()
                .adicionarCpf("07032256756")
                .adicionarNome("Lilian")
                .adicionarRg("63437343885")
                .adicionarEmail("lilian@gmail.com")
                .adicionarTelefone("34999999999")
                .adicionarDataNascimento("12/12/2012")
                .get();

        System.out.println(comprador);
    }
}
