import java.util.Scanner;

public class Ejercicio09{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Biembenido a nuestro sistema");  

        System.out.print("Ingrese las horas trabajadas "); 
        int horas = teclado.nextInt();   

        System.out.print("Ingrese la tarifa por hora $ "); 
        int tarifa = teclado.nextInt();   

        int numero_horas_extras = horas-40; 
        int horas_regulares = horas - numero_horas_extras;
        int valor_horas = (tarifa*horas_regulares);
        int valor_horas_extra = (tarifa*numero_horas_extras*150)/100; 
        int valor_total = valor_horas + valor_horas_extra;


        if(horas>=40){
            System.out.print("El salario semanal, incluyendo horas extra es de: " +valor_total);
        }
        else{
            System.out.println("El salario semanal es de: " +valor_horas);
        }
    } 
}