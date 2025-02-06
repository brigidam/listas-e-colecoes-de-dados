package produtos;

import java.util.ArrayList;

public class Produto {
    private String nome;  // Nome do produto
    private double preco; // Preço do produto

    // Construtor da classe Produto
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Getter para o nome do produto
    public String getNome() {
        return nome;
    }

    // Getter para o preço do produto
    public double getPreco() {
        return preco;
    }

    // Método para exibir as informações do produto
    public void exibirInformacoes() {
        System.out.println("Nome: " + nome + " | Preço: " + preco);
    }
    // Método que calcula o preço médio dos produtos em uma lista
    public static double calcularPrecoMedio(ArrayList<Produto> produtos) {
        double somaPrecos = 0.0;
        int quantidadeProdutos = produtos.size();

        // Loop para somar os preços dos produtos
        for (Produto produto : produtos) {
            somaPrecos += produto.getPreco();
        }

        // Retorna o preço médio
        return somaPrecos / quantidadeProdutos;
    }
}
