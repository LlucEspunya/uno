package uno;
import java.util.ArrayList;

public class Jugador {

    private String nomJugador;
    private ArrayList<Carta> cartes;

    public Jugador(String nom) {
        nomJugador = nom;
        cartes = new ArrayList<>();
    }

    public String getNomJugador() {
        return nomJugador;
    }

    public ArrayList<Carta> getCartes() {
        return cartes;
    }

    public void addCarta(Carta carta) {
        cartes.add(carta);
    }

    public void tirarCartaPilo(Pilo pilo){
        if (!cartes.isEmpty()){
            Carta carta = cartes.remove(0);
            pilo.addCarta(carta);
        }
    }
}
