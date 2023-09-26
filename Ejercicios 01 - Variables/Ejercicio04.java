import java.util.Scanner;

public class Ejercicio04{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("Ingrese un numero entero "); 
        int n1 = teclado.nextInt();   

        System.out.print("Ingrese otro numero entero "); 
        int n2 = teclado.nextInt();  

        int suma = n1 + n2;

        System.out.println("Primer numero: "+(suma-n1)); 
        System.out.println("Segundo numero: "+(suma-n2));

    }
}