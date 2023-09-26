import java.util.Scanner;

public class Ejercicio05{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("Ingrese un primer numero "); 
        int n1 = teclado.nextInt();   

        System.out.print("Ingrese un segundo numero "); 
        int n2 = teclado.nextInt(); 

        System.out.print("Ingrese un tercer numero "); 
        int n3 = teclado.nextInt(); 
        

        if(n1<n2 && n2<n3 && n3>n1){
            System.out.println("los numeros se ingresaron de forma ascendente");  
        } 
        else{
            if(n1>n2 && n2>n3 && n3<n1){
               System.out.println("los numeros se ingresaron de forma descendente "); 
            } 
            else{
                
                System.out.println("los numeros se inresaron sin un orden aparente");
                
            }
        } 
    }
}