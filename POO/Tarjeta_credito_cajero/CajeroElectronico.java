import java.util.Date; 

public class CajeroElectronico {

    int Limite_dinero;
    int Dinero_disponible;
    int Cant_10;
    int Cant_20;
    int Cant_50;
    int Cant_100;
    String Nombre_banco; 
    String Usuario_admi; 
    String Clave_admi;
    String Transacciones []; 

    public CajeroElectronico(int Limite_dinero, int Dinero_disponible, int Cant_10, int Cant_20, int Cant_50, int Cant_100, String Nombre_banco, String Usuario_admi, String Clave_admi){
        this.Limite_dinero = Limite_dinero;
        this.Dinero_disponible = Dinero_disponible;
        this.Cant_10 = Cant_10;
        this.Cant_20 = Cant_20;
        this.Cant_50 = Cant_50;
        this.Cant_100 = Cant_100;
        this.Nombre_banco = Nombre_banco;
        this.Usuario_admi = Usuario_admi;
        this.Clave_admi = Clave_admi;
        Transacciones = new String [100]; 
    }

    public CajeroElectronico(int Limite_dinero, String Nombre_banco, String Usuario_admi, String Clave_admi){
        this.Limite_dinero = Limite_dinero;
        this.Nombre_banco = Nombre_banco;
        this.Usuario_admi = Usuario_admi;
        this.Clave_admi = Clave_admi;
        Transacciones = new String [100]; 
    }

    public boolean abastecerCajero(int Cant_10, int Cant_20, int Cant_50, int Cant_100){

        int total = (Cant_10*10000)+(Cant_20*20000)+(Cant_50*50000)+(Cant_100*100000); 

        if(total<=Limite_dinero){
            Dinero_disponible = total; 
            this.Cant_10 = Cant_10;
            this.Cant_20 = Cant_20;
            this.Cant_50 = Cant_50;
            this.Cant_100 = Cant_100;

            System.out.println("----------CAJERO RECARGADO----------");
            registarTransaccion("ABASTECER","XXXX XXXX XXXX XXXX",total,"REALIZADA");
            return true; 
        }else{
            System.out.println("----------ERROR EN RECARGA----------");
            registarTransaccion("ABASTECER","XXXX XXXX XXXX XXXX",total,"NO REALIZADA");
            return false;
        }
    }

    public void registarTransaccion(String tipo, String numeroTarjeta, int monto, String estado){
        Date fecha = new Date();

        String texto = fecha.toString()+" - "+tipo+" - "+numeroTarjeta+" - "+monto+" - "+estado;

        int indice = -1;
        for(int i = 0 ; i<Transacciones.length; i++){
            if(Transacciones[i]==null){
                indice = i; 
                break;
            }
        }

        if(indice!= -1){
            Transacciones[indice]= texto; 
        }else{
            for(int i= 0; i<Transacciones.length-1;i++){
                Transacciones[i]= Transacciones[i+1]; 
            }

            Transacciones[Transacciones.length-1]=texto;
        }
    }

    /* public int getTotalDinero(){
        return Total_dinero;
    }

    public int getDinero_disponible(){
        return Dinero_disponible;
    }

    public int getCant_10(){
        return Cant_10;
    }

    public int getCant_20(){
        return Cant_20;
    }

    public int getCant_50(){
        return Cant_50;
    }

    public int getCant_100(){
        return Cant_100;
    } 

    public String getNombre_banco(){
        return Nombre_banco;
    }

    public String getUsuario_admi(){
        return Usuario_admi;
    }

    public String getContraseña_admi(){
        Contraseña_admi;
    } 


    public int setTotalDinero(dato){
        Total_dinero = dato;
    }

    public int setDinero_disponible(dato){
        Dinero_disponible = dato;
    }

    public int setCant_10(dato){
        Cant_10;
    }

    public int setCant_20(dato){
        Cant_20 = dato;
    }

    public int setCant_50(dato){
        Cant_50 = dato;
    }

    public int setCant_100(dato){
        Cant_100 = dato;
    } 

    public String setNombre_banco(dato){
        Combre_banco = dato;
    }

    public String setUsuario_admi(dato){
        Usuario_admi = dato;
    }

    public String setContraseña_admi(dato){
        Contraseña_admi = dato;
    }  */
    
    public void imprimirDetalle(){
        System.out.println();
        System.out.println("|--------------------------------------");
        System.out.println("|                                      ");
        System.out.println("|  1.Capacidad total "+ Limite_dinero);
        System.out.println("|  2.Dinero disponible "+Dinero_disponible);
        System.out.println("|  3.cantidad 10 "+Cant_10);
        System.out.println("|  4.cantidad 20 "+Cant_20);
        System.out.println("|  5.cantidad 50 "+Cant_100);
        System.out.println("|  6.Nombre banco "+Nombre_banco);
        System.out.println("|  7.usuario Admin "+Usuario_admi);
        System.out.println("|  8.clave Admin "+Clave_admi);
        System.out.println("|  9.Historial de transacciones ");

        for(int i=0; i<Transacciones.length; i++){
            if(Transacciones[i]!=null){
                System.out.println("        => "+Transacciones[i]);
            }
        }

        System.out.println("---------------------------------------");
            

    }
    
}
