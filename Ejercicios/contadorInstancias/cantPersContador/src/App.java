/**
 Se incrementara un contador cada que una persona se ingrese. 
 Como no se usa ninguna estructura de datos cada que se ingrese una 
 persona se borrara la información de la anterior
**/
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        int op, age;
        String name;  
        Scanner leer; 
        Personas per1;
        per1=new Personas(); 
        leer= new Scanner(System.in); 
        do {
            System.out.println("¿Quiere agregar una nueva persona?, 1=SI 2=NO");
            op= leer.nextInt(); 
            leer.nextLine(); 
            switch (op) {
                case 1:
                    System.out.println("Ingresa edad");
                    age= leer.nextInt(); 
                    leer.nextLine();
                    System.out.println("Ingresa nombre");
                    name=leer.nextLine(); 
                    per1= new Personas(age, name); 
                    System.out.println("Cantidad="+per1.getCantidad_personas());

                    break;
            
                default:
                    break;
            }
            
        } while (op!=2);
        System.out.println("TOTAL");
        System.out.println("Cantidad="+per1.getCantidad_personas());
    }

}
