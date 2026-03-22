package Prácticas.Práctica01.Ejercicio07.h;

import java.util.ArrayList;

public class InvertirArrayList {

  public void invertirArrayList(ArrayList<Integer> lista) {
    if (!lista.isEmpty()) {
      int n = lista.get(0);
      lista.remove(0);
      invertirArrayList(lista);
      lista.add(n);
    }
  }
}
