package Prácticas.Práctica02.Ejercicio05;

import Prácticas.Práctica01.Ejercicio08.Queue;
import Prácticas.Práctica02.BinaryTree;


public class ProfundidadDeArbolBinario {
  private BinaryTree<Integer> arbol;
  
  public ProfundidadDeArbolBinario( BinaryTree<Integer> arbol ) {
    this.arbol = arbol;
  }


  public BinaryTree<Integer> getArbol() {
    return arbol;
  }


  // Métodos
  public int sumaElementosProfundidad( int p ) {
    if (getArbol().isEmpty()) return 0;

    Queue<BinaryTree<Integer>> cola = new Queue<>();
    cola.enqueue(getArbol());
    int nivel = 0;
    int suma = 0;

    while (!cola.isEmpty()) {
      int size = cola.size();

      for ( int i = 0; i < size; i++ ) {
        BinaryTree<Integer> a = cola.dequeue();

        if (nivel == p) return suma += a.getData();

        if (a.hasLeftChild()) cola.enqueue(a.getLeftChild());
        if (a.hasRightChild()) cola.enqueue(a.getRightChild());
      }

      if ( nivel == p ) return suma;
      nivel++;
    }

    return suma;
  }
}
