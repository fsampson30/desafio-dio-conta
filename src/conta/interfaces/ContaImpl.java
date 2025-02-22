package conta.interfaces;

import conta.Conta;

public interface ContaImpl {

    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, Conta contaDestino);

    void imprimirExtrato();

}
