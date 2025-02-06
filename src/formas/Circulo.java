package formas;

// Classe Circulo que implementa a interface Forma
public class Circulo implements Forma {

    private double raio; // Atributo para armazenar o raio do círculo

    // Construtor da classe Circulo
    public Circulo(double raio) {
        this.raio = raio;
    }

    // Implementação do método calcularArea() da interface Forma
    @Override
    public double calcularArea() {
        return Math.PI * raio * raio; // Fórmula para calcular a área do círculo
    }
}
