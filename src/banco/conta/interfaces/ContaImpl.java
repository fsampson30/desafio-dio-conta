package banco.conta.interfaces;

import banco.Conta;

public interface ContaImpl {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();

}
