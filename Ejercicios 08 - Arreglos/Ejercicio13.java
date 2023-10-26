import java.util.Scanner;

public class Ejercicio13{

    public static void main(String[] arg) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido a nuestro sistema");

        System.out.print("-> Ingrese un numero del size para los array ");
        int size = teclado.nextInt();

        int arreglo1[] = new int[size];
        int arreglo2[] = new int[size];
        int arreglo3[] = new int[size];
        int aleatorio =0;
        
        for (int i = 0; i < size; i++) {
            aleatorio = (int) (Math.random() * (100 - 1 + 1) - 1);
            arreglo1[i] = aleatorio;
        }

        for (int i = 0; i < size; i++) {
            aleatorio = (int) (Math.random() * (100 - 1 + 1) - 1);
            arreglo2[i] = aleatorio;
        }

        for(int i = 0; i < size; i++){
            arreglo3[i] = (arreglo1[i] + arreglo2[i]); 
            System.out.print(arreglo3[i]);
            if (i < arreglo3.length - 1) {
                System.out.print(", ");
            }
        }


    }
}