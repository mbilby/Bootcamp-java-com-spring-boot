package br.com.dio.desafio.dominio.model;

public abstract class Conteudo {

    public static final double XP_PADRAO = 10d;

    private String titulo;
    private String descricao;

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public abstract double calcularXP();
    
}
