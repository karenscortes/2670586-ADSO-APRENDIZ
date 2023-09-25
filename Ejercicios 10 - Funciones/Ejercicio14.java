import java.util.Scanner;

public class Ejercicio14 {

    public static void main(String[] args) {

        int array[] = {6, 4, 5, 9, 8};

        boolean resultado = confirmarOrdenarArray(array);
        System.out.println("El array esta ordenado? "+resultado);
    }

    public static boolean confirmarOrdenarArray(int[] array) {
        for(int i=0; i<array.length-1 ; i++){
            if(array[i]>array[i+1]){
                return false;
            }
        }
        return true;
    }
}