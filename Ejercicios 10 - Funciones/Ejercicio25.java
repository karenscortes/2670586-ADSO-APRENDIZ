import java.util.Scanner;

public class Ejercicio25{

    public static void main(String[] args){
        System.out.println("numero generado = "+ numeroGenerado(2,21) ); 
        System.out.println("numero generado = "+ numeroGenerado(4,89) ); 
        System.out.println("numero generado = "+ numeroGenerado(10,35) ); 
    }

    public static int numeroGenerado(int inferior, int superior){
        int aleatorio =0;
        int rango = (superior-inferior+1);
        aleatorio = (int)(Math.random()*(rango)-inferior);
        return aleatorio;
    }
}