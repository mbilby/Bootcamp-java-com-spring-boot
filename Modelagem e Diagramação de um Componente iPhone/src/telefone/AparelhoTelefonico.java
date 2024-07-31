package telefone;

public class AparelhoTelefonico implements Telefone{

    public void ligar(String numero) {
        System.out.println("Ligando para :" + numero);
    }

    public void atender() {
        System.out.println("Atendendo ligação....");
    }

    public void iniciarCorreioVoz() {
        System.out.println("Inicioando correio de voz....");
    }
    
}
