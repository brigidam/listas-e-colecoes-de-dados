package principal;

import produtos.Produto;

import java.util.ArrayList;

import static produtos.Produto.calcularPrecoMedio;

public class PrincipalProdutos {
    public static void main(String[] args) {
        // Criando objetos de Produto
        Produto produto1 = new Produto("Camiseta", 49.99);
        Produto produto2 = new Produto("Calça Jeans", 89.90);
        Produto produto3 = new Produto("Tênis", 199.99);
        Produto produto4 = new Produto("Boné", 29.90);

        // Criando uma lista de produtos
        ArrayList<Produto> produtos = new ArrayList<>();
        produtos.add(produto1);
        produtos.add(produto2);
        produtos.add(produto3);
        produtos.add(produto4);

        // Calculando o preço médio utilizando o método
        double precoMedio = calcularPrecoMedio(produtos);

        // Imprimindo o preço médio
        System.out.println("Preço médio dos produtos: " + precoMedio);
    }
}

