public class Division {
    public double dividir(int n1,int n2){
    double result;
    try{
      result = n1/n2;
    }catch(ArithmeticException e){
      System.out.println("Error! No es posible dividir por cero");
      result=0;
    }
    return result;
  }
}
