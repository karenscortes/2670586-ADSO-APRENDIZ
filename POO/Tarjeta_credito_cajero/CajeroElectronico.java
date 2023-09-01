public class CajeroElectronico {

    int total_dinero;
    int dinero_disponible;
    int cant_10;
    int cant_20;
    int cant_50;
    int cant_100;
    String nombre_banco; 
    String usuario_admi; 
    String contraseña_admi;
    String transacciones [] = new []; 

    public CajeroElectronico(int dato1, int dato2, int cant_10, int cant_20, int cant_50, int cant_100, System dato7, String dato8, String dato9, String dato10){
        total_dinero = dato1;
        dinero_disponible = dato2;
        cant_10 = 0;
        cant_20 = 0;
        cant_50 = 0;
        cant_100 = 0;
        nombre_banco = dato7;
        usuario_admi = dato8;
        contraseña_admi = dato9;
        transacciones = dato10;
    }

    public int getTotalDinero(){
        return total_dinero;
    }

    public int getDinero_disponible(){
        return dinero_disponible;
    }

    public int getCant_10(){
        return cant_10;
    }

    public int getCant_20(){
        return cant_20;
    }

    public int getCant_50(){
        return cant_50;
    }

    public int getCant_100(){
        return cant_100;
    } 

    public String getNombre_banco(){
        return nombre_banco;
    }

    public String getUsuario_admi(){
        return usuario_admi;
    }

    public String getContraseña_admi(){
        contraseña_admi;
    } 


    public int setTotalDinero(dato){
        total_dinero = dato;
    }

    public int setDinero_disponible(dato){
        dinero_disponible = dato;
    }

    public int setCant_10(dato){
        cant_10;
    }

    public int setCant_20(dato){
        cant_20 = dato;
    }

    public int setCant_50(dato){
        cant_50 = dato;
    }

    public int setCant_100(dato){
        cant_100 = dato;
    } 

    public String setNombre_banco(dato){
        nombre_banco = dato;
    }

    public String setUsuario_admi(dato){
        usuario_admi = dato;
    }

    public String setContraseña_admi(dato){
        contraseña_admi = dato;
    } 

    public void AbastecerCajero(int can_10, int cant_20, int cant_50, int can_100){
        cant_10 += can_10;
        cant_20 += cant_20;
        cant_50 += cant_50;
        cant_100 += cant_100;

        dinero_disponible += (cant_10 * 10000) + (cant_20 * 20000) + (cant_50 * 50000) + (cant_100 * 100000);
    }

    public void BloquearCajero(){
        dinero_disponible = 0;
    }

    
}
