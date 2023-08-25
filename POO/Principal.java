import java.util.Scanner;

public class Principal{
    public static void main(String [] args){
        Scanner teclado = new Scanner(System.in);
        
        Persona array_usuarios [] = new Persona [9]; 

        for(int i=0; i<10; i++){
            System.out.println("Ingrese los datos para el usuario N "+(i+1)); 

            System.out.print("Ingrese la cedula: "); 
            int cedula = Integer.parseInt(teclado.nextLine());

            System.out.print("Ingrese los nombres: "); 
            String nombres = teclado.nextLine(); 

            System.out.print("Ingrese los apellidos: ");
            String apellidos = teclado.nextLine();
            
            System.out.print("Ingrese la edad: ");
            int edad = Integer.parseInt(teclado.nextLine());
            
            int altura = Integer.parseInt(teclado.nextLine());
            System.out.print("Ingrese la altura: ");
            
            double peso = Double.parseDouble(teclado.nextLine()); 
            System.out.print("Ingrese el peso: ");

            Persona persona = new Persona(cedula, nombres, apellidos, edad, altura, peso);
            array_usuarios[i] = persona;
        }

        for (Persona persona : array_usuarios) {
            persona.imprimirEstado();
        }
       
    }
}