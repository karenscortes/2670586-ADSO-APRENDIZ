import java.util.Scanner;

public class Ejercicio03{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("-> Ingrese valor total a financiar = "); 
        int capital = teclado.nextInt();  

        System.out.print("-> Ingrese valor de la tasa de interes fija = "); 
        int tasa_interes = teclado.nextInt();  

        System.out.print("-> Ingrese un numero de cuotas mensuales: "); 
        int n_cuotas = teclado.nextInt(); 

        float interes = tasa_interes/100;
        float cuadrado =(float) (Math.pow((1+tasa_interes),n_cuotas*-1));
        float pago = (capital * tasa_interes)/(1-(cuadrado)); 

        float cm = capital *(1+interes); 
        float intereses = cm-capital; 

        System.out.println("-> pago "+pago); 
        System.out.println("-> interes "+cm); 




    }
}