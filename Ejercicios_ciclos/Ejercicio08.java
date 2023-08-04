import java.util.Scanner;

public class Ejercicio08{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("-> Ingrese un numero (max 6 cifras) "); 
        int num = teclado.nextInt(); 

        int mod = 0;
        int divisor = 0; 
        int n =0;

        if(num<999999){
            if(num>99999 && num<999999){
                divisor = 100000;
                mod = 10 ;
                for(int i =1; i<=6; i++){
                    n = (num/divisor)%mod;
                    System.out.println("El digito 0"+i+" es "+n); 
                    divisor = divisor /10; 
                }
            }else if(num>9999 && num<99999){
                divisor = 10000;
                mod = 10 ;
                for(int i =1; i<=5; i++){
                    n = (num/divisor)%mod;
                    System.out.println("El digito 0"+i+" es "+n); 
                    divisor = divisor /10; 
                }
            }else if(num>999 && num<9999){
                divisor = 1000;
                mod = 10 ;
                for(int i =1; i<=4; i++){
                    n = (num/divisor)%mod;
                    System.out.println("El digito 0"+i+" es "+n); 
                    divisor = divisor /10; 
                }
            }else if(num>99 && num<999){
                divisor = 100;
                mod = 10 ;
                for(int i =1; i<=3; i++){
                    n = (num/divisor)%mod;
                    System.out.println("El digito 0"+i+" es "+n); 
                    divisor = divisor /10; 
                }
            }else if(num>9 && num<99){
                divisor = 10;
                mod = 10 ;
                for(int i =1; i<=2; i++){
                    n = (num/divisor)%mod;
                    System.out.println("El digito 0"+i+" es "+n); 
                    divisor = divisor /10; 
                }
            }else if(num>0 && num<10){
                System.out.println("El digito 01 es "+num); 
            }
        }else{
            System.out.println("Solo se aceptan valores de max 6 digitos "); 
        }
    }
}