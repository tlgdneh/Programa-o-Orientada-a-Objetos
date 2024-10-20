class Forma {
    void desenhar() {
        System.out.println("Desenhando forma");
    }
}

class Circulo extends Forma {
    void desenhar() {
        System.out.println("Desenhando círculo");
    }
}

class Quadrado extends Forma {
    void desenhar() {
        System.out.println("Desenhando quadrado");
    }
}

public class TestePolimorfismo {
    public static void main(String[] args) {
        Forma f1 = new Circulo();
        Forma f2 = new Quadrado();

        f1.desenhar();
        f2.desenhar();
    }
}
