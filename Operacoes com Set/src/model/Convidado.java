package model;

import java.util.Objects;
import java.lang.Comparable;

public class Convidado implements Comparable<Convidado> {

    private String nome;

    private int codigoConvite;

    public Convidado(String nome, int codigoConvite) {
        this.nome = nome;
        this.codigoConvite = codigoConvite;
    }

    @Override
    public int compareTo(Convidado c) {
        return nome.compareToIgnoreCase(c.getNome());
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodigoConvite() {
        return this.codigoConvite;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Convidado convidado)) return false;
        return getCodigoConvite() == convidado.codigoConvite;
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCodigoConvite());
    }

    @Override
    public String toString() {
        return "Convidado {" +
        "nome: '" + nome + '\'' +
        ", codigoConvite: " + codigoConvite +
        '}';
    }
}