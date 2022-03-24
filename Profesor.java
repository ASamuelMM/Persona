class Profesor extends Persona{
  //ATRIBUTOS
  private int seguridadSocial;
  private double sueldo;

  //CONSTRUCTOR
  public Profesor(){
    this.seguridadSocial = 11223344;
    this.sueldo = 1200.50;
  }

  public Profesor(String nom, String d, int ss, double salario){
    super(nom, d);
    this.seguridadSocial = ss;
    this.sueldo = salario;
  }

  //TO STRING
  public String toString(){
    return super.toString() + " . Mi SS es " + seguridadSocial + " y el sueldo es de " + sueldo + " euros";
  }
}
