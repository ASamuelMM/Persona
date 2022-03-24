import java.util.ArrayList;

public class Main{
  public static void main(String[] args){

    Persona miPersona = new Persona();
    Alumno miAlumno = new Alumno("Marivi", "12864332N", "ASD");
    Profesor miProfesor = new Profesor("Samuel", "12346787A", 12349876, 3400.76);


    System.out.println(miProfesor);

    ArrayList<Integer> lista = new ArrayList();
    lista.add(4);
    lista.add(5);
    System.out.println(lista);

    ArrayList<Alumno> listaAlumno = new ArrayList();
    listaAlumno.add(miAlumno);
    System.out.println(listaAlumno);
    System.out.println(listaAlumno.get(0).getNombre());

  }
}
