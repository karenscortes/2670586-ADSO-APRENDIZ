import java.util.Scanner;

public class Ejercicio07{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("-> Ingrese un numero de tamamo para el array "); 
        int size = teclado.nextInt(); 

        int aleatorio = 0;
        int arreglo []= new int [size]; 
        int invertido [] = new int [0];

        for(int i =0; i<size; i++){
            aleatorio = (int)(Math.random()*(100-1+1)-1);
            System.out.println(aleatorio);
            arreglo[i] = aleatorio; 
        }

        for(int i = 0; i<arreglo.length;i++){
            System.out.print(arreglo[i]+", "); 
        }

        for(int i = 0; i<arreglo.length;i++){
            System.out.print(invertido[i]+", "); 
        }
        


    }
}
