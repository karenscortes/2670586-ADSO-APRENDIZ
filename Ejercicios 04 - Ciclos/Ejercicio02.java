import java.util.Scanner;

public class Ejercicio02{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("-> Ingrese el numero de materias que va a ingresar "); 
        int numero_materias = teclado.nextInt(); 

        int contador = 1;
        float suma_creditos = 0;
        float nota_por_credito = 0;
        float suma_nota_creditos = 0;

        while(contador<=numero_materias){
            System.out.print("Nota Materia "+contador+" = "); 
            float nota = teclado.nextFloat();  

            System.out.print("Credito Materia "+contador+" = "); 
            float credito = teclado.nextFloat(); 
  
            nota_por_credito= nota * credito; 
            suma_nota_creditos = suma_nota_creditos + nota_por_credito;
            suma_creditos = suma_creditos + credito; 
            contador= contador + 1;
        }  

        float promedio = suma_nota_creditos/ suma_creditos; 
        System.out.println("El promedio ponderado es: "+promedio); 

    }
}