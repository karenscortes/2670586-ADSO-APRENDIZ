import java.util.Scanner;

public class Ejercicio07{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("Ingrese el precio al que desea aplicarle el descuento "); 
        int precio = teclado.nextInt();   

        System.out.print("Ingrese el porcentaje del descuento "); 
        int des = teclado.nextInt();  

        double resultado = (precio/100)*des; 
        double total = precio - resultado;
        
        System.out.print("El total con el descuento aplicado es: "+total); 

    }
}