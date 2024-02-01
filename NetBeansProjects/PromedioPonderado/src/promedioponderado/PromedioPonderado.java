
package promedioponderado;

public class PromedioPonderado {

    public static void main(String[] args) {
        Materia listaMateria [] = new Materia [50];

        listaMateria [0] = new Materia("Matematicas",4);
        listaMateria [1] = new Materia("Literatura",5);
        listaMateria [2] = new Materia("Artes",2);
        listaMateria [3] = new Materia("Fisica",3);
        listaMateria [4] = new Materia("Deporte",1);
        
        CalcularPromedio ventana = new CalcularPromedio();
    }
    
}
