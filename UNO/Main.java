package UNO;

public class Main {
    public static void main(String[] args) {
        Carta c1 = new Carta(1, Carta.Color.groc);
        Carta c2 = new Carta(3, Carta.Color.vermell);
        Carta c3 = new Carta(6, Carta.Color.blau);
        Carta c4 = new Carta(9, Carta.Color.verd);

        //Generar mazo
        Mazo mazo = new Mazo();

        mazo.addCarta(c1);
        mazo.addCarta(c2);
        mazo.addCarta(c3);
        mazo.addCarta(c4);

        for (Carta carta : mazo.getCartes()) {
            UI.mostrarCarta(carta);
        }

        //crear pilo
        Pilo pilo = new Pilo();


        Jugador j1 = new Jugador("Jugador 1");
        j1.addCarta(c1);
        j1.addCarta(c2);
        j1.addCarta(c3);
        j1.addCarta(c4);

        for (Carta c : j1.getCartes()) {
            UI.mostrarCarta(c);
        }

        UI.mostrarCartes(j1.getCartes());

        while(!j1.getCartes().isEmpty()){
            j1.tirarCartaPilo(pilo);
        }
    }
}
