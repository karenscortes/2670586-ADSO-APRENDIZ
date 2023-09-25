public class Ejercicio16{

    public static void main(String[] args){
        System.out.println("Numero de digitos = "+ nDigitos(334) ); 
        System.out.println("Numero de digitos = "+ nDigitos(4124) ); 
        System.out.println("Numero de digitos = "+ nDigitos(53256) ); 
    }

    public static int nDigitos(int a){
        int contador=0;
        while(a!=0){
            a = a/10;
            contador++;
        }
        return contador;
    }
}