package Prácticas.Práctica03.Ejercicio04;

public class AreaEmpresa {
  private String identificacion;
  private int transmision;


  // constructor
  public AreaEmpresa( String indentificacion, int transicion ) {
    this.identificacion = indentificacion;
    this.transmision = transicion;
  }


  // Getters y Setters
  public String getIdentificacion() {
    return identificacion;
  }

  public void setIdentificacion( String identificacion ) {
    this.identificacion = identificacion;
  }


  public int getTransmision() {
    return transmision;
  }

  public void setTransmision( int transimision ) {
    this.transmision = transimision;
  }

  @Override
  public String toString() {
    String aux = "Identificación: " + getIdentificacion() + " | Tiemp. transmisión: " + getTransmision();
    return aux;
  }
}
