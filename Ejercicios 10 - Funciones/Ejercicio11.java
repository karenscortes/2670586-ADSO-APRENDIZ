import java.util.Scanner;

public class Ejercicio11{

    public static void main(String[] args){
        System.out.println("Factorial: "+ factorial(3)); 
        System.out.println("Factorial: "+ factorial(4)); 
        System.out.println("Factorial: "+ factorial(5));
    }

    public static int factorial(int a){
        int resultado =1;
        for(int i=1; i<=a; i++){
            resultado = resultado*i; 
        }
     
        return resultado;
    }
}