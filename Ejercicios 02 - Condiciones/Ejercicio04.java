import java.util.Scanner;

public class Ejercicio04{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("Ingrese un primer numero "); 
        int n1 = teclado.nextInt();   

        System.out.print("Ingrese un segundo numero "); 
        int n2 = teclado.nextInt(); 

        System.out.print("Ingrese un tercer numero "); 
        int n3 = teclado.nextInt(); 
        

        if(n1>n2 && n1>n3){
            System.out.println("el numero mayor es: "+n1);  
        } 
        else{
            if(n2>n1 && n2>n3){
               System.out.println("el numero mayor es: "+n2); 
            } 
            else{
                if(n3>n1 && n3>n2){
                    System.out.println("el numero mayor es: "+n3);
                } 
            }
        } 
        

        if(n1<n2 && n1<n3){
            System.out.println("el numero menor es: "+n1); 
        } 
        else{
            if(n2<n1 && n2<n3){
                System.out.println("el numero menor es: "+n2);
            } 
            else{
                if(n3<n1 && n3<n2){
                    System.out.println("el numero mayor es: "+n3);
                }
            }
        } 
       

       
                  
            
            
        
    }
}