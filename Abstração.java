abstract class Animal {
    abstract void emitirSom();
}

class Cachorro extends Animal {
    void emitirSom() {
        System.out.println("Latido");
    }
}
