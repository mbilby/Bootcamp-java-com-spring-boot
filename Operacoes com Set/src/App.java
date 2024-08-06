import service.ConjuntoConvidado;

public class App {
    public static void main(String[] args) throws Exception {
        
        ConjuntoConvidado conjuntoConvidado = new ConjuntoConvidado();
        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " convidados(s) dentro do Set Convidados");

        conjuntoConvidado.adicionarConvidado("Marcelo", 1234);
        conjuntoConvidado.adicionarConvidado("Marcio", 1235);
        conjuntoConvidado.adicionarConvidado("France", 1235);
        conjuntoConvidado.adicionarConvidado("Lucia", 1236);

        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " convidados(s) dentro do Set Convidados");

        conjuntoConvidado.removerConvidadoPorCodigoConvite(1234);
        System.out.println("Existem " + conjuntoConvidado.contarConvidados() + " convidados(s) dentro do Set Convidados");

        conjuntoConvidado.exibirConvidados();

        conjuntoConvidado.buscarConvidadoPorCodigoConvite(1235);

        conjuntoConvidado.alterarConvidado(1235, "Moises");

        conjuntoConvidado.exibirConvidados();

        conjuntoConvidado.exibirConvidadoPorNome();
    }
}
