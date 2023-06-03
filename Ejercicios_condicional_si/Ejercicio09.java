import java.util.Scanner;

public class Ejercicio09{
	public static void main(String[] args) {
		
		// Variable de entrada
		Scanner entrada = new Scanner(System.in);

		System.out.print(" => Ingrese una fecha (ddmmaaaa): ");
		int numero = entrada.nextInt();

		if(numero>=01010001 && numero<=31123000){

			int dia = (numero/1000000);
			int mes = (numero/10000)%100;
            int year = (numero%10000);
			int a1 = (numero%10000)/1000; 
            int a2 = (numero%10000)/100%10;
            int a3 = (numero%10000)/10%10; 
            int a4 = (numero%10000)%10; 


            if((year%4==0 && year%100!=0 || year%400==0) && (mes==02 && dia>29)){

                System.out.print("DATO INOCRECTO, ANIO BISIESTO FEBRERO TIENE 29 DIAS ");
            }    
            else if(mes==2 && dia>28){
                    System.out.print("DATO INCORRECTO, FEBRESO TIENE 28 DIAS ");
            } 
            else{
                //dia=01
                if(dia==01){
                    System.out.print("PRIMERO DE ");
                } 
                //dia=02
                else if(dia==02){
                    System.out.print("DOS DE ");
                } 
                //dia=03 
                else if(dia==03){
                    System.out.print("TRES DE ");
                } 
                 //dia=04
                else if(dia==04){
                    System.out.print("CUATRO DE ");
                } 
                //dia=05
                else if(dia==05){
                    System.out.print("CINCO DE ");
                } 
                //dia=06
                else if(dia==06){
                    System.out.print("SEIS DE ");
                } 
                //dia=07
                else if(dia==07){
                    System.out.print("SIETE DE ");
                } 
                //dia=08
                else if(dia==8){
                    System.out.print("OCHO DE ");
                } 
                //dia=09
                else if(dia==9){
                    System.out.print("NUEVE DE ");
                }
                //dia=10 
                else if(dia==10){
                    System.out.print("DIEZ DE ");
                }
                //dia=11 
                else if(dia==11){
                    System.out.print("ONCE DE ");
                } 
                //dia=12 
                else if(dia==12){
                    System.out.print("DOCE DE ");
                } 
                //dia=13 
                else if(dia==13){
                    System.out.print("TRECE DE ");
                } 
                //dia=14
                else if(dia==14){
                    System.out.print("CATORCE DE ");
                } 
                //dia=15
                else if(dia==15){
                    System.out.print("QUINCE DE ");
                } 
                //dia=16 
                else if(dia==16){
                    System.out.print("DIECISEIS DE ");
                } 
                //dia=17 
                else if(dia==17){
                    System.out.print("DIECISIETE DE ");
                } 
                //dia=18
                else if(dia==18){
                    System.out.print("DIECIOCHO DE ");
                } 
                //dia=19
                else if(dia==19){
                    System.out.print("DIECINUEVE DE ");
                } 
                //dia=20 
                else if(dia==20){
                    System.out.print("VEINTE DE ");
                } 
                //dia=21
                else if(dia==21){
                    System.out.print("VEINTIUNO DE ");
                } 
                //dia=22 
                else if(dia==22){
                    System.out.print("VEINTIDOS DE ");
                } 
                //dia=23 
                else if(dia==23){
                    System.out.print("VEINTITRES DE ");
                } 
                //dia=24 
                else if(dia==24){
                    System.out.print("VEINTICUATRO DE ");
                } 
                //dia=25
                else if(dia==25){
                    System.out.print("VEINTICINCO DE ");
                } 
                //dia=26
                else if(dia==26){
                    System.out.print("VEINTISEIS DE ");
                } 
                //dia=27
                else if(dia==27){
                    System.out.print("VEINTISIETE DE ");
                } 
                //dia=28
                else if(dia==28){
                    System.out.print("VEINTIOCHO DE ");
                } 
                //dia=29
                else if(dia==29){
                    System.out.print("VEINTINUEVE DE ");
                } 
                //dia=30
                else if(dia==30){
                    System.out.print("TREINTA DE ");
                } 
                //dia=31
                else if(dia==31){
                    System.out.print("TREINTA Y UNO DE ");
                }  

             
                //mes=01 
                if(mes==01){ 
                    System.out.print("ENERO DEL ");
                } 
                //mes=02 
                else if(mes==02){  
                    System.out.print("FEBRERO DEL ");
                } 
                //mes=03 
                else if(mes==03){
                    System.out.print("MARZO DEL ");
                } 
                //mes=04 
                else if(mes==04){
                    System.out.print("ABRIL DEL ");
                } 
                //mes=05 
                else if(mes==05){
                    System.out.print("MAYO DEL ");
                } 
                //mes=06
                else if(mes==06){
                    System.out.print("JUNIO DEL ");
                } 
                //mes=07 
                else if(mes==07){
                    System.out.print("JULIO DEL ");
                } 
                //mes=08
                else if(mes==8){
                    System.out.print("AGOSTO DEL ");
                } 
                //mes=09 
                else if(mes==9){
                    System.out.print("SEPTIEMBRE DEL ");
                } 
                //mes=10 
                else if(mes==10){
                    System.out.print("OCTUBRE DEL ");
                } 
                //mes=11 
                else if(mes==11){
                    System.out.print("NOVIEMBRE DEL ");
                } 
                //mes=12 
                else if(mes==12){
                    System.out.print("DICIEMBRE DEL ");
                }  


                //a1=0 
                if(a1==0){
                    System.out.print("");
                }
                //a1=1
                else if(a1==1){
                    System.out.print("MIL ");
                }
                //a1=2 
                else if(a1==2){
                    System.out.print("DOS MIL ");
                }
                //a1=3
                else if(a1==3){
                    System.out.print("TRES MIL ");
                } 

                 //a2=0 
                else if(a2==0){
                    System.out.print("");
                }
                //a2=1
                else if(a2==0){
                    if(a3==0 && a4==0){
                        System.out.print("CIEN ");
                    }
                    else{
                        System.out.print("CIENTO ");
                    }
                }
                //a2=2
                if(a2==2){
                    System.out.print("DOSCIENTOS ");
                } 
                //a2=3 
                if(a2==3){
                    System.out.print("TRESCIENTOS ");
                } 
                //a2=4 
                if(a2==4){
                    System.out.print("CUATROCIENTOS ");
                } 
                //a2=5
                if(a2==5){
                    System.out.print("QUINIENTOS ");
                } 
                //a2=6
                if(a2==6){
                    System.out.print("SEISCIENTOS ");
                } 
                //a2=7 
                if(a2==7){
                    System.out.print("SETECIENTOS ");
                } 
                //a2=8
                if(a2==8){
                    System.out.print("OCHOCIENTOS ");
                } 
                //a2=9 
                if(a2==9){
                    System.out.print("NOVECIENTOS ");
                } 


                //a3=0 
                if(a3==0){
                    System.out.print("");
                }
                //a3=1 
                else if(a3==1){
                    if(a4==0){
                        System.out.print("DIEZ");
                    } 
                    else if(a4==1){
                        System.out.print("ONCE");
                    }
                    else if(a4==2){
                        System.out.print("DOCE");
                    }
                    else if(a4==3){
                        System.out.print("TRECE");
                    }
                    else if(a4==4){
                        System.out.print("CATORCE");
                    }
                    else if(a4==5){
                        System.out.print("QUINCE");
                    }
                    else if(a4==6){
                        System.out.print("DIECISEIES");
                    } 
                    else if(a4==7){
                        System.out.print("DIECISIETE");
                    }
                    else if(a4==8){
                        System.out.print("DIECIOCHO");
                    }
                    else if(a4==9){
                        System.out.print("DIECINUEVE");
                    } 
                } 

                //a3=2
                else if(a3==2){
                    if(a4==0){
                        System.out.print("VEINTE");
    } 
                    else if(a4==1){
                        System.out.print("VENTIUNO");
                    }
                    else if(a4==2){
                        System.out.print("VENTIDOS");
                    }
                    else if(a4==3){
                        System.out.print("VENTITRES");
                    }
                    else if(a4==4){
                        System.out.print("VENTICUATRO");
                    }
                    else if(a4==5){
                        System.out.print("VENTICINCO");
                    }
                    else if(a4==6){
                        System.out.print("VENTISEIS");
                    }
                    else if(a4==7){
                        System.out.print("VENTISIETE");
                    }
                    else if(a4==8){
                        System.out.print("VENTIOCHO");
                    }
                    else if(a4==9){
                        System.out.print("VENTINUEVE");
                    } 
                }  
                //a3=3 
                else if(a3==3){
                    if(a4==0){
                        System.out.print("TREINTA");
                    }
                    else if(a4==1){
                        System.out.print("TREINTA Y UN0");
                    }
                    else if(a4==2){
                        System.out.print("TREINTA Y DOS");
                    }
                    else if(a4==3){
                        System.out.print("TREINTA Y TRES");
                    }
                    else if(a4==4){
                        System.out.print("TREINTA Y CUATRO");
                    }
                else if(a4==5){
                        System.out.print("TREINTA Y CINCO");
                    }
                    else if(a4==6){
                        System.out.print("TREINTA Y SEIS");
                    }
                    else if(a4==7){
                        System.out.print("TREINTA Y SIETE");
                    }
                    else if(a4==8){
                        System.out.print("TREINTA Y OCHO");
                    }
                    else if(a4==9){
                        System.out.print("TREINTA Y NUEVE");
                    }
                }


                //a3=4 
                else if(a3==4){
                    if(a4==0){
                        System.out.print("CUARENTA");
                    }
                    else if(a4==1){
                        System.out.print("CUARENTA Y UN");
                    }
                    else if(a4==2){
                        System.out.print("CUARENTA Y DOS");
                    }
                    else if(a4==3){
                        System.out.print("CUARENTA Y TRES");
                    }
                    else if(a4==4){
                        System.out.print("CUARENTA Y CUATRO");
                    }
                    else if(a4==5){
                        System.out.print("CUARENTA Y CINCO");
                    }
                    else if(a4==6){
                        System.out.print("CUARENTA Y SEIS");
                    }
                    else if(a4==7){
                        System.out.print("CUARENTA Y SIETE");
                    }
                else if(a4==8){
                        System.out.print("CUARENTA Y OCHO");
                    }
                    else if(a4==9){
                        System.out.print("CUARENTA Y NUEVE");
                    }
                } 
                //a3=5 
                else if(a3==5){
                    if(a4==0){
                        System.out.print("CINCUENTA");
                    }
                    else if(a4==1){
                        System.out.print("CINCUENTA Y UN");
                    }
                    else if(a4==2){
                        System.out.print("CINCUENTA Y DOS");
                    }
                    else if(a4==3){
                        System.out.print("CINCUENTA Y TRES");
                    }
                    else if(a4==4){
                        System.out.print("CINCUENTA Y CUATRO");
                    }
                    else if(a4==5){
                        System.out.print("CINCUENTA Y CINCO");
                    }
                    else if(a4==6){
                        System.out.print("CINCUENTA Y SEIS");
                    }
                    else if(a4==7){
                        System.out.print("CINCUENTA Y SIETE");
                    }
                    else if(a4==8){
                        System.out.print("CINCUENTA Y OCHO");
                    }
                    else if(a4==9){
                        System.out.print("CINCUENTA Y NUEVE");
                    }
                }  

                 //a3=6 
                else if(a3==6){
                    if(a4==0){
                        System.out.print("SESENTA");
                    }
                    else if(a4==1){
                        System.out.print("SESENTA Y UN0");
                    }
                    else if(a4==2){
                        System.out.print("SESENTA Y DOS");
                    }
                    else if(a4==3){
                        System.out.print("SESENTA Y TRES");
                    }
                    else if(a4==4){
                        System.out.print("SESENTA Y CUATRO");
                    }
                    else if(a4==5){
                        System.out.print("SESENTA Y CINCO");
                    }
                    else if(a4==6){
                        System.out.print("SESENTA Y SEIS");
                    }
                    else if(a4==7){
                        System.out.print("SESENTA Y SIETE");
                    }
                    else if(a4==8){
                        System.out.print("SESENTA Y OCHO");
                    }
                    else if(a4==9){
                        System.out.print("SESENTA Y NUEVE");
                    }
                } 
                //a3=7 
                else if(a3==7){
                    if(a4==0){
                        System.out.print("SETENTA");
                    }
                    else if(a4==1){
                        System.out.print("SETENTA Y UN");
                    }
                    else if(a4==2){
                        System.out.print("SETENTA Y DOS");
                    }
                    else if(a4==3){
                        System.out.print("SETENTA Y TRES");
                    }
                    else if(a4==4){
                        System.out.print("SETENTA Y CUATRO");
                    }
                    else if(a4==5){
                        System.out.print("SETENTA Y CINCO");
                    }
                    else if(a4==6){
                        System.out.print("SETENTA Y SEIS");
                    }
                    else if(a4==7){
                        System.out.print("SETENTA Y SIETE");
                    }
                    else if(a4==8){
                        System.out.print("SETENTA Y OCHO");
                    }
                    else if(a4==9){
                        System.out.print("SETENTA Y NUEVE");
                    }
                } 

                //a3=8 
                else if(a3==8){
                    if(a4==0){
                        System.out.print("OCHENTA");
                    }
                    else if(a4==1){
                        System.out.print("OCHENTA Y UN");
                    }
                    else if(a4==2){
                        System.out.print("OCHENTA Y DOS");
                    }
                    else if(a4==3){
                        System.out.print("OCHENTA Y TRES");
                    }
                    else if(a4==4){
                        System.out.print("OCHENTA Y CUATRO");
                    }
                    else if(a4==5){
                        System.out.print("OCHENTA Y CINCO");
                    }
                    else if(a4==6){
                        System.out.print("OCHENTA Y SEIS");
                    }
                    else if(a4==7){
                        System.out.print("OCHENTA Y SIETE");
                    }
                    else if(a4==8){
                        System.out.print("OCHENTA Y OCHO");
                    }
                    else if(a4==9){
                        System.out.print("OCHENTA Y NUEVE");
                    }
                } 
                //a3=9 
                else if(a3==9){
                    if(a4==0){
                        System.out.print("NOVENTA");
                    }
                    else if(a4==1){
                        System.out.print("NOVENTA Y UN");
                    }
                    else if(a4==2){
                        System.out.print("NOVENTA Y DOS");
                    }
                    else if(a4==3){
                        System.out.print("NOVENTA Y TRES");
                    }
                    else if(a4==4){
                        System.out.print("NOVENTA Y CUATRO");
                    }
                    else if(a4==5){
                        System.out.print("NOVENTA Y CINCO");
                    }
                    else if(a4==6){
                        System.out.print("NOVENTA Y SEIS");
                    }
                    else if(a4==7){
                        System.out.print("NOVENTA Y SIETE");
                    }
                    else if(a4==8){
                        System.out.print("NOVENTA Y OCHO");
                    }
                    else if(a4==9){
                        System.out.print("NOVENTA Y NUEVE");
                    }
                }  

                  //a4=0 
                if(a4==0){
                System.out.print(""); 
                } 
                else if(a4==1){
                    if(a2==0 && a3==0 || a3==0){
                        System.out.print("UNO");
                    } 
                    else{
                        System.out.print("");
                    }
                } 
                //a4=2
                else if(a4==2){
                    if(a2==0 && a3==0 || a3==0){
                        System.out.print("DOS");
                    } 
                    else{
                        System.out.print("");
                    }
                } 
                //a4=3
                else if(a4==3){
                    if(a2==0 && a3==0 || a3==0){
                        System.out.print("TRES");
                    } 
                    else{
                        System.out.print("");
                    }
                } 
                //a4=4
                else if(a4==4){
                    if(a2==0 && a3==0 || a3==0){
                        System.out.print("CUATRO");
                    } 
                    else{
                        System.out.print("");
                    }
                } 

                //a4=5 
                else if(a4==5){
                    if(a2==0 && a3==0 || a3==0){
                        System.out.print("CINCO");
                    } 
                    else{
                        System.out.print("");
                    }
                } 
                //a4=6 
                else if(a4==6){
                    if(a2==0 && a3==0 || a3==0){
                        System.out.print("SEIS");
                    } 
                    else{
                        System.out.print("");
                    }
                } 
                //a4=7 
                else if(a4==7){
                    if(a2==0 && a3==0 || a3==0){
                        System.out.print("SIETE");
                    } 
                    else{
                        System.out.print("");
                    }
                } 
                //a4=8 
                else if(a4==8){
                    if(a2==0 && a3==0 || a3==0){
                        System.out.print("OCHO");
                    } 
                    else{
                        System.out.print("");
                    }
                } 
                //a4=9 
                else if(a4==9){
                    if(a2==0 && a3==0 || a3==0){
                        System.out.print("NUEVE");
                    } 
                    else{
                        System.out.print("");
                    }
                } 
            }  
        }  
        else{
            System.out.print("PARA ESE ANIO LA HUMANIDAD YA SE EXTINGUIO");
        }

    } 
}
            
