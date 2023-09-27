import java.util.Scanner;  

public class Ejercicio09{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("-> Ingrese un numero entero: "); 
        int numero = teclado.nextInt();  

        int raizDigital = numero;

        while (raizDigital >= 10) {
            int sumaDigitos = 0;
            
            while (numero > 0) {
                sumaDigitos = sumaDigitos + numero % 10;
                numero = numero / 10;
            }

            raizDigital = sumaDigitos;
            numero = raizDigital;
        }

        System.out.println("La Raiz Digital del número ingresado es: " + raizDigital);

    }
}