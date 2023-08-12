import java.util.Scanner;  

public class Ejercicio01{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("-> Ingrese un numero entero de maximo 6 cifras "); 
        int numero = teclado.nextInt(); 
        int reverso =0;
        int auxiliar = numero;

        if(numero<=999999 && numero>=1){
            while(auxiliar != 0){
                int r = auxiliar %10;
                reverso = reverso * 10 + r; 
                auxiliar = auxiliar /10;
            } 
            if(numero == reverso){
                System.out.println("el numero ingresado es un palindromo");            
            }
            else if(numero != reverso){
                System.out.println("el numero ingresado no es un palindromo"); 
            }
        }
        else{
            System.out.println("ingrese un dato correcto");
        }
    }
}