import java.util.Scanner;

public class Ejercicio03{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("-> Ingrese el numero de la altura de la piramide "); 
        int altura = teclado.nextInt(); 
        
        int espacio = altura; 
        int filas =1; 
        int x = 1; 

        while(altura>=filas){
            for(int i=0; i<=espacio; i++){
               System.out.print(" ");  
            } 
            for(int i=0; i<x ; i++){
                System.out.print("x");
            }  
            x = (x + 2); 
            espacio = (espacio -1);
            System.out.println(); 
            filas = filas +1;
        }
        
    }
}