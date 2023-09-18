import java.util.Scanner;

public class Ejercicio12{

    public static void main(String[] args){
        System.out.println("Es primo?: "+ primo(3)); 
        System.out.println("Es primo?: "+ primo(4)); 
        System.out.println("Es primo?: "+ primo(5));
    }

    public static boolean primo(int a){
        int divisores=0; 
        for(int i=1; i<=a; i++){
            if(a%i==0){
                divisores = divisores+1; 
            }
        }

        if(divisores==2){
           return true; 
        }else{
            return false;
        }
        
    }
}