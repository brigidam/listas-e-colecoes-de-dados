package construtores;


public class ProdutoPerecivel extends Produto { // Classe ProdutoPerecivel herda da classe Produto, ou seja, ProdutoPerecivel é um tipo específico de Produto

    String dataValidade;

    public ProdutoPerecivel(String nome, double preco, int quantidade, String dataValidade) {
        super(nome, preco, quantidade); // Chama o construtor da superclasse Produto para inicializar os atributos herdados
        this.dataValidade = dataValidade; // Inicializa o atributo específico da subclasse
    }

    public static void main(String[] args) {

        // Criando um objeto ProdutoPerecivel e passando os valores para o construtor
        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Produto C", 12.75, 2, "2025-01-29");

        // Exibe a representação do objeto no console
        // Sem a sobrescrita do método toString(), imprimirá o endereço de memória do objeto
        System.out.println(produtoPerecivel);
    }
}

