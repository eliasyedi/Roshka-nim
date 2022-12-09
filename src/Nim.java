

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
public class Nim {
    private List<Stack<String>> tabla ;
    private static final String pieza = "[*]";


    //inicia juego
    public Nim() {
        tabla = new ArrayList<Stack<String>>(3);
        for (int i = 0; i < 3; i++) {
            tabla.add(new Stack<>());
            for(int j = i ; j<3 ; j++){
                Stack<String> columna = tabla.get(i);
                columna.push(pieza);
            }
        }





    }


}
