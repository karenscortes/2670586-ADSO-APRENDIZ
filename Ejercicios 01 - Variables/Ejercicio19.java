import java.util.Scanner;

public class Ejercicio19{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("Ingrese el nombre del empleado "); 
        String nombre = teclado.nextLine();   

        System.out.print("Ingrese la edad del empleado "); 
        String edad = teclado.nextLine(); 

        System.out.print("Ingrese el salario del empleado "); 
        String salario = teclado.nextLine();  

        System.out.println("Nombre: "+nombre); 
        System.out.println("Edad: "+edad); 
        System.out.println("Salario: "+salario); 

    }
}