package Prácticas.Práctica01.Ejercicio07.j;

import java.util.ArrayList;

public class CombinarOrdenado {
  
  public ArrayList<Integer> combinarOrdenado(ArrayList<Integer> lista1, ArrayList<Integer> lista2) {
    
    ArrayList<Integer> lista = new ArrayList<>();
    int i = 0, j = 0;

    while (i < lista1.size() && j < lista2.size()) {
        if (lista1.get(i) >= lista2.get(j)) {
            lista.add(lista1.get(i));
            i++;
        } else {
            lista.add(lista2.get(j));
            j++;
        }
    }

    // Agregar los elementos restantes
    while (i < lista1.size()) lista.add(lista1.get(i++));
    while (j < lista2.size()) lista.add(lista2.get(j++));

    return lista;
  }

}
