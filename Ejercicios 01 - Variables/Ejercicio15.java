import java.util.Scanner;

public class Ejercicio15{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("Ingrese la medida en metros "); 
        Double metros = teclado.nextDouble();    

        Double pies = metros * 3.281; 
        Double cm = metros * 100;
        Double pulgadas = metros * 39.37;

        System.out.println("Metros a centimetros: "+cm);
        System.out.println("Metros a pies: "+pies); 
        System.out.println("Metros a pulgadas: "+pulgadas);  

    }
}