package edu.felipebuso.desafio;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.DoubleStream;

public class Desafio5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);
        List<Integer> numerosMaiores5 = numeros.stream().filter(n -> n > 5).toList();
        OptionalDouble media = numerosMaiores5.stream().mapToDouble(Integer::doubleValue).average();
        System.out.println(media);
    }
}
