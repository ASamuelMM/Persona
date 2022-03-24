//CLASE PERSONA HERENCIA
//DOS TIPOS DE HERENCIA:
//EXTENSION: A LOS METODOS DEL PADRE, LE AÑADIMOS METODOS PROPIOS
//ESPECIALIZACION: MODIFICAMOS LOS METODS DEL PADRE PARA ADOPTARLOS A NUESTRAS NECESIDADES
class Persona{
  //ATRIBUTOS
  private String nombre;
  private String dni;

  //CONSTRUCTOR
  public Persona(){
    this.nombre = "Samuel";
    this.dni = "12345678A";
  }

  public Persona(String nom, String d){
    this.nombre = nom;
    this.dni = d;
  }

  //GET
  public String getNombre(){
    return this.nombre;
  }

  public String getDni(){
    return this.dni;
  }

  //SET
  public void setNombre(String nom){
    this.nombre = nom;
  }

  public void setDni(String d){
    this.dni = d;
  }

  //TO STRING
  public String toString(){
    return "Me llamo " + this.nombre + " y mi dni es " + this.dni;
  }
}
