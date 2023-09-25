import java.util.Scanner;

public class Ejercicio02{

    public static void main(String[] args){
        System.out.println("resta = "+ restar(3,6) ); 
        System.out.println("resta = "+ restar(4,-2) ); 
        System.out.println("resta = "+ restar(-10,-3) );
    }

    public static int restar(int a, int b){
        int resul = (a-b); 
        return resul;
    }
}
