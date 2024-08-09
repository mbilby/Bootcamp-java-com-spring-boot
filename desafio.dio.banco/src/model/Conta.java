package model;

import contrato.IConta;


public abstract class Conta implements IConta{

    protected static int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;
    private int agencia;
    private int numero;
    protected double saldo;
    protected Cliente cliente;

    

    public Conta(Cliente cliente) {

        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL ++;
        this.cliente = cliente;
    }

    
    public int getAgencia() {return this.agencia;}

    public int getNumero() {return this.numero;}

    public double getSaldo() {return this.saldo;}

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {

        System.out.println("*** EXTRATO ****");
        System.out.println(String.format("Cliente: %s" , this.cliente.getNome()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número da conta: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    @Override
    public String toString() {
        return "Conta {" + 
            " Nome: '" + this.cliente.getNome() + '\'' +
            ", Agência: " + this.agencia +
            ", Numero da conta: " + this.numero +
            ", Saldo : " + this.saldo +
            "}";
    }

}
