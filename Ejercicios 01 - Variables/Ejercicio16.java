import java.util.Scanner;

public class Ejercicio16{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("Ingrese el valor de la inversion inicial "); 
        double inversion = teclado.nextDouble();   

        System.out.print("Ingrese la tasa de intereses "); 
        double tasa = teclado.nextDouble();  

        System.out.print("Ingrese el numero de periodos "); 
        double periodos = teclado.nextDouble();  

        double potencia = Math.pow((1+tasa),periodos);
        double resultado = inversion * potencia; 

        System.out.print("El monto del interes compuesto es: "+resultado); 

    }
}