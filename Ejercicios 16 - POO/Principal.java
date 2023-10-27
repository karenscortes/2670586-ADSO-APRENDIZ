import java.util.Scanner;

public class Principal{

    public static void main(String[] args){
        Scanner tecladoN = new Scanner(System.in);
        Scanner tecladoT = new Scanner(System.in);

        Jugador jugador1 = new Jugador("12324546","Sebastian","D.I",23);
        Jugador jugador2 = new Jugador("12897636","Francisco","D.F",29);
        Jugador jugador3 = new Jugador("12784540","Alejandro","D.D",30);
        Jugador jugador4 = new Jugador("12936549","Guillermo","D.M",18);
        Jugador jugador5 = new Jugador("12397044","Alexander","D.F",19);
        Jugador jugador6 = new Jugador("12678092","Cristhian","D.I",26);
        Jugador jugador7 = new Jugador("17426803","Dominique","D.I",22);
        Jugador jugador8 = new Jugador("18053568","Salvatore","D.M",20);
        Jugador jugador9 = new Jugador("11745932","Celestine","D.F",17);
        Jugador jugador10 = new Jugador("12986989","Jhonathan","D.M",31);

        Equipo equipo1 = new Equipo("Jaguares","1985",56,24,23); 
        Equipo equipo2 = new Equipo("Linces","2005",96,14,9);

        equipo1.agregarJugador(jugador1); 
        equipo1.agregarJugador(jugador2); 
        equipo1.agregarJugador(jugador3); 
        equipo1.agregarJugador(jugador4); 
        equipo1.agregarJugador(jugador5); 
        equipo1.agregarJugador(jugador6); 

        equipo1.listaNombres();

        equipo2.agregarJugador(jugador7); 
        equipo2.agregarJugador(jugador8); 
        equipo2.agregarJugador(jugador9); 
        equipo2.agregarJugador(jugador10); 

        equipo2.listaNombres();

        equipo1.eliminarJugador(jugador4); 
        equipo1.eliminarJugador(jugador5); 
        equipo1.eliminarJugador(jugador6); 

        equipo1.listaJugadores();

        equipo2.agregarJugador(jugador4); 
        equipo2.agregarJugador(jugador5); 
        equipo2.agregarJugador(jugador6);

        equipo2.listaJugadores();

    }

}