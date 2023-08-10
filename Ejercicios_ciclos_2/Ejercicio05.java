import java.util.Scanner;

public class Ejercicio05{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("-> Ingrese un numero para realizar el factorial "); 
        int numero = teclado.nextInt(); 

        int resultado = 1;

        for(int i=1; i<=numero; i++){ 
            resultado = resultado * i; 
            System.out.print(i);  
            if(i<numero){
                System.out.print(" x "); 
            }
        } 
        System.out.print(" = "+resultado); 
    }
}