import java.util.Scanner;

public class Ejercicio11 {

    public static void main(String[] arg) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido a nuestro sistema");

        System.out.print("-> Ingrese un numero del size para el array ");
        int size1 = teclado.nextInt();

        System.out.print("-> Ingrese un numero del size para el segundo array ");
        int size2 = teclado.nextInt();

        int arregloN[] = new int[size1];
        int arregloM[] = new int[size2];
        int aleatorio =0;

        for (int i = 0; i < size1; i++) {
            aleatorio = (int) (Math.random() * (100 - 1 + 1) - 1);
            arregloN[i] = aleatorio;
        }

        for (int i = 0; i < size2; i++) {
            aleatorio = (int) (Math.random() * (100 - 1 + 1) - 1);
            arregloM[i] = aleatorio;
        }

        int size = size1 + size2; 
        int arregloNM[] = new int[size];

        for(int i=0; i<arregloN.length; i++){
            arregloNM[i]=arregloN[i];
        }

        for(int i=0; i<arregloM.length; i++){
            arregloNM[(arregloN.length + i)]=arregloM[i];
        }

        int menor = arregloNM[0];
        int aux = 0;

        for(int i=0; i<arregloNM.length; i++){
            for (int j = 0; j < size - i -1 ; j++) {
                if (arregloNM[j] > arregloNM[j + 1]) {
                    aux = arregloNM[j];
                    arregloNM[j] = arregloNM[j + 1];
                    arregloNM[j + 1] = aux;
                }
            }
        }

        for (int i = 0; i < arregloNM.length; i++) {
            System.out.print(arregloNM[i]);
            if (i < arregloNM.length - 1) {
                System.out.print(", ");
            }
        }
    }
}