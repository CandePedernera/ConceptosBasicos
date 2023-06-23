public class Alumno {
    String name, surname; 
    private final double[] notas = new double[3];
    double prom;
  
    public Alumno(String name, String surname){
        this.name=name; 
        this.surname=surname; 
    }

    public Alumno(String name, String surname, double n1,double n2,double n3) {
        this.name = name;
        this.surname = surname;
        notas[0]=n1;
        notas[1]=n2;
        notas[2]=n3;
    }
    

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getPromedio(){
    double suma=0;
    for (double nota : notas) {
    suma += nota;
    }
    return suma/notas.length;
  }

     
    
}
