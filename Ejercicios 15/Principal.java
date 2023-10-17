import java.util.Scanner;

public class Principal{

    public static void main(String[] args){
        Scanner tecladoN = new Scanner(System.in);
        Scanner tecladoT = new Scanner(System.in);

        int size = 99;
        Curso array [] = new Curso [size];


        System.out.println("|--------------------------------|");
        System.out.println("|          MENU DE CURSOS        |");
        System.out.println("|--------------------------------|");
        System.out.println("|                   MEMORIA:"+size+"   |");
        System.out.println("|  1.Crear curso                 |");
        System.out.println("|  2.Listar todos los cursos     |");
        System.out.println("|  3. Ver detalle de curso       |");
        System.out.println("|  4.Editar informacion de curso |");
        System.out.println("|  5.Agregar tema al curso       |");
        System.out.println("|  6.Eliminar curso              |");
        System.out.println("|  7.Salir                       |");
        System.out.println("|--------------------------------|");
    }
}