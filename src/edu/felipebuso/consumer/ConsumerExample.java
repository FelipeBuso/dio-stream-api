package edu.felipebuso.consumer;


import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

//      Usar o Consumer com expressão lambda para imprimir números pares
//        Consumer<Integer> imprimirNumeroPar = numero -> {
//            if (numero % 2 == 0) {
//                System.out.println(numero);
//            }
//        };
//        numeros.stream().forEach(imprimirNumeroPar);


//        numeros.stream().forEach(new Consumer<Integer>() {
//            @Override
//            public void accept(Integer integer) {
//                if(integer % 2 == 0) {
//                    System.out.println(integer);
//                }
//            }
//        });

        //Lambda
        numeros.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);
    }
}