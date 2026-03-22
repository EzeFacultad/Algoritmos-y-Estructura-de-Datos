package Prácticas.Práctica01.Ejercicio03;

public class Estudiante {
  private String nombre;
  private String apellido;
  private int comision;
  private String email;
  private String direcicon;


  public Estudiante(String nombre, String apellido, int comision, String email, String direccion) {
    this.apellido = apellido;
    this.nombre = nombre;
    this.comision = comision;
    this.email = email;
    this.direcicon = direccion;
  }


  // Getters y Setters
  public String getNombre() {
    return nombre;
  }
  public void setNombre(String nombre) {
    this.nombre = nombre;
  }


  public String getApellido() {
    return apellido;
  }
  public void setApellido(String apellido) {
    this.apellido = apellido;
  }


  public int getComision() {
    return comision;
  }
  public void setComision(int comision) {
    this.comision = comision;
  }


  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }


  public String getDirecicon() {
    return direcicon;
  }
  public void setDirecicon(String direcicon) {
    this.direcicon = direcicon;
  }


  // Métodos
  public String tusDatos() {
  return "Apellido y Nombre: " + getApellido() + " " + getNombre() + "\n" +
    "Email: " + getEmail() + "\n" + 
    "Comision: " + getComision() + "\n" + "Direccion: " + getDirecicon();
  }
}
