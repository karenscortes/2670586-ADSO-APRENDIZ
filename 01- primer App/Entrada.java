import java.util.Scanner; 

public class Entrada{
    public static void main (String[] args){ 
        Scanner teclado = new Scanner(System.in);
        int cedula =0; 
        String nombre;
        System.out.println("ingrese su cedula: ");
        cedula = teclado.nextInt();  

        System.out.println("ingrese su nombre: ");
        nombre = teclado.nextString();  
    }
}
