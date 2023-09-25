import java.util.Scanner;

public class Ejercicio07{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("Ingrese un numero entero (maximo 9 cifras) "); 
        int numero = teclado.nextInt();   

        int n1 = (numero/100000000);
		int n2 = (numero/10000000)%10;
		int n3 = (numero/1000000)%10;
		int n4 = (numero/100000)%10;
		int n5 = (numero/10000)%10; 
        int n6 = (numero/1000)%10; 
        int n7 = (numero/100)%10; 
        int n8 = (numero/10)%10; 
        int n9 = (numero/1)%10;

        if(numero>9 && numero<100){
           if(n9==n8){
            System.out.println("ES PALINDROMO");
           }
           else{
            System.out.println("NO ES PALINDROMO");
           }
        }
        else if(numero>99 && numero<1000){
            if(n9==n7){
            System.out.println("ES PALINDROMO");
           }
           else{
            System.out.println("NO ES PALINDROMO");
           }
        }
        else if(numero>999 && numero<10000){
            if(n9==n6 && n7==n8){
            System.out.println("ES PALINDROMO");
           }
           else{
            System.out.println("NO ES PALINDROMO");
           }
        } 
        else if(numero>9999 && numero<100000){
            if(n9==n5 && n6==n8){
            System.out.println("ES PALINDROMO");
           }
           else{
            System.out.println("NO ES PALINDROMO");
           }
        }
        else if(numero>99999 && numero<1000000){
            if(n9==n4 && n5==n8 && n6==n7){
            System.out.println("ES PALINDROMO");
           }
           else{
            System.out.println("NO ES PALINDROMO");
           }
        }
        else if(numero>999999 && numero<10000000){
            if(n9==n3 && n4==n8 && n5==n7){
            System.out.println("ES PALINDROMO");
           }
           else{
            System.out.println("NO ES PALINDROMO");
           }
        }
        else if(numero>9999999 && numero<100000000){
            if(n9==n2 && n3==n8 && n4==n7 && n5==n6){
            System.out.println("ES PALINDROMO");
           }
           else{
            System.out.println("NO ES PALINDROMO");
           }
        }
        else if(numero>99999999 && numero<1000000000){
            if(n9==n1 && n2==n8 && n3==n7 && n4==n6){
            System.out.println("ES PALINDROMO");
           }
           else{
            System.out.println("NO ES PALINDROMO");
           }
        }
        else{
           System.out.println("INGRESE UN DATO VALIDO"); 
        }
    } 
}