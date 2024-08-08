package supplier;

import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.List;

/**
 * Representa uma operação que não aceita nenhum argumento e retorna um resultado do tipo T.
 * É comumente usada para criar ou fornecer novos objetos de determinados tipos. 
 */
public class SupplierExample {

    public static void main(String[] args) {
        
        //Usar o Supplier com expressão lambda para fornecer uma saudação personalizada
        //Supplier<String> saudacao = () -> "Olá, seja bem vindo(a)!";

        //Método 1
        // List<String> saudacoes = Stream.generate(saudacao)
        //     .limit(5)
        //     .collect(Collectors.toList());

        //Método 2
        // List<String> saudacoes = Stream.generate(saudacao)
        //     .limit(5)
        //     .toList();

        //Método 3
        List<String> saudacoes = Stream.generate(() -> "Olá, seja bem vindo(a)")
            .limit(5)
            .toList();

        //Imprimir saudações geradas via lambda

        saudacoes.forEach(s -> System.out.println(s));

        //Imprimir saudações geradas via method reference

        saudacoes.forEach(System.out::println);

    }
}