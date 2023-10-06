import java.util.Scanner;

public class Ejemplo02{ 

    static String nombre = "Karen"; 

    public static void main(String[] args){

        cambiarnombre();

        System.out.println("Nombre = "+nombre);
        
    }

    public static void cambiarnombre(){
        nombre = "stephanie"; 
        System.out.println("Nombre = "+nombre);
    }
}