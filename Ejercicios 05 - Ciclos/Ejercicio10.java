import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese numero entero: ");
        int N = teclado.nextInt();

        int[][] cuadrado = new int[N][N];

        for (int i = 0; i < N; i++) {
            cuadrado[0][i] = i + 1;
        }

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < N; j++) {
                cuadrado[i][j] = cuadrado[i - 1][(j + 1) % N];
            }
        }

        System.out.println("Cuadrado latino:");
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(cuadrado[i][j] + " ");
            }
            System.out.println();
        }
    }
}