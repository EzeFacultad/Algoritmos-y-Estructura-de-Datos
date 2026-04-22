package Prácticas.Práctica03.Ejercicio11;

import Prácticas.Práctica03.GeneralTree;
import Prácticas.Práctica01.Ejercicio08.Queue;


public class ParcialArbol {
  
  // Método
  public static boolean resolver( GeneralTree<Integer> arbol ) {

    if ( arbol.isEmpty() ) return false;

    Queue<GeneralTree<Integer>> cola = new Queue<>();
    cola.enqueue(arbol);

    int cantAnterior = 0;

    while ( !cola.isEmpty() ) {
      int size = cola.size();

      if ( cantAnterior != 0 && size == cantAnterior + 1 ) return false;

      cantAnterior = size;

      for ( int i = 0; i < size; i++ ) {
        GeneralTree<Integer> nodo = cola.dequeue();

        
        for ( GeneralTree<Integer> n : nodo.getChildren() ) {
          cola.enqueue(n);
        }
      }
    }

    return true;
  }
}
