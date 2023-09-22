public class Ejercicio21{

    public static void main(String[] args){
        System.out.println("Fahrenheit = "+ celciusAFahrenheit(53) ); 
        System.out.println("Fahrenheit = "+ celciusAFahrenheit(44) ); 
        System.out.println("Fahrenheit = "+ celciusAFahrenheit(123) ); 
    }

    public static double celciusAFahrenheit(double celcius){
        
        double Fahrenheit = ( celcius + 273.15 );
        
        return Fahrenheit;
    }
}