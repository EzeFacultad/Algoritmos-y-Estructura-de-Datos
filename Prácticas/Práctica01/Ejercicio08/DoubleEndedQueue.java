package Prácticas.Práctica01.Ejercicio08;

public class DoubleEndedQueue<T> extends Queue<T> {

  // métodos
  public void enqueueFirst(T data) {
    this.data.add(0, data);
  }

}
