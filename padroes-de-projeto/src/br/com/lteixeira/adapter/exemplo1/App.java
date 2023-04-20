package br.com.lteixeira.adapter.exemplo1;

import java.util.List;
import java.util.Set;

public class App {

    public static void main(String[] args) {

        List<String> frutas = List.of("Maça", "Abacaxi", "Pera", "Banana", "Banana", "Abacaxi");

        Set<String> items = new ListToSetAdapter<>(frutas);

        items.forEach(System.out::println);

    }
}
