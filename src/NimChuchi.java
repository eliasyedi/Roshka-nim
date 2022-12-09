import java.util.ArrayList;
import java.util.Stack;

public class NimChuchi {
   private ArrayList<Stack<String>> tabla;
    final static String pieza = "[x]";

    public NimChuchi(){
        tabla = new ArrayList<>(3);
        for(int i = 0 ; i<3 ; i++)
            tabla.add(new Stack<String>());

        Stack<String> columna = null;
        for(int i = 0 ; i<3 ; i++){
            columna = tabla.get(i);
            for(int j = i ; j<3 ; j++){
                columna.push(pieza);
            }
        }
        printTable();
    }


    private void printTable(){
        String aux = null;
        Stack<String> stack= null;
        for (int i = 3 ; i>=0 ; i--){
            for(int j = 0 ; j<3 ; j++ ){
                stack = tabla.get(j);
                if(stack.size()>i)
                    aux = stack.elementAt(i);

                if(aux != null)
                    System.out.print(aux);
                else
                    System.out.print("   ");
                aux = null;
            }
            System.out.println();
        }


    }


    public boolean gameOver(){
        for(Stack<String> stack : tabla)
            if(!stack.isEmpty())
                return false;

        return true;
    }


    public void jugada(char col , int cantidad){
        int columna = col-'A';
        Stack<String> stack = tabla.get(columna);
        for(int i = 0 ; i<cantidad ; i++)
            stack.pop();

        printTable();
    }

    public int getColumn(char col){
        return tabla.get(col-'A').size();
    }
}
