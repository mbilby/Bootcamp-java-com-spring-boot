package br.com.dio.desafio.dominio.model;

public class Curso extends Conteudo{

    private int cargaHoraria;

    public Curso () {

    }

    public int getCargaHoraria() {
        return this.cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO * cargaHoraria;
    }

    @Override
    public String toString() {

        return "Curso {" +
        "titulo: " + getTitulo() +
        ", descrição: " + getDescricao() +
        ", cargaHoraria: " + cargaHoraria +
        "}";
    }

}