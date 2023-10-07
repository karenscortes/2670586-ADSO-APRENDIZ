public class Ejercicio23 {

    public static void main(String[] args) {

        double capitalInicial = 0; 
        double tasaInteres = 0;     
        int periodos = 0;               

        double montoFinal = calcularMontoFinal(10000,5,3);

        System.out.println("El monto final con interes compuesto es: " + montoFinal);
    }

  
    public static double calcularMontoFinal(double capitalInicial, double tasaInteres, int periodos) {
        tasaInteres = tasaInteres / 100;
        double montoFinal = capitalInicial * Math.pow(1 + tasaInteres, periodos);
        return montoFinal;
    }
}
