import java.util.Scanner;
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

    public String entradaTexto() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese texto: ");
        return scanner.nextLine();
    }

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




/*     public int getLimiteDinero(){
        return Limite_dinero;
    }

    public int getDineroDisponible(){
        return Dinero_disponible;
    }

    public int getCant10(){
        return Cant_10;
    }

    public int getCant20(){
        return Cant_20;
    }

    public int getCant50(){
        return Cant_50;
    }

    public int getCant100(){
        return Cant_100;
    } 

    public String getNombreBanco(){
        return Nombre_banco;
    }

    public String getUsuarioAdmi(){
        return Usuario_admi;
    }

    public String getClaveAdmi(){
        return Clave_admi;
    }  */






   /*  public int setLimiteDinero( int dato){
        Limite_dinero = dato;
    }

    public int setDineroDisponible( int dato){
        Dinero_disponible = dato;
    }

    public int setCant10( int dato){
        Cant_10 = dato;
    }

    public int setCant20( int dato){
        Cant_20 = dato;
    }

    public int setCant50( int dato){
        Cant_50 = dato;
    }

    public int setCant100( int dato){
        Cant_100 = dato;
    } 

    public String setNombreBanco(String dato){
        Nombre_banco = dato;
    }

    public String setUsuarioAdmi(String dato){
        Usuario_admi = dato;
    }

    public String setClaveAdmi(String dato){
        Clave_admi = dato;
    }  


 */


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

    public void cambiarClaveAdmin(String Clave_admi){
        System.out.print("=>Ingrese la clave del administrador: ");
        String Confirmar_clave = entradaTexto(); 
        System.out.println();
        if(Confirmar_clave==Clave_admi){
            System.out.print("=>Ingrese la nueva clave del usuario administrador");
            String new_clave_admin = entradaTexto();

            Clave_admi=new_clave_admin;
            System.out.println("----------NUEVA CLAVE GUARDADA----------");
        }else{
            System.out.println("=>La clave ingresada no coincide con ninguna cuenta administrador ");
        }
    }
    
}
