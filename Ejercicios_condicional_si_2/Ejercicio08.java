import java.util.Scanner;

public class Ejercicio08{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Biembenido a nuestro sistema");  

        System.out.print("Ingrese la medida de la base del triangulo "); 
        int base = teclado.nextInt();   

        System.out.print("Ingrese la medida de la altura del triangulo "); 
        int altura = teclado.nextInt();   

        int area = (base*altura)/2; 


        if(base>0 && altura>0){
            System.out.print("El area del triangulo es: " +area);
        }
        else{
            System.out.println("Solo se aceptan valores positivos");
        }
    } 
}