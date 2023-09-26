import java.util.Scanner;

public class Ejercicio05{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("Ingrese un year "); 
        int year = teclado.nextInt();   

        if(year%4==0 && year%100!=0 || year%400==0){
            System.out.print("ES BISIESTO ");
        } 
        else{
            System.out.print("NO ES BISIESTO ");
        }


    } 
}