package Prácticas.Práctica01.Ejercicio08;

import java.util.List;
import java.util.LinkedList;

public class Queue<T> extends Sequence {
  protected List<T> data;

  // constructor
  public Queue() {
    this.data = new LinkedList<>();
  }

  
  // ============== MÉTODOS

  // insertar elemento al final
  public void enqueue(T dato) {
    data.add(dato);
  }

  // eliminar elemento
  public T dequeue() {
    return data.remove(0);
  }

  // retorna el elemento del frente
  public T head() {
    return data.get(0);
  }

  // retorna si tiene o no elementos
  @Override
  public boolean isEmpty() {
    return data.isEmpty();
  }

  // retorna la cantidad de elementos
  @Override
  public int size() {
    return data.size();
  }

  @Override
  public String toString() {
    return data.toString();
  }
}
