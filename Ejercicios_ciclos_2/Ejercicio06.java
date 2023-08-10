import java.util.Scanner;

public class Ejercicio06{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("-> Ingrese un numero para iniciar el factorial "); 
        int n = teclado.nextInt(); 

        System.out.print("-> Ingrese un numero para finalizar el factorial "); 
        int m = teclado.nextInt();

        int resultado = 1; 
        int resultado2 =1; 
        int resultado3 = 1; 
        int resultado4 =1; 
        int resultado5 = 1; 
        int resultado6 = 1; 
        int resultado7 = 1; 
        int resultado8 = 1; 
        int resultado9 = 1;

        int diferencia = m-n; 

        if(diferencia==1){
            for(int i=1; i<=n; i++){ 
                resultado = resultado * i; 
                System.out.print(i);  
                if(i<n){
                    System.out.print(" x "); 
                }
            } 
            System.out.print(" = "+resultado); 
            System.out.println();

            for(int i=1; i<=n+1; i++){ 
                resultado2 = resultado2 * i; 
                System.out.print(i);  
                if(i<n+1){
                    System.out.print(" x "); 
                }
            }
            System.out.print(" = "+resultado2);

        }else if(diferencia==2){
            for(int i=1; i<=n; i++){ 
                resultado = resultado * i; 
                System.out.print(i);  
                if(i<n){
                    System.out.print(" x "); 
                }
            } 
            System.out.print(" = "+resultado); 
            System.out.println();

            for(int i=1; i<=n+1; i++){ 
                resultado2 = resultado2 * i; 
                System.out.print(i);  
                if(i<n+1){
                    System.out.print(" x "); 
                }
            }
            System.out.print(" = "+resultado2);
            System.out.println();

            for(int i=1; i<=n+2; i++){ 
                resultado3 = resultado3 * i; 
                System.out.print(i);  
                if(i<n+2){
                    System.out.print(" x "); 
                }
            }
            System.out.print(" = "+resultado3);
        }else if(diferencia==3){
            for(int i=1; i<=n; i++){ 
                resultado = resultado * i; 
                System.out.print(i);  
                if(i<n){
                    System.out.print(" x "); 
                }
            } 
            System.out.print(" = "+resultado); 
            System.out.println();

            for(int i=1; i<=n+1; i++){ 
                resultado2 = resultado2 * i; 
                System.out.print(i);  
                if(i<n+1){
                    System.out.print(" x "); 
                }
            }
            System.out.print(" = "+resultado2);
            System.out.println();

            for(int i=1; i<=n+2; i++){ 
                resultado3 = resultado3 * i; 
                System.out.print(i);  
                if(i<n+2){
                    System.out.print(" x "); 
                }
            }
            System.out.print(" = "+resultado3);
            System.out.println();

            for(int i=1; i<=n+3; i++){ 
                resultado4 = resultado4 * i; 
                System.out.print(i);  
                if(i<n+3){
                    System.out.print(" x "); 
                }
            }
            System.out.print(" = "+resultado4);
        }else if(diferencia==4){
            for(int i=1; i<=n; i++){ 
                resultado = resultado * i; 
                System.out.print(i);  
                if(i<n){
                    System.out.print(" x "); 
                }
            } 
            System.out.print(" = "+resultado); 
            System.out.println();

            for(int i=1; i<=n+1; i++){ 
                resultado2 = resultado2 * i; 
                System.out.print(i);  
                if(i<n+1){
                    System.out.print(" x "); 
                }
            }
            System.out.print(" = "+resultado2);
            System.out.println();

            for(int i=1; i<=n+2; i++){ 
                resultado3 = resultado3 * i; 
                System.out.print(i);  
                if(i<n+2){
                    System.out.print(" x "); 
                }
            }
            System.out.print(" = "+resultado3);
            System.out.println();

            for(int i=1; i<=n+3; i++){ 
                resultado4 = resultado4 * i; 
                System.out.print(i);  
                if(i<n+3){
                    System.out.print(" x "); 
                }
            }
            System.out.print(" = "+resultado4);
            System.out.println();

            for(int i=1; i<=n+4; i++){ 
                resultado5 = resultado5 * i; 
                System.out.print(i);  
                if(i<n+4){
                    System.out.print(" x "); 
                }
            }
            System.out.print(" = "+resultado5);
        }else if(diferencia==5){
            for(int i=1; i<=n; i++){ 
                resultado = resultado * i; 
                System.out.print(i);  
                if(i<n){
                    System.out.print(" x "); 
                }
            } 
            System.out.print(" = "+resultado); 
            System.out.println();

            for(int i=1; i<=n+1; i++){ 
                resultado2 = resultado2 * i; 
                System.out.print(i);  
                if(i<n+1){
                    System.out.print(" x "); 
                }
            }
            System.out.print(" = "+resultado2);
            System.out.println();

            for(int i=1; i<=n+2; i++){ 
                resultado3 = resultado3 * i; 
                System.out.print(i);  
                if(i<n+2){
                    System.out.print(" x "); 
                }
            }
            System.out.print(" = "+resultado3);
            System.out.println();

            for(int i=1; i<=n+3; i++){ 
                resultado4 = resultado4 * i; 
                System.out.print(i);  
                if(i<n+3){
                    System.out.print(" x "); 
                }
            }
            System.out.print(" = "+resultado4);
            System.out.println();

            for(int i=1; i<=n+4; i++){ 
                resultado5 = resultado5 * i; 
                System.out.print(i);  
                if(i<n+4){
                    System.out.print(" x "); 
                }
            }
            System.out.print(" = "+resultado5);
            System.out.println();

            for(int i=1; i<=n+5; i++){ 
                resultado6 = resultado6 * i; 
                System.out.print(i);  
                if(i<n+5){
                    System.out.print(" x "); 
                }
            }
            System.out.print(" = "+resultado6);
        }else if(diferencia==6){
            for(int i=1; i<=n; i++){ 
                resultado = resultado * i; 
                System.out.print(i);  
                if(i<n){
                    System.out.print(" x "); 
                }
            } 
            System.out.print(" = "+resultado); 
            System.out.println();

            for(int i=1; i<=n+1; i++){ 
                resultado2 = resultado2 * i; 
                System.out.print(i);  
                if(i<n+1){
                    System.out.print(" x "); 
                }
            }
            System.out.print(" = "+resultado2);
            System.out.println();

            for(int i=1; i<=n+2; i++){ 
                resultado3 = resultado3 * i; 
                System.out.print(i);  
                if(i<n+2){
                    System.out.print(" x "); 
                }
            }
            System.out.print(" = "+resultado3);
            System.out.println();

            for(int i=1; i<=n+3; i++){ 
                resultado4 = resultado4 * i; 
                System.out.print(i);  
                if(i<n+3){
                    System.out.print(" x "); 
                }
            }
            System.out.print(" = "+resultado4);
            System.out.println();

            for(int i=1; i<=n+4; i++){ 
                resultado5 = resultado5 * i; 
                System.out.print(i);  
                if(i<n+4){
                    System.out.print(" x "); 
                }
            }
            System.out.print(" = "+resultado5);
            System.out.println();

            for(int i=1; i<=n+5; i++){ 
                resultado6 = resultado6 * i; 
                System.out.print(i);  
                if(i<n+5){
                    System.out.print(" x "); 
                }
            }
            System.out.print(" = "+resultado6);
            System.out.println();

            for(int i=1; i<=n+6; i++){ 
                resultado7 = resultado7 * i; 
                System.out.print(i);  
                if(i<n+6){
                    System.out.print(" x "); 
                }
            }
            System.out.print(" = "+resultado7);
        }if(diferencia==7){
            for(int i=1; i<=n; i++){ 
                resultado = resultado * i; 
                System.out.print(i);  
                if(i<n){
                    System.out.print(" x "); 
                }
            } 
            System.out.print(" = "+resultado); 
            System.out.println();

            for(int i=1; i<=n+1; i++){ 
                resultado2 = resultado2 * i; 
                System.out.print(i);  
                if(i<n+1){
                    System.out.print(" x "); 
                }
            }
            System.out.print(" = "+resultado2);
            System.out.println();

            for(int i=1; i<=n+2; i++){ 
                resultado3 = resultado3 * i; 
                System.out.print(i);  
                if(i<n+2){
                    System.out.print(" x "); 
                }
            }
            System.out.print(" = "+resultado3);
            System.out.println();

            for(int i=1; i<=n+3; i++){ 
                resultado4 = resultado4 * i; 
                System.out.print(i);  
                if(i<n+3){
                    System.out.print(" x "); 
                }
            }
            System.out.print(" = "+resultado4);
            System.out.println();

            for(int i=1; i<=n+4; i++){ 
                resultado5 = resultado5 * i; 
                System.out.print(i);  
                if(i<n+4){
                    System.out.print(" x "); 
                }
            }
            System.out.print(" = "+resultado5);
            System.out.println();

            for(int i=1; i<=n+5; i++){ 
                resultado6 = resultado6 * i; 
                System.out.print(i);  
                if(i<n+5){
                    System.out.print(" x "); 
                }
            }
            System.out.print(" = "+resultado6);
            System.out.println();

            for(int i=1; i<=n+6; i++){ 
                resultado7 = resultado7 * i; 
                System.out.print(i);  
                if(i<n+6){
                    System.out.print(" x "); 
                }
            }
            System.out.print(" = "+resultado7);
            System.out.println();

            for(int i=1; i<=n+7; i++){ 
                resultado8 = resultado8 * i; 
                System.out.print(i);  
                if(i<n+7){
                    System.out.print(" x "); 
                }
            }
            System.out.print(" = "+resultado8);
        }if(diferencia==8){
            for(int i=1; i<=n; i++){ 
                resultado = resultado * i; 
                System.out.print(i);  
                if(i<n){
                    System.out.print(" x "); 
                }
            } 
            System.out.print(" = "+resultado); 
            System.out.println();

            for(int i=1; i<=n+1; i++){ 
                resultado2 = resultado2 * i; 
                System.out.print(i);  
                if(i<n+1){
                    System.out.print(" x "); 
                }
            }
            System.out.print(" = "+resultado2);
            System.out.println();

            for(int i=1; i<=n+2; i++){ 
                resultado3 = resultado3 * i; 
                System.out.print(i);  
                if(i<n+2){
                    System.out.print(" x "); 
                }
            }
            System.out.print(" = "+resultado3);
            System.out.println();

            for(int i=1; i<=n+3; i++){ 
                resultado4 = resultado4 * i; 
                System.out.print(i);  
                if(i<n+3){
                    System.out.print(" x "); 
                }
            }
            System.out.print(" = "+resultado4);
            System.out.println();

            for(int i=1; i<=n+4; i++){ 
                resultado5 = resultado5 * i; 
                System.out.print(i);  
                if(i<n+4){
                    System.out.print(" x "); 
                }
            }
            System.out.print(" = "+resultado5);
            System.out.println();

            for(int i=1; i<=n+5; i++){ 
                resultado6 = resultado6 * i; 
                System.out.print(i);  
                if(i<n+5){
                    System.out.print(" x "); 
                }
            }
            System.out.print(" = "+resultado6);
            System.out.println();

            for(int i=1; i<=n+6; i++){ 
                resultado7 = resultado7 * i; 
                System.out.print(i);  
                if(i<n+6){
                    System.out.print(" x "); 
                }
            }
            System.out.print(" = "+resultado7);
            System.out.println();

            for(int i=1; i<=n+7; i++){ 
                resultado8 = resultado8 * i; 
                System.out.print(i);  
                if(i<n+7){
                    System.out.print(" x "); 
                }
            }
            System.out.print(" = "+resultado8);
             System.out.println();

            for(int i=1; i<=n+8; i++){ 
                resultado9 = resultado9 * i; 
                System.out.print(i);  
                if(i<n+8){
                    System.out.print(" x "); 
                }
            }
            System.out.print(" = "+resultado9);
        }
    }
}