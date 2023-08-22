import java.util.Scanner;  

public class Ejercicio01{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("-> Ingrese un numero entero para el tamano del array "); 
        int size = teclado.nextInt(); 

        int arreglo []= new int [size]; 
        int impar =1;

        for(int i =0; i<size; i++){
            arreglo[i]=impar; 
            impar =  impar+2; 
        }

        for(int i =0; i<size; i++){
            System.out.print("[ "+arreglo[i]+" ] "); 
        }
    }
}