package Prácticas.Práctica01.Ejercicio07.g;

import java.util.ArrayList;
import java.util.List;

public class EjercicioSucesion {
  public static void main(String[] args) {
    
    EjercicioSucesion prueba = new EjercicioSucesion();

    List<Integer> lista = prueba.calcularSucesion(6);

    for (int n : lista)
      System.out.print(n + " ");

  }

  public List<Integer> calcularSucesion(int n) {
    ArrayList<Integer> lista = new ArrayList<>();
    lista.add(n);

    if (n == 1) {
      return lista;
    } else {
      if (n % 2 == 0) {
        n = n / 2;
      } else {
        n = 3*n + 1;
      }

      lista.addAll(calcularSucesion(n));
    }

    return lista;
  }
}
