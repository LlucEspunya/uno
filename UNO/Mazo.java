package UNO;

import java.util.Stack;

public class Mazo {
    private Stack<Carta> cartes;

    public Mazo() {
        this.cartes = new Stack<>();
    }

    public void addCarta(Carta carta) {
        cartes.push(carta);
    }

    public Stack<Carta> getCartes() {
        return cartes;
    }
}
