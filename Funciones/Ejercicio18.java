public class Ejercicio18{

    public static void main(String[] args){
        System.out.println("Numero invertido = "+ invertido(1234) ); 
        System.out.println("Numero invertido = "+ invertido(4567) ); 
        System.out.println("Numero invertido = "+ invertido(8912) ); 
    }

    public static int invertido(int a){
        int invertido=0;
        int digito=0;
        
        while(a!=0){ 
            digito = a%10;
            invertido = (invertido*10) + digito;
            a = a/10;
        }
        return invertido;
    }
}