import java.util.Scanner;

public class Ejercicio11{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("Ingrese el radio del circulo "); 
        double radio = teclado.nextDouble();    

        double perimetro = (2 * 3.1415 * radio); 
        double area = (3.1415 * (radio * radio));

        System.out.println("La area del circulo es: "+area); 
        System.out.println("El perimetro del circulo es: "+perimetro); 

    }
}