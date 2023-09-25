import java.util.Scanner;

public class Ejercicio10{

    public static void main(String[] args){

        float array [] = {2,4,5,5,8}; 
        float promedio=promArreglo(array);

        System.out.println("El promedio es: "+promedio);
    }

    public static float promArreglo(float [] array){
        float suma =0;
        for(int i=0; i<array.length; i++){
            suma = suma + array[i];
        } 
        float prom = suma/array.length;
        return prom;
    }
}
