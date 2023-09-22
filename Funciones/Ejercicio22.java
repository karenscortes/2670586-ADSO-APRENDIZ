import java.util.Scanner;

public class Ejercicio22{

    public static void main(String[] args){

        int cantidad = 10;
        int int array []= new int [];
        array = arregloPrimo(10);

        System.out.println("El array llenado con numeros primos: ");
        for (int i = 0; i < cantidad; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
    }

    public static int [] arregloPrimo(int cantidad){
        int array [] = new int [cantidad];
        int indice =0;
        int aleatorio=0;
        while(indice < cantidad){
            aleatorio = (int)(Math.random()*1000);
            int divisores=0;
            for(int i =1; i<= aleatorio;i++ ){
                if(aleatorio %i == 0){
                    divisores = divisores +1; 
                } 
            }

            if(divisores == 2){
                array[indice] = aleatorio;
                indice++;
            }

        }   
        return array;
    }
}
