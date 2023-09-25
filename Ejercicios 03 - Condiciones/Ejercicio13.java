import java.util.Scanner;

public class Ejercicio13{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Biembenido a nuestro sistema");  

        System.out.print("Ingrese un numero entero "); 
        int numero = teclado.nextInt();   

        if(numero%2==0 && numero%3==0 && numero%5==0){
            System.out.println(numero +" es divisible por 2, 3 y 5 al mismo tiempo");
        } 
        else if(numero%2==0 && numero%3==0 && numero%5!=0){
            System.out.println(numero +" es divisible por 2 y por 3 pero no es divisible por 5");
        }
        else if(numero%2==0 && numero%3!=0 && numero%5==0){
            System.out.println(numero +" es divisible por 2 y por 5 pero no es divisible por 3");
        } 
        else if(numero%2!=0 && numero%3==0 && numero%5==0){
            System.out.println(numero +" es divisible por 3 y por 5 pero no es divisible por 2");
        }
        else if(numero%2==0 && numero%3!=0 && numero%5!=0){
            System.out.println(numero +" solo es divisible por 2");
        }
        else if(numero%2!=0 && numero%3==0 && numero%5!=0){
            System.out.println(numero +" solo es divisible por 3");
        } 
        else if(numero%2!=0 && numero%3!=0 && numero%5==0){
            System.out.println(numero +" solo es divisible por 5");
        }
        else{
           System.out.println(numero +" no es divisible por 2, ni por 3 ni por 5"); 
        }


    } 
}