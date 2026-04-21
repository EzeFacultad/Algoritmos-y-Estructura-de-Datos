package Prácticas.Práctica03.Ejercicio06;

import java.util.List;

import Prácticas.Práctica03.GeneralTree;

public class RedDeAguaPotable {
  private GeneralTree<Character> arbol;


  // Constructor
  public RedDeAguaPotable( GeneralTree<Character> arbol ) {
    this.arbol = arbol;
  }


  // Métodos
  public double minimoCaudal( double caudal ) {

    // Si esta vacio, retorna el mismo caudal
    if ( arbol.isEmpty() ) return caudal;

    // Si es hoja, devuelve el caudal actual
    if ( arbol.isLeaf() ) return caudal;

    // Si no está vacio y no es hoja, si o si tiene al menos 1 hijo
    List<GeneralTree<Character>> children = arbol.getChildren();
    double nuevoCaudal = caudal / children.size();
    
    double min = Double.MAX_VALUE;

    for ( GeneralTree<Character> child : children ) {
      RedDeAguaPotable red = new RedDeAguaPotable(child);
      double aux = red.minimoCaudal(nuevoCaudal);
      if ( min > aux ) min = aux;
    }

    return min;
  }

}
