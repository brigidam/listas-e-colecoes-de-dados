package construtores;

import java.util.ArrayList;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    // Construtor da classe Produto, inicializando os atributos com valores passados como parâmetros
    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Métodos getter e setter para acessar e modificar os atributos da classe
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    //Método sobrescrito toString() para representar o objeto como uma string formatada
    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + ", quantidade=" + quantidade + "]";
    }

    public static void main(String[] args) {

        // Criando uma lista para armazenar objetos da classe Produto
        ArrayList<Produto> listaProdutos = new ArrayList<>();

        // Criando dois objetos Produto e adicionando-os à lista
        Produto produto1 = new Produto("Sabão", 15.99, 5);
        Produto produto2 = new Produto("Detergente", 10.49, 8);

        listaProdutos.add(produto1);
        listaProdutos.add(produto2);

        // Exibindo o tamanho da lista de produtos
        System.out.println("Tamanho da lista: " + listaProdutos.size());

        // Exibindo o nome do primeiro produto na lista
        System.out.println("Produto na posição 0: " + listaProdutos.get(0).getNome());

        // Percorrendo a lista e exibindo os produtos armazenados
        for (Produto produto : listaProdutos) {
            System.out.println(produto);
        }

        // Criando um novo objeto Produto e imprimindo seus detalhes diretamente
        Produto produtoNovo = new Produto("Novo Produto", 15.99, 3);
        System.out.println(produtoNovo);
    }
}