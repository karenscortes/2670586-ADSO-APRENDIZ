import java.util.Scanner;

public class Ejercicio01{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("Ingrese su edad "); 
        int edad = teclado.nextInt();   

        if(edad<=0){
            System.out.print("ingrese un dato correcto");  
        } 
        else{
            if(edad<18){ 
                System.out.print("felicidades usted recibe un auxilio de $800.000"); 
            } 
            else{
                if(edad>110){
                    System.out.print("usted paga impuestos desde el mas alla"); 
                } 
                else{
                  System.out.print("usted paga un impuesto de $200.000");  
                }
            }
        }
    }
}