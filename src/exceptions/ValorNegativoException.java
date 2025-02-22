package exceptions;

import mensagens.MensagensConta;

public class ValorNegativoException extends RuntimeException{

    public ValorNegativoException() {
        super(MensagensConta.VALOR_NEGATIVO.getMensagem());
    }
}
