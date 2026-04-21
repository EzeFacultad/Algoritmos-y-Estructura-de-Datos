package Prácticas.Práctica03.Ejercicio04;

import Prácticas.Práctica03.GeneralTree;
import Prácticas.Práctica01.Ejercicio08.Queue;


public class AnalizarArbol {
  
  // Métodos
  public double devolverMaximoPromedio( GeneralTree<AreaEmpresa> arbol ) {
    if ( arbol.isEmpty() ) return 0;

    Queue<GeneralTree<AreaEmpresa>> cola = new Queue<>();
    cola.enqueue(arbol);
    
    double maxPromedio = Double.NEGATIVE_INFINITY;
    
    while (!cola.isEmpty()) {
      int size = cola.size();
      int suma = 0;

      for ( int i = 0; i < size; i++ ) {
        GeneralTree<AreaEmpresa> d = cola.dequeue();
        suma += d.getData().getTransmision();

        if ( d.hasChildren() )
          for ( GeneralTree<AreaEmpresa> child : d.getChildren() )
            devolverMaximoPromedio(child);
      }

      double promedio = (double) suma / size;
      if ( promedio > maxPromedio ) maxPromedio = promedio;
    }

    return maxPromedio;
  }
}
