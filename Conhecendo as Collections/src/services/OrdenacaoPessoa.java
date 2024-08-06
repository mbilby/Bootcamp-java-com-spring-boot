package services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import model.Pessoa;

public class OrdenacaoPessoa {
    
    private List<Pessoa> listaDePessoas;


    public OrdenacaoPessoa() {
        this.listaDePessoas = new ArrayList<>();
    }

    public void adicionarPessoas(String nome, int idade, double altura) {
        listaDePessoas.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPessoaPorIdade() {
        List<Pessoa> pessoasOrdenadaPorIdade = new ArrayList<>(listaDePessoas);
        if (!listaDePessoas.isEmpty()) {
            Collections.sort(pessoasOrdenadaPorIdade);
        }
        return pessoasOrdenadaPorIdade;
    }

    public List<Pessoa> ordenarPessoaPorAltura() {
        List<Pessoa> pessoasOrdenadaPorAltura = new ArrayList<>(listaDePessoas);
        if (!listaDePessoas.isEmpty()) {
            Collections.sort(pessoasOrdenadaPorAltura, new OrdenacaoPorAltura());
        }
        return pessoasOrdenadaPorAltura;
    }

    public List<Pessoa> getListaPessoas() {
        List<Pessoa> retornaListaDePessoas = new ArrayList<>(listaDePessoas);
        return retornaListaDePessoas;
        
    }
}
