package formas;

// Classe Quadrado que implementa a interface Forma
public class Quadrado implements Forma {

    private double lado; // Atributo para armazenar o lado do quadrado

    // Construtor da classe Quadrado
    public Quadrado(double lado) {
        this.lado = lado;
    }

    // Implementação do método calcularArea() da interface Forma
    @Override
    public double calcularArea() {
        return lado * lado; // Fórmula para calcular a área do quadrado
    }
}
