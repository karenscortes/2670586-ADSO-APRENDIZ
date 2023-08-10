import java.util.Scanner;

public class Ejercicio02{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bienvenido a nuestro sistema");  

        int dia= 1;
        int mes = 1; 
        int year = 1; 

        do{
            dia= (int)(Math.random()*(29-1))+1;
            mes = (int)(Math.random()*(12-1))+1;
            year= (int)(Math.random()*(2025-1))+1;

            if(dia<10 && mes<10){
                System.out.println("La fecha generada es: 0"+dia+"0"+mes+year);
            }else if(dia<10){
                System.out.println("La fecha generada es: 0"+dia+mes+year);
            }else if( mes<10){
                System.out.println("La fecha generada es: "+dia+"0"+mes+year);
            }else{
                System.out.println("La fecha generada es: "+dia+mes+year);
            }

        }while(dia ==0);

    }
}