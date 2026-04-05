package Prácticas.Práctica02.Ejercicio06;

import Prácticas.Práctica02.BinaryTree;

public class Transformacion {
  private BinaryTree<Integer> arbol;

  public Transformacion( BinaryTree<Integer> arbol ) {
    this.arbol = arbol;
  }


  public BinaryTree<Integer> getArbol() {
    return arbol;
  }


  // Métodos
  private int recorrerArbol(BinaryTree<Integer> a) {
    if (a.isEmpty()) return 0;

    int aux = a.getData();

    if (a.isLeaf()) {
      a.setData(0);
      return aux;
    }

    int valorHi = recorrerArbol(a.getLeftChild());
    int valorHd = recorrerArbol(a.getRightChild());

    a.setData(valorHi + valorHd);
    return aux;
  }

  public BinaryTree<Integer> suma() {
    recorrerArbol(getArbol());    
    return getArbol();
  }
}
