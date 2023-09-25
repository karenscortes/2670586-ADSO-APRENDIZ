public class Ejercicio15{

    public static void main(String[] args){
        System.out.println("Fibonacci = "+ fibonacci(3) ); 
        System.out.println("Fibonacci = "+ fibonacci(4) ); 
        System.out.println("Fibonacci = "+ fibonacci(5) ); 
    }

    public static int fibonacci(int a){
        int ante=0; 
        int sigui=1; 
        int secuencia = 0;
  
        for(int i=1; i<a; i++){
            ante = secuencia; 
            secuencia = sigui;
            sigui = sigui + ante;
        } 
        return secuencia;
    }
}