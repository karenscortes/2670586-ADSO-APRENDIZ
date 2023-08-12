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
        int menor =0;

        for(int i =0; i<size;i++){
            array[i]=secuencia; 
            secuencia=secuencia+1;
        }

        for(int fila =0; fila<n; fila++){
            
            if(fila%2==0){
                
                for(int col=0; col<n; col++){
                    indice = fila * n + col;
                    System.out.print("[ "+array[indice]+" ]"); 
                }
                System.out.println();
            }else if(fila%2!=0){ 
                for(int col=0; col<n; col++){
                    indice = fila * n + col;
                    for(int i = 0; i < n; i++){
                        menor = array[indice];

                        if (array[indice] < menor){
                            menor = array[i];
                        }else{if (array[indice] > menor){
                            menor = menor;
                        }      
                    } 
                    /* sorry oscar lo intente durante 4 horas y no pude 
                    si me disculpa me voy a llorar  */
                    System.out.print("[ "+array[indice]+" ]"); 
                }
                System.out.println();
            }
           
        }         
    }
}
}