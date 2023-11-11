public class Producto {
    private String id; 
    private String nombre; 
    private int precio; 

    public Producto( String id, String nombre, int precio){
        this.id = id; 
        this.nombre = nombre; 
        this.precio = precio;
    }

    public String getId(){
        return this.id;
    }
    public String getNombre(){
        return this.nombre;
    }
    public int getPrecio(){
        return this.precio;
    }
    

    public void setId(String dato){
        id = dato;
    }
    public void setNombre(String dato){
        nombre = dato;
    }
    public void setPrecio(int dato){
        precio = dato;
    }
}
