package classeteste;

public class ClasseTeste {
 
    public static void main(String[] args) {
 
        // Criando instâncias das classes
        AnimalClasses.Cachorro cachorro = new AnimalClasses.Cachorro("Rex", 5);
        AnimalClasses.Gato gato = new AnimalClasses.Gato("Mimi", 3);
        AnimalClasses.Vaca vaca = new AnimalClasses.Vaca("Mimosa", 2);

        // Chamando métodos
        cachorro.emitirSom();
        cachorro.latir();

        gato.emitirSom();
        gato.miar();

        vaca.emitirSom();
        vaca.mugir();
    }
    
}
