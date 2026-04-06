package Prácticas.Práctica02.Ejercicio08;

import Prácticas.Práctica02.BinaryTree;


public class ParcialArboles {
  
  private boolean analizarNodos( BinaryTree<Integer> a1, BinaryTree<Integer> a2 ) {
    if ( a1.isEmpty() ) return true;
    if ( a2.isEmpty() ) return false;

    if (!a1.getData().equals(a2.getData())) return false;

    if ( a1.hasLeftChild() ) {
      if ( !a2.hasLeftChild() ) return false;
      if ( !analizarNodos( a1.getLeftChild(), a2.getLeftChild() )) return false; 
    }

    if ( a2.hasRightChild() ) {
      if ( !a2.hasRightChild() ) return false;
      if ( !analizarNodos( a1.getRightChild(), a2.getRightChild() )) return false;
    }

    return true;
  }

  public boolean esPrefijo( BinaryTree<Integer> arbol1, BinaryTree<Integer> arbol2 ) {
    if ( arbol1.isEmpty() ) return true;
    if ( arbol2.isEmpty() ) return false;

    return analizarNodos( arbol1, arbol2 );
  }

}
