package Desafio;

import java.util.List;

import utils.Utils;

public class Desafio3 {

    public static void main(String[] args) {
        
        List<Integer> listaDeNumerosInteiros = Utils.getListaDeNumerosInteiros();

        boolean todosOsValoresSaoPositovos = listaDeNumerosInteiros.stream()
           .allMatch(n -> n > 0);  
        
           System.out.println(todosOsValoresSaoPositovos);
    }
    
}
