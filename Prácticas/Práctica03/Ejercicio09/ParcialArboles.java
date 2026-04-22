package Prácticas.Práctica03.Ejercicio09;

import java.util.List;

import Prácticas.Práctica03.GeneralTree;

public class ParcialArboles {


  // Método
  public static boolean esDeSeleccion( GeneralTree<Integer> arbol ) {

    if ( arbol.isEmpty() ) return false;
    
    if ( arbol.isLeaf() ) return true;

    boolean cumple = false;
    int valor = arbol.getData();

    List<GeneralTree<Integer>> children = arbol.getChildren();
    
    for ( GeneralTree<Integer> child : children ) {
      if ( valor > child.getData() ) return false;

      if ( valor == child.getData() ) cumple = true;

      if ( !esDeSeleccion(child) ) return false;
    }

    if (!cumple) return false;

    return cumple;
  }
}