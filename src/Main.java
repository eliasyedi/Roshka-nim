
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String jugador1 = null;
        String jugador2 = null;
        Scanner in = new Scanner(System.in);
        System.out.println("Jugador 1, ingrese su nombre: ");
        jugador1 = new String(in.nextLine());
        System.out.println("Jugador 2, ingrese su nombre: ");
        jugador2 = new String(in.nextLine());

        Nim juego = new Nim();
        char pila = 0;
        int cantidad = 0;
        while(!juego.gameOver()){
            System.out.print(jugador1 + ", elija una pila: ");
            pila = in.next;
            juego.(pila, cantidad);


        }


    }
}