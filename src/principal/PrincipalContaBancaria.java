package principal;

import contabancaria.ContaBancaria;

import java.util.ArrayList;

public class PrincipalContaBancaria {
    public static void main(String[] args) {
        // Criando contas bancárias com diferentes saldos
        ContaBancaria conta1 = new ContaBancaria("12345", 1500.50);
        ContaBancaria conta2 = new ContaBancaria("67890", 2500.75);
        ContaBancaria conta3 = new ContaBancaria("11223", 800.30);
        ContaBancaria conta4 = new ContaBancaria("44556", 3200.90);

        // Criando uma lista de contas bancárias
        ArrayList<ContaBancaria> contas = new ArrayList<>();
        contas.add(conta1);
        contas.add(conta2);
        contas.add(conta3);
        contas.add(conta4);

        // Inicializa a variável para a conta com maior saldo
        ContaBancaria contaMaiorSaldo = contas.get(0);

        // Loop para encontrar a conta com o maior saldo
        for (ContaBancaria conta : contas) {
            if (conta.getSaldo() > contaMaiorSaldo.getSaldo()) {
                contaMaiorSaldo = conta;  // Atualiza a conta com o maior saldo
            }
        }

        // Imprime as informações da conta com o maior saldo
        System.out.println("Conta com o maior saldo:");
        contaMaiorSaldo.exibirInformacoes();

    }
}
