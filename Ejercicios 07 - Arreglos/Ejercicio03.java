import java.util.Scanner;  

public class Ejercicio03{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("-> Ingrese un numero entero para el tamano del array "); 
        int size = teclado.nextInt(); 

        int arreglo []= new int [size]; 
        int n =0;

        for(int i=0; i<size; i++){
            System.out.print("-> Ingrese un numero entero (1 a 12) para la posicion "+i+": "); 
            n = teclado.nextInt(); 
            if(n>0 && n<13){
                arreglo[i]=n; 
            }else{
                System.out.println("-> Solo se aceptan valores de 1 a 12");
                arreglo[i]=1;
            }
            
        } 

        System.out.print("-> Ingrese un numero de posicion del array "); 
        int posicion = teclado.nextInt(); 

        for(int i= 0; i<arreglo.length; i++){
            System.out.print(arreglo[i]);
            if(i != size-1){
                System.out.print(", ");
            }
        }

        int arregloAntihorario []= new int [size]; 
        
        for(int i= 0; i<arregloAntihorario.length; i++){

        }

    }
}