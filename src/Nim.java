


public class Nim {
    private int [] tabla;



    //inicia juego
    public Nim() {

        tabla = new int[3];
        for(int i = 0 ; i<3 ; i++)
           tabla[i] = i+1;
        printTable();
    }



    private void printTable(){
        char pila = 'A';
        for(int i = 0 ; i<3 ; i++)
            System.out.print((pila+i) + ":" + tabla[i]);
    }


    public boolean gameOver(){
        for(int i = 0 ; i<3 ; i++)
            if(tabla[i] >0 )
                return false;
        return true;
    }


    public void jugada(char pila , int cantidad){
        tabla[pila - 'A'] -= cantidad;
        printTable();
    }



}
