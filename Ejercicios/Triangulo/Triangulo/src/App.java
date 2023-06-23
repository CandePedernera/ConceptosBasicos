public class App {
    public static void main(String[] args) throws Exception {
    Triangulo t1 = new Triangulo(4, 5, 6);
    double area1 = t1.calcularArea();
    System.out.println("El área del triángulo 1 es: " + area1);
    Triangulo t2 = new Triangulo(3,4, 5);
    double area2 = t2.calcularArea();
    System.out.println("El área del triángulo 2 es: " + area2);
    }
}
