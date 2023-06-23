public class Personas {
    public static int cantidad_personas = 0;
    int age; 
    String name; 
    
    public Personas(){   
    }

    public Personas(int age, String name){
        this.age=age; 
        this.name=name; 
        cantidad_personas++; 
    }
    public static int getCantidad_personas() {
        return cantidad_personas;
    }
}
