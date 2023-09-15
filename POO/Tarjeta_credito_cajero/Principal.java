import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner entradaNum = new Scanner (System.in);
        Scanner entradaTexto = new Scanner (System.in);

        CajeroElectronico cajero1 = new CajeroElectronico(5000000, 3000000,1,2,3,8,"platukis","paola","123knrt");
        cajero1.imprimirDetalle();
        CajeroElectronico cajero2 = new CajeroElectronico (10000000,"platukis2","paoblina","123pc4");

        TarjetaDebito tarjeta1 = new TarjetaDebito ("karen","1111 1111 1111 1111", "bancolombia", "2210",5000000,3000000);

        cajero1.consignarDineroTarjeta(tarjeta1, "2210",2,5,1,1); 

        cajero1.imprimirDetalle(); 

        cajero1.retirarDineroTarjeta(tarjeta1, "2210",2,5,1,1); 

        cajero1.imprimirDetalle(); 

        cajero1.consultarSaldoTarjeta(tarjeta1, "2210");

        tarjeta1.verHistorialTarjeta("2210");
        
    }
}