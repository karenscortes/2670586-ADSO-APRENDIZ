import java.util.Scanner;  

public class Ejercicio10{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("-> Ingrese un numero para el tamano de la cuadricula (max: 11): "); 
        int N = teclado.nextInt();  

        int[][] primos = new int[N][N];
        int num = 2;
        int primo =0;

        if(N>0 && N <=11){
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    while(primo < (N*N)){
                        int divisores = 0;
                        for(int k =1; k<=num;k++ ){
                            if(num%k == 0){
                                divisores = divisores +1; 
                            }
                        }

                        if (divisores == 2) {
                            primos[primo / N][primo % N] = num;
                            primo = primo + 1;
                        }
                        num++;
                    }   
                }
            }

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if(primos[i][j]>1 && primos[i][j]<10 ){
                        System.out.print("[00"+primos[i][j]+"]");
                    }else if(primos[i][j]>10 && primos[i][j]<100 ){
                        System.out.print("[0"+primos[i][j]+"]");
                    }else{
                        System.out.print("["+primos[i][j]+"]");
                    }
                }   
                System.out.println();
            }
        }else{
            System.out.println("Solo se aceptan valores de 1 a 11");
        }
    }
}