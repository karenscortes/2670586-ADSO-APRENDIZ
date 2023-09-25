import java.util.Scanner;

public class Ejercicio07{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in); 

        int n1, n2, n3; 
        int max; 

        System.out.print("-> Ingrese el primer numero "); 
        int num1 = teclado.nextInt(); 

        System.out.print("-> Ingrese el segundo numero "); 
        int num2 = teclado.nextInt(); 

        System.out.print("-> Ingrese el tercer numero "); 
        int num3 = teclado.nextInt();  

        if(num1> num2 && num1> num3){
            max = num1;
        }else if(num2> num1 && num2> num3){
            max=num2;
        }else{
            max=num3;
        }

        int i = max; 
        while((i % num1 !=0) || (i % num2 !=0) || (i % num3 !=0)){
            i = i + 1;
        } 
        System.out.print("el minimo comun multiplo de "+num1 +", " +num2 +" y "+ num3 +" es: "+i);  

    }
}
