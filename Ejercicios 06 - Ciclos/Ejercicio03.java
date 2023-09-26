import java.util.Scanner;

public class Ejercicio03{

    public static void main(String [] arg){ 
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bienvenido a nuestro sistema");  

        System.out.print("Ingrese el valor total a financiar: ");
        double valorTotal = scanner.nextDouble();

        System.out.print("Ingrese la tasa de intereses: ");
        double tasaInteres = scanner.nextDouble();

        System.out.print("Ingrese la cantidad de cuotas: ");
        int cantidadCuotas = scanner.nextInt();
        
        tasaInteres = tasaInteres/100;
        double tasaMensual = tasaInteres / 12.0;
        double cuotaMensual = valorTotal * (tasaMensual / (1 - Math.pow(1 + tasaMensual, -cantidadCuotas)));

        System.out.println("--------------------------------------------------------------------");
        System.out.println("| Cuota | Cuota Mensual | Interes | Abono a Capital | Deuda Total |");
        System.out.println("--------------------------------------------------------------------");

        double saldoPendiente = valorTotal;
        for (int i = 1; i <= cantidadCuotas; i++) {
            double interesMensual = saldoPendiente * tasaMensual;
            double abonoCapital = cuotaMensual - interesMensual;
            saldoPendiente -= abonoCapital;

            String cuotaMensualStr = String.format("%.2f", cuotaMensual);
            String interesMensualStr = String.format("%.2f", interesMensual);
            String abonoCapitalStr = String.format("%.2f", abonoCapital);
            String saldoPendienteStr = String.format("%.2f", saldoPendiente);

            System.out.print("    "+i + "      ");
            System.out.print("$ " + cuotaMensualStr + "      ");
            System.out.print("$ " + interesMensualStr + "        ");
            System.out.print("$ " + abonoCapitalStr + "       ");
            System.out.print("$ " + saldoPendienteStr + "        ");

            System.out.println();
        }
        System.out.println("--------------------------------------------------------------------");
    }
}