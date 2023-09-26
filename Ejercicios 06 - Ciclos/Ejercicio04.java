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
        System.out.println("||      1-Apia                   ||");
        System.out.println("||      2-Balboa                 ||");
        System.out.println("||      3-Belen de umbria        ||");
        System.out.println("||      4-Dosquebradas           ||");
        System.out.println("||      5-Guatica                ||");
        System.out.println("||      6-La celia               ||");
        System.out.println("||      7-La virginia            ||");
        System.out.println("||      8-Marsella               ||");
        System.out.println("||      9-Mistrato               ||");
        System.out.println("||      10-Pereira               ||");
        System.out.println("||      11-Pueblo rico           ||");
        System.out.println("||      12-Quinchia              ||");
        System.out.println("||      13-Santa rosa de cabal   ||");
        System.out.println("||      14-Santuario             ||");
        System.out.println("||                               ||");
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

        if(cinicio>0 && cinicio<=14){
            for(int i=1; i<=n_paradas; i++ ){
                System.out.print("Ingrese la siguente parada: ");
                parada = teclado.nextInt();

                if(cinicio==1){
                    if(parada==1){
                       kilometros = 5.0; 
                    }else if(parada==2){
                        kilometros = 39.8; 
                    }else if(parada==3){
                        kilometros = 39.5; 
                    }else if(parada==4){
                        kilometros = 68.9; 
                    }else if(parada==5){
                        kilometros = 58.7; 
                    }else if(parada==6){
                        kilometros = 24.1; 
                    }else if(parada==7){
                        kilometros = 34.9; 
                    }else if(parada==8){
                        kilometros = 88.1; 
                    }else if(parada==9){
                        kilometros = 55.6; 
                    }else if(parada==10){
                        kilometros = 65.7; 
                    }else if(parada==11){
                        kilometros = 26.4; 
                    }else if(parada==12){
                        kilometros = 77.4; 
                    }else if(parada==13){
                        kilometros = 77.8; 
                    }else if(parada==14){
                        kilometros = 15.3; 
                    }    
                }else if(cinicio==2){
                    if(parada==1){
                       kilometros = 39.8; 
                    }else if(parada==2){
                        kilometros = 5.0; 
                    }else if(parada==3){
                        kilometros = 56.9; 
                    }else if(parada==4){
                        kilometros = 52.9; 
                    }else if(parada==5){
                        kilometros = 76.1; 
                    }else if(parada==6){
                        kilometros = 13.7; 
                    }else if(parada==7){
                        kilometros = 18.9; 
                    }else if(parada==8){
                        kilometros = 72.1; 
                    }else if(parada==9){
                        kilometros = 73.0; 
                    }else if(parada==10){
                        kilometros = 49.7; 
                    }else if(parada==11){
                        kilometros = 64.8; 
                    }else if(parada==12){
                        kilometros = 94.8; 
                    }else if(parada==13){
                        kilometros = 61.9; 
                    }else if(parada==14){
                        kilometros = 38.3; 
                    }    
                }else if(cinicio==3){
                    if(parada==1){
                       kilometros = 39.5; 
                    }else if(parada==2){
                        kilometros = 56.9; 
                    }else if(parada==3){
                        kilometros = 5.0; 
                    }else if(parada==4){
                        kilometros = 74.6; 
                    }else if(parada==5){
                        kilometros = 25.1; 
                    }else if(parada==6){
                        kilometros = 71.9; 
                    }else if(parada==7){
                        kilometros = 40.8; 
                    }else if(parada==8){
                        kilometros = 93.8; 
                    }else if(parada==9){
                        kilometros = 16.3; 
                    }else if(parada==10){
                        kilometros = 71.4; 
                    }else if(parada==11){
                        kilometros = 65.4; 
                    }else if(parada==12){
                        kilometros = 52.4; 
                    }else if(parada==13){
                        kilometros = 83.6; 
                    }else if(parada==14){
                        kilometros = 71.4; 
                    }    
                }else if(cinicio==4){
                    if(parada==1){
                       kilometros = 67.5; 
                    }else if(parada==2){
                        kilometros = 51.5; 
                    }else if(parada==3){
                        kilometros = 73.1; 
                    }else if(parada==4){
                        kilometros = 5.0; 
                    }else if(parada==5){
                        kilometros = 92.3; 
                    }else if(parada==6){
                        kilometros = 66.6; 
                    }else if(parada==7){
                        kilometros = 32.5; 
                    }else if(parada==8){
                        kilometros = 34.4; 
                    }else if(parada==9){
                        kilometros = 89.3; 
                    }else if(parada==10){
                        kilometros = 2.4; 
                    }else if(parada==11){
                        kilometros = 92.5; 
                    }else if(parada==12){
                        kilometros = 93.9; 
                    }else if(parada==13){
                        kilometros = 12.4; 
                    }else if(parada==14){
                        kilometros = 66.0; 
                    }    
                }else if(cinicio==5){
                    if(parada==1){
                       kilometros = 58.7; 
                    }else if(parada==2){
                        kilometros = 76.1; 
                    }else if(parada==3){
                        kilometros = 25.1; 
                    }else if(parada==4){
                        kilometros = 93.8; 
                    }else if(parada==5){
                        kilometros = 5.0; 
                    }else if(parada==6){
                        kilometros = 91.1; 
                    }else if(parada==7){
                        kilometros = 60.0; 
                    }else if(parada==8){
                        kilometros = 98.5; 
                    }else if(parada==9){
                        kilometros = 25.1; 
                    }else if(parada==10){
                        kilometros = 90.6; 
                    }else if(parada==11){
                        kilometros = 84.8; 
                    }else if(parada==12){
                        kilometros = 22.9; 
                    }else if(parada==13){
                        kilometros = 85.5; 
                    }else if(parada==14){
                        kilometros = 73.4; 
                    }    
                }else if(cinicio==6){
                    if (parada == 1) {
                        kilometros = 24.1;
                    } else if (parada == 2) {
                        kilometros = 13.7;
                    } else if (parada == 3) {
                        kilometros = 71.9;
                    } else if (parada == 4) {
                        kilometros = 67.9;
                    } else if (parada == 5) {
                        kilometros = 91.1;
                    } else if (parada == 6) {
                        kilometros = 5.0;
                    } else if (parada == 7) {
                        kilometros = 33.9;
                    } else if (parada == 8) {
                        kilometros = 87.2;
                    } else if (parada == 9) {
                        kilometros = 88.1;
                    } else if (parada == 10) {
                        kilometros = 64.7;
                    } else if (parada == 11) {
                        kilometros = 49.1;
                    } else if (parada == 12) {
                        kilometros = 110.0;
                    } else if (parada == 13) {
                        kilometros = 76.9;
                    } else if (parada == 14) {
                        kilometros = 22.6;
                    }   
                }else if(cinicio==7){
                    if (parada == 1) {
                        kilometros = 35.0;
                    } else if (parada == 2) {
                        kilometros = 19.0;
                    } else if (parada == 3) {
                        kilometros = 40.8;
                    } else if (parada == 4) {
                        kilometros = 34.0;
                    } else if (parada == 5) {
                        kilometros = 60.0;
                    } else if (parada == 6) {
                        kilometros = 34.0;
                    } else if (parada == 7) {
                        kilometros = 5.0;
                    } else if (parada == 8) {
                        kilometros = 53.3;
                    } else if (parada == 9) {
                        kilometros = 56.9;
                    } else if (parada == 10) {
                        kilometros = 30.8;
                    } else if (parada == 11) {
                        kilometros = 60.0;
                    } else if (parada == 12) {
                        kilometros = 78.7;
                    } else if (parada == 13) {
                        kilometros = 43.0;
                    } else if (parada == 14) {
                        kilometros = 33.5;
                    }
                }else if(cinicio==8){
                    if (parada == 1) {
                        kilometros = 88.0;
                    } else if (parada == 2) {
                        kilometros = 72.0;
                    } else if (parada == 3) {
                        kilometros = 93.6;
                    } else if (parada == 4) {
                        kilometros = 35.8;
                    } else if (parada == 5) {
                        kilometros = 98.4;
                    } else if (parada == 6) {
                        kilometros = 87.0;
                    } else if (parada == 7) {
                        kilometros = 53.0;
                    } else if (parada == 8) {
                        kilometros = 5.0;
                    } else if (parada == 9) {
                        kilometros = 110.0;
                    } else if (parada == 10) {
                        kilometros = 32.9;
                    } else if (parada == 11) {
                        kilometros = 113.0;
                    } else if (parada == 12) {
                        kilometros = 96.6;
                    } else if (parada == 13) {
                        kilometros = 44.7;
                    } else if (parada == 14) {
                        kilometros = 86.5;
                    }
                }else if(cinicio==9){
                    if (parada == 1) {
                        kilometros = 55.7;
                    } else if (parada == 2) {
                        kilometros = 73.1;
                    } else if (parada == 3) {
                        kilometros = 16.3;
                    } else if (parada == 4) {
                        kilometros = 90.8;
                    } else if (parada == 5) {
                        kilometros = 25.1;
                    } else if (parada == 6) {
                        kilometros = 88.1;
                    } else if (parada == 7) {
                        kilometros = 57.0;
                    } else if (parada == 8) {
                        kilometros = 110.0;
                    } else if (parada == 9) {
                        kilometros = 5.0;
                    } else if (parada == 10) {
                        kilometros = 87.6;
                    } else if (parada == 11) {
                        kilometros = 81.7;
                    } else if (parada == 12) {
                        kilometros = 53.6;
                    } else if (parada == 13) {
                        kilometros = 99.8;
                    } else if (parada == 14) {
                        kilometros = 70.4;
                    }
                }else if(cinicio==10){
                    if (parada == 1) {
                        kilometros = 65.7;
                    } else if (parada == 2) {
                        kilometros = 49.8;
                    } else if (parada == 3) {
                        kilometros = 71.3;
                    } else if (parada == 4) {
                        kilometros = 2.4;
                    } else if (parada == 5) {
                        kilometros = 90.5;
                    } else if (parada == 6) {
                        kilometros = 64.8;
                    } else if (parada == 7) {
                        kilometros = 30.7;
                    } else if (parada == 8) {
                        kilometros = 33.0;
                    } else if (parada == 9) {
                        kilometros = 87.5;
                    } else if (parada == 10) {
                        kilometros = 5.0;
                    } else if (parada == 11) {
                        kilometros = 90.7;
                    } else if (parada == 12) {
                        kilometros = 95.8;
                    } else if (parada == 13) {
                        kilometros = 14.3;
                    } else if (parada == 14) {
                        kilometros = 64.2;
                    }
                }else if(cinicio==11){
                    if (parada == 1) {
                        kilometros = 26.2;
                    } else if (parada == 2) {
                        kilometros = 64.6;
                    } else if (parada == 3) {
                        kilometros = 65.5;
                    } else if (parada == 4) {
                        kilometros = 93.7;
                    } else if (parada == 5) {
                        kilometros = 84.5;
                    } else if (parada == 6) {
                        kilometros = 48.9;
                    } else if (parada == 7) {
                        kilometros = 59.7;
                    } else if (parada == 8) {
                        kilometros = 113.0;
                    } else if (parada == 9) {
                        kilometros = 81.5;
                    } else if (parada == 10) {
                        kilometros = 90.5;
                    } else if (parada == 11) {
                        kilometros = 5.0;
                    } else if (parada == 12) {
                        kilometros = 103.0;
                    } else if (parada == 13) {
                        kilometros = 103.0;
                    } else if (parada == 14) {
                        kilometros = 34.3;
                    }
                }else if(cinicio==12){
                    if (parada == 1) {
                        kilometros = 77.4;
                    } else if (parada == 2) {
                        kilometros = 94.7;
                    } else if (parada == 3) {
                        kilometros = 52.4;
                    } else if (parada == 4) {
                        kilometros = 91.9;
                    } else if (parada == 5) {
                        kilometros = 22.8;
                    } else if (parada == 6) {
                        kilometros = 110.0;
                    } else if (parada == 7) {
                        kilometros = 78.7;
                    } else if (parada == 8) {
                        kilometros = 96.2;
                    } else if (parada == 9) {
                        kilometros = 57.9;
                    } else if (parada == 10) {
                        kilometros = 93.8;
                    } else if (parada == 11) {
                        kilometros = 103.0;
                    } else if (parada == 12) {
                        kilometros = 5.0;
                    } else if (parada == 13) {
                        kilometros = 83.2;
                    } else if (parada == 14) {
                        kilometros = 109.0;
                    }
                }else if(cinicio==13){
                    if (parada == 1) {
                        kilometros = 76.7;
                    } else if (parada == 2) {
                        kilometros = 60.8;
                    } else if (parada == 3) {
                        kilometros = 82.6;
                    } else if (parada == 4) {
                        kilometros = 10.3;
                    } else if (parada == 5) {
                        kilometros = 85.4;
                    } else if (parada == 6) {
                        kilometros = 75.8;
                    } else if (parada == 7) {
                        kilometros = 41.7;
                    } else if (parada == 8) {
                        kilometros = 43.6;
                    } else if (parada == 9) {
                        kilometros = 98.5;
                    } else if (parada == 10) {
                        kilometros = 12.3;
                    } else if (parada == 11) {
                        kilometros = 102.0;
                    } else if (parada == 12) {
                        kilometros = 83.5;
                    } else if (parada == 13) {
                        kilometros = 5.0;
                    } else if (parada == 14) {
                        kilometros = 75.2;
                    }
                }else if(cinicio==14){
                    if (parada == 1) {
                        kilometros = 15.3;
                    } else if (parada == 2) {
                        kilometros = 38.3;
                    } else if (parada == 3) {
                        kilometros = 71.4;
                    } else if (parada == 4) {
                        kilometros = 67.4;
                    } else if (parada == 5) {
                        kilometros = 73.5;
                    } else if (parada == 6) {
                        kilometros = 22.6;
                    } else if (parada == 7) {
                        kilometros = 33.4;
                    } else if (parada == 8) {
                        kilometros = 86.6;
                    } else if (parada == 9) {
                        kilometros = 70.5;
                    } else if (parada == 10) {
                        kilometros = 64.2;
                    } else if (parada == 11) {
                        kilometros = 34.5;
                    } else if (parada == 12) {
                        kilometros = 109.0;
                    } else if (parada == 13) {
                        kilometros = 76.4;
                    } else if (parada == 14) {
                        kilometros = 5.0;
                    }
                }

                nkilometros = nkilometros + kilometros; 
                cinicio = cfin;
            }

            double gasto = nkilometros * preciog; 

            System.out.println("Los kilometros recorridos son: "+nkilometros);
            System.out.println("El gasto en gasolina de este recorrido sera aproximadamente de: "+gasto);
        }else{
            System.out.print("Ingrese un dato correcto, intentelo nuevamente ");
        }

    }
}