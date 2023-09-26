import java.util.Scanner;

public class Ejercicio03{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Bienvenido a nuestro sistema");  

        int temp = 0;

        System.out.print("Ingrese un numero entero "); 
        int n1 = teclado.nextInt();   

        System.out.print("Ingrese otro numero entero "); 
        int n2 = teclado.nextInt();  

        temp = n1;
        n1 = n2;
        n2 = temp; 

        System.out.println("Primer numero: "+n1); 
        System.out.println("Segundo numero: "+n2);

    }
}