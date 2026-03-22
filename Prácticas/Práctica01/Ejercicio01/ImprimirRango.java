package Prácticas.Práctica01.Ejercicio01;

public class ImprimirRango {

  // Métdos
  public static void usandoFor(int a, int b) {
    for (int i=a; i <= b; i++) {
      System.out.print(i + " ");
    }
    System.out.println();
  }

  public static void usandoWhile(int a, int b) {
    while (a <= b) {
      System.out.print(a + " ");
      a++;
    }
    System.out.println();
  }

  public static void usandoRecursion(int a, int b) {
    System.out.print(a + " ");
    if (a < b) usandoRecursion(a + 1, b);
    else System.out.println();
  }
}
