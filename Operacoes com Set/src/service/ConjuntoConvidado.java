package service;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import model.Convidado;

public class ConjuntoConvidado {
    
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidado() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        this.convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaRemover = null;

        for (Convidado c: convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            }
        }
        this.convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return this.convidadoSet.size();
    }

    public void exibirConvidados() {
        System.out.println(this.convidadoSet);
    }

    public void buscarConvidadoPorCodigoConvite(int codigoConvite) {
        Convidado convidadoParaBuscar = null;

        for(Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaBuscar = c;
                break;
            }
        }
        System.out.println(convidadoParaBuscar);
    }

    public void alterarConvidado(int codigoConvite, String nome) {
        Convidado convidadoAtualizado = null;

        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                c.setNome(nome);
                convidadoAtualizado = c;
                break;
            }
        }
        System.out.println(convidadoAtualizado);
    }

    public void exibirConvidadoPorNome() {
        Set<Convidado> convidados = new TreeSet<>(convidadoSet);
        System.out.println(convidados);
    }
}
