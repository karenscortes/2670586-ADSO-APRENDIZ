import java.util.Scanner;  

public class Ejercicio03{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("-> Ingrese un numero entero para crear el arreglo "); 
        int n = teclado.nextInt(); 

        System.out.print("-> Ingrese la cantidad de bombas que desea poner "); 
        int bombas = teclado.nextInt();

        int array []= new int [n]; 
        int array_bom []= new int [n]; 
        int aleatorio = 0;

        for(int i =0; i<n; i++){
            aleatorio = (int)(Math.random()*(1-n)+1);
            array[aleatorio]= 1;
        }
        for(int i =0; i<n; i++){
            System.out.println(array[i]);
        }


    }
}