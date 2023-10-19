import java.util.Scanner;

public class Principal{

    public static void main(String[] args){
        Scanner tecladoN = new Scanner(System.in);
        Scanner tecladoT = new Scanner(System.in);

        int size = 99;
        Curso array [] = new Curso [size];
        int opcion = 0; 
        Curso ejemplo = new Curso("Ejemplo", "NombreEjemplo", "TecnologiaEjemplo", 100);
        Curso curso1 = new Curso("224010","ADSO","Tecnologia",1000);
        Curso curso2 = new Curso("221010","BARI","Tecnologia",2000);
    
        do{
            System.out.println("|--------------------------------|");
            System.out.println("|          MENU DE CURSOS        |");
            System.out.println("|--------------------------------|");
            System.out.println("|                   MEMORIA:"+size+"   |");
            System.out.println("|  1.Crear curso                 |");
            System.out.println("|  2.Listar todos los cursos     |");
            System.out.println("|  3.Ver detalle de curso        |");
            System.out.println("|  4.Editar informacion de curso |");
            System.out.println("|  5.Agregar tema al curso       |");
            System.out.println("|  6.Eliminar curso              |");
            System.out.println("|  7.Salir                       |");
            System.out.println("|--------------------------------|");
            System.out.print("-> Ingrese la opcion que desee (1 a 7): "); 
            opcion = tecladoN.nextInt(); 

            if(opcion>=1 && opcion<=7){
                if(opcion == 1){
                    ejemplo.agrgarCurso(curso1);
                    size--;
                }else if(opcion == 2){
                    ejemplo.imprimirListado();
                }else if(opcion == 3){
                    curso1.imprimir();
                }else if(opcion == 4){
                    curso1.editar("ADSI", "Tecnologia", 1200); 
                }else if(opcion == 5){
                    curso1.agregarTema("Programacion");
                    curso1.agregarTema("Matematicas ");
                    curso1.agregarTema("LenguajeJAVA");
                }else if(opcion == 6){
                    ejemplo.eliminarCurso("224010");
                }else if(opcion == 7){
                    System.out.println("-> Ha salido con exito del programa "); 
                }
            }else{
                System.out.println("-> Ingrese una opcion correcta, intentelo nuevamente: "); 
            }
        }while(opcion!=7);
        
    } 

}