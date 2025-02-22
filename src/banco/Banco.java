package banco;

import cliente.Cliente;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private static List<Cliente> clientes = new ArrayList<>();

    protected void adicionarCliente(Cliente cliente){
        clientes.add(cliente);
    }

    public void listarClientesConta(){
        for (Cliente cliente: clientes){
            System.out.println("Titular: " +
                    cliente.getPrimeiroNome() + " " +
                    cliente.getSobrenome() + " " +
                    "Conta aberta em: " + cliente.getDataCadastro());
        }


    }
}
