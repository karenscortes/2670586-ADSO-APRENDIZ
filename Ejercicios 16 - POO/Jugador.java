public class Jugador {
    public String cedula; 
    public String nombre; 
    public String posicion; 
    public int edad; 

    public Jugador(String cedula, String nombre, String posicion, int edad){
        this.cedula = cedula; 
        this.nombre = nombre; 
        this.posicion = posicion; 
        this.edad = edad;
    }


    public String getCedula(){
        return cedula;
    } 

    public String getNombre(){
        return nombre;
    } 

    public String getPosicion(){
        return posicion;
    } 

    public int getEdad(){
        return edad;
    } 


    public void setCedula(String dato){
        cedula = dato; 
    }

    public void setNombre(String dato){
        nombre = dato; 
    }

    public void setPosicion(String dato){
        posicion = dato; 
    }

    public void setEdad(int dato){
        edad = dato; 
    }
}