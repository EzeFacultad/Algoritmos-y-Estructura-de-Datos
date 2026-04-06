package Prácticas.Práctica02.Ejercicio09;

import Prácticas.Práctica02.BinaryTree;

public class ParcialArboles {
  
  private BinaryTree<Resultado> crearArbol( BinaryTree<Integer> a, int sumaAcum, int valorPadre) {
    if ( a.isEmpty() ) return null;
    
    int valorActual = a.getData();

    // Calcular suma acumulada
    int nuevaSuma = sumaAcum + valorActual;

    // Calcular diferencia
    int diferencia = valorActual - valorPadre;
    
    // Crear nuevo nodo
    BinaryTree<Resultado> nuevo = new BinaryTree<>(new Resultado(nuevaSuma, diferencia));

    // Recursión
    if ( a.hasLeftChild() ) nuevo.addLeftChild(crearArbol( a.getLeftChild(), nuevaSuma, valorActual ));
    if ( a.hasRightChild() ) nuevo.addRightChild( crearArbol(a.getRightChild(), sumaAcum, valorActual ));
    
    return nuevo;
  }

  public BinaryTree<Resultado> sumAndDif( BinaryTree<Integer> arbol ) {
    if (arbol == null || arbol.isEmpty()) return null;

    return crearArbol(arbol, 0, 0);
  }

}
