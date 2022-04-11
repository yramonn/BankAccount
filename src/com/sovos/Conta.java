package com.sovos;

public abstract class Conta implements Operacoes {

    protected static int AgenciaPadrao = 001;
    protected static int SEQUENCIAL = 1;


    protected int numero;
    protected int agencia;
    protected double saldo;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = Conta.AgenciaPadrao;
        this.numero = Conta.SEQUENCIAL;
        this.cliente = cliente;


    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;

    }


    @Override
    public void transferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        contaDestino.depositar(valor);

    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;

    }
    protected void imprimirInfosComuns() {
        System.out.println("Titular: " + this.cliente.getNome());
        System.out.println(("Agencia: "+this.agencia));
        System.out.println(("Numero: " + this.numero));
        System.out.println(("Saldo: "+ this.saldo));
    }

    public void imprimirExtrato() {

    }






}
