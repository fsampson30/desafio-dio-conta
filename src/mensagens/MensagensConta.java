package mensagens;

public enum MensagensConta {
    SALDO_INSUFICIENTE("Saldo insuficiente. Operação Cancelada"),
    VALOR_NEGATIVO("Não é possível depositar valor igual ou menor que 0. Operação Cancelada");

    private final String mensagem;

    MensagensConta(String mensagem){
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return mensagem;
    }

}
