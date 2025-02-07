package principal;

import animais.Animal;
import animais.Cachorro;

public class PrincipalAnimais {
    public static void main(String[] args) {
        // Cria um objeto do tipo Cachorro
        Cachorro cachorro = new Cachorro();

        // Chama o método som da classe Cachorro
        cachorro.som(); // Saída: O cachorro faz au au!

        // Faz o casting do objeto Cachorro para o tipo Animal
        Animal animal = (Animal) cachorro;

        // Agora podemos chamar métodos da classe Animal, mas não os específicos de Cachorro
        animal.som(); // Saída: O cachorro faz au au!

        // O método correr() não pode ser chamado diretamente no objeto do tipo Animal
        // animal.correr(); // Isso causaria erro de compilação, pois 'correr' é específico de Cachorro
    }
}
