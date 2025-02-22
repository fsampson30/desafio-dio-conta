package exceptions;

import mensagens.MensagensConta;

public class SaldoInsuficienteException extends RuntimeException{

    public SaldoInsuficienteException() {
        super(MensagensConta.SALDO_INSUFICIENTE.getMensagem());
    }
}
