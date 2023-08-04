import java.util.Scanner;

public class Ejercicio01{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("-> Ingrese un numero de tamamo para el array "); 
        int size = teclado.nextInt(); 

        int aleatorio = 0;
        int suma =0;
        int arreglo []= new int [size]; 

        for(int i =0; i<size; i++){
            aleatorio = (int)(Math.random()*(100-1+1)-1);
            suma = suma + aleatorio;
            arreglo[i] = aleatorio; 
        }

        System.out.println("La suma de todos los aleatorios es: "+suma);  


    }
}
