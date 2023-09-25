import java.util.Scanner;

public class Ejercicio04{

    public static void main(String[] args){
        System.out.println("division = "+ dividir(3,6) ); 
        System.out.println("division = "+ dividir(4,2) ); 
        System.out.println("division = "+ dividir(10,2) ); 
    }

    public static float dividir(float a, float b){
        float resul = (a/b); 
        return resul;
    }
}