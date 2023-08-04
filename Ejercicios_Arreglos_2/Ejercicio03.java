import java.util.Scanner;

public class Ejercicio03{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("-> Ingrese un numero de tamamo para el array "); 
        int size = teclado.nextInt(); 

        int aleatorio = 0;
        int mayor =0;
        int arreglo []= new int [size]; 

        for(int i =0; i<size; i++){
            aleatorio = (int)(Math.random()*(100-1+1)-1);
            if(aleatorio>mayor){
                mayor = aleatorio;
            }
            arreglo[i] = aleatorio; 
        }

        System.out.println("El numero mayor es: "+mayor);  
    }
}