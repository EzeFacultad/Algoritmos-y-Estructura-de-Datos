package Prácticas.Práctica03.Ejercicio02;

import java.util.ArrayList;
import java.util.List;
import Prácticas.Práctica03.GeneralTree;


public class RecorridsAG {
  
  // Métodos
  // ======= PREORDEN
  private void recorridoPreOrden( List<Integer> l, GeneralTree<Integer> a, Integer n ) {
    if ( a.isEmpty() ) return;

    if ( a.getData() > n && a.getData() % 2 != 0 ) {
      l.add(a.getData());
    }

    if ( a.hasChildren() ) {
      List<GeneralTree<Integer>> children = a.getChildren();
      for ( GeneralTree<Integer> child : children ) {
        recorridoPreOrden(l, child, n);
      }
    }
  }

  public List<Integer> numerosImparesMayoresQuePreOrden( GeneralTree<Integer> a, Integer n ) {
    List<Integer> lista = new ArrayList<>();

    recorridoPreOrden( lista, a, n );

    return lista;
  }

  // ======= INORDEN
  private void recorridoInOrden( List<Integer> l, GeneralTree<Integer> a, Integer n ) {
    if ( a.isEmpty() ) return;

    List<GeneralTree<Integer>> children = a.getChildren();

    if ( children != null ) {
      // procesar hijo "izquierdo"
      recorridoInOrden(l, children.get(0), n);
    }

    if ( a.getData() > n && a.getData() % 2 != 0 ) {
      l.add(a.getData());
    }

    if ( children != null && children.size() > 1 ) {
      for ( int i = 1; i < children.size(); i++ ) {
        recorridoInOrden(l, children.get(i), n);
      }
    }
  }

  public List<Integer> numerosImparesMayoresQueinOrden( GeneralTree<Integer> a, Integer n ) {
    List<Integer> lista = new ArrayList<>();

    recorridoInOrden(lista, a, n );

    return lista;
  }

  // ======= POSTORDEN
  private void recorridoPostOrden( List<Integer> l, GeneralTree<Integer> a, Integer n ) {
    if ( a.isEmpty() ) return;

    if ( a.hasChildren() ) {
      List<GeneralTree<Integer>> children = a.getChildren();
      for ( GeneralTree<Integer> child : children ) {
        recorridoPostOrden(l, child, n);
      }
    }

    if ( a.getData() > n && a.getData() % 2 != 0 ) {
      l.add(a.getData());
    }
  }
  
  public List<Integer> numerosImparesMayoresQuePostOrden( GeneralTree<Integer> a, Integer n ) {
    List<Integer> lista = new ArrayList<>();

    recorridoPostOrden(lista, a, n );

    return lista;
  }
}
