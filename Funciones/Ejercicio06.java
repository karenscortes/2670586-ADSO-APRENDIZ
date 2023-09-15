import java.util.Scanner;

public class Ejercicio06{

    public static void main(String[] args){
        System.out.println("numero mayor = "+ nMayor(2,21,8) ); 
        System.out.println("numero mayor = "+ nMayor(4,2,12) ); 
        System.out.println("numero mayor = "+ nMayor(10,2,9) ); 
    }

    public static int nMayor(int a, int b, int c){
        int mayor =0;
        if(a>b && a>c){
            mayor = a; 
        }else if(b>c && b>a){
            mayor = b; 
        }else if(c>a && c>b){
            mayor = c; 
        }
        return mayor;
    }
}