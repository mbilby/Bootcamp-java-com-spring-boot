package predicate;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
//import java.util.stream.Collectors;

/**
 * Representa uma função que aceita um argumento do tipo T e retorna um valor boleano
 * E comumente utilizado para filtrar elementos do Stream com base em algumas condições.
         */

public class PredicateExample {

    public static void main(String[] args) {
        
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        //Predicate que verifica se a palavra tem mais de 5 caracteres
        Predicate<String> verificaSeTemMaisDeCincoCaracteres = palavra -> palavra.length() > 5;

        //método 1 via lambda
        //Usar o stream para filtrar as palavras se a palavra tem mais de 5 caracteres
        //Em seguida imprimir cada palavra que passou pelo filtro
        palavras.stream()
            .filter(verificaSeTemMaisDeCincoCaracteres)
            .forEach(palavra -> System.out.println(palavra));

        //método 2 reference method
        //Usar o stream para filtrar as palavras se a palavra tem mais de 5 caracteres
        //Em seguida imprimir cada palavra que passou pelo filtro
        palavras.stream()
            .filter(verificaSeTemMaisDeCincoCaracteres)
            .forEach(System.out::println);

        //método 3 passando a expressão lambda dentro do filter
        palavras.stream()
            .filter(palavra -> palavra.length() < 5)
            .forEach(System.out::println);       
    }
}