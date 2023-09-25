import java.util.Scanner;
public class Ejercicio07{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

       System.out.print("Ingrese la altura del rombo: ");
        int altura = entrada.nextInt(); 

        int espacio = altura; 
        int abajo = (altura+1)/2; 
        int fila = 1;
        int x = 1;
        int arriba = (altura+1)/2; 

        if(altura%2!=0){

            while(altura>=fila){
                while(altura>arriba){
                    for(int i=0; i<=espacio; i++){
                        System.out.print(" ");  
                    } 
                    for(int i=0; i<x ; i++){
                        System.out.print("x");
                    }  
                    x = (x + 2); 
                    espacio = (espacio -1);
                    System.out.println(); 
                    arriba = arriba +1;
                }
                while(altura>=abajo){
                    for(int i=0; i<=espacio; i++){
                        System.out.print(" ");  
                    } 
                    for(int i=0; i<x ; i++){
                        System.out.print("x");
                    }  
                    x = (x - 2); 
                    espacio = (espacio +1);
                    System.out.println(); 
                    abajo = abajo +1;
                } 
                fila++;
            }

            

        }else{
            System.out.print("Solo se aceptan valores impares ");
        }
        
    }
}