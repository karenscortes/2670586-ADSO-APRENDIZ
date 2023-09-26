import java.util.Scanner;

public class Ejercicio05{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("Ingrese la base del triaungulo "); 
        int base = teclado.nextInt();   

        System.out.print("Ingrese la latura del triangulo "); 
        int altura = teclado.nextInt();  

        int resultado = (base * altura)/2; 
        System.out.print("El area del triangulo es: "+resultado); 

    }
}