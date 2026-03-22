package Prácticas.Práctica01.Ejercicio07.d_e;

import Prácticas.Práctica01.Ejercicio03.Estudiante;
import java.util.LinkedList;

public class app {
  public static void main(String[] args) {
    LinkedList<Estudiante> estudiantes = new LinkedList<>();
    LinkedList<Estudiante> copiaEstudiantes;
    estudiantes.add(new Estudiante("Aaaa", "Aaaaaaa", 1, "a@gmail.com", "1 y 2"));
    estudiantes.add(new Estudiante("Bbbb", "Bbbbbbb", 2, "b@hotmail.com", "3 y 4"));
    estudiantes.add(new Estudiante("Cccc", "Ccccccc", 3, "c@gmail.com", "4 y 6"));

    copiaEstudiantes = new LinkedList<>(estudiantes);

    System.out.println("===== Lista original ====");
    for (Estudiante e : estudiantes) {
      System.out.println("Apellido y nombre: " + e.getApellido() + " " + e.getNombre());
    }

    System.out.println();

    System.out.println("===== Lista copiada ====");
    for (Estudiante e : copiaEstudiantes) {
      System.out.println("Apellido y nombre: " + e.getApellido() + " " + e.getNombre());
    }

    estudiantes.get(0).setNombre("Cambie el nombre");

    System.out.println("Luego de cambiar un estudiante");
    System.out.println("===== Lista original ====");
    for (Estudiante e : estudiantes) {
      System.out.println("Apellido y nombre: " + e.getApellido() + " " + e.getNombre());
    }

    System.out.println();

    System.out.println("===== Lista copiada ====");
    for (Estudiante e : copiaEstudiantes) {
      System.out.println("Apellido y nombre: " + e.getApellido() + " " + e.getNombre());
    }

    Estudiante nuevoEstudiante = new Estudiante("Dddd", "Dddddd", 1, "d@gmail.com", "7 y 8");
    boolean encontrado = false;
    for (Estudiante e : estudiantes) {
      if (e.getApellido() == nuevoEstudiante.getApellido() && e.getNombre() == nuevoEstudiante.getNombre()) {
        encontrado = true;
        break;
      }
    }

    if (!encontrado) estudiantes.add(nuevoEstudiante);
  }
}
