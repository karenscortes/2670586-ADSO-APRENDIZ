import java.util.Scanner;

public class Ejercicio09{

    public static void main(String[] args){

        int array [] = {2,4,5,8,1}; 
        int minimo = nMenor(array);

        System.out.println("El numero menor es: "+minimo );
    }

    public static int nMenor(int [] array){
        int menor =100; 
        for(int i=0; i<array.length; i++){
            if(array[i]<menor){
                menor=array[i]; 
            }
        }
        return menor;
        
    }
}