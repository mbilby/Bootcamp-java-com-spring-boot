package reprodutor;

public class ITunes implements Reprodutor {

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
