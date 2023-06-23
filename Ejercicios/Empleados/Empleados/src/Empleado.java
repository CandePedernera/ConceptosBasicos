import java.time.LocalDate;

public class Empleado {
    public String nombre;
    public int salario;
    public String puesto;
    public LocalDate fecha;

    public Empleado(String nombre, int salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public Empleado(String nombre, int salario, String puesto) {
        this.nombre = nombre;
        this.salario = salario;
        this.puesto = puesto;
    }

    public Empleado(String nombre, int salario, String puesto, LocalDate fecha) {
        this.nombre = nombre;
        this.salario = salario;
        this.puesto = puesto;
        this.fecha = fecha;
    }
}
