import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        // Criando uma lista dinâmica para armazenar objetos do tipo Pessoa
        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        // Criando três instâncias da classe Pessoa
        Pessoa pessoa1 = new Pessoa("Luiz", 31);
        Pessoa pessoa2 = new Pessoa("Carlos", 55);
        Pessoa pessoa3 = new Pessoa("Renata", 32);

        // Adicionando as pessoas criadas à lista
        listaDePessoas.add(pessoa1);
        listaDePessoas.add(pessoa2);
        listaDePessoas.add(pessoa3);

        // Exibe o tamanho da lista, ou seja, quantos elementos foram adicionados
        System.out.println(listaDePessoas.size());

        // Exibe o primeiro elemento da lista (posição 0)
        System.out.println(listaDePessoas.get(0));

        // Exibe todos os elementos da lista, iterando sobre cada objeto do tipo Pessoa
        System.out.println("Lista de Pessoas:");
        for (Pessoa pessoa : listaDePessoas) {
            System.out.println(pessoa);
        }
    }
}