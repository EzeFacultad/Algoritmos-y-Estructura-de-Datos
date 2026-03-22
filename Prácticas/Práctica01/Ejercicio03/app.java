package Prácticas.Práctica01.Ejercicio03;

public class app {
  public static void main(String[] args) {
    Estudiante e = new Estudiante("Ezequiel", "Belmonte", 7, "eze@gmail.com", "49 y 19");
    Profesor p = new Profesor("Pedro", "Alonso", "profe@hotmail.com", "CADP", "Informática");

    System.out.println(" ===== Alumno ===== ");
    System.out.println(e.tusDatos());

    System.out.println(" ===== Profesor ===== ");
    System.out.println(p.tusDatos());
  }
}
