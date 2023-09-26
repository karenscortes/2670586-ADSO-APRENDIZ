import java.util.Scanner;

public class Ejercicio03{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("Ingrese un numero entero para la coordenada de x "); 
        int x = teclado.nextInt();   

        System.out.print("Ingrese un numero entero para coordenada de y "); 
        int y = teclado.nextInt();  

        if(x==0 && y==0){
            System.out.print("La coordenada esta ubicada en el punto de origen");  
        } 
        else{
            if(x==0 && y<0) { 
                System.out.print("La coordenada esta ubicada en el eje y negativo"); 
            } 
            else{ 
                if(x==0 && y>0){ 
                    System.out.print("La coordenada esta ubicada en el eje y positivo"); 
                } 
                else{
                    if(x<0 && y==0){ 
                        System.out.print("La coordenada esta ubicada en el eje x negativo"); 
                    }  
                    else{
                        if(x>0 && y==0){ 
                            System.out.print("La coordenada esta ubicada en el eje x positivo"); 
                        } 
                        else{
                            if(x>0 && y>0){ 
                                System.out.print("La coordenada esta ubicada en el primer cuadrante"); 
                            } 
                            else{
                                if(x<0 && y>0){ 
                                    System.out.print("La coordenada esta ubicada en el segundo cuadrante"); 
                                } 
                                else{
                                    if(x<0 && y<0){ 
                                        System.out.print("La coordenada esta ubicada en el tercer cuadrante"); 
                                    } 
                                    else{
                                       System.out.print("La coordenada esta ubicada en el cuarto cuadrante");  
                                    }
                                }
                            }
                        }
                    }
                }
                
            }
        }
    }
}