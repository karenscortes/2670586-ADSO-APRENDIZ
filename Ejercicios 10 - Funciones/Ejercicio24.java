import java.util.Scanner;

public class Ejercicio24{

    public static void main(String[] args){

        int array [] = {2,4,5,5,8,7,89,3,5,85,24}; 
        int pares= paresArreglo(array);
        int impares= imparesArreglo(array);

        System.out.println("El numero de pares es: "+pares);
        System.out.println("El numero de impares es: "+impares);
    }

    public static int  paresArreglo(int [] array){
        int pares =0;
        for(int i=0; i<array.length; i++){
            if(array[i] %2==0){
                pares = pares +1; 
            }
        } 
        return pares;
    }

    public static int imparesArreglo(int [] array){
        int impares =0;
        for(int i=0; i<array.length; i++){
            if(array[i]%2!=0){
                impares = impares +1; 
            }
        } 
        return impares;
    }
}