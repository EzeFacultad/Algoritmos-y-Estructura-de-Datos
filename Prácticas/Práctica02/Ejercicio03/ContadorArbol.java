package Prácticas.Práctica02.Ejercicio03;

import Prácticas.Práctica02.BinaryTree;
import java.util.ArrayList;

public class ContadorArbol {
  private BinaryTree<Integer> arbol;

  public ContadorArbol(BinaryTree<Integer> arbol) {
    this.arbol = arbol;
  }


  // Métodos
  private void preOrden(ArrayList<Integer> lista, BinaryTree<Integer> arbol) {
    if (arbol.isEmpty()) return;
    
    if (arbol.getData() % 2 == 0) lista.add(arbol.getData());

    if (arbol.hasLeftChild()) preOrden(lista, arbol.getLeftChild());
    if (arbol.hasRightChild()) preOrden(lista, arbol.getRightChild());
  }

  public ArrayList<Integer> numerosPares() {

    ArrayList<Integer> lista = new ArrayList<>();
    
    if (!arbol.isEmpty()) {
      preOrden(lista, arbol);
    }

    return lista;
  }


  // ======= Incisos A y B
  private void inOrden(ArrayList<Integer> lista, BinaryTree<Integer> arbol) {
    if (arbol.isEmpty()) return;

    if (arbol.hasLeftChild()) inOrden(lista, arbol.getLeftChild());

    if (arbol.getData() % 2 == 0) lista.add(arbol.getData());

    if (arbol.hasRightChild()) inOrden(lista, arbol.getRightChild());
  }

  private void postOrden(ArrayList<Integer> lista, BinaryTree<Integer> arbol) {
    if (arbol.isEmpty()) return;
    
    if (arbol.hasLeftChild()) inOrden(lista, arbol.getLeftChild());
    if (arbol.hasRightChild()) inOrden(lista, arbol.getRightChild());
    
    if (arbol.getData() % 2 == 0) lista.add(arbol.getData());
  }

  public ArrayList<Integer> numerosParesIncisoA() {

    ArrayList<Integer> lista = new ArrayList<>();
    
    if (!arbol.isEmpty()) {
      inOrden(lista, arbol);
    }

    return lista;
  }

  public ArrayList<Integer> numerosParesIncisoB() {

    ArrayList<Integer> lista = new ArrayList<>();
    
    if (!arbol.isEmpty()) {
      postOrden(lista, arbol);
    }

    return lista;
  }
}
