package edu.felipebuso.desafio;

import java.util.Arrays;
import java.util.List;

public class Desafio3 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        Boolean ePar = numeros.stream().noneMatch(n -> n < 0);
        System.out.println(ePar ? "Todos os números são pares" : "Nem todos os números são pares");

    }
}
