package banco;

import cliente.Cliente;
import banco.conta.interfaces.ContaImpl;
import exceptions.SaldoInsuficienteException;
import exceptions.ValorNegativoException;

public abstract class Conta implements ContaImpl {

    private final int AGENCIA_PADRAO = 3010;

    private int numero;
    private double saldo;
    private Cliente cliente;
    private Banco banco = new Banco();

    public Conta(Cliente cliente, int numero, double depositoInicial) {
        this.saldo = depositoInicial;
        this.numero = numero;
        this.cliente = cliente;
        depositar(depositoInicial);
        banco.adicionarCliente(cliente);

    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            this.saldo -= valor;
        } else throw new SaldoInsuficienteException();
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0){
            this.saldo += valor;
        } else throw new ValorNegativoException();
    }

    @Override
    public void transferir(double valor, Conta contaDestino) {
        sacar(valor);
        contaDestino.depositar(valor);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Conta{" +
                "Agência=" + AGENCIA_PADRAO +
                ", numero=" + numero +
                ", saldo=" + saldo +
                ", titular=" + cliente.getPrimeiroNome() + cliente.getSobrenome() +
                '}');
    }


}
