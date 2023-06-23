import java.time.LocalDate;

public class Tarea {
    private int id;
  public String nombre;
  public boolean completed;
  public LocalDate startDate, endDate;
  public static int count;
  
  public Tarea( String nombre, LocalDate endDate)
  {
    this.id=++count;
    this.nombre=nombre;
    this.completed=false;
    this.startDate=LocalDate.now();
    this.endDate=endDate;
  }

  public int getID() {
    return id;
  }
}
