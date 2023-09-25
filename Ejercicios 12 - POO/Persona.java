public class Persona {

    //Atributos -> Caracteristica

    int cedula;
    String nombres;
    String apellidos;
    int edad;
    int altura;
    double peso;

    

    //Metodos -> Acciones
    // -Constructor
    // -Getters
    // -Setters

    public Persona(int dato1, String dato2, String dato3, int dato4, int dato5, double dato6){
        cedula = dato1;
        nombres = dato2;
        apellidos = dato3;
        edad = dato4;
        altura = dato5;
        peso = dato6;
    }

    //Getters

    public int getCedula(){
        return cedula;
    }

    public String getNombres(){
        return nombres;
    }

    public String getApellidos(){
        return apellidos;
    }

    public int getEdad(){
        return edad;
    }

    public int getAltura(){
        return altura;
    }

    public double getPeso(){
        return peso;
    }

    //Setters

    public void setCedula(int dato){
        cedula = dato;
    }

    public void setNombres(String dato){
        nombres = dato;
    }

    public void setApellidos(String dato){
        apellidos = dato;
    }

    public void setEdad(int dato){
        edad = dato;
    }

    public void setAltura(int dato){
        altura = dato;
    }

    public void setPeso(double dato){
        peso = dato;
    }

}
