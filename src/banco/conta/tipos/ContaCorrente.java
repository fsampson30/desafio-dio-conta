package banco.conta.tipos;

import banco.Conta;
import cliente.Cliente;

public class ContaCorrente  extends Conta {

    private static int sequencialContaCorrente = 1000;

    public ContaCorrente(double saldo, Cliente cliente) {
        super(cliente, ++sequencialContaCorrente,saldo);
    }


}
