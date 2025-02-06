package formas;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        // Criando objetos do tipo Circulo e Quadrado
        Forma circulo = new Circulo(5); // Raio 5
        Forma quadrado = new Quadrado(4); // Lado 4

        // Criando uma lista de formas (objetos que implementam a interface Forma)
        ArrayList<Forma> formas = new ArrayList<>();
        formas.add(circulo);
        formas.add(quadrado);

        // Loop para calcular e imprimir a área de cada forma
        for (Forma forma : formas) {
            System.out.println("Área: " + forma.calcularArea());
        }
    }
}
