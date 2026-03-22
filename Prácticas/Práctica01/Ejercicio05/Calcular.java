package Prácticas.Práctica01.Ejercicio05;

import java.util.List;

public class Calcular {
  
  static class Resultado {
    int max;
    int min;
    double promedio;
  }


  public static Resultado resultadA(List<Integer> lista) {
    Resultado r = new Resultado();

    int suma = 0;
    r.max = lista.get(0);
    r.min = lista.get(0);

    for (int num : lista) {
      if (num > r.max) r.max = num;
      if (num < r.min) r.min = num;
      suma += num;
    }

    r.promedio = (double) suma / lista.size();

    return r;
  }

  public static void resultadB(List<Integer> lista, Resultado r) {
    int suma = 0;
    r.max = lista.get(0);
    r.min = lista.get(0);

    for (int num : lista) {
      if (num > r.max) r.max = num;
      if (num < r.min) r.min = num;
      suma += num;
    }

    r.promedio = (double) suma / lista.size();
  }

}