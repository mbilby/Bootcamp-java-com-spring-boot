package model;

public class Pessoa implements Comparable<Pessoa>{

    private String nome;
    private int idade;
    private double altura;


    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public double getAltura() {
        return this.altura;
    }

    @Override
    public String toString() {
        return "Pessoa {" +
        "nome: '" + nome + '\'' +
        ", idade: " + idade +
        ", altura: " + altura +
        '}';
    }

    @Override
    public int compareTo(Pessoa p) {
        return Integer.compare(idade, p.getIdade());
    }
}
