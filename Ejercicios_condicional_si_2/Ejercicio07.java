import java.util.Scanner;

public class Ejercicio07{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Biembenido a nuestro sistema");  

        System.out.print("Ingrese un numero de cuatro cifras "); 
        int numero = teclado.nextInt();   

        int n1 = numero/1000; 
        int n2 = numero/100%10; 
        int n3 = numero/10%10; 
        int n4 = numero%10;

        if(numero>999 && numero<9999){
            if(n1==n4 && n2==n3){
                System.out.println("ES UN PALINDROMO");
            }
            else{
                System.out.println("NO ES UN PALINDROMO");
            }
        }
        else{
            System.out.println("SOLO SE HACEPTAN NUMEROS DE CUATRO CIFRAS");
        }
    } 
}