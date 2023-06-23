
public class Triangulo {
    private double la1,la2,la3;

  public Triangulo(double la1,double la2,double la3){
     this.la1=la1;
    this.la2=la2;
    this.la3=la3;
  }
    
  double calcularArea(){
    double s = (la1+la2+la3)/2;
    double area = Math.sqrt(s*(s-la1) * (s-la2) * (s-la3));
    return area;
  }

}
