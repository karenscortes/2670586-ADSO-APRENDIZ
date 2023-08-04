import java.util.Scanner;

public class Ejercicio02{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("-> Ingrese un numero de tamamo para el array "); 
        int size = teclado.nextInt(); 

        int aleatorio = 0;
        int producto =1;
        int arreglo []= new int [size]; 

        for(int i =0; i<size; i++){
            aleatorio = (int)(Math.random()*(100-1+1)-1);
            producto = producto * aleatorio;
            arreglo[i] = aleatorio; 
        }

        System.out.println("La multiplicacion de todos los aleatorios es: "+producto);  


    }
}
