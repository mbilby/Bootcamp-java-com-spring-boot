package Desafio;

import java.util.List;

import utils.Utils;

/**
 * Desafio 2 - realize a soma dos números e imprima o resultado no console.
 */

public class Desafio2 {
    public static void main(String[] args) {
        
        List<Integer> listaDeNumerosInteiros = Utils.getListaDeNumerosInteiros();

        int resultado = listaDeNumerosInteiros.stream()
            .filter(n -> n % 2 == 0)
            .reduce(0, Integer::sum);

        System.out.println("O resultado da soma é: " + resultado);
    }
}
