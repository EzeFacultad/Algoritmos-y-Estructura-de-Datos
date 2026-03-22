package Prácticas.Práctica01.Ejercicio02;

public class CrearArreglo {
  private int n;
  private int[] arreglo;

  public CrearArreglo(int n) {
    this.n  = n;
    arreglo = new int[n];
  }


  public int[] crearArreglo() {
    for (int i=0; i<n; i++) {
      arreglo[i] = (i + 1) * n;
    }
    
    return arreglo;
  }
}
