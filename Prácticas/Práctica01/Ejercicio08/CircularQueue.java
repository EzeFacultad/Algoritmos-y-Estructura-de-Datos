package Prácticas.Práctica01.Ejercicio08;


public class CircularQueue<T> extends Queue<T> {

  // métodos
  public T shift() {

    if (isEmpty()) {
      return null;
    }
    
    T dato = dequeue();
    enqueue(dato);
    return dato;
  }
  
}
