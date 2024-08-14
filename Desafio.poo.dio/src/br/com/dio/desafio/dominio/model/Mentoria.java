package br.com.dio.desafio.dominio.model;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate data;

    public LocalDate getData() {
        return this.data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    @Override
    public double calcularXP() {
        return XP_PADRAO + 20;
    }

    @Override
    public String toString() {

        return "Mentoria {" +
        "titulo: " + getTitulo() +
        " descrição: " + getDescricao() +
        " data: " + data +
        "}";
    }
    
}
