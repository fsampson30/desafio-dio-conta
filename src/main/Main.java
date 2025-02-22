package main;

import banco.Banco;
import cliente.Cliente;
import banco.Conta;
import banco.conta.tipos.ContaCorrente;
import banco.conta.tipos.ContaPoupanca;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Banco banco = new Banco();

        Conta cc = new ContaCorrente(100, new Cliente("Flavio","Sampson", LocalDateTime.now()));
        Conta poupanca = new ContaPoupanca(5000, new Cliente("Flavio","Sampson", LocalDateTime.now()));

        Conta cc1 = new ContaCorrente(100, new Cliente("Fernanda","Sampson", LocalDateTime.now()));
        Conta poupanca1 = new ContaPoupanca(5000, new Cliente("Fernanda","Sampson", LocalDateTime.now()));

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        cc1.imprimirExtrato();
        poupanca1.imprimirExtrato();

        cc.sacar(100);
        cc.depositar(50);

        banco.listarClientesConta();


    }
}