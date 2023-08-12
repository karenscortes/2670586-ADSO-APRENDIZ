import java.util.Scanner;

public class Ejercicio04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 

        System.out.print("Ingrese la cantidad de galones que utiliza su vehiculo por kilometro ");
        double gxK = teclado.nextDouble();

        System.out.print("Ingrese el costo de un galon de gasolina el dia de hoy ");
        double costog = teclado.nextDouble();

        System.out.println("||-------------RUTAS-------------||");
        System.out.println("||                               ||");
        System.out.println("||      1-Mistrato               ||");
        System.out.println("||      2-Pueblo Rico            ||");
        System.out.println("||      3-Quinchia               ||");
        System.out.println("||      4-Santa rosa de cabal    ||");
        System.out.println("||      5-Santuario              ||");
        System.out.println("||-------------------------------||");
        System.out.println("");

        System.out.print("Ingrese el municipio donde se inicia su recorrdo (numero): ");
        int cinicio = teclado.nextInt();

        System.out.print("Ingrese la cantidad de paradas: ");
        int n_paradas = teclado.nextInt();

        int cfin = 0;
        double nkilometros = 0; 
        double kilometros =0; 

        int parada =0; 
        double preciog = gxK * costog;

        if(cinicio>0 && cinicio<=5){
            for(int i=1; i<=n_paradas; i++){
                System.out.print("Ingrese la siguente parada: ");
                parada = teclado.nextInt();

                if(cinicio==1){
                    if(parada==1){
                       kilometros = 5.0; 
                    }else if(parada==2){
                        kilometros = 81.7; 
                    }else if(parada==3){
                        kilometros = 53.6; 
                    }else if(parada==4){
                        kilometros = 99.8; 
                    }else if(parada==5){
                        kilometros = 70.4; 
                    }    
                }else if(cinicio==2){
                    if(parada==1){
                       kilometros = 81.5; 
                    }else if(parada==2){
                        kilometros = 5.0; 
                    }else if(parada==3){
                        kilometros = 103.0; 
                    }else if(parada==4){
                        kilometros = 103.0; 
                    }else if(parada==5){
                        kilometros = 34.3; 
                    }    
                }else if(cinicio==3){
                    if(parada==1){
                       kilometros = 57.9; 
                    }else if(parada==2){
                        kilometros = 103.0; 
                    }else if(parada==3){
                        kilometros = 5.0; 
                    }else if(parada==4){
                        kilometros = 83.2; 
                    }else if(parada==5){
                        kilometros = 109.0; 
                    }    
                }else if(cinicio==4){
                    if(parada==1){
                       kilometros = 98.5; 
                    }else if(parada==2){
                        kilometros = 102.0; 
                    }else if(parada==3){
                        kilometros = 83.5; 
                    }else if(parada==4){
                        kilometros = 5.0; 
                    }else if(parada==5){
                        kilometros = 75.2; 
                    }    
                }else if(cinicio==5){
                    if(parada==1){
                       kilometros = 70.5; 
                    }else if(parada==2){
                        kilometros = 34.5; 
                    }else if(parada==3){
                        kilometros = 109.0; 
                    }else if(parada==4){
                        kilometros = 76.4; 
                    }else if(parada==5){
                        kilometros = 5.0; 
                    }    
                }

                nkilometros = nkilometros + kilometros; 
                cinicio = cfin;

            }
        }

        double gasto = nkilometros * preciog; 

        System.out.println("Los kilometros recorridos son: "+nkilometros);
        System.out.println("El gasto en gasolina de este recorrido sera aproximadamente de: "+gasto);


    }
}