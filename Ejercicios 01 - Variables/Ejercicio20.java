import java.util.Scanner;

public class Ejercicio20{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("Ingrese un numero (max 5 cifras) "); 
        int numero = teclado.nextInt();    

        int n1 = numero / 10000;
        int n2 = numero / 1000 %10;  
        int n3 = numero / 100 %10; 
        int n4 = numero / 10 %10;   
        int n5 = numero %10;  

        int suma = n1 + n2 + n3 + n4 + n5;  

        System.out.print("La suma de los digitos es: "+suma); 

    }
}