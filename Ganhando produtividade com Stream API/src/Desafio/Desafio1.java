package Desafio;

import java.util.List;
import utils.Utils;

/**Desafio 1 - Mostrar a lista em ordem númerica */
public class Desafio1 {

    public static void main(String[] args) {

        List<Integer> listaDeNumerosInteiros = Utils.getListaDeNumerosInteiros();
    
        //Método 1 - utilizando lambda
        listaDeNumerosInteiros.stream()
            .sorted()
            .forEach(n -> System.out.println(n));

        //Método 2 - method reference
        listaDeNumerosInteiros.stream()
            .sorted()
            .forEach(System.out::println);

    }
}
