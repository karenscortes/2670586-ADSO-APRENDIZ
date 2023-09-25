import java.util.Scanner;

public class Ejercicio06{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("-> Ingrese un numero de tamamo para el array "); 
        int size = teclado.nextInt(); 

        System.out.print("-> Ingrese otro numero de 1 a 10 "); 
        int m = teclado.nextInt(); 

        int aleatorio = 0;
        int igual = 0;
        int arreglo []= new int [size]; 

        for(int i =0; i<size; i++){
            aleatorio = (int)(Math.random()*(10-1+1)-1);
            if(aleatorio == m){
                igual = igual +1;
            }
            arreglo[i] = aleatorio; 
        }

        System.out.println("La cantidad de veces que se repite "+m+" es:"+igual);  
    }
}