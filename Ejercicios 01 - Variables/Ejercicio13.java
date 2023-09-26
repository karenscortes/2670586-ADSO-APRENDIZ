import java.util.Scanner;

public class Ejercicio13{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("Ingrese el numero de segundos que desea convertir "); 
        int segundos = teclado.nextInt();    

        int min = segundos / 60; 
        int seg = segundos % 60;
        int hor = min / 60;
        min = min % 60;


        System.out.println("Horas: "+hor); 
        System.out.println("Minutos: "+min);
        System.out.println("Segundos: "+seg);

    }
}