import java.util.Scanner;

public class Ejercicio05{

    public static void main(String[] args){
        System.out.println("potencia = "+ potencia(2,3) ); 
        System.out.println("potencia = "+ potencia(4,2) ); 
        System.out.println("potencia = "+ potencia(10,2) ); 
    }

    public static int potencia(int a, int b){
        int resul = a*a;
        for(int i=2; i<b; i++){
            resul = resul *a;
        }
        return resul;
    }
}