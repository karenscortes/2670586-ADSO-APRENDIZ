import java.util.Scanner;

public class Ejercicio06{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);

        System.out.print("-> Ingrese el numero de la secuencia fibonacci que desee "); 
        int numero = teclado.nextInt(); 

        int ante=0; 
        int sigui=1; 
        int secuencia = 0;
  
        for(int i=1; i<=numero; i++){
            ante = secuencia; 
            secuencia = sigui;
            sigui = sigui + ante;
        } 

        System.out.print(secuencia);
    }
}
