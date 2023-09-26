import java.util.Scanner;

public class Ejercicio10{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("Ingrese un numero entero "); 
        int n1 = teclado.nextInt();   

        System.out.print("Ingrese otro numero entero "); 
        int n2 = teclado.nextInt();  

        int resultado = n1 / n2; 
        int mod = n1 % n2;

        System.out.println("El resultado de la division es: "+resultado); 
        System.out.print("El resto de la division es: "+mod);

    }
}