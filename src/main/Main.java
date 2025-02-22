package main;

import cliente.Cliente;
import conta.Conta;
import conta.ContaCorrente;
import conta.ContaPoupanca;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Conta cc = new ContaCorrente(100, new Cliente("Flavio","Sampson", LocalDateTime.now()));
        Conta poupanca = new ContaPoupanca(5000, new Cliente("Flavio","Sampson", LocalDateTime.now()));

        Conta cc1 = new ContaCorrente(100, new Cliente("Fernanda","Sampson", LocalDateTime.now()));
        Conta poupanca1 = new ContaPoupanca(5000, new Cliente("Fernanda","Sampson", LocalDateTime.now()));

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        cc1.imprimirExtrato();
        poupanca1.imprimirExtrato();
    }
}