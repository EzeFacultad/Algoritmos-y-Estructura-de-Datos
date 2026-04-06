package Prácticas.Práctica02.Ejercicio07;

import Prácticas.Práctica02.BinaryTree;


public class ParcialArboles {
  private BinaryTree<Integer> arbol;


  public ParcialArboles( BinaryTree<Integer> arbol ) {
    this.arbol = arbol;
  }


  public BinaryTree<Integer> getArbol() {
    return this.arbol;
  }


  // Métodos
  private int analizarNodo( BinaryTree<Integer> a ) {
    if (a.isEmpty()) return 0;

    int valor = 0;

    //if ( a.hasLeftChild() && !a.hasRightChild() || !a.hasLeftChild() && a.hasRightChild() ) valor = 1;

    if ( a.hasLeftChild() ^ a.hasRightChild() ) valor = 1;

    if ( a.hasLeftChild() ) valor += analizarNodo(a.getLeftChild());
    if ( a.hasRightChild() ) valor += analizarNodo(a.getRightChild());

    return valor;
  }

  private boolean buscarNodo( BinaryTree<Integer> a, int num ) {
    if (a.isEmpty()) return false;
    
    if ( a.getData() == num ) {
      int valorHi = a.hasLeftChild() ? analizarNodo(a.getLeftChild()) : -1;
      int valorHd = a.hasRightChild() ? analizarNodo(a.getRightChild()) : -1;

      return valorHi > valorHd;
    }

    boolean HI = false, HD = false;
    if (a.hasLeftChild()) HI = buscarNodo( a.getLeftChild(), num );
    if (a.hasRightChild()) HD = buscarNodo( a.getRightChild(), num );

    return HI || HD;

  }

  public boolean isLeftTree( int num ) {
    return buscarNodo( arbol, num );
  }
}
