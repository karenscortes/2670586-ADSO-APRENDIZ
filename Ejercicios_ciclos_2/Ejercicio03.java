import java.util.Scanner;  

public class Ejercicio03{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("-> Ingrese la cantidad de numeros primos que desea: "); 
        int cantidad = teclado.nextInt(); 

        int aleatorio = 0; 
        int divisores = 0;
        int primo =0; 

        while(primo < cantidad){
            aleatorio = (int)(Math.random()*(100-2+1)-2);
            for(int i =1; i<=aleatorio;i++ ){
                if(aleatorio%i == 0){
                    divisores = divisores +1; 
                }
            }

            if(divisores == 2){
                primo = primo+1; 
                System.out.println("Primo generado -> "+aleatorio); 
            }
        }   
    }
}