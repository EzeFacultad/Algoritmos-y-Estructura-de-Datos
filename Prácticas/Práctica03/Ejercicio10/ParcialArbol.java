package Prácticas.Práctica03.Ejercicio10;

import java.util.ArrayList;
import java.util.List;

import Prácticas.Práctica03.GeneralTree;
import Prácticas.Práctica01.Ejercicio08.Queue;

public class ParcialArbol {
  
  // Métodos
  private static void recorrerArbol ( List<Integer> l, GeneralTree<Integer> a ) {
    if ( a.isEmpty() ) return;

    if ( a.isLeaf() ) {
      l.add(a.getData());
      return;
    }

    Queue<GeneralTree<Integer>> cola = new Queue<>();
    cola.enqueue(a);

    int nivel = 0;

    while ( !cola.isEmpty() ) {
      int suma = 0;
      int size = cola.size();
      
      List<Integer> temporal = new ArrayList<>();
      for ( int i = 0; i < size; i++ ) {
        GeneralTree<Integer> nodo = cola.dequeue();

        List<Integer> listaAux = new ArrayList<>();
        listaAux.add(nodo.getData());
        recorrerArbol(listaAux, nodo);

        if ( suma < listaAux.get(0) * nivel ) {
          temporal = listaAux;
        }
      }

      l.addAll(temporal);

      nivel++;
    }

  }

  public static List<Integer> resolver( GeneralTree<Integer> arbol ) {
    List<Integer> lista = new ArrayList<>();

    recorrerArbol( lista, arbol );

    return lista;
  }
}
