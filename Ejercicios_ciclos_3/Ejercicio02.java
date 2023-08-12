import java.util.Scanner;

public class Ejercicio02{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("-> Ingrese la cantidad del prestamo total: "); 
        int cantidad_inicial = teclado.nextInt();  

        System.out.print("-> Ingrese numero de cuotas pagadas: "); 
        int numero_pagos = teclado.nextInt();  

        int suma_pagos =0;
        int resto =0; 

        for(int i =1; i<=numero_pagos;i++){
           System.out.print("-> Ingrese el valor de cada cuota pagada: "); 
           int valor_pagos = teclado.nextInt();  
           suma_pagos = valor_pagos + suma_pagos;
        }
        
        resto = suma_pagos-cantidad_inicial; 

        float intereses = ( ((float) resto / (float) cantidad_inicial)) * 100; 
        System.out.print("Los intereses pagados son: "+intereses+"%");
    }
}