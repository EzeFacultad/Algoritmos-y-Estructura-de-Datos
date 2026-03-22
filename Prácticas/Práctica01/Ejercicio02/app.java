package Prácticas.Práctica01.Ejercicio02;

import java.util.Scanner;

public class app {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n;

    CrearArreglo c;

    System.out.print("Tamaño del arreglo: ");
    n = s.nextInt();

    c = new CrearArreglo(n);
    int[] arreglo = c.crearArreglo();

    for (int i=0; i<n; i++)
      System.out.print(arreglo[i] + " ");

    s.close();
  }
}
