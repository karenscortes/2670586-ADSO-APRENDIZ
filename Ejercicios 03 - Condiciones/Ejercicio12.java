import java.util.Scanner;

public class Ejercicio12{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("Ingrese el precio del articulo "); 
        int precio = teclado.nextInt(); 

        System.out.print("Ingrese el porcentaje del descuento a aplicar "); 
        int descuento = teclado.nextInt();   

        int porcentaje = (precio*descuento)/100; 
        int valor_final = precio-porcentaje;


        if(descuento>=0 && descuento<=100){
            System.out.print(" El precio del articulo con el descuento aplicado es: " +valor_final); 
        }
        else{
            System.out.print("El porcentaje de descuento no es valido, vuelva a intentarlo "); 
        }


    } 
}