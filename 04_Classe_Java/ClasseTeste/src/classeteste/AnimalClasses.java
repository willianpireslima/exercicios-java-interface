
package classeteste;

public class AnimalClasses {
        // Superclasse Animal
    static class Animal {
        // Atributos
        String nome;
        int idade;

        // Construtor
        public Animal(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        // Método para fazer o animal emitir um som
        public void emitirSom() {
            System.out.println("O animal emite um som.");
        }
    }

    // Subclasse Cachorro
    static class Cachorro extends Animal {
        // Construtor
        public Cachorro(String nome, int idade) {
            super(nome, idade);
        }

        // Método específico para latir
        public void latir() {
            System.out.println(nome + " late: Au au!");
        }

        // Sobrescrevendo o método emitirSom()
        @Override
        public void emitirSom() {
            System.out.println(nome + " emite um som de cachorro.");
        }
    }

    // Subclasse Gato
    static class Gato extends Animal {
        // Construtor
        public Gato(String nome, int idade) {
            super(nome, idade);
        }

        // Método específico para miar
        public void miar() {
            System.out.println(nome + " mia: Miau!");
        }

        // Sobrescrevendo o método emitirSom()
        @Override
        public void emitirSom() {
            System.out.println(nome + " emite um som de gato.");
        }
    }

    // Subclasse Vaca
    static class Vaca extends Animal {
        // Construtor
        public Vaca(String nome, int idade) {
            super(nome, idade);
        }

        // Método específico para mugir
        public void mugir() {
            System.out.println(nome + " muge: Muuu!");
        }
    }
}
