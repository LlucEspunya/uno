package uno;

import java.util.Stack;
import java.util.ArrayList;

public class Pilo {
    private Stack<Carta> cartes;

    public Pilo() {
        this.cartes = new Stack<>();
    }

    public Carta agafarCarta(){
        return cartes.pop();
    }

    public void addCarta(Carta carta) {
        cartes.push(carta);
    }

    public ArrayList<Carta> getCartes() {
        return new ArrayList<>(cartes);
    }
}
