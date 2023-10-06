import java.util.Scanner;

public class Ejercicio08{

    public static void main(String[] args){
        int array [] = new int [100]; 
        Ejercicio07.llenarArray(array);
        imprimirArreglo(array);
    }

    public static void imprimirArreglo(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+", ");
        }
    }

    
}