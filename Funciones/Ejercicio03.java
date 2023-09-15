import java.util.Scanner;

public class Ejercicio03{

    public static void main(String[] args){
        System.out.println("multiplicacion = "+ multiplicar(3,6) ); 
        System.out.println("multiplicacion = "+ multiplicar(4,-2) ); 
        System.out.println("multiplicacion = "+ multiplicar(-10,-3) );
    }

    public static int multiplicar(int a, int b){
        int resul = (a*b); 
        return resul;
    }
}