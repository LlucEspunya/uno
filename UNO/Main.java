package UNO;
import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner object = new Scanner(System.in);

        Carta carta1 = new Carta(2, Carta.Color.blau);

        String nom;
        nom = object.nextLine();
        Jugador jugador1 = new Jugador(nom);

        jugador1.addCarta(carta1);
    }
}
