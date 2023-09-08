public class TarjetaDebito{

    String Nombre_propietario; 
    String Numero_tarjeta; 
    String Nombre_banco; 
    String Transacciones [] = new []; 
    String clave; 
    int Dinero_tarjeta;
    int Dinero_permitido_retirar; 

    public CajeroElectronico(String Nombre_propietario, String Numero_tarjeta, String Nombre_banco, String clave, int Dinero_tarjeta, int Dinero_permitido_retirar){
        this.Nombre_propietario = Nombre_propietario;
        this.Numero_tarjeta = Numero_tarjeta;
        this.Nombre_banco = Nombre_banco;
        this.clave = clave;
        this.Dinero_tarjeta =Dinero_tarjeta;
        this.Dinero_permitido_retirar = Dinero_permitido_retirar;
        Transacciones = new String [100]; 
    }




/* 
    public String getNombrePropietario(){
        return Nombre_propietario;
    }

    public String getNumeroTarjeta(){
        return Numero_tarjeta;
    } 

    public String getNombreBanco(){
        return Nombre_banco;
    }

    public String getClave(){
        return clave;
    }

    public int getDineroTarjeta(){
        return Dinero_tarjeta;
    }

    public int getDineroPermitidoRetirar(){
        return Dinero_permitido_retirar;
    } */






    /* public String setNombrePropietario( String dato){
        Nombre_propietario = dato;
    }

    public String setNumeroTarjeta( String dato){
        Numero_tarjeta = dato;
    } 

    public String setNombreBanco( String dato){
        Nombre_banco = dato;
    }

    public String setClave( String dato){
        clave = dato;
    }

    public int setDineroTarjeta( int dato){
        Dinero_tarjeta = dato;
    }

    public int setDineroPermitidoRetirar( int dato){
        Dinero_permitido_retirar = dato;
    }


    
 */


    
    public disminuirSaldo(){

    }
    
}