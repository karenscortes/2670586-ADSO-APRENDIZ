import java.util.Scanner;  

public class Ejercicio02{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("-> Ingrese un numero entero para crear el arreglo "); 
        int n = teclado.nextInt(); 

        int  size = n*n; 
        int array []= new int [size];
        int secuencia = 1;
        int indice =0;
        int aux =0;

        for ( int i =0; i<size; i++){
            array[i] = secuencia;
            secuencia = secuencia+1;
        }
        
        for(int fila =1; fila<=n; fila++){
            for(int col=1; col<=n; col++){
                indice = (fila-1) * n + (col-1);
                if(fila%2!=0){
                    System.out.print("[ "+array[indice]+" ]"); 
                }else if(fila%2==0){
                    for(int i=1; i<=n;i++){
                        while(array[indice]>array[indice+1]){
                            aux = array [indice];
                            array[indice]=array[indice+1];
                            array[indice+1]=aux;
                        }
                        System.out.print("[ "+array[indice]+" ]");
                    }
                }    
            }
            System.out.println(); 
        }         
    }
}