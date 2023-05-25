import java.util.Scanner;

public class Ejercicio02{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Biembenido a nuestro sistema");  

        System.out.print("Ingrese un numero de tres digitos "); 
        int numero = teclado.nextInt();   

        if(numero>999){
            System.out.print("ingrese un dato correcto, intentelo de nuevo");  
        } 
        else{
            if(numero<100){ 
                System.out.print("ingrese un dato correcto, intentelo de nuevo"); 
            } 
            else{ 
                if(numero%2==0){ 
                    System.out.print("El numero es par"); 
                } 
                else{
                    System.out.print("el numero es impar"); 
                }
                
            }
        }
    }
}