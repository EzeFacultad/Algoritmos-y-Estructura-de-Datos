package Prácticas.Práctica02.Ejercicio04;

import Prácticas.Práctica02.BinaryTree;

public class RedBinariaLlena {
  private BinaryTree<Integer> arbol;

  public RedBinariaLlena( BinaryTree<Integer> arbol) {
    this.arbol = arbol;
  }


  public BinaryTree<Integer> getArbol() {
    return arbol;
  }

  private int retardoReenvio(BinaryTree<Integer> a) {
    if (a.isEmpty()) return 0;

    if (a.isLeaf()) return a.getData();

    int valorHi = retardoReenvio(a.getLeftChild());
    int valorHd = retardoReenvio(a.getRightChild());

    valorHi += a.getData();
    valorHd += a.getData();
    if (valorHi > valorHd) return valorHi;
    else return valorHd;
  }

  public int retardoReenvio() {
    return retardoReenvio(getArbol());
  }
}