


public class Nim {
    private int [] tabla;



    //inicia juego
    public Nim() {

        this.tabla = new int[3];
        for(int i = 0 ; i<3 ; i++)
           this.tabla[i] = i+1;
        printTable();
    }



    private void printTable(){
        char pila = 'A';
        for(int i = 0 ; i<3 ; i++){
            System.out.print(pila + ":" + this.tabla[i] + "  ");
            pila ++;
        }
        System.out.println();
    }


    public boolean gameOver(){
        for(int i = 0 ; i < 3 ; i++){
            if(this.tabla[i] > 0 )
                return false;
        }
        return true;
    }


    public void jugada(char pila , int cantidad){
        this.tabla[pila - 'A'] -= cantidad;
        printTable();
    }


    public int getColumn(char columna){
        return this.tabla[columna- 'A'];
    }



}
