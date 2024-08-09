import model.ContaCorrente;
import model.ContaPoupanca;

import java.util.ArrayList;
import java.util.List;

import model.Banco;
import model.Cliente;
import model.Conta;

public class App {
    public static void main(String[] args) throws Exception {

        Banco banco = new Banco();
        List<Conta> contas = new ArrayList<>();
        Cliente marcelo = new Cliente();
        marcelo.setNome("Marcelo");
        
        Conta contaCorrente = new ContaCorrente(marcelo);
        Conta contaPoupanca = new ContaPoupanca(marcelo);

        contaCorrente.depositar(100);
        contaCorrente.transferir(100, contaPoupanca);
        contaCorrente.imprimirExtrato();
        
        contaPoupanca.imprimirExtrato();
        contas.add(contaCorrente);
        contas.add(contaPoupanca);
        banco.setContas(contas);

        System.out.println(contas);;

    }
}
