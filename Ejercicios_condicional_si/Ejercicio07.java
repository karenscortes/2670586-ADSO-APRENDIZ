import java.util.Scanner;

public class Ejercicio07{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);

        
        System.out.println("Biembenido a nuestro sistema");  

        System.out.print("Ingrese un numero de maximo 10 digitos "); 
        long numero = teclado.nextLong();   

        long n1, n2, n3, n4, n5, n6, n7, n8, n9, n10;

        if(numero>=1000000000 && numero<10000000000l){ 
            n1 = numero/1000000000; 
            n2 = numero/100000000%10; 
            n3 = numero/10000000%100%10;
            n4 = numero/1000000%1000%10; 
            n5 = numero/100000%10000%10; 
            n6 = numero/10000%100000%10; 
            n7 = numero/1000%1000000%10; 
            n8 = numero/100%10000000%10;
            n9 = numero/10%100000000%10; 
            n10 = numero%10;

            System.out.println("//------ FORMATO DE MONEDA ------\\");
            System.out.println("MONEDA $ " + n1 + "." + n2 + n3 + n4 + "." + n5 + n6 + n7 + "." + n8 + n9 + n10);
        }  
        else{
            if(numero>=100000000 && numero<1000000000l){
                n1 = numero/100000000; 
                n2 = numero/10000000%10; 
                n3 = numero/1000000%100%10;
                n4 = numero/100000%1000%10; 
                n5 = numero/10000%10000%10; 
                n6 = numero/1000%100000%10; 
                n7 = numero/100%1000000%10; 
                n8 = numero/10%10000000%10;
                n9 = numero%10; 

                System.out.println("//------ FORMATO DE MONEDA ------\\");
                System.out.println("MONEDA $ " + n1 +  n2 + n3 + "." + n4 +  n5 + n6 + "." + n7 + n8 + n9);
            } 
            else{
              if(numero>=10000000 && numero<100000000){
                    n1 = numero/10000000; 
                    n2 = numero/1000000%10; 
                    n3 = numero/100000%100%10;
                    n4 = numero/10000%1000%10; 
                    n5 = numero/1000%10000%10; 
                    n6 = numero/100%100000%10; 
                    n7 = numero/10%1000000%10; 
                    n8 = numero%10;

                    System.out.println("//------ FORMATO DE MONEDA ------\\");
                    System.out.println("MONEDA $ " + n1 +  n2 + "." + n3 + n4 +  n5 + "." + n6 + n7 + n8);
                }  
                else{
                   if(numero>=1000000 && numero<10000000){
                        n1 = numero/1000000; 
                        n2 = numero/100000%10; 
                        n3 = numero/10000%100%10;
                        n4 = numero/1000%1000%10; 
                        n5 = numero/100%10000%10; 
                        n6 = numero/10%100000%10; 
                        n7 = numero%10;

                        System.out.println("//------ FORMATO DE MONEDA ------\\");
                        System.out.println("MONEDA $ " + n1 + "." +  n2 + n3 + n4 + "." + n5 +  n6 + n7);
                    }  
                    else{
                       if(numero>=100000 && numero<1000000){
                            n1 = numero/100000; 
                            n2 = numero/10000%10; 
                            n3 = numero/1000%100%10;
                            n4 = numero/100%1000%10; 
                            n5 = numero/10%10000%10; 
                            n6 = numero%10;

                            System.out.println("//------ FORMATO DE MONEDA ------\\");
                            System.out.println("MONEDA $ " + n1 +  n2 + n3 + "." + n4 + n5 +  n6);
                        }   
                        else{
                           if(numero>=10000 && numero<100000){
                                n1 = numero/10000; 
                                n2 = numero/1000%10; 
                                n3 = numero/100%100%10;
                                n4 = numero/10%1000%10;  
                                n5 = numero%10;

                                System.out.println("//------ FORMATO DE MONEDA ------\\");
                                System.out.println("MONEDA $ " + n1 +  n2 + "." + n3 + n4 + n5);
                            }   
                            else{
                              if(numero>=1000 && numero<10000){
                                    n1 = numero/1000; 
                                    n2 = numero/100%10; 
                                    n3 = numero/10%100%10; 
                                    n4 = numero%10;

                                    System.out.println("//------ FORMATO DE MONEDA ------\\");
                                    System.out.println("MONEDA $ " + n1 + "." +  n2 +  n3 + n4);
                                }   
                                else{
                                    if(numero>=100 && numero<1000){
                                        n1 = numero/100; 
                                        n2 = numero/10%10; 
                                        n3 = numero%10;

                                        System.out.println("//------ FORMATO DE MONEDA ------\\");
                                        System.out.println("MONEDA $ " + n1 +  n2 +  n3);
                                    } 
                                    else{
                                        if(numero>=10 && numero<100){
                                            n1 = numero/10;  
                                            n2 = numero%10;

                                            System.out.println("//------ FORMATO DE MONEDA ------\\");
                                            System.out.println("MONEDA $ " + n1 +  n2);
                                        } 
                                        else{
                                            if(numero>=0 && numero<10){  
                                                n1 = numero;

                                                System.out.println("//------ FORMATO DE MONEDA ------\\");
                                                System.out.println("MONEDA $ " + n1);
                                            } 
                                            else{
                                                System.out.println("Ingrese un dato correcto, intentelo de nuevo ");
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}