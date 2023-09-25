import java.util.Scanner;

public class Ejercicio01{

    public static void main(String[] args){
        System.out.println("suma = "+ sumar(3,6) ); 
        System.out.println("suma = "+ sumar(4,-2) ); 
        System.out.println("suma = "+ sumar(-10,-3) );
    }

    public static int sumar(int a, int b){
        int resul = (a+b); 
        return resul;
    }
}