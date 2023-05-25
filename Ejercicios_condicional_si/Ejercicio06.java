import java.util.Scanner;

public class Ejercicio06{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Biembenido a nuestro sistema");  

        System.out.print("Ingrese un numero de seis digitos "); 
        int numero = teclado.nextInt();  

        int n1 = numero/100000; 
        int n2 = numero/10000%10; 
        int n3 = numero/1000%100%10; 
        int n4 = numero/100%1000%10; 
        int n5 = numero/10%10000%10; 
        int n6 = numero%10;

        if(numero<=999999 && numero>=100000){
            System.out.println("++-----------------------------------------++"); 
            System.out.println("++----              MENU               ----++"); 
            System.out.println("++-----------------------------------------++");
            System.out.println("||                                         ||"); 
            System.out.println("||   1. primer digito  2. segundo digito   ||");
            System.out.println("||   3. tercer digito  4. cuarto digito    ||"); 
            System.out.println("||   5. quinto digito  6. sexto digito     ||"); 
            System.out.println("||                                         ||");
            System.out.println("++-----------------------------------------++");
            System.out.println("++-----------------------------------------++"); 
        
            System.out.print("Ingrese la opcion que desee "); 
            int opcion = teclado.nextInt();   

            if(opcion==1){
                System.out.print("El primer digito es: " +n1); 
            }
            else{
                if(opcion==2){
                    System.out.print("El segundo digito es: " +n2); 
                } 
                else{
                    if(opcion==3){
                        System.out.print("El tercer digito es: " +n3); 
                    } 
                    else{
                        if(opcion==4){
                            System.out.print("El cuarto digito es: " +n4); 
                        } 
                        else{
                            if(opcion==5){
                                System.out.print("El quinto digito es: " +n5); 
                            } 
                            else{
                                if(opcion==6){
                                    System.out.print("El sexto digito es: " +n6); 
                                } 
                                else{
                                   System.out.print("Ingrese una opcion correcta, vuelva a intentarlo");  
                                }
                            }
                        }
                    }
                }
            }
        }
        else{
         System.out.print("Ingrese un numero menor o igual a 999999");   
        }
    }
}