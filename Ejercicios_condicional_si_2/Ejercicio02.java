import java.util.Scanner;

public class Ejercicio02{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Biembenido a nuestro sistema");  

        System.out.print("Ingrese el primer numero entero "); 
        int n1 = teclado.nextInt();   

        System.out.print("Ingrese el segundo numero entero "); 
        int n2 = teclado.nextInt();   

        System.out.print("Ingrese el tercer numero entero "); 
        int n3 = teclado.nextInt();   

        System.out.print("Ingrese el cuarto numero entero "); 
        int n4 = teclado.nextInt();   
        

        if(n1>n2 && n1>n3 && n1>n4){
          System.out.println("El primer numero ingresado es el mayor ");   
        }
        else if(n2>n1 && n2>n3 && n2>n4){
            System.out.println("El segundo numero ingresado es el mayor "); 
        } 
        else if(n3>n1 && n3>n2 && n3>n4 ){
            System.out.println("El tercer numero ingresado es el mayor "); 
        }
        else if(n4>n1 && n4>n2 && n4>n3){
            System.out.println("El cuarto numero ingresado es el mayor "); 
        }
        else if(n1==n2 && n2==n3 && n3==n4){
            System.out.println("Todos los numeros ingresados tienen el mismo valor "); 
        }
        else if(n1==n2 && n1>n3 && n1>n4){
            System.out.println("El  primer y el segundo numero son los mayores  "); 
        } 
        else if(n1==n3 && n1>n2 && n1>n4){
            System.out.println("El  primer y el tercer numero son los mayores  "); 
        }
        else if(n1==n4 && n1>n2 && n1>n3){
            System.out.println("El  primer y el cuarto numero son los mayores  "); 
        } 
        else if(n2==n3 && n2>n1 && n2>n4){
            System.out.println("El segundo y el tercer numero son los mayores  "); 
        }
        else if(n2==n4 && n2>n1 && n2>n3){
            System.out.println("El segundo y el cuarto numero son los mayores  "); 
        }
        else if(n3==n4 && n3>n2 && n3>n1){
            System.out.println("El  tercer y el cuarto numero son los mayores  "); 
        }
        else if(n1==n2 && n1==n3 && n1>n4){
            System.out.println("El  primer, el segundo y el tercer numero son los mayores  "); 
        }
        else if(n1==2 && n1==n4 && n1>n3){
            System.out.println("El  primer, el segundo y el cuarto numero son los mayores  "); 
        } 
        else if(n1==n3 && n1==n4 && n1>n2){
            System.out.println("El  primer, el cuarto y el tercer numero son los mayores  "); 
        } 
        else if(n2==n3 && n2==n4 && n2>n1){
            System.out.println("El  segundo, el cuarto y el tercer numero son los mayores  "); 
        }  
    }
}