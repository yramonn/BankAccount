package com.sovos;

public class Main {
    public static void main(String[] args) {


         Cliente Ramon = new Cliente();
         Ramon.setNome("Ramon");

        Conta cc = new ContaCorrente(Ramon);
        Conta pp = new ContaPoupanca(Ramon);

        cc.depositar(100);
        cc.transferir(100, pp);

       // Cliente Giovanna = new Cliente();
        //Giovanna.setNome("");


        //Conta cc = new ContaCorrente();
        //Conta pp = new ContaPoupanca();


        cc.depositar(100);
        cc.transferir(100, pp);



       cc.imprimirExtrato();
       pp.imprimirExtrato();

    }

}
