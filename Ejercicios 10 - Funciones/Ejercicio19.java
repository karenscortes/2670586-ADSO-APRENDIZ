public class Ejercicio19{

    public static void main(String[] args){
        System.out.println("Area del circulo = "+ areaCirculo(5) ); 
        System.out.println("Area del circulo = "+ areaCirculo(4) ); 
        System.out.println("Area del circulo = "+ areaCirculo(8) ); 
    }

    public static double areaCirculo(double a){
        double cuadrado = a * a;
        double area= 3.1416 * cuadrado;
        
        return area;
    }
}