package Prácticas.Práctica01.Ejercicio07.a_b_c;

import java.util.ArrayList;
import java.util.LinkedList;

public class TestArrayList {
  public static void main(String[] args) {
    ArrayList<String> numerosArray = new ArrayList<>();
    LinkedList<String> numerosLinked = new LinkedList<>();
    
    // Guardando los números recibidos
    for (String num : args) {
      numerosArray.add(num);
      numerosLinked.add(num);
    }

    // Imprimiendo
    System.out.println("===== Usando ArrayList =====");
    for (String num : numerosArray) {
      System.out.print(num + " ");
    }
    
    System.out.println();

    System.out.println("===== Usando LinkedList =====");
    for (String num : numerosLinked) {
      System.out.print(num + " ");
    }
  }
}
