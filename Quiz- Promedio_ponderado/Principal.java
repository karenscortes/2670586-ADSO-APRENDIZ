
public class Principal {
    public static void main(String[] args) {

        Materia listaMaterias [] = new Materia [50];

        listaMaterias [0] = new Materia("Matematicas",4);
        listaMaterias [1] = new Materia("Literatura",5);
        listaMaterias [2] = new Materia("Artes",2);
        listaMaterias [3] = new Materia("Fisica",3);
        listaMaterias [4] = new Materia("Deporte",1);

        Ventana primera = new Ventana(listaMaterias);
    }
}
