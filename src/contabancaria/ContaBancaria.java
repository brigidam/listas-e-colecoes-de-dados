package contabancaria;

public class ContaBancaria {
    private String numeroConta;  // Número da conta bancária
    private double saldo;        // Saldo da conta bancária

    // Construtor da classe ContaBancaria
    public ContaBancaria(String numeroConta, double saldo) {
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    // Getter para o número da conta
    public String getNumeroConta() {
        return numeroConta;
    }

    // Getter para o saldo da conta
    public double getSaldo() {
        return saldo;
    }

    // Método para exibir as informações da conta
    public void exibirInformacoes() {
        System.out.println("Número da conta: " + numeroConta + " | Saldo: " + saldo);
    }

}
