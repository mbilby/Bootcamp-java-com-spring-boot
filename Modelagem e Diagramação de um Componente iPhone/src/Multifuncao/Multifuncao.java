package Multifuncao;

import navegador.Navegador;
import reprodutor.Reprodutor;
import telefone.Telefone;

public class Multifuncao implements Telefone, Navegador, Reprodutor {

    public void ligar(String numero) {
        System.out.println("Ligando para :" + numero);
    }

    public void atender() {
        System.out.println("Atendendo ligação....");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Inicioando correio de voz....");
    }

    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }

    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba");
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página");
    } 

    public void tocar() {
        System.out.println("Tocando...");
    }

    public void pausar () {
        System.out.println("Em pausa...");
    }

    public void selecionarMusica (String musica) {
        System.out.println("Selcionando música: " + musica);
    }
    
}
