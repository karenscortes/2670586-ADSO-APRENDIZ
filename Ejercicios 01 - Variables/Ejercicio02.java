import java.util.Scanner;

public class Ejercicio02{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("Ingrese la temperatura en grados celcius "); 
        int celcius = teclado.nextInt();    

        double resultado = (celcius * 1.8) + 32; 
        System.out.print("La temperatura en grados fahrenheit es: "+resultado); 

    }
}