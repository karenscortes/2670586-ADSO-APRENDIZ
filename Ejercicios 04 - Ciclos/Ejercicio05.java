import java.util.Scanner;

public class Ejercicio05{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);

        System.out.print("-> Ingrese hasta que distancia desea la sucesion "); 
        int numero = teclado.nextInt(); 

        int ante=0; 
        int sigui=1; 
        int secuencia = 1; 
        int i = 1;

        while(i<=numero){
             if(i == 1){
                System.out.print(ante); 
            } 
            else if(i == 2){
                System.out.print(sigui); 
            }
            else if(i>2){ 
                System.out.print(secuencia); 
                ante = sigui; 
                sigui = secuencia;
                secuencia = ante + sigui; 
            } 
            if(i<numero){
                System.out.print(","); 
            }
            i = i + 1; 

        }
        


        
    }
}