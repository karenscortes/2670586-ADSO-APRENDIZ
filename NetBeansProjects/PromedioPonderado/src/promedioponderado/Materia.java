
package promedioponderado;

public class Materia {
    private String nombre; 
    private float credito; 

    public Materia(String nombre, float credito){
        this.nombre = nombre; 
        this.credito = credito;
    }

    public float getCredito(){
        return this.credito;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setCredito(float dato){
        credito = dato;
    }
    public void setNombre(String dato){
        nombre = dato;
    }
}
