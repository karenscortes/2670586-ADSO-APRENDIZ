import java.util.Scanner;

public class Ejercicio10 {

    public static void main(String[] arg) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido a nuestro sistema");

        System.out.print("-> Ingrese un numero del size para el array ");
        int size = teclado.nextInt();

        int arreglo[] = new int[size];
        int aleatorio =0; 
        int repetidos =0; 
        int repetido=0;
        int sinRepetidos[] = new int[size-repetido];
        int indice=0; 

        for (int i = 0; i < size; i++) {
            aleatorio = (int) (Math.random() * (100 - 1 + 1) - 1);
            arreglo[i] = aleatorio;
        }

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = i + 1; j < arreglo.length; j++) {
                if (arreglo[i] == arreglo[j]) {
                    repetido=arreglo[j];
                    repetidos++;
                }
            }
            if (arreglo[i]!=repetido) {
                sinRepetidos[indice] = arreglo[i];
                indice++;
            }
        }

        System.out.print("Arreglo inicial: ");
        for (int i = 0; i < arreglo.length; i++) {
            System.out.print(arreglo[i]);
            if (i < arreglo.length - 1) {
                System.out.print(", ");
            }
        } 

        System.out.println();

        System.out.print("Arreglo sin repetido: ");
        for (int i = 0; i < sinRepetidos.length; i++) {
            System.out.print(sinRepetidos[i]);
            if (i < sinRepetidos.length - 1) {
                System.out.print(", ");
            }
        }


    }
}