import java.util.Scanner;  

public class Ejercicio03{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("-> Ingrese un numero entero para crear el arreglo "); 
        int n = teclado.nextInt(); 

        System.out.print("-> Ingrese la cantidad de bombas que desea poner "); 
        int bombas = teclado.nextInt();

        int array []= new int [n]; 
        int array_bom []= new int [n];
        int aleatorio = 0;

        for (int i = 0; i < bombas; i++) { 
            do {
                aleatorio = (int) (Math.random() * n);
            } while (array[aleatorio] == 1);
            array[aleatorio] = 1;
        }

        System.out.println("Arreglo con las bombas:");
        for (int i = 0; i < n; i++) {
            System.out.print("[ "+array[i]+" ]");
        }
        System.out.println();

        for (int i = 0; i < n; i++) {
            if (array[i] == 1) {

                array_bom[i] = 1;

                for (int j = i - 1; j <= i + 1; j++) {
                    if (j >= 0 && j < n && array[j] != 1) {
                        array_bom[j] = 2;
                    }
                }
            }
        }

        System.out.println("Area afectada:");
        for (int i = 0; i < n; i++) {
            System.out.print("[ "+array_bom[i]+" ]");
        }

    }
}