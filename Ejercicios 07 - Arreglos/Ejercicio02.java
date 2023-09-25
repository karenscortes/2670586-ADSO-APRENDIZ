import java.util.Scanner;  

public class Ejercicio02{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("-> Ingrese un numero entero para el tamano del array "); 
        int size = teclado.nextInt(); 

        int arreglo []= new int [size]; 

        int primos =0; 
        int primo =2; 
        int divisor =0; 

        while(primos<size){

            for(int i=1; i<=primo; i++){
                if(primo%i==0){
                    divisor++;
                }
            }

            if(divisor==2){
                arreglo[primos]=primo; 
                primos=primos+1;
            } 

            primo++;
        }

        for(int i=0; i<size; i++){
            System.out.print("[ "+arreglo[i]+" ] "); 
        }
    }
}
