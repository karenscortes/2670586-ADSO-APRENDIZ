import java.util.Scanner;

public class Ejercicio18{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("Ingrese el peso de la persona en kg "); 
        float peso = teclado.nextFloat();   

        System.out.print("Ingrese la altura de la persona en mt "); 
        float altura = teclado.nextFloat();  

        float resultado = (peso/(altura * altura)); 

        System.out.print("El IMC es: "+resultado); 

    }
}