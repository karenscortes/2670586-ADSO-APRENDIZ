import java.util.Scanner;

public class Ejercicio11{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in); 

        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("Ingrese un numero entero "); 
        String cadena = teclado.next();   

        int numero=Integer.parseInt(cadena); 

        if(numero%2==0){
            System.out.print("El numero es par "); 
        }
        else{
            System.out.print("El numero es impar"); 
        }
    }
}