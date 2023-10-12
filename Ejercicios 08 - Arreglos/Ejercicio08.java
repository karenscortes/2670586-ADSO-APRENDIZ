import java.util.Scanner;

public class Ejercicio08 {

    public static void main(String[] arg) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido a nuestro sistema");

        System.out.print("-> Ingrese un numero del size para el array ");
        int size = teclado.nextInt();

        int aleatorio = 0;
        int arreglo[] = new int[size];
        int n_impares = 0;
        int n_pares = 0;
        int indice = 0;

        for (int i = 0; i < size; i++) {
            aleatorio = (int) (Math.random() * (100 - 1 + 1) - 1);
            if (aleatorio % 2 == 0) {
                n_pares++;
            } else {
                n_impares++;
            }
            arreglo[i] = aleatorio;
        }

        int par[] = new int[n_pares];
        int impar[] = new int[n_impares];
        int indice2 = 0;

        for (int i = 0; i < size; i++) {
            if (arreglo[i] % 2 == 0) {
                par[indice] = arreglo[i];
                indice++;
            } else {
                impar[indice2] = arreglo[i];
                indice2++;
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

        System.out.print("Arreglo con numeros pares: ");
        for (int i = 0; i < par.length; i++) {
            System.out.print(par[i]);
            if (i < par.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();

        System.out.print("Arreglo con numeros impares: ");
        for (int i = 0; i < impar.length; i++) {
            System.out.print(impar[i]);
            if (i < impar.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
