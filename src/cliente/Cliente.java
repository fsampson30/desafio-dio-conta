package cliente;

import java.time.LocalDateTime;

public class Cliente {

    private String primeiroNome;
    private String sobrenome;
    private LocalDateTime dataCadastro;

    public Cliente(String primeiroNome, String sobrenome, LocalDateTime dataCadastro) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        this.dataCadastro = dataCadastro;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "primeiroNome='" + primeiroNome + '\'' +
                ", sobrenome='" + sobrenome + '\'' +
                ", dataCadastro=" + dataCadastro +
                '}';
    }

    public String getPrimeiroNome() {
        return primeiroNome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }
}
