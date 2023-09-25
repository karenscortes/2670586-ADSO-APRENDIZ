import java.util.Scanner;

public class Ejercicio02{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("-> Ingrese un numero de tamano para el array "); 
        int size = teclado.nextInt(); 

        String array [] = new String [size]; 
        String palabra;

        for(int i =0; i<size; i++){
            System.out.print("-> Ingrese un nombre para llenar el array "); 
            palabra = entrada.nextLine(); 
            array[i] = palabra;
        } 

        System.out.print("-> Ingrese un nombre que desea buscar en el array "); 
        String nombre = entrada.nextLine(); 

        for(int i =0; i<size; i++){
            if(array[i].equals(nombre)){
               System.out.println("Posicion "+i);  
            }
        }

    }
}