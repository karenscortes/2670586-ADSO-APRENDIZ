public class Ejercicio17{

    public static void main(String[] args){
        System.out.println("Suma de digitos = "+ sumaDigitos(334) ); 
        System.out.println("Suma de digitos = "+ sumaDigitos(4124) ); 
        System.out.println("Suma de digitos = "+ sumaDigitos(53256) ); 
    }

    public static int sumaDigitos(int a){
        int suma=0;
        int digito=0;
        
        while(a!=0){ 
            digito = a%10;
            suma = suma + digito;
            a = a/10;
        }
        return suma;
    }
}