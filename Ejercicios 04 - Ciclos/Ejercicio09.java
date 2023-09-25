import java.util.Scanner;

public class Ejercicio09{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("-> Ingrese un numero "); 
        int num = teclado.nextInt(); 

        int divisores = 0; 

        for(int i = 1; i<=num; i++){
            if(num%i==0){
                divisores = divisores +1;
            }
        }

        if(divisores ==2){
            System.out.print("-> Es primo"); 
        }else{
            System.out.print("-> No es primo "); 
        }
    }
}