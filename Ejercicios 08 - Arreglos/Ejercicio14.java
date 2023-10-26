import java.util.Scanner;

public class Ejercicio14{

    public static void main(String[] arg) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido a nuestro sistema");

        System.out.print("-> Ingrese un numero entero para size el array ");
        int size = teclado.nextInt();

        System.out.print("-> Ingrese un numero decimal ");
        float M = teclado.nextFloat();

        float arreglo[] = new float[size]; 
        float aleatorio = 0;
        float distanciaCorta = Math.abs(M - arreglo[0]);
        float cercano = arreglo[0];

        for (int i = 0; i < size; i++) {
            aleatorio = (float) (Math.random() * (100 - 1 + 1) - 1);
            arreglo[i] = aleatorio;
        } 

        for (int i = 1; i < size; i++) {
            float distancia = Math.abs(M - arreglo[i]);
            if (distancia < distanciaCorta) {
                distanciaCorta = distancia;
                cercano = arreglo[i];
            }
        }

        System.out.println("El valor mas cercano a M: " + cercano);
    }
}