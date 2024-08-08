package binaryoperator;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Representa uma operação que combina 2 argumentos do tipo T e retorna um resultado do mesmo tipo T.
 * É utilizada para realizar operaç~es de redução em pares de elementos, como somar números ou combinar objetos.
 */

public class BinaryOperatorExample {

    public static void main(String[] args) {

        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6);

        //BinaryOperator para somar com expressão lambda para somar 2 números
        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;
    
        //Método 1
        //Usar o BinaryOperator para somar 2 números no Stream
        int resultado = numeros.stream()
            .reduce(0, somar);

        //Método 2 utilizando lambda
        int resultado2 = numeros.stream()
            .reduce(0, (n1, n2) -> n1 + n2);

         //Método 3 utilizando method reference
         int resultado3 = numeros.stream()
         .reduce(0, Integer::sum);
    
        //Imprimi o resultado
        System.out.println("A soma dos números é: " + resultado);

        //Imprimi o resultado 2
        System.out.println("A soma dos números é: " + resultado2);

        //Imprimi o resultado 3
        System.out.println("A soma dos números é: " + resultado3);
    }    
}
