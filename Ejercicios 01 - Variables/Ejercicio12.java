import java.util.Scanner;

public class Ejercicio12{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("Ingrese la base del rectangulo "); 
        int base = teclado.nextInt();   

        System.out.print("Ingrese la latura del rectangulo "); 
        int altura = teclado.nextInt();  

        int resultado = (base * altura); 
        System.out.print("El area del rectangulo es: "+resultado); 

    }
}