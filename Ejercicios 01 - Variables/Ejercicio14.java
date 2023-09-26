import java.util.Scanner;

public class Ejercicio14{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("Ingrese la primera nota "); 
        float n1 = teclado.nextFloat();  

        System.out.print("Ingrese los creditos de la primera nota "); 
        float c1 = teclado.nextFloat(); 


        System.out.print("Ingrese la segunda nota "); 
        float n2 = teclado.nextFloat();  

        System.out.print("Ingrese los creditos de la segunda nota "); 
        float c2 = teclado.nextFloat(); 


        System.out.print("Ingrese la tercera nota "); 
        float n3 = teclado.nextFloat();  

        System.out.print("Ingrese los creditos de la tercera nota "); 
        float c3 = teclado.nextFloat(); 

        float suma = (n1*c1) + (n2*c2) + (n3*c3);
        float resultado = (suma)/(c1 + c2 + c3); 
        System.out.print("El promedio es: "+resultado); 

    }
}