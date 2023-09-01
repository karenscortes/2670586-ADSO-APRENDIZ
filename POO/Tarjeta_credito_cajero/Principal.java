import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner entradaNum = new Scanner (System.in);
        Scanner entradaTexto = new Scanner (System.in);

        CajeroElectronico cajero1 = new CajeroElectronico(5000000, 3000000,1,2,3,8,"platukis","paola","123knrt");
        cajero1.imprimirDetalle();
        CajeroElectronico cajero2 = new CajeroElectronico (10000000,"platukis2","paoblina","123pc4");

        cajero2.imprimirDetalle();


        cajero2.abastecerCajero(10,30,10,8);

        cajero2.imprimirDetalle();
    }
}