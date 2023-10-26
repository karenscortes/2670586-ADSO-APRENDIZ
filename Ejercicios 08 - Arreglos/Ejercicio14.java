import java.util.Scanner;

public class Ejercicio13{

    public static void main(String[] arg) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido a nuestro sistema");

        System.out.print("-> Ingrese un numero del size para el array ");
        int size = teclado.nextInt();

        float arreglo[] = new int[size]; 
        float aleatorio =0;

        for (int i = 0; i < size; i++) {
            aleatorio = (float) (Math.random() * (100 - 1 + 1) - 1);
            arreglo[i] = aleatorio;
        }
    }
}