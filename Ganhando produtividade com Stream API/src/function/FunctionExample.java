package function;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;
import java.util.function.Function;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um resultado do tipo R.
 * É utilizado para transformar ou mapear os elementos do Stream em outros valores ou tipos. 
 */

public class FunctionExample {

    public static void main(String[] args) {

        //Lista de numeros inteiros
        List<Integer> inteiros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        //Usando Function com expressão lambda para dobrar todos os números
        //Function<Integer, Integer> dobrarNumeros = numero -> numero * 2;

        //Método 1
        // List<Integer> numerosDobrados = inteiros.stream()
        //     .map(dobrarNumeros)
        //     .toList();

        //Método 2
        List<Integer> numerosDobrados = inteiros.stream()
            .map(n -> n * 2)
            .toList();

        //Imprimir numeros dobrados usando method reference
        numerosDobrados.forEach(System.out::println);

        //Imprimir numeros dobrados usando lambda
        numerosDobrados.forEach(n -> System.out.println(n));

    }
}
