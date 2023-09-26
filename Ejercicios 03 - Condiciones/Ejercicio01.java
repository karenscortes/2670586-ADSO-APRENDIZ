import java.util.Scanner;

public class Ejercicio01{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("Ingrese un numero entero "); 
        int numero = teclado.nextInt();   

        if(numero==0){
            System.out.print("Este numero no es positivo ni negativo, es nulo");  
        } 
        else{
            if(numero<0){ 
                System.out.print("el numero es negativo"); 
            } 
            else{
                if(numero>0){
                    System.out.print("el numero es positivo"); 
                } 
                else{
                  System.out.print("ingrese un numero entero");  
                }
            }
        }
    }
}