import java.util.Scanner;  

public class Ejercicio08{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("-> Ingrese un numero para el tamano de la cuadricula: "); 
        int N = teclado.nextInt();  

        int[][] cuadricula = new int[N][N];
        int num = 2;
        int noprimo= N * N - 8;
        int primo = 0; 
        int contPrimo =0;
        
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i % 2 == 0 && j % 2 == 0) {
                    while(primo < (N*N)){
                        int divisores = 0;
                        for(int k =1; k<=num;k++ ){
                            if(num%k == 0){
                                divisores = divisores +1; 
                            }
                        }

                        if (divisores == 2) {
                            cuadricula[primo / N][primo % N] = num;
                            primo = primo + 1;
                        }
                        num++;
                    }    
                    
                } else {
                    cuadricula[i][j] = noprimo;
                    noprimo--;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print("["+cuadricula[i][j] + "]");
            }
            System.out.println();
        }

    }
}