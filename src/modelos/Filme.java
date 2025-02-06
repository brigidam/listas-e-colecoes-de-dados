package modelos;

import calculos.Classificavel;

// A classe Filme herda da classe Titulo e implementa a interface Classificavel.
public class Filme extends Titulo implements Classificavel {

    // Atributo específico da classe Filme para armazenar o nome do diretor.
    private String diretor;

    // Construtor da classe Filme, que recebe o nome e o ano de lançamento do filme.
    // Utiliza a palavra-chave "super" para chamar o construtor da classe pai (Titulo).
    public Filme(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    // Método getter para obter o nome do diretor.
    public String getDiretor() {
        return diretor;
    }

    // Método setter para definir o nome do diretor.
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    // Implementação do método getClassificacao() da interface Classificavel.
    // Retorna a média das avaliações dividida por 2, convertida para inteiro.
    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    // Método toString sobrescrito para fornecer uma representação textual do objeto Filme.
    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
    }
}
