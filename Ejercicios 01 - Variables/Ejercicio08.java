import java.util.Scanner;

public class Ejercicio08{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("Ingrese una cadena de texto "); 
        String cadena1 = teclado.nextLine();   

        System.out.print("Ingrese otra cadena de texto "); 
        String cadena2 = teclado.nextLine();  

        String cadena = cadena1 +" "+ cadena2; 
        System.out.print(cadena); 

    }
}