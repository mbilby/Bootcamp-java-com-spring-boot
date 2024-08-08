package consumer;

import java.util.List;
import java.util.function.Consumer;
import java.util.Arrays;

public class ConsumerExample {
    public static void main (String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        Consumer<Integer> imprimirNumerosPares = numero -> {
            if(numero % 2 == 0) {
                System.out.println(numero);
            }
        };

        numeros.stream().forEach(imprimirNumerosPares);

        numeros.stream().forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });

        numeros.forEach(n -> {
            if (n % 2 == 0) {
                System.out.println(n);
            }
        });
    }
}