class Alumno extends Persona{
  //ATRIBUTOS
  private String grado;

  //CONSTRUCTOR
  public Alumno(){
    this.grado = "DAM";
  }

  public Alumno(String nom, String d, String grado){
    super(nom, d);
    this.grado = grado;
  }

  //TO STRING
  public String toString(){
    return super.toString() + " y estoy en el grado de " + this.grado;
  }
}
