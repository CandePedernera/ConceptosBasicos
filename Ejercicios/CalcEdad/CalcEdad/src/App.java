import java.time.LocalDate;
import java.time.Period;
public class App {
    public static void main(String[] args) throws Exception {
    LocalDate fechaDeNacimiento;
    fechaDeNacimiento = LocalDate.of(2003,03,23);
    calcularage(fechaDeNacimiento);
  }
  
  public static void calcularage(LocalDate fechaDeNacimiento){
    LocalDate fechaActual;
    Period periodo;
    int age;
    fechaActual = LocalDate.now();
    periodo = Period.between(fechaDeNacimiento, fechaActual);
    age = periodo.getYears();
    System.out.println("La edad es: " + age + " años");
  }
    }

