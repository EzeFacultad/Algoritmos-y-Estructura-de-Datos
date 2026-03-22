package Prácticas.Práctica01.Ejercicio07.i;

import java.util.LinkedList;

public class SumarLinkedList {
  
  public int sumarLinkedList(LinkedList<Integer> lista) {

    if (lista.isEmpty()) return 0;

    return lista.getFirst() + sumarLinkedList((LinkedList<Integer>) lista.subList(1, lista.size()));
  }

}
