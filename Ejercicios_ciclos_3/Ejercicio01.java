import java.util.Scanner;

public class Ejercicio01{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("-> Ingrese un sueldo total= "); 
        int sueldo = teclado.nextInt();  

        System.out.print("-> Ingrese un numero de pagos: "); 
        int pagos = teclado.nextInt(); 

        System.out.println("---------------FORMAS DE PAGO---------------");
        System.out.println("||    1. Pagos de igual valor.            ||");
        System.out.println("||    2. Primer pago diferente.           ||");
        System.out.println("||    3. Ultimo pago diferente.           ||");
        System.out.println("||    4. Primer y ultimo pago iguales.    ||");
        System.out.println("||    5. Primer y ultimo pago diferentes. ||");  

        System.out.print("-> Ingrese forma de pago: "); 
        int forma_pago = teclado.nextInt();  
 
        System.out.println("---------------SUS PAGOS SERAN--------------"); 
        
        if(forma_pago ==1){ 
            int resultado_igual = sueldo / pagos;

            for(int i =1; i <=pagos; i++){
               System.out.println("Mes 0"+i+": $ "+resultado_igual); 
            }
        }else if(forma_pago ==2){
            int resultado_distinto = sueldo / 2; 
            int resultado_iguales = resultado_distinto / (pagos - 1); 
            System.out.println("Mes 0"+1+": $ "+resultado_distinto);

            for(int a = 2; a<=pagos; a++){
                System.out.println("Mes 0"+a+": $ "+resultado_iguales);
            }
        }else if(forma_pago == 3){
            int resultado_distinto = sueldo / 2; 
            int resultado_iguales = resultado_distinto / (pagos - 1);

            for(int e = 1; e<=pagos-1; e++){
                System.out.println("Mes 0"+e+": $ "+resultado_iguales);
            } 
            System.out.println("Mes 0"+pagos+": $ "+resultado_distinto);
        }else if(forma_pago == 4){
           int resultado_distinto = sueldo / 2; 
           int resultado_distinto_2 = resultado_distinto /2;
           int resultado_iguales = resultado_distinto / (pagos - 1); 
           System.out.println("Mes 0"+1+": $ "+resultado_distinto_2);

           for(int o=2; o<=pagos-1;o++){
            System.out.println("Mes 0"+o+": $ "+resultado_iguales);
           } 
           System.out.println("Mes 0"+pagos+": $ "+resultado_distinto_2);
        }else if(forma_pago ==5){
            int resultado_distinto = sueldo /2; 
            int resultado_distinto_1 = (resultado_distinto /5) *4; 
            int resultado_distinto_2 = resultado_distinto /5;
            int resultado_iguales = resultado_distinto / (pagos - 2); 
            System.out.println("Mes 0"+1+": $ "+resultado_distinto_1);

           for(int u=2; u<=pagos-1;u++){
                System.out.println("Mes 0"+u+": $ "+resultado_iguales);
           } 
           System.out.println("Mes 0"+pagos+": $ "+resultado_distinto_2);
        }
    }
}