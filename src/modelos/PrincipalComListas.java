package modelos;

import java.util.*;

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

        ArrayList<String> buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo");
        buscaPorArtista.add("Jacqueline");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação:");
        System.out.println(buscaPorArtista);

        // Ordena a lista 'buscaPorArtista' usando a ordem natural dos elementos (definida pelo método compareTo() da classe)
        System.out.println("Lista de titulos ordenados:");
        Collections.sort(lista);
        System.out.println(lista);

        // Ordena a lista 'lista' usando um comparador baseado no ano de lançamento
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenando por ano:");
        System.out.println(lista);

        // Criando a lista de números inteiros
        List<Integer> numeros = new ArrayList<>();
        numeros.add(42);
        numeros.add(7);
        numeros.add(19);
        numeros.add(3);
        numeros.add(99);

        // Ordenando a lista em ordem crescente
        Collections.sort(numeros);
        // Imprimindo a lista ordenada
        System.out.println("Lista ordenada em ordem crescente: " + numeros);

        // Criando a lista como ArrayList
        List<String> listaArrayList = new ArrayList<>();
        listaArrayList.add("Maçã");
        listaArrayList.add("Banana");

        // Imprimindo a lista com ArrayList
        System.out.println("Lista utilizando ArrayList: " + listaArrayList);

        // Criando a lista como LinkedList
        List<String> listaLinkedList = new LinkedList<>();
        listaLinkedList.add("Melancia");
        listaLinkedList.add("Uva");

        // Imprimindo a lista com listaLinkedList
        System.out.println("Lista utilizando LinkedList: " + listaLinkedList);

       // Declarando a variável como List para demonstrar polimorfismo
        List<String> listaPolimorfica;

        // Instanciando a lista como ArrayList (implementação baseada em array)
        listaPolimorfica = new ArrayList<>();
        listaPolimorfica.add("Elemento 1"); // Adicionando o primeiro elemento
        listaPolimorfica.add("Elemento 2"); // Adicionando o segundo elemento
        System.out.println("ArrayList: " + listaPolimorfica); // Exibindo a lista

        // Mudando a implementação para LinkedList (baseada em estrutura encadeada)
        listaPolimorfica = new LinkedList<>();
        listaPolimorfica.add("Elemento A"); // Adicionando o primeiro elemento na nova lista
        listaPolimorfica.add("Elemento B"); // Adicionando o segundo elemento na nova lista
        System.out.println("LinkedList: " + listaPolimorfica); // Exibindo a lista
    }
}
