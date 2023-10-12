import java.util.Scanner;

public class Ejercicio09 {

    public static void main(String[] arg) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido a nuestro sistema");

        System.out.print("-> Ingrese un numero del size para el array ");
        int size = teclado.nextInt();

        System.out.print("-> Ingrese un numero que desee buscar en el array ");
        int m = teclado.nextInt(); 

        int arreglo[] = new int[size];
        int posicion = -1; 
        int aleatorio =0;

        for (int i = 0; i < size; i++) {
            aleatorio = (int) (Math.random() * (100 - 1 + 1) - 1);
            if (aleatorio == m) {
                posicion = i;
            }
            arreglo[i] = aleatorio;
        } 

        System.out.print("La posicion del numero es: "+posicion);

    }
}