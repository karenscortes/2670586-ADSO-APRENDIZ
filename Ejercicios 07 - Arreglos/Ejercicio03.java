import java.util.Scanner;  

public class Ejercicio03{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("-> Ingrese un numero entero para el tamano del array "); 
        int size = teclado.nextInt(); 

        int arreglo []= new int [size]; 
        int n =0;

        for(int i=0; i<size; i++){
            System.out.print("-> Ingrese un numero entero para el tamano del array "); 
            n = teclado.nextInt(); 
        }

    }
}