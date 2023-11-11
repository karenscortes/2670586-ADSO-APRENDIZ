public class Usuario {
    private  String cedula;
    private  String nombres;
    private  String direccion;
    private  String rol;

    public Usuario(String cedula, String nombres, String direccion, String rol){
        this.cedula = cedula;
        this.nombres = nombres;
        this.direccion = direccion;
        this.rol = rol;
    }

    
    public String getCedula(){
        return this.cedula;
    }
    public String getNombres(){
        return this.nombres;
    }
    public String getDireccion(){
        return this.direccion;
    }
    public String getRol(){
        return this.rol;
    }

    public void setCedula(String dato){
        cedula = dato;
    }
    public void setNombres(String dato){
        nombres = dato;
    }
    public void setDireccion(String dato){
        direccion = dato;
    }
    public void setRol(String dato){
        rol = dato;
    }



}
