package Prácticas.Práctica03.Ejercicio07;

import java.util.ArrayList;
import java.util.List;

import Prácticas.Práctica03.GeneralTree;

public class Caminos {
  private GeneralTree<Integer> arbol;


  // Constructor
  public Caminos ( GeneralTree<Integer> arbol ) {
    this.arbol = arbol;
  }

  // Métodos
  public List<Integer> caminoAHojaMasLejana() {
    List<Integer> maxLista = new ArrayList<>();

    if ( arbol.isEmpty() ) return maxLista;

    // Si no está vacia, guardamos el dato en la lista
    maxLista.add(arbol.getData());

    // Si es hoja, retormanos la lista con el dato guardado
    if ( arbol.isLeaf() ) return maxLista;



    List<GeneralTree<Integer>> children = arbol.getChildren();
    List<Integer> mejorCamino = new ArrayList<>();

    for ( GeneralTree<Integer> child : children ) {
      Caminos cam = new Caminos(child);
      List<Integer> subCamino = cam.caminoAHojaMasLejana();
      if ( mejorCamino.size() < subCamino.size() ) {
        mejorCamino = subCamino;
      }
    }
    
    maxLista.addAll(mejorCamino);
    
    return maxLista;
  }
}
