import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
        /**
         * Crea una clase "Empleado" que tenga tres constructores sobrecargados: uno que
         * tome el nombre
         * del empleado y su salario como parámetros, otro que tome el nombre del
         * empleado, su salario y su
         * puesto como parámetros, y otro que tome el nombre del empleado, su salario,
         * su puesto y su fecha
         * de contratación como parámetros.
         **/
        Empleado e1, e2, e3;
        e1 = new Empleado("Candela", 6453);
        System.out.println("Nombre: " + e1.nombre);
        System.out.println("Salario: $" + e1.salario);

        e2 = new Empleado("Nahir", 743435, "Ingeniera");
        System.out.println("Nombre: " + e2.nombre);
        System.out.println("Salario: $" + e2.salario);
        System.out.println("Puesto: " + e2.puesto);
        
        e3 = new Empleado("Nahir Pedernera", 7843654, "Programadora", LocalDate.now());
        System.out.println("Nombre: " + e3.nombre);
        System.out.println("Salario: $" + e3.salario);
        System.out.println("Puesto: " + e3.puesto);
        System.out.println("Fecha de contratación: " + e3.fecha);
    }
}
