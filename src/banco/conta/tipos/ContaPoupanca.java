package banco.conta.tipos;

import banco.Conta;
import cliente.Cliente;

public class ContaPoupanca extends Conta {

    private static int sequencialPoupanca = 9000;

    public ContaPoupanca(double saldo, Cliente cliente) {
        super(cliente,++sequencialPoupanca,saldo);
    }
}

