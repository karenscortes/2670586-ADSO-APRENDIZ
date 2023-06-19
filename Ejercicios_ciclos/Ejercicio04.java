import java.util.Scanner;

public class Ejercicio04{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);

        int opcion=1;

        while(opcion !=3){
            System.out.println("----------Bienvenido----------");
            System.out.println("||  1. Docente              ||");
            System.out.println("||  2. Estudiante           ||");
            System.out.println("||  3. Salir                ||");
            System.out.println("------------------------------");

            System.out.print("-> Ingrese la opcion que desee "); 
            opcion = teclado.nextInt(); 

            if(opcion==1){
                System.out.print("-> Ingrese el numero de notas que va a ingresar "); 
                int numero_notas = teclado.nextInt(); 

                int contador = 1;
                float suma_notas = 0;

                while(contador<=numero_notas){
                    System.out.print("Nota "+contador+" = "); 
                    float nota = teclado.nextFloat();  
                    contador= contador + 1; 
                    suma_notas = suma_notas + nota;
                } 

                float promedio = (suma_notas)/numero_notas;
                System.out.println("El promedio es: "+promedio); 
            } 
            else if(opcion==2){
                System.out.print("-> Ingrese el numero de materias que va a ingresar "); 
                int numero_materias = teclado.nextInt(); 

                int contado = 1;
                float suma_creditos = 0;
                float notas_por_credito = 0;
                float suma_notas_creditos = 0;

                while(contado<=numero_materias){
                    System.out.print("Nota Materia "+contado+" = "); 
                    float notas = teclado.nextFloat();  

                    System.out.print("Credito Materia "+contado+" = "); 
                    float credito = teclado.nextFloat(); 
  
                    notas_por_credito= notas * credito; 
                    suma_notas_creditos = suma_notas_creditos + notas_por_credito;
                    suma_creditos = suma_creditos + credito; 
                    contado= contado + 1;
                }  
                float promedio_ponderado = suma_notas_creditos/ suma_creditos; 
                System.out.println("El promedio ponderado es: "+promedio_ponderado); 
            }
            else if(opcion !=1 && opcion !=2 && opcion!=3){
                System.out.println("Ingrese una opcion correcta "); 
            }
        } 
        if(opcion==3){
           System.out.print("Ha salido con exito");  
        }
    }
}