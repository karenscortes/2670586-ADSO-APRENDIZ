import java.util.Scanner;

public class Ejercicio22{

    public static void main(String[] args){

        int cantidad = 4;
        int array [] = new int [cantidad]; 
        array =primoArreglo(array,cantidad);

        System.out.println("El array llenado con numeros primos: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
    }

    public static int [] primoArreglo(int [] array, int cantidad){
        int aleatorio=0;
        int primo=0; 
        int divisores=0;
        while(primo < cantidad){
            aleatorio = (int)(Math.random()*(100-2+1)-2);
            for(int i =1; i<=aleatorio;i++ ){
                if(aleatorio%i == 0){
                    divisores = divisores +1; 
                } 
            }

            if(divisores == 2){
                primo = primo+1; 
                
                for(int i=0; i<array.length; i++){
                    array[i]= aleatorio;
                }
            }

        
        }   
        return array;
    }
}
