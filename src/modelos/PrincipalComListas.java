package modelos;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {

        // Cria um objeto do tipo Filme com o nome "The Matrix" e ano de lançamento 1999
        Filme favorito = new Filme("The Matrix", 1999);
        favorito.avalia(10);

        // Cria outro objeto do tipo Filme com o nome "John Wick" e ano de lançamento 2014
        Filme outro = new Filme("John Wick", 2014);
        outro.avalia(9);

        // Cria um objeto do tipo Serie com o nome "Modern Family" e ano de lançamento 2009
        Serie serie = new Serie("Modern Family", 2009);

        // Cria uma lista (ArrayList) para armazenar objetos do tipo Titulo
        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(favorito);
        lista.add(outro);
        lista.add(serie);

        // Itera sobre cada item da lista, que pode ser de qualquer tipo que estenda Titulo
        for (Titulo item : lista) {
            System.out.println("Nome: " + item.getNome());
            // Verifica se o item é uma instância de Filme e se sua classificação é maior que 2
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        // Cria uma lista ArrayList do tipo String para armazenar nomes de linguagens de programação
        ArrayList<String> listaStrings = new ArrayList<>();

        // Adiciona elementos (nomes de linguagens) à lista
        listaStrings.add("Java");
        listaStrings.add("C++");
        listaStrings.add("Python");

        System.out.println("****Linguagens de Programação:****");
        // Itera sobre cada elemento da lista
        for (String elemento : listaStrings) {
            System.out.println(elemento); // Imprime o nome da linguagem de programação
        }
    }
}
