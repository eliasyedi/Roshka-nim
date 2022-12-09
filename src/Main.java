
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String jugador1 = null;
        String jugador2 = null;
        Scanner in = new Scanner(System.in);
        System.out.println("Jugador 1, ingrese su nombre: ");
        jugador1 = in.nextLine();
        System.out.println("Jugador 2, ingrese su nombre: ");
        jugador2 = in.nextLine();
        NimChuchi juego = new NimChuchi();

       /* Nim juego = new Nim();*/
        char pila = 0;
        int cantidad = 0;
        while(true){
            System.out.println(jugador1 + ", elija una pila: ");
            pila = getValidChar();
            System.out.println("Cuantos quitara de la pila " + pila);
            cantidad = getValidNumber(juego.getColumn(pila));

            juego.jugada(pila, cantidad);
            if(juego.gameOver()){
                System.out.println(jugador1 + ", ya no quedan contadores, asiq que... Ganaste!");
                break;
            }
            System.out.println(jugador2 + ", elija una pila: ");
            pila = getValidChar();
            System.out.println("Cuantos quitara de la pila " + pila);
            cantidad = getValidNumber(juego.getColumn(pila));
            juego.jugada(pila , cantidad);
            if(juego.gameOver()){
                System.out.println(jugador1 + ", ya no quedan contadores, asiq que... Ganaste!");
                break;
            }
        }
    }


    public static int getValidNumber(int roof){
        Scanner in = new Scanner(System.in);
        int nro = in.nextInt();
        while(nro>roof || nro<1){
            System.out.println("nro INVALIDO, ingrese de nuevo: ");
            nro = in.nextInt();
        }
        return nro;
    }

    //limitado si se ingresa una cadena por el uso de charAt
    public static char getValidChar(){
        Scanner in = new Scanner(System.in);
        char column = 'A';
        column = in.next().charAt(0);
        while(column < 'A' || column > 'C'){
            System.out.println("columna no valida, ingrese de nuevo (mayusculas)");
            column = in.next().charAt(0);
        }
        return column;

    }
}