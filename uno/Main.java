package uno;

import uno.interficie.UI;

public class Main {
    public static void main(String[] args) {
        Carta c1 = new Carta(1, Carta.Color.groc);
        Carta c2 = new Carta(3, Carta.Color.vermell);
        Carta c3 = new Carta(6, Carta.Color.blau);
        Carta c4 = new Carta(9, Carta.Color.verd);

        //Generar mazo
        Mazo mazo = new Mazo();

//        for (Carta carta : mazo.getCartes()) {
//            UI.mostrarCarta(carta);
//        }

        Pilo pilo = new Pilo();


        Jugador j1 = new Jugador("Jugador 1");
        j1.addCarta(c1);
        j1.addCarta(c2);
        j1.addCarta(c3);
        j1.addCarta(c4);

//        for (Carta c : j1.getCartes()) {
//            UI.mostrarCarta(c);
//        }

//        UI.mostrarCartes(j1.getCartes());

        if (!pilo.getCartes().isEmpty()){
            mazo.tirarCartaPilo(pilo);
        }

//        if(!j1.getCartes().isEmpty()){
//            j1.tirarCartaPilo(pilo);
//        }

        UI.mostrarCartes(j1.getCartes());

        UI.mostrarCartes(pilo.getCartes());

//        if(mazo.getCartes().isEmpty()){
//            pilo.reiniciarMazo(mazo);
//        }

    }
}
