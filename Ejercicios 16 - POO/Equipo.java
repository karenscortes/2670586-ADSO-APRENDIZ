public class Equipo {

    public String nombre; 
    public String fundacion; 
    public int pGanados; 
    public int pEmpatados;
    public int pPerdidos;
    public Jugador jugadores [];

    public Equipo(String nombre, String fundacion, int pGanados, int pEmpatados, int pPerdidos){
        this.nombre = nombre; 
        this.fundacion = fundacion; 
        this.pGanados = pGanados;
        this.pEmpatados = pEmpatados;
        this.pPerdidos = pPerdidos;
        this. jugadores = new Jugador [16];
    }



    public String getNombre(){
        return nombre;
    }

    public String getFundacion(){
        return fundacion;
    }

    public int getPGanados(){
        return pGanados;
    }

    public int getPEmpatados(){
        return pEmpatados;
    }

    public int getPPerdidos(){
        return pPerdidos;
    }


    public void setNombre(String dato){
        nombre = dato; 
    }

    public void setFundacion(String dato){
        fundacion = dato; 
    }

    public void setPGanados(int dato){
        pGanados = dato; 
    }

    public void setPEmpatados(int dato){
        pEmpatados = dato; 
    }

    public void setPPerdidos(int dato){
        pPerdidos = dato; 
    }

    int indice = 0; 
    public void agregarJugador(Jugador jugador){
        int cont = 0;
        for(int i = 0; i<jugadores.length; i++){
            if(jugadores[i] != null && jugadores[i].getCedula().equals(jugador.getCedula())){
                cont++;
            }
        }

        if(cont==0){
            jugadores[indice]=jugador;
            indice++;
        }else if (cont !=0 ){
            System.out.println("Los datos de este jugador ya estan en el sistema");
        }
    }

    public void eliminarJugador(Jugador jugador){
        for(int i = 0; i<jugadores.length; i++){
            if(jugadores[i] != null && jugadores[i].getCedula().equals(jugador.getCedula())){
                jugadores[i]= null; 
            }
        }
    }

    public void listaNombres(){
        System.out.println();
        System.out.println("|--------------------------------------|");
        System.out.println("|           LISTA JUGADORES            |");
        System.out.println("|--------------------------------------|");
        System.out.println("|                                      |");
        for(int i = 0; i < jugadores.length; i++){
            if(jugadores[i] != null){
                System.out.println("|  "+(i+1)+". "+jugadores[i].getNombre()+"                        |");
            }
        }  
        System.out.println("|                                      |");
        System.out.println("|--------------------------------------|");
    } 


    public void listaJugadores(){
        System.out.println();
        System.out.println("|--------------------------------------------------|");
        System.out.println("|           LISTA DETALLADA DE JUGADORES           |");
        System.out.println("|--------------------------------------------------|");
        System.out.println("|                                                  |");
        System.out.println("|    Nombre       Cedula      Posicion     Edad    |");
        for(int i = 0; i < jugadores.length; i++){
            if(jugadores[i] != null){
                System.out.println("|  "+jugadores[i].getNombre()+"     "+jugadores[i].getCedula()+"        "+jugadores[i].getPosicion()+"        "+jugadores[i].getEdad()+"     |");
            }
        }  
        System.out.println("|                                                  |");
        System.out.println("|--------------------------------------------------|");
    }


}