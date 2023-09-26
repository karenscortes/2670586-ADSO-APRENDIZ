import java.util.Scanner;

public class Ejercicio03{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("Ingrese un numero entero "); 
        int numero = teclado.nextInt();   

        if(numero==0){
            System.out.print("Este numero no es par ni impar, es nulo");  
        } 
        else{
            if(numero % 2 != 0){ 
                System.out.print("el numero es impar"); 
            } 
            else{
                if(numero%2 == 0){
                    System.out.print("el numero es par"); 
                } 
                else{
                  System.out.print("ingrese un numero entero");  
                }
            }
        }
    }
}