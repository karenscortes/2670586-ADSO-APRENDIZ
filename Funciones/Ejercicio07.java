import java.util.Scanner;

public class Ejercicio07{

    public static void main(String[] args){
        int array [] = new int [100]; 
        array = llenarArray(array); 
        
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