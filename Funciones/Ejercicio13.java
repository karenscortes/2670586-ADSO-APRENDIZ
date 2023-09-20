import java.util.Scanner;

public class Ejercicio13 {

    public static void main(String[] args) {

        int array[] = {6, 4, 5, 9, 8};

        array = ordenarArray(array);

        System.out.println("El array ordenado de manera ascendente: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
    }

    public static int[] ordenarArray(int[] array) {
        int n = array.length;
        int aux;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i -1 ; j++) {
                if (array[j] > array[j + 1]) {
                    aux = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = aux;
                }
            }
        }
        return array;
    }
}