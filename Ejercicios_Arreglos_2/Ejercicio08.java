import java.util.Scanner;

public class Ejercicio08{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("-> Ingrese un numero de tamamo para el array "); 
        int size = teclado.nextInt(); 

        int aleatorio = 0;
        int arreglo []= new int [size];  
        int n_pares = 0; 
        int n_impares =0;

        for(int i =0; i<size; i++){
            aleatorio = (int)(Math.random()*(100-1+1)-1);
            if(aleatorio %2==0){
                n_pares = n_pares +1;
            }else{
                n_impares = n_impares+1;
            }
            arreglo[i] = aleatorio; 
        }

        for(int i =0; i<arreglo.length;i++){
          System.out.print(arreglo[i]+", ");    
        } 

        int par []= new int [n_pares];
        int impar [] = new int [n_impares]; 

        for(int i =0; i<par.length; i++){
            if(arreglo[i] %2==0){
                par[i]= arreglo[1];
            }
            i++;
        } 

        System.out.println();  

        for(int i =0; i<par.length;i++){
          System.out.print(par[i]+", ");    
        } 
    }
}