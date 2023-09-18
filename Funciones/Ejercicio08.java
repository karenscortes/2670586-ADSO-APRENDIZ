import java.util.Scanner;

public class Ejercicio08{

    public static void main(String[] args){
        int array [] = new int [100]; 
        llenarArray(array);
        imprimirArreglo(array);
    }

    public static void imprimirArreglo(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+", ");
        }
    }

    public static int [] llenarArray(int [] array){
        int aleatorio =0;
        for(int i=0; i<array.length; i++){
            aleatorio = (int) (Math.random()*100);
            array[i]=aleatorio;
        }
        return array;
    }
}