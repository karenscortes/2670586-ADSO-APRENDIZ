import java.util.Scanner;

public class Ejercicio12{

    public static void main(String[] arg) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Bienvenido a nuestro sistema");

        System.out.print("-> Ingrese un numero del size para el array ");
        int size = teclado.nextInt();

        int arreglo[] = new int[size];
        int aleatorio =0;
        int primos =0;

        for (int i = 0; i < size; i++) {
            aleatorio = (int) (Math.random() * (100 - 1 + 1) - 1);
            arreglo[i] = aleatorio;
        }

        for(int i=0; i<arreglo.length; i++){
            
            int divisores=0;
            for(int j =1; j<= aleatorio; j++ ){
                if(aleatorio %j == 0){
                    divisores = divisores +1; 
                } 
            }

            if(divisores == 2){
                primos++;
            }
               
        }

        if(primos==0){
            System.out.println("El arreglo no tiene numeros primos");
        }else if(primos != 0){
           System.out.println("El numero de primos es: "+primos); 
        }
    }
}