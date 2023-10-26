import java.util.Scanner;

public class Ejercicio15{

    public static void main(String[] arg) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido a nuestro sistema");

        System.out.print("-> Ingrese un numero entero para el size del array ");
        int size = teclado.nextInt();

        int arreglo[] = new int[size]; 

        for(int i = 0; i < arreglo.length; i++){
            System.out.print("-> Ingrese un numero para llenar el array ");
            int num = teclado.nextInt();

            arreglo[i]= num;
        }

        int inicio = 0;
        int fin = arreglo.length - 1;
        int arregloVolteado[] = new int[size]; 


        while (inicio < fin) {
            arregloVolteado[inicio] = arreglo[fin];
            arregloVolteado[fin] = arreglo[inicio];
            inicio++;
            fin--;
        }

        if (inicio == fin) {
            arregloVolteado[inicio] = arreglo[inicio];
        }

        int cont = 0;

        for(int i = 0; i < size; i++){
            if(arreglo[i]==arregloVolteado[i]){
                cont++;
            }
        }

        if(cont==size){
            System.out.print("-> El array es palindromo ");
        }else if(cont != size){
            System.out.print("-> El array no es palindromo ");
        }

    }
}