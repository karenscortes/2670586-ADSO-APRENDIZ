import java.util.Scanner;

public class Ejercicio10{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Biembenido a nuestro sistema");  

        System.out.print("Ingrese su fecha de nacimiento (ddmmaaaa) "); 
        int nacimiento = teclado.nextInt();   

        System.out.print("Ingrese la fecha actual (ddmmaaaa) "); 
        int fecha = teclado.nextInt(); 

        int dia = (nacimiento/1000000);
		int mes = (nacimiento/10000)%100;
        int year = (nacimiento%10000); 

        int dia2 = (fecha/1000000);
		int mes2 = (fecha/10000)%100;
        int year2 = (fecha%10000); 

        int years = year2-year;

        if(year<1873){
            System.out.println("Es casi imposible que estes vivo");
        }
        else if(nacimiento>31123000 || nacimiento<01011773){
            System.out.println("Es casi imposible que la humanidad llegara hasta ese anio");
        } 
        else if((dia>dia2 && mes>mes2 && years==18) || (dia<dia2 && mes<mes2 && years==18) || (dia==dia2 && mes<mes2 && years==18) || (dia==dia2 && mes>mes2 && years==18) || (dia<dia2 && mes==mes2 && years==18) || (dia>dia && mes==mes2 && years==18) || (dia>dia2 && mes<mes2 && years==18) || (dia<dia2 && mes>mes2 && years==18) ){
            System.out.println("Ya casi es mayor edad");
        }  
        else if(dia==dia2 && mes==mes2 && years==18){
            System.out.println("Feliz cumple ya eres mayor de edad");
        } 
        else if(dia==dia2 && mes==mes2 && years<18){
            System.out.println("Feliz cumple aun eres menor de edad");
        }
        else if((dia>dia2 && mes>mes2 && years<18) || (dia<dia2 && mes<mes2 && years<18) || (dia==dia2 && mes<mes2 && years<18) || (dia==dia2 && mes>mes2 && years<18) || (dia<dia2 && mes==mes2 && years<18) || (dia>dia2 && mes==mes2 && years<18) || (dia==dia2 && mes==mes2 && years<18) || (dia>dia2 && mes<mes2 && years<18) || (dia<dia2 && mes>mes2 && years<18) ){
            System.out.println("Es menor de edad");
        } 
        else{
            System.out.println("Es mayor de edad");
        } 
    } 
}