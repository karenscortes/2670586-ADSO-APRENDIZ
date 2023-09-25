import java.util.Scanner;

public class Ejercicio05{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("-> Ingrese un numero de tamamo para el array "); 
        int size = teclado.nextInt(); 

        float aleatorio = 0;
        float suma = 0;
        float prom = 0;
        float arreglo []= new float [size]; 

        for(int i =0; i<size; i++){
            aleatorio = (float)(Math.random()*(80-1+1)-1);
            suma = suma + aleatorio;
            arreglo[i] = aleatorio; 
        }

        prom = suma / size;
        System.out.println("El promedio es: "+prom);  
    }
}