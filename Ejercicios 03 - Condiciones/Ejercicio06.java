import java.util.Scanner;

public class Ejercicio06{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Biembenido a nuestro sistema");  

        System.out.print("Ingrese su edad "); 
        int edad = teclado.nextInt();   

        if(edad>=18){
            System.out.print("PUEDE VOTAR ");
        } 
        else{
            System.out.print("NO PUEDE VOTAR ");
        }


    } 
}