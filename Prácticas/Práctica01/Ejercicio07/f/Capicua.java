package Prácticas.Práctica01.Ejercicio07.f;

import java.util.ArrayList;

public class Capicua {
    
    public boolean esCapicua(ArrayList<Integer> lista) {
        int x = lista.size() / 2;
        boolean cumple = true;
        int y = 0;

        while (cumple && y < x) {
            if (!lista.get(y).equals(lista.get(lista.size() - 1 - y))) {
                cumple = false;
            }
            y++;
        }


        return cumple;
    }

}
