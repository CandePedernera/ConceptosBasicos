/*
  Crea una clase Alumno con atributos nombre, apellido y notas, y métodos getNombre(), 
getApellido(), setNombre(), setApellido() y getPromedio(). Haz que el atributo notas sea final.
 */

public class App {
    public static void main(String[] args) throws Exception {
    
    Alumno a;
    a = new Alumno("Candela","Pedernera",7.5,9,8);
    System.out.println("Nombre: " + a.getName());
    System.out.println("Apellido: " + a.getSurname());
    System.out.println("Promedio: " + a.getPromedio());
  
    }
}
