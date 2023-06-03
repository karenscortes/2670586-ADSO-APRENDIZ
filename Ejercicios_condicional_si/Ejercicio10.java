import java.util.Scanner;

public class Ejercicio10{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Biembenido a nuestro sistema");  

        System.out.print("Ingrese la nota de matematicas: "); 
        float mate = teclado.nextFloat();   

        System.out.print("Ingrese la nota de espanol: "); 
        float espa = teclado.nextFloat();

        System.out.print("Ingrese la nota de ingles: "); 
        float ing = teclado.nextFloat();

        System.out.print("Ingrese la nota de ciencias naturales: "); 
        float natu = teclado.nextFloat();

        System.out.print("Ingrese la nota de deportes: "); 
        float depo = teclado.nextFloat();

        float suma = (mate + espa + ing + natu + depo);
        float promedio = suma/5; 
        float faltante = 15-suma;  
        

        if(mate<1 || mate>5 || espa<1 || espa>5 || ing<1 || ing>5 || natu<1 || natu>5 || depo<1 || depo>5){
             System.out.print("solo notas de uno a cinco, intentelo nuevamente");
        }
        else{
            if(mate>espa && mate>ing && mate>natu && mate>depo){
                System.out.println("La mayor nota es: matematicas"); 
            } 
            else if(espa>mate && espa>ing && espa>natu && espa>depo){
                System.out.println("La mayor nota es: literatura");
            }
            else if(ing>mate && ing>espa && ing>natu && ing>depo){
                System.out.println("La mayor nota es: ingles");
            }
            else if(natu>mate && natu>espa && natu>ing && natu>depo){
                System.out.println("La mayor nota es: ciencias naturales");
            }
            else if(depo>mate && depo>espa && depo>ing && depo>natu){
                System.out.println("La mayor nota es: deportes");
            } 

            float menor =0;

            if(mate<espa && mate<ing && mate<natu && mate<depo){
                System.out.println("La menor nota es: matematicas"); 
                menor=mate;
            } 
            else if(espa<mate && espa<ing && espa<natu && espa<depo){
                System.out.println("La menor nota es: literatura"); 
                menor=espa;
            }
            else if(ing<mate && ing<espa && ing<natu && ing<depo){
                System.out.println("La menor nota es: ingles");
                menor=ing;
            }
            else if(natu<mate && natu<espa && natu<ing && natu<depo){
                System.out.println("La menor nota es: ciencias naturales");
                menor=natu;
            }
            else if(depo<mate && depo<espa && depo<ing && depo<natu){
                System.out.println("La menor nota es: deportes"); 
                menor=depo;
            } 

            System.out.println("El rpmedio de notas es: " +promedio); 

            float nota = menor + faltante;

            if(promedio<3){
                System.out.println("Debio obtener una tota de: " +nota + " en su asignatura con menor nota para pasar el periodo");
            }
        } 
         
    } 

}