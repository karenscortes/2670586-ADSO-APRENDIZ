import java.util.Date; 

public class TarjetaDebito{

    private String Nombre_propietario; 
    private String Numero_tarjeta; 
    private String Nombre_banco; 
    private String Ulimas_Transacciones []; 
    private String clave; 
    private String Estado;
    private int Dinero_tarjeta;
    private int Dinero_permitido_retirar; 

    public TarjetaDebito(String Nombre_propietario, String Numero_tarjeta, String Nombre_banco, String clave, int Dinero_tarjeta, int Dinero_permitido_retirar){
        this.Nombre_propietario = Nombre_propietario;
        this.Numero_tarjeta = Numero_tarjeta;
        this.Nombre_banco = Nombre_banco;
        this.clave = clave;
        this.Estado = "ACTIVO"; 
        this.Dinero_tarjeta =Dinero_tarjeta;
        this.Dinero_permitido_retirar = Dinero_permitido_retirar;
        this.Ulimas_Transacciones = new String [10]; 
    }

    public void registarTransaccion(String tipo, int monto, String estado){
        Date fecha = new Date();

        String texto = fecha.toString()+" - "+tipo+" - "+monto+" - "+estado;

        int indice = -1;
        for(int i = 0 ; i<Ulimas_Transacciones.length; i++){
            if(Ulimas_Transacciones[i]==null){
                indice = i; 
                break;
            }
        }

        if(indice!= -1){
            Ulimas_Transacciones[indice]= texto; 
        }else{
            for(int i= 0; i<Ulimas_Transacciones.length-1;i++){
                Ulimas_Transacciones[i]= Ulimas_Transacciones[i+1]; 
            }

            Ulimas_Transacciones[Ulimas_Transacciones.length-1]=texto;
        }
    } 

    public void verHistorialTarjeta(String pass){
        System.out.println("----------HISTORIAL TARJETA----------");
        registarTransaccion("HISTORIAL", 0 , "REALIZADA");
        if(pass.equals(clave)){
            for(int i = 0; i<Ulimas_Transacciones.length; i++){
                if(Ulimas_Transacciones[i]!=null){
                    System.out.print(Ulimas_Transacciones[i]);
                    System.out.println();
                }
            }
        }else{
          System.out.println("----------ACCESO DENEGADO CLAVE INCORRECTA----------");  
          registarTransaccion("HISTORIAL", 0 , "ERROR");
        }
    }



    public boolean aumentarSaldo(int monto, String pass){
        if(pass.equals(clave)){
            if(monto>0){ 
                Dinero_tarjeta += monto; 
                System.out.println("----------TRANSACCION EXITOSA----------");  
                registarTransaccion("AUMENTO SALDO", monto , "REALIZADA");
                return true;
            }else{
                System.out.println("----------MONTO INVALIDO----------");  
                registarTransaccion("AUMENTO SALDO", monto , "ERROR");
                return false;
            }
        }else{
            System.out.println("----------TRANSACCION FALLIDA CLAVE INCORRECTA----------");  
            registarTransaccion("AUMENTO SALDO", monto , "ERROR");
            return false; 
        }
    }




    public boolean disminuirSaldo(int monto, String pass){
        if(pass.equals(clave)){
            if(monto>0 && monto<Dinero_permitido_retirar){ 
                if(monto<=Dinero_tarjeta){
                    Dinero_tarjeta -= monto; 
                    System.out.println("----------TRANSACCION EXITOSA----------");  
                    registarTransaccion("AUMENTO SALDO", monto , "REALIZADA");
                    return true;
                }else{
                    System.out.println("----------MONTO MAYOR A SALSO DISPONIBLE----------");  
                    registarTransaccion("AUMENTO SALDO", monto , "ERROR");
                    return false;
                }
            }else{
                System.out.println("----------MONTO MAYOR AL PERMITIDO RETIRAR----------");  
                registarTransaccion("AUMENTO SALDO", monto , "ERROR");
                return false;
            }
        }else{
            System.out.println("----------TRANSACCION FALLIDA CLAVE INCORRECTA----------");  
            registarTransaccion("AUMENTO SALDO", monto , "ERROR");
            return false; 
        }
    }

    public int getSaldo(String pass){
        if(pass.equals(clave)){
            registarTransaccion("CONSULTAR SALDO",0,"REALIZADA"); 
            return Dinero_tarjeta;
        }else{
            registarTransaccion("CONSULTAR SALDO",0,"ERROR"); 
            return -1; 
        }
    }



    public boolean validarClave(String clave){
        if(clave.equals(clave)){
            registarTransaccion("VALIDAR CLAVE",0,"REALIZADA"); 
            return true; 
        }else{
            registarTransaccion("VALIDAR CLAVE",0,"ERROR"); 
            return false; 
        }
    } 

    public String getNumero(){
        return Numero_tarjeta;
    }

     public boolean validarEstado(){
        if(Estado.equals("ACTIVO")){
            return true; 
        }else{
            return false; 
        }
    }
    
}