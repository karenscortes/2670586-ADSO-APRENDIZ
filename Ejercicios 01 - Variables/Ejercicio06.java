import java.util.Scanner;

public class Ejercicio06{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("Ingrese un numero entero "); 
        int n1 = teclado.nextInt();   

        System.out.print("Ingrese otro numero entero "); 
        int n2 = teclado.nextInt();  

        System.out.print("Ingrese otro numero entero "); 
        int n3 = teclado.nextInt();

        System.out.print("Ingrese un ultimo numero entero "); 
        int n4 = teclado.nextInt();

        double resultado = (n1 + n2 + n3 + n4)/4; 
        System.out.print("El promedio es: "+resultado); 

    }
}