import java.util.Scanner;

public class Ejercicio01{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("-> Ingrese un numero entero (1 a 6) "); 
        int numero = teclado.nextInt(); 

        int i =1;
        int aleatorio =0; 
        int numero_aleatorio =0;
        int numero_doble =1;
        if(numero>=1 && numero<=6){ 
            while(i<=numero){
                aleatorio = (int)(Math.random()*(10-1))+1;

                numero_aleatorio = (numero_aleatorio * 10) + aleatorio;
                i = i+1; 
            } 
            System.out.println("el numero generado es: "+numero_aleatorio); 
            numero_doble = numero_aleatorio *2; 
            System.out.print("resultado producto: "+numero_doble); 
        }
        else{
            System.out.print("solo se aceptan valores de 1 a 6, intentalo nuevamente ");
        }
    }
}