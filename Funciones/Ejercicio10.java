import java.util.Scanner;

public class Ejercicio10{

    public static void main(String[] args){
        int array [] = new int [4]; 
        int a=1;
        for(int i=0 ;i<array.length; i++){
            array[i] = a; 
            a= a+2;
        }

        sumarArreglo(array);

    }

    public static int sumarArray(int [] array){
        int suma =0;
        for(int i=0; i<array.length; i++){
            suma = suma + array[i];
        }
        return suma;
    }
}
