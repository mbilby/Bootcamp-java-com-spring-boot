import Multifuncao.Multifuncao;
import navegador.Navegador;
import reprodutor.Reprodutor;
import telefone.Telefone;

public class IPhone {
    public static void main(String[] args) throws Exception {
        
        Telefone tf = new Multifuncao();
        tf.atender();

        Reprodutor rp = new Multifuncao();
        rp.pausar();

        Navegador nvg = new Multifuncao();

        nvg.atualizarPagina();
    }
}
