import java.util.Scanner;

public class Ejercicio09{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("Ingrese un numero "); 
        int n = teclado.nextInt();    

        int resultado = n % 2; 
    
        System.out.println("Si los numeros coninciden el numero ingresado es par si no, es impar: "); 

        System.out.println(resultado+" = "+0);

    }
}