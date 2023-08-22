public class Principal{
    public static void main(String [] args){
        Persona persona1 = new Persona(1088340376, "Oscar", "Loaiza", 85, 185, 300.5);
        Persona persona2= new Persona(904581112, "karem", "villegas", 25, 155, 60.8);

        // System.out.println("Atributo cedula " + persona1.cedula);   esta forma se puede usar solmente cuando los atributos son publicos
        System.out.println("Metodo getCedula: " + persona1.getCedula());

        persona1.setCedula(303033);
        System.out.println("Metodo getCedula: " + persona1.getCedula());

        persona1.imprimirEstado();
        persona2.imprimirEstado();

        persona1.actividadFisica(80);
        persona2.actividadFisica(30);

        persona1.imprimirEstado();
        persona2.imprimirEstado();
    }
}