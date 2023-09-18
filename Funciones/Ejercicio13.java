import java.util.Scanner;

public class Ejercicio13{

    public static void main(String[] args){

        int array [] = {6,4,5,9,8}; 
        int arrayOrdenado = ordenarArray(array);

        System.out.println("El array ordenado de manera ascendente: ");
    }

    public static int [] ordenarArray(int [] array){
        int aux=0;
        for(int i=0; i<array.length; i++){
        
            if(array[i]>array[i+1]){
                aux = array[i+1]; 
                array[i+1]= array[i]; 
                array[i]= aux; 
            }
        } 
        
        
    }
}