import java.util.Scanner;

public class Ejemplo01{

    public static void main(String[] args){
        /* System.out.println("suma = "+ sumar(3,6) ); 
        System.out.println("suma = "+ sumar(4,-2) ); 
        System.out.println("suma = "+ sumar(-10,-3) ); 

        int juana = sumar(4,4); 
        System.out.println("juana = "+ juana ); 

        if(sumar(-5,12) >= 0){
            System.out.println("El resultado es positivo"); 
        }else{
            System.out.println("El resultado es negativo");
        }  

        System.out.println("division = "+ dividir(3,6) ); 
        System.out.println("division = "+ dividir(4,2) ); 
        System.out.println("division = "+ dividir(10,2) ); 

        saludarClico(4);  */ 

        int array [] = new int [100]; 
        array = llenarArray(array); 
        imprimirArreglo(array);

    }

    public static int sumar(int a, int b){
        int resul = (a+b); 
        return resul;
    }
    
    public static float dividir(float a, float b){
        float resul = (a/b); 
        return resul; 
    }
   

    public static void saludar(){
        System.out.println("||----------------------||");
        System.out.println("||      HOLA MUNDO      ||");
        System.out.println("||----------------------||");
    } 

    public static void saludarClico(int cantidad){

        for(int i=1; i<=cantidad; i++){  
            System.out.println("||----------------------||");
            System.out.println("||      HOLA MUNDO "+i+"    ||");
            System.out.println("||----------------------||");
            System.out.println();
            
        }
    }

    public static void imprimirTabla(int tabla, int multiplo){
        int resultado =0; 
        System.out.println("||-----------------||");
        for(int i=0; i<=multiplo; i++){
            resultado = tabla * i; 
            System.out.println("     "+tabla+" x "+i+" = "+resultado);
        }
        System.out.println("||-----------------||");
    }

    public static int [] llenarArray(int [] array){
        int aleatorio =0;
        for(int i=0; i<array.length; i++){
            aleatorio = (int) (Math.random()*100);
            array[i]=aleatorio;
        }
        return array;
    }

    public static void imprimirArreglo(int [] array){
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+", ");
        }
    }

    
  
}