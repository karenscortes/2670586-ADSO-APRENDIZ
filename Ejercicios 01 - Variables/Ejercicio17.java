import java.util.Scanner;

public class Ejercicio17{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("Ingrese la cantidad de dinero en COP "); 
        Double cop = teclado.nextDouble();    

        Double usd = cop * 0.00025; 
        Double eur = cop * 0.00024;
        Double gbp = cop * 0.00020;
        Double jpy = cop * 0.037;

        System.out.println("COP a USD: "+usd);
        System.out.println("COP a EUR: "+eur); 
        System.out.println("COP a GBP: "+gbp);  
        System.out.println("COP a JPY: "+jpy);  

    }
}