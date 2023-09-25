import java.util.Scanner;

public class Ejercicio08{
	public static void main(String[] args) {
		
		// Variable de entrada
		Scanner entrada = new Scanner(System.in);

		System.out.print(" => Ingrese un numero (maximo 9 digitos): ");
		int numero = entrada.nextInt();

		if(numero>=0 && numero<=999999999l){

			int d1 = (numero/100000000);
			int d2 = (numero/10000000)%10;
			int d3 = (numero/1000000)%10;
			int d4 = (numero/100000)%10;
			int d5 = (numero/10000)%10; 
            int d6 = (numero/1000)%10; 
            int d7 = (numero/100)%10; 
            int d8 = (numero/10)%10; 
            int d9 = (numero/1)%10;

            //d1=0
			if(d1==0){
                System.out.print("");
            } 
            //d1=1
            else if(d1==1){
                if(d2==0 && d3==0){
                    System.out.print("CIEN MILLONES ");
                }else{
                    System.out.print("CIENTO ");
                }
            } 
            // d1=2 
            else if(d1==2){
                if(d2==0 && d3==0){
                    System.out.print("DOSCIENTOS MILLONES ");
                } 
                else{
                    System.out.print("DOSCIENTOS ");
                }
            } 
            // d1=3 
            else if(d1==3){
                if(d2==0 && d3==3){
                    System.out.print("TRESCIENTOS MILLONES ");
                }
                else{
                    System.out.print("TRESCIENTOS ");
                }
            } 
            //d1=4
            else if(d1==4){
                if(d2==0 && d3==0){
                    System.out.print("CUATROCIENTOS MILLONES ");
                }
                else{
                    System.out.print("CUATROCIENTOS ");
                }
            } 
            //d1=5 
            else if(d1==5){
                if(d2==0 && d3==0){
                    System.out.print("QUINIENTOS MILLONES ");
                }
                else{
                    System.out.print("QUINIENTOS ");
                }
            }
            //d1=6
            else if(d1==6){
                if(d2==0 && d3==0){
                    System.out.print("SEISCIENTOS MILLONES ");
                }
                else{
                    System.out.print("SEISCIENTOS ");
                }
            } 
            //d1=7 
            else if(d1==7){
                if(d2==0 && d3==0){
                    System.out.print("SETECIENTOS MILLONES ");
                } 
                else{
                    System.out.print("SETECIENTOS ");
                }
            } 
            //d1=8 
            else if(d1==8){
                if(d2==0 && d3==0){
                    System.out.print("OCHOCIENTOS MILLONES ");
                }
                else{
                    System.out.print("OCHOCIENTOS ");
                }
            }
            //d1=9 
            else if(d1==9){
                if(d2==0 && d3==0){
                    System.out.print("NOVECIENTOS MILLONES ");
                }
                else{
                    System.out.print("NOVECIENTOS ");
                }
            } 


            //d2=0 
            if(d2==0){
                System.out.print("");
            }
            //d2=1 
            else if(d2==1){
                if(d3==0){
                    System.out.print("DIEZ MILLONES");
                } 
                else if(d3==1){
                    System.out.print("ONCE MILLONES");
                }
                else if(d3==2){
                    System.out.print("DOCE MILLONES");
                }
                else if(d3==3){
                    System.out.print("TRECE MILLONES");
                }
                else if(d3==4){
                    System.out.print("CATORCE MILLONES");
                }
                else if(d3==5){
                    System.out.print("QUINCE MILLONES");
                }
                else if(d3==6){
                    System.out.print("DIECISEIES MILLONES");
                } 
                 else if(d3==7){
                    System.out.print("DIECISIETE MILLONES");
                }
                 else if(d3==8){
                    System.out.print("DIECIOCHO MILLONES");
                }
                 else if(d3==9){
                    System.out.print("DIECINUEVE MILLONES");
                } 
            } 
            //d2=2 
            else if(d2==2){
                if(d3==0){
                    System.out.print("VEINTE MILLONES");
                } 
                else if(d3==1){
                    System.out.print("VENTIUN MILLONES");
                }
                else if(d3==2){
                    System.out.print("VENTIDOS MILLONES");
                }
                else if(d3==3){
                    System.out.print("VENTITRES MILLONES");
                }
                else if(d3==4){
                    System.out.print("VENTICUATRO MILLONES");
                }
                else if(d3==5){
                    System.out.print("VENTICINCO MILLONES");
                }
                else if(d3==6){
                    System.out.print("VENTISEIS MILLONES");
                }
                else if(d3==7){
                    System.out.print("VENTISIETE MILLONES");
                }
                else if(d3==8){
                    System.out.print("VENTIOCHO MILLONES");
                }
                else if(d3==9){
                    System.out.print("VENTINUEVE MILLONES");
                }
            } 
            //d2=3 
            else if(d2==3){
                if(d3==0){
                    System.out.print("TREINTA MILLONES");
                }
                else if(d3==1){
                    System.out.print("TREINTA Y UN MILLONES");
                }
                else if(d3==2){
                    System.out.print("TREINTA Y DOS MILLONES");
                }
                else if(d3==3){
                    System.out.print("TREINTA Y TRES MILLONES");
                }
                else if(d3==4){
                    System.out.print("TREINTA Y CUATRO MILLONES");
                }
                else if(d3==5){
                    System.out.print("TREINTA Y CINCO MILLONES");
                }
                else if(d3==6){
                    System.out.print("TREINTA Y SEIS MILLONES");
                }
                else if(d3==7){
                    System.out.print("TREINTA Y SIETE MILLONES");
                }
                else if(d3==8){
                    System.out.print("TREINTA Y OCHO MILLONES");
                }
                else if(d3==9){
                    System.out.print("TREINTA Y NUEVE MILLONES");
                }
            } 
            //d2=4 
            else if(d2==4){
                if(d3==0){
                    System.out.print("CUARENTA MILLONES");
                }
                else if(d3==1){
                    System.out.print("CUARENTA Y UN MILLONES");
                }
                else if(d3==2){
                    System.out.print("CUARENTA Y DOS MILLONES");
                }
                else if(d3==3){
                    System.out.print("CUARENTA Y TRES MILLONES");
                }
                else if(d3==4){
                    System.out.print("CUARENTA Y CUATRO MILLONES");
                }
                else if(d3==5){
                    System.out.print("CUARENTA Y CINCO MILLONES");
                }
                else if(d3==6){
                    System.out.print("CUARENTA Y SEIS MILLONES");
                }
                else if(d3==7){
                    System.out.print("CUARENTA Y SIETE MILLONES");
                }
                else if(d3==8){
                    System.out.print("CUARENTA Y OCHO MILLONES");
                }
                else if(d3==9){
                    System.out.print("CUARENTA Y NUEVE MILLONES");
                } 
               
            }
            //d2=5 
            else if(d2==5){
                if(d3==0){
                    System.out.print("CINCUENTA MILLONES");
                } 
                else if(d3==1){
                    System.out.print("CINCUENTA Y UN MILLONES");
                }
                else if(d3==2){
                    System.out.print("CINCUENTA Y DOS MILLONES");
                }
                else if(d3==3){
                    System.out.print("CINCUENTA Y TRES MILLONES");
                }
                else if(d3==4){
                    System.out.print("CINCUENTA Y CUATRO MILLONES");
                }
                else if(d3==5){
                    System.out.print("CINCUENTA Y CINCO MILLONES");
                }
                else if(d3==6){
                    System.out.print("CINCUENTA Y SEIS MILLONES");
                }
                else if(d3==7){
                    System.out.print("CINCUENTA Y SIETE MILLONES");
                }
                else if(d3==8){
                    System.out.print("CINCUENTA Y OCHO MILLONES");
                }
                else if(d3==9){
                    System.out.print("CINCUENTA Y NUEVE MILLONES");
                } 

            }
            //d2=6
            else if(d2==6){
                if(d3==0){
                    System.out.print("SESENTA MILLONES");
                } 
                else if(d3==1){
                    System.out.print("SESENTA Y UN MILLONES");
                } 
                else if(d3==2){
                    System.out.print("SESENTA Y DOS MILLONES");
                }
                else if(d3==3){
                    System.out.print("SESENTA Y TRES MILLONES");
                }
                else if(d3==4){
                    System.out.print("SESENTA Y CUATRO MILLONES");
                }
                else if(d3==5){
                    System.out.print("SESENTA Y CINCO MILLONES");
                }
                else if(d3==6){ 
                    System.out.print("SESENTA Y SEIS MILLONES");
                }
                else if(d3==7){
                    System.out.print("SESENTA Y SIETE MILLONES");
                }
                else if(d3==8){
                    System.out.print("SESENTA Y OCHO MILLONES");
                }
                else if(d3==9){
                    System.out.print("SESENTA Y NUEVE MILLONES");
                }
            } 
            //d2=7 
            else if(d2==7){
                if(d3==0){
                    System.out.print("SETENTA MILLONES");
                }
                else if(d3==1){
                    System.out.print("SETENTA Y UN MILLONES");
                }
                else if(d3==2){
                    System.out.print("SETENTA Y DOS MILLONES");
                }
                else if(d3==3){
                    System.out.print("SETENTA Y TRES MILLONES");
                }
                else if(d3==4){
                    System.out.print("SETENTA Y CUATRO MILLONES");
                }
                else if(d3==5){
                    System.out.print("SETENTA Y CINCO MILLONES");
                }
                else if(d3==6){
                    System.out.print("SETENTA Y SEIS MILLONES");
                }
                else if(d3==7){
                    System.out.print("SETENTA Y SIETE MILLONES");
                }
                else if(d3==8){
                    System.out.print("SETENTA Y OCHO MILLONES");
                }
                else if(d3==9){
                    System.out.print("SETENTA Y NUEVE MILLONES");
                }
            } 
            //d2=8
            else if(d2==8){
                if(d3==0){
                    System.out.print("OCHENTA MILLONES");
                }
                else if(d3==1){
                    System.out.print("OCHENTA Y UN MILLONES");
                }
                else if(d3==2){
                    System.out.print("OCHENTA Y DOS MILLONES");
                }
                else if(d3==3){
                    System.out.print("OCHENTA Y TRES MILLONES");
                }
                else if(d3==4){
                    System.out.print("OCHENTA Y CUATRO MILLONES");
                }
                else if(d3==5){
                    System.out.print("OCHENTA Y CINCO MILLONES");
                }
                else if(d3==6){
                    System.out.print("OCHENTA Y SEIS MILLONES");
                }
                else if(d3==7){
                    System.out.print("OCHENTA Y SIETE MILLONES");
                }
                else if(d3==8){
                    System.out.print("OCHENTA Y OCHO MILLONES");
                }
                else if(d3==9){
                    System.out.print("OCHENTA Y NUEVE MILLONES");
                }
            } 
            //d2=9
            else if(d2==9){
                if(d3==0){
                    System.out.print("NOVENTA MILLONES");
                }
                else if(d3==1){
                    System.out.print("NOVENTA Y UN MILLONES");
                }
                else if(d3==2){
                    System.out.print("NOVENTA Y DOS MILLONES");
                } 
                else if(d3==3){
                    System.out.print("NOVENTA Y TRES MILLONES");
                }
                else if(d3==4){
                    System.out.print("NOVENTA Y CUATRO MILLONES");
                }
                else if(d3==5){
                    System.out.print("NOVENTA Y CINCO MILLONES");
                }
                else if(d3==6){
                    System.out.print("NOVENTA Y SEIS MILLONES");
                }
                else if(d3==7){
                    System.out.print("NOVENTA Y SIETE MILLONES");
                }
                else if(d3==8){
                    System.out.print("NOVENTA Y OCHO MILLONES");
                }
                else if(d3==9){
                    System.out.print("NOVENTA Y NUEVE MILLONES");
                }
            } 


            //d3=0 
            if(d3==0){
                System.out.print(""); 
            }  
            //d3=1
            else if(d3==1){
                if(d1==0 && d2==0 || d2==0){
                    System.out.print("UN MILLON");
                } 
                else{
                    System.out.print("");
                }
            } 
            //d3=2
            else if(d3==2){
                if(d1==0 && d2==0 || d2==0){
                    System.out.print("DOS MILLONES");
                } 
                else{
                    System.out.print("");
                }
            } 
            //d3=3 
            else if(d3==3){
                if(d1==0 && d2==0){
                    System.out.print("TRES MILLONES");
                }
                else{
                    System.out.print("");
                }
            } 
            //d3=4 
            else if(d3==4){
                if(d1==0 && d2==0){
                    System.out.print("CUATRO MILLONES");
                }
                else{
                    System.out.print("");
                }
            } 
            //d3=5 
            else if(d3==5){
                if(d1==0 && d2==0 || d2==0){
                    System.out.print("CINCO MILLONES");
                } 
                else{
                    System.out.print("");
                }
            } 
            //d3=6 
            else if(d3==6){
                if(d1==0 && d2==0){
                    System.out.print("SEIS MILLONES");
                } 
                else{
                    System.out.print("");
                }
            } 
            //d3=7 
            else if(d3==7){
                if(d1==0 && d2==0){
                    System.out.print("SIETE MILLONES");
                } 
                else{
                    System.out.print("");
                }
            } 
            //d3=8 
            else if(d3==8){
                if(d1==0 && d2==0 || d2==0){
                    System.out.print("OCHO MILLONES");
                } 
                else{
                    System.out.print("");
                }
            } 
            //d3=9 
            else if(d3==9){
                if(d1==0 && d2==0 || d2==0){
                    System.out.print("NUEVE MILLONES");
                } 
                else{
                    System.out.print("");
                }
            }  


            //d4=0 
            if(d4==0){
                System.out.print("");
            } 
            //d4=1
            else if(d4==1){
                if(d5==0 && d6==0){
                    System.out.print(" CIEN MIL ");
                }else{
                    System.out.print(" CIENTO ");
                }
            }  
            //d4=2 
            else if(d4==2){
                if(d5==0 && d6==0){
                    System.out.print(" DOSCIENTOS MIL ");
                }else{
                    System.out.print(" DOSCIENTOS ");
                }
            } 
            //d4=3 
            else if(d4==3){
                if(d5==0 && d6==0){
                    System.out.print(" TRECIENTOS MIL ");
                }else{
                    System.out.print(" TRECIENTOS ");
                }
            } 
            //d4=4 
            else if(d4==4){
                if(d5==0 && d6==0){
                    System.out.print(" CUATROCIENTOS MIL ");
                }else{
                    System.out.print(" CUATROCIENTOS ");
                }
            } 
            //d4=5 
            else if(d4==5){
                if(d5==0 && d6==0){
                    System.out.print(" QUINIENTOS MIL ");
                }else{
                    System.out.print(" QUINIENTOS ");
                }
            }
            //d4=6 
            else if(d4==6){
                if(d5==0 && d6==0){
                    System.out.print(" SEISCIENTOS MIL ");
                }else{
                    System.out.print(" SEISCIENTOS ");
                }
            }
            //d4=7 
            else if(d4==7){
                if(d5==0 && d6==0){
                    System.out.print(" SETECIENTOS MIL ");
                }else{
                    System.out.print(" SETECIENTOS ");
                }
            }
            //d4=8 
            else if(d4==8){
                if(d5==0 && d6==0){
                    System.out.print(" OCHOCIENTOS MIL ");
                }else{
                    System.out.print(" OCHOCIENTOS ");
                }
            }
            //d4=9 
            else if(d4==9){
                if(d5==0 && d6==0){
                    System.out.print(" NOVECIENTOS MIL ");
                }else{
                    System.out.print(" NOVECIENTOS ");
                }
            } 



            //d5=0 
            if(d5==0){
                System.out.print("");
            }
            //d5=1 
            else if(d5==1){
                if(d6==0){
                    System.out.print("DIEZ MIL  ");
                } 
                else if(d6==1){
                    System.out.print("ONCE MIL ");
                }
                else if(d6==2){
                    System.out.print("DOCE MIL ");
                }
                else if(d6==3){
                    System.out.print("TRECE MIL ");
                }
                else if(d6==4){
                    System.out.print("CATORCE MIL ");
                }
                else if(d6==5){
                    System.out.print("QUINCE MIL ");
                }
                else if(d6==6){
                    System.out.print("DIECISEIES MIL ");
                } 
                 else if(d6==7){
                    System.out.print("DIECISIETE MIL ");
                }
                 else if(d6==8){
                    System.out.print("DIECIOCHO MIL ");
                }
                 else if(d6==9){
                    System.out.print("DIECINUEVE MIL ");
                } 
            } 
            //d5=2 
            else if(d5==2){
                if(d6==0){
                    System.out.print("VEINTE MIL ");
                } 
                else if(d5==1){
                    System.out.print("VENTIUN MIL ");
                }
                else if(d5==2){
                    System.out.print("VENTIDOS MIL ");
                }
                else if(d5==3){
                    System.out.print("VENTITRES MIL ");
                }
                else if(d5==4){
                    System.out.print("VENTICUATRO MIL ");
                }
                else if(d5==5){
                    System.out.print("VENTICINCO MIL ");
                }
                else if(d5==6){
                    System.out.print("VENTISEIS MIL ");
                }
                else if(d5==7){
                    System.out.print("VENTISIETE MIL ");
                }
                else if(d5==8){
                    System.out.print("VENTIOCHO MIL ");
                }
                else if(d5==9){
                    System.out.print("VENTINUEVE MILLONES");
                }
            } 
            //d5=3 
            else if(d5==3){
                if(d6==0){
                    System.out.print("TREINTA MIL ");
                }
                else if(d6==1){
                    System.out.print("TREINTA Y UN MIL ");
                }
                else if(d6==2){
                    System.out.print("TREINTA Y DOS MIL ");
                }
                else if(d6==3){
                    System.out.print("TREINTA Y TRES MIL ");
                }
                else if(d6==4){
                    System.out.print("TREINTA Y CUATRO MIL ");
                }
                else if(d6==5){
                    System.out.print("TREINTA Y CINCO MIL ");
                }
                else if(d6==6){
                    System.out.print("TREINTA Y SEIS MIL ");
                }
                else if(d6==7){
                    System.out.print("TREINTA Y SIETE MIL ");
                }
                else if(d6==8){
                    System.out.print("TREINTA Y OCHO MIL ");
                }
                else if(d6==9){
                    System.out.print("TREINTA Y NUEVE MIL ");
                }
            } 
            //d5=4 
            else if(d5==4){
                if(d6==0){
                    System.out.print("CUARENTA MIL ");
                }
                else if(d6==1){
                    System.out.print("CUARENTA Y UN MIL ");
                }
                else if(d6==2){
                    System.out.print("CUARENTA Y DOS MIL ");
                }
                else if(d6==3){
                    System.out.print("CUARENTA Y TRES MIL ");
                }
                else if(d6==4){
                    System.out.print("CUARENTA Y CUATRO MIL ");
                }
                else if(d6==5){
                    System.out.print("CUARENTA Y CINCO MIL ");
                }
                else if(d6==6){
                    System.out.print("CUARENTA Y SEIS MIL ");
                }
                else if(d6==7){
                    System.out.print("CUARENTA Y SIETE MIL ");
                }
                else if(d6==8){
                    System.out.print("CUARENTA Y OCHO MIL ");
                }
                else if(d6==9){
                    System.out.print("CUARENTA Y NUEVE MIL ");
                }
            } 
            //d5=5 
            else if(d5==5){
                if(d6==0){
                    System.out.print("CINCUENTA MIL ");
                }
                else if(d6==1){
                    System.out.print("CINCUENTA Y UN MIL ");
                }
                else if(d6==2){
                    System.out.print("CINCUENTA Y DOS MIL ");
                }
                else if(d6==3){
                    System.out.print("CINCUENTA Y TRES MIL ");
                }
                else if(d6==4){
                    System.out.print("CINCUENTA Y CUATRO MIL ");
                }
                else if(d6==5){
                    System.out.print("CINCUENTA Y CINCO MIL ");
                }
                else if(d6==6){
                    System.out.print("CINCUENTA Y SEIS MIL ");
                }
                else if(d6==7){
                    System.out.print("CINCUENTA Y SIETE MIL ");
                }
                else if(d6==8){
                    System.out.print("CINCUENTA Y OCHO MIL ");
                }
                else if(d6==9){
                    System.out.print("CINCUENTA Y NUEVE MIL ");
                }
            }  
            //d5=6 
            else if(d5==6){
                if(d6==0){
                    System.out.print("SESENTA MIL ");
                }
                else if(d6==1){
                    System.out.print("SESENTA Y UN MIL ");
                }
                else if(d6==2){
                    System.out.print("SESENTA Y DOS MIL ");
                }
                else if(d6==3){
                    System.out.print("SESENTA Y TRES MIL ");
                }
                else if(d6==4){
                    System.out.print("SESENTA Y CUATRO MIL ");
                }
                else if(d6==5){
                    System.out.print("SESENTA Y CINCO MIL ");
                }
                else if(d6==6){
                    System.out.print("SESENTA Y SEIS MIL ");
                }
                else if(d6==7){
                    System.out.print("SESENTA Y SIETE MIL ");
                }
                else if(d6==8){
                    System.out.print("SESENTA Y OCHO MIL ");
                }
                else if(d6==9){
                    System.out.print("SESENTA Y NUEVE MIL ");
                }
            } 
            //d5=7 
            else if(d5==7){
                if(d6==0){
                    System.out.print("SETENTA MIL ");
                }
                else if(d6==1){
                    System.out.print("SETENTA Y UN MIL ");
                }
                else if(d6==2){
                    System.out.print("SETENTA Y DOS MIL ");
                }
                else if(d6==3){
                    System.out.print("SETENTA Y TRES MIL ");
                }
                else if(d6==4){
                    System.out.print("SETENTA Y CUATRO MIL ");
                }
                else if(d6==5){
                    System.out.print("SETENTA Y CINCO MIL ");
                }
                else if(d6==6){
                    System.out.print("SETENTA Y SEIS MIL ");
                }
                else if(d6==7){
                    System.out.print("SETENTA Y SIETE MIL ");
                }
                else if(d6==8){
                    System.out.print("SETENTA Y OCHO MIL ");
                }
                else if(d6==9){
                    System.out.print("SETENTA Y NUEVE MIL ");
                }
            } 
            //d5=8 
            else if(d5==8){
                if(d6==0){
                    System.out.print("OCHENTA MIL ");
                }
                else if(d6==1){
                    System.out.print("OCHENTA Y UN MIL ");
                }
                else if(d6==2){
                    System.out.print("OCHENTA Y DOS MIL ");
                }
                else if(d6==3){
                    System.out.print("OCHENTA Y TRES MIL ");
                }
                else if(d6==4){
                    System.out.print("OCHENTA Y CUATRO MIL ");
                }
                else if(d6==5){
                    System.out.print("OCHENTA Y CINCO MIL ");
                }
                else if(d6==6){
                    System.out.print("OCHENTA Y SEIS MIL ");
                }
                else if(d6==7){
                    System.out.print("OCHENTA Y SIETE MIL ");
                }
                else if(d6==8){
                    System.out.print("OCHENTA Y OCHO MIL ");
                }
                else if(d6==9){
                    System.out.print("OCHENTA Y NUEVE MIL ");
                }
            } 
            //d5=9 
            else if(d5==9){
                if(d6==0){
                    System.out.print("NOVENTA MIL ");
                }
                else if(d6==1){
                    System.out.print("NOVENTA Y UN MIL ");
                }
                else if(d6==2){
                    System.out.print("NOVENTA Y DOS MIL ");
                }
                else if(d6==3){
                    System.out.print("NOVENTA Y TRES MIL ");
                }
                else if(d6==4){
                    System.out.print("NOVENTA Y CUATRO MIL ");
                }
                else if(d6==5){
                    System.out.print("NOVENTA Y CINCO MIL ");
                }
                else if(d6==6){
                    System.out.print("NOVENTA Y SEIS MIL ");
                }
                else if(d6==7){
                    System.out.print("NOVENTA Y SIETE MIL ");
                }
                else if(d6==8){
                    System.out.print("NOVENTA Y OCHO MIL ");
                }
                else if(d6==9){
                    System.out.print("NOVENTA Y NUEVE MIL ");
                }
            } 


            //d6=0 
            if(d6==0){
                System.out.print(""); 
            }  
            //d6=1
            else if(d6==1){
                if(d4==0 && d5==0 || d5==0){
                    System.out.print("MIL ");
                } 
                else{
                    System.out.print("");
                }
            } 
            //d6=2 
            else if(d6==2){
                if(d4==0 && d5==0 || d5==0){
                    System.out.print("DOS MIL ");
                } 
                else{
                    System.out.print("");
                }
            } 
            //d6=3 
            else if(d6==3){
                if(d4==0 && d5==0 || d5==0){
                    System.out.print("TRES MIL ");
                } 
                else{
                    System.out.print("");
                }
            } 
            //d6=4
            else if(d6==4){
                if(d4==0 && d5==0 || d5==0){
                    System.out.print("CUATRO MIL ");
                } 
                else{
                    System.out.print("");
                }
            } 
            //d6=5
            else if(d6==5){
                if(d4==0 && d5==0 || d5==0){
                    System.out.print("CINCO MIL ");
                } 
                else{
                    System.out.print("");
                }
            } 
            //d6=6 
            else if(d6==6){
                if(d4==0 && d5==0 || d5==0){
                    System.out.print("SEIS MIL ");
                } 
                else{
                    System.out.print("");
                }
            } 
            //d6=7
            else if(d6==7){
                if(d4==0 && d5==0 || d5==0){
                    System.out.print("SIETE MIL ");
                } 
                else{
                    System.out.print("");
                }
            } 
            //d6=8 
            else if(d6==8){
                if(d4==0 && d5==0 || d5==0){
                    System.out.print("OCHO MIL ");
                } 
                else{
                    System.out.print("");
                }
            } 
            //d6=9 
            else if(d6==9){
                if(d4==0 && d5==0 || d5==0){
                    System.out.print("NUEVE MIL ");
                } 
                else{
                    System.out.print("");
                }
            }  


            //d7=0 
            if(d7==0){
                System.out.print("");
            } 
            //d7=1
            else if(d7==1){
                if(d8==0 && d9==0){
                    System.out.print("CIEN");
                }else{
                    System.out.print("CIENTO ");
                }
            }  
            //d7=2 
            else if(d7==2){
                System.out.print(" DOSCIENTOS ");
            } 
            //d7=3 
            else if(d7==3){
                System.out.print(" TRESCIENTOS ");
            } 
            //d7=4
            else if(d7==4){
                System.out.print(" CUATROCIENTOS ");
            } 
            //d7=5
            else if(d7==5){
                System.out.print(" QUINIENTOS ");
            } 
            //d7=6
            else if(d7==6){
                System.out.print(" SEISCIENTOS ");
            } 
            //d7=7
            else if(d7==7){
                System.out.print(" SETECIENTOS ");
            } 
            //d7=8 
            else if(d7==8){
                System.out.print(" OCHOCIENTOS ");
            } 
            //d7=9 
            else if(d7==9){
                System.out.print(" NOVECIENTOS ");
            } 


            //d8=0 
            if(d8==0){
                System.out.print("");
            }
            //d8=1 
            else if(d8==1){
                if(d9==0){
                    System.out.print("DIEZ");
                } 
                else if(d9==1){
                    System.out.print("ONCE");
                }
                else if(d9==2){
                    System.out.print("DOCE");
                }
                else if(d9==3){
                    System.out.print("TRECE");
                }
                else if(d9==4){
                    System.out.print("CATORCE");
                }
                else if(d9==5){
                    System.out.print("QUINCE");
                }
                else if(d9==6){
                    System.out.print("DIECISEIES");
                } 
                 else if(d9==7){
                    System.out.print("DIECISIETE");
                }
                 else if(d9==8){
                    System.out.print("DIECIOCHO");
                }
                 else if(d9==9){
                    System.out.print("DIECINUEVE");
                } 
            } 
            //d8=2
            else if(d8==2){
                if(d9==0){
                    System.out.print("VEINTE");
                } 
                else if(d9==1){
                    System.out.print("VENTIUNO");
                }
                else if(d9==2){
                    System.out.print("VENTIDOS");
                }
                else if(d9==3){
                    System.out.print("VENTITRES");
                }
                else if(d9==4){
                    System.out.print("VENTICUATRO");
                }
                else if(d9==5){
                    System.out.print("VENTICINCO");
                }
                else if(d9==6){
                    System.out.print("VENTISEIS");
                }
                else if(d9==7){
                    System.out.print("VENTISIETE");
                }
                else if(d9==8){
                    System.out.print("VENTIOCHO");
                }
                else if(d9==9){
                    System.out.print("VENTINUEVE");
                }
            } 
            //d8=3 
            else if(d8==3){
                if(d9==0){
                    System.out.print("TREINTA");
                }
                else if(d9==1){
                    System.out.print("TREINTA Y UN0");
                }
                else if(d9==2){
                    System.out.print("TREINTA Y DOS");
                }
                else if(d9==3){
                    System.out.print("TREINTA Y TRES");
                }
                else if(d9==4){
                    System.out.print("TREINTA Y CUATRO");
                }
                else if(d9==5){
                    System.out.print("TREINTA Y CINCO");
                }
                else if(d9==6){
                    System.out.print("TREINTA Y SEIS");
                }
                else if(d9==7){
                    System.out.print("TREINTA Y SIETE");
                }
                else if(d9==8){
                    System.out.print("TREINTA Y OCHO");
                }
                else if(d9==9){
                    System.out.print("TREINTA Y NUEVE");
                }
            }
            //d8=4 
            else if(d8==4){
                if(d9==0){
                    System.out.print("CUARENTA");
                }
                else if(d9==1){
                    System.out.print("CUARENTA Y UN");
                }
                else if(d9==2){
                    System.out.print("CUARENTA Y DOS");
                }
                else if(d9==3){
                    System.out.print("CUARENTA Y TRES");
                }
                else if(d9==4){
                    System.out.print("CUARENTA Y CUATRO");
                }
                else if(d9==5){
                    System.out.print("CUARENTA Y CINCO");
                }
                else if(d9==6){
                    System.out.print("CUARENTA Y SEIS");
                }
                else if(d9==7){
                    System.out.print("CUARENTA Y SIETE");
                }
                else if(d9==8){
                    System.out.print("CUARENTA Y OCHO");
                }
                else if(d9==9){
                    System.out.print("CUARENTA Y NUEVE");
                }
            } 
            //d8=5 
            else if(d8==5){
                if(d9==0){
                    System.out.print("CINCUENTA");
                }
                else if(d9==1){
                    System.out.print("CINCUENTA Y UN");
                }
                else if(d9==2){
                    System.out.print("CINCUENTA Y DOS");
                }
                else if(d9==3){
                    System.out.print("CINCUENTA Y TRES");
                }
                else if(d9==4){
                    System.out.print("CINCUENTA Y CUATRO");
                }
                else if(d9==5){
                    System.out.print("CINCUENTA Y CINCO");
                }
                else if(d9==6){
                    System.out.print("CINCUENTA Y SEIS");
                }
                else if(d9==7){
                    System.out.print("CINCUENTA Y SIETE");
                }
                else if(d9==8){
                    System.out.print("CINCUENTA Y OCHO");
                }
                else if(d9==9){
                    System.out.print("CINCUENTA Y NUEVE");
                }
            } 
            //d8=6 
            else if(d8==6){
                if(d9==0){
                    System.out.print("SESENTA");
                }
                else if(d9==1){
                    System.out.print("SESENTA Y UN0");
                }
                else if(d9==2){
                    System.out.print("SESENTA Y DOS");
                }
                else if(d9==3){
                    System.out.print("SESENTA Y TRES");
                }
                else if(d9==4){
                    System.out.print("SESENTA Y CUATRO");
                }
                else if(d9==5){
                    System.out.print("SESENTA Y CINCO");
                }
                else if(d9==6){
                    System.out.print("SESENTA Y SEIS");
                }
                else if(d9==7){
                    System.out.print("SESENTA Y SIETE");
                }
                else if(d9==8){
                    System.out.print("SESENTA Y OCHO");
                }
                else if(d9==9){
                    System.out.print("SESENTA Y NUEVE");
                }
            } 
            //d8=7 
            else if(d8==7){
                if(d9==0){
                    System.out.print("SETENTA");
                }
                else if(d9==1){
                    System.out.print("SETENTA Y UN");
                }
                else if(d9==2){
                    System.out.print("SETENTA Y DOS");
                }
                else if(d9==3){
                    System.out.print("SETENTA Y TRES");
                }
                else if(d9==4){
                    System.out.print("SETENTA Y CUATRO");
                }
                else if(d9==5){
                    System.out.print("SETENTA Y CINCO");
                }
                else if(d9==6){
                    System.out.print("SETENTA Y SEIS");
                }
                else if(d9==7){
                    System.out.print("SETENTA Y SIETE");
                }
                else if(d9==8){
                    System.out.print("SETENTA Y OCHO");
                }
                else if(d9==9){
                    System.out.print("SETENTA Y NUEVE");
                }
            } 
            //d8=8 
            else if(d8==8){
                if(d9==0){
                    System.out.print("OCHENTA");
                }
                else if(d9==1){
                    System.out.print("OCHENTA Y UN");
                }
                else if(d9==2){
                    System.out.print("OCHENTA Y DOS");
                }
                else if(d9==3){
                    System.out.print("OCHENTA Y TRES");
                }
                else if(d9==4){
                    System.out.print("OCHENTA Y CUATRO");
                }
                else if(d9==5){
                    System.out.print("OCHENTA Y CINCO");
                }
                else if(d9==6){
                    System.out.print("OCHENTA Y SEIS");
                }
                else if(d9==7){
                    System.out.print("OCHENTA Y SIETE");
                }
                else if(d9==8){
                    System.out.print("OCHENTA Y OCHO");
                }
                else if(d9==9){
                    System.out.print("OCHENTA Y NUEVE");
                }
            } 
            //d8=9 
            else if(d8==9){
                if(d9==0){
                    System.out.print("NOVENTA");
                }
                else if(d9==1){
                    System.out.print("NOVENTA Y UN");
                }
                else if(d9==2){
                    System.out.print("NOVENTA Y DOS");
                }
                else if(d9==3){
                    System.out.print("NOVENTA Y TRES");
                }
                else if(d9==4){
                    System.out.print("NOVENTA Y CUATRO");
                }
                else if(d9==5){
                    System.out.print("NOVENTA Y CINCO");
                }
                else if(d9==6){
                    System.out.print("NOVENTA Y SEIS");
                }
                else if(d9==7){
                    System.out.print("NOVENTA Y SIETE");
                }
                else if(d9==8){
                    System.out.print("NOVENTA Y OCHO");
                }
                else if(d9==9){
                    System.out.print("NOVENTA Y NUEVE");
                }
            } 


            //d9=0 
            if(d9==0){ 
                if(d1==0 && d2==0 && d3==0 && d4==0 && d5==0 && d6==0 && d7==0 && d8==0){
                    System.out.print("CERO"); 
                }
                else{
                    System.out.print(""); 
                }
            }  
            //d9=1
            else if(d9==1){
                if(d7==0 && d8==0 || d8==0){
                    System.out.print("UNO");
                } 
                else{
                    System.out.print("");
                }
            } 
            //d9=2
            else if(d9==2){
                if(d7==0 && d8==0 || d8==0){
                    System.out.print("DOS");
                } 
                else{
                    System.out.print("");
                }
            } 
            //d9=3
            else if(d9==3){
                if(d7==0 && d8==0 || d8==0){
                    System.out.print("TRES");
                } 
                else{
                    System.out.print("");
                }
            } 
            //d9=4
            else if(d9==4){
                if(d7==0 && d8==0 || d8==0){
                    System.out.print("CUATRO");
                } 
                else{
                    System.out.print("");
                }
            } 
            //d9=5 
            else if(d9==5){
                if(d7==0 && d8==0 || d8==0){
                    System.out.print("CINCO");
                } 
                else{
                    System.out.print("");
                }
            } 
            //d9=6 
            else if(d9==6){
                if(d7==0 && d8==0 || d8==0){
                    System.out.print("SEIS");
                } 
                else{
                    System.out.print("");
                }
            } 
            //d9=7 
            else if(d9==7){
                if(d7==0 && d8==0 || d8==0){
                    System.out.print("SIETE");
                } 
                else{
                    System.out.print("");
                }
            } 
            //d9=8 
            else if(d9==8){
                if(d7==0 && d8==0 || d8==0){
                    System.out.print("OCHO");
                } 
                else{
                    System.out.print("");
                }
            } 
            //d9=9 
            else if(d9==9){
                if(d7==0 && d8==0 || d8==0){
                    System.out.print("NUEVE");
                } 
                else{
                    System.out.print("");
                }
            } 
        }  
        else{
            System.out.println("=> Ingrese un dato correcto, intentelo de nuevo");
        }
    } 
}