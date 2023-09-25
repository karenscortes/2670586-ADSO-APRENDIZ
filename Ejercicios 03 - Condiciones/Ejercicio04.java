import java.util.Scanner;

public class Ejercicio04{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Biembenido a nuestro sistema");  

        System.out.print("Ingrese la primera nota "); 
        float n1 = teclado.nextFloat();   

        System.out.print("Ingrese la segunda nota "); 
        float n2 = teclado.nextFloat();   

        System.out.print("Ingrese la tercera nota  "); 
        float n3 = teclado.nextFloat();   
 

        float promedio = (n1 + n2 + n3 )/3; 

        if(promedio>=7){
            System.out.println("Felicitaciones, usted aprobo ");
        }
        else{
            System.out.println("Lastima, usted desaprobo");
        }
            


    } 
}