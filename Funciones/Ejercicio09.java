import java.util.Scanner;

public class Ejercicio09{

    public static void main(String[] args){
        System.out.println("numero menor = "+ nMenor(2,21,8) ); 
        System.out.println("numero menor = "+ nMenor(4,2,12) ); 
        System.out.println("numero menor = "+ nMenor(10,2,9) ); 
    }

    public static int nMenor(int a, int b, int c){
        int menor =0;
        if(a<b && a<c){
            menor = a; 
        }else if(b<c && b<a){
            menor = b; 
        }else if(c<a && c<b){
            menor = c; 
        }
        return menor;
    }
}