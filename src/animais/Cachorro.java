package animais;

// Classe Cachorro que herda de Animal
public class Cachorro extends Animal {
    // Sobrescreve o método som da classe Animal
    @Override
    public void som() {
        System.out.println("O cachorro faz au au!");
    }

    // Método específico da classe Cachorro
    public void correr() {
        System.out.println("O cachorro está correndo.");
    }
}
