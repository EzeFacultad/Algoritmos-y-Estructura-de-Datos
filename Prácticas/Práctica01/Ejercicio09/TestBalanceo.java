package Prácticas.Práctica01.Ejercicio09;
import java.util.Scanner;

import Prácticas.Práctica01.Ejercicio08.*;;

public class TestBalanceo {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    DoubleEndedQueue<Character> pila = new DoubleEndedQueue<>();
    
    System.out.println("Escribir String: ");
    String texto = s.next();

    for (int i=0; i < texto.length(); i++) {
      
      char c = texto.charAt(i);
      if ( c == '{' || c == '(' || c == '[') {
        pila.enqueueFirst(c);
      }

      if ( c == '}' && pila.head() == '{' ) pila.dequeue();
      if ( c == ')' && pila.head() == '(' )  pila.dequeue();
      if ( c == '[' && pila.head() == '[' )  pila.dequeue();
    }

    if (pila.isEmpty()) {
      System.out.println("El string está balanceado");
    } else {
      System.out.println("El string NO está balanceado");
    }

    s.close();
  }
}
