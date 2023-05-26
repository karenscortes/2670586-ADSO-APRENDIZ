import java.util.Scanner;

public class Ejercicio10{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Biembenido a nuestro sistema");  

        System.out.print("Ingrese la primera nota "); 
        int n1 = teclado.nextInt();   

        System.out.print("Ingrese la segunda nota "); 
        int n2 = teclado.nextInt();

        System.out.print("Ingrese la tercera nota "); 
        int n3 = teclado.nextInt();

        System.out.print("Ingrese la cuarta nota "); 
        int n4 = teclado.nextInt();

        System.out.print("Ingrese la quinta nota "); 
        int n5 = teclado.nextInt();

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