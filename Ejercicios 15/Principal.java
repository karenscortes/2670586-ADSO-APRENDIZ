import java.util.Scanner;

public class Principal{

    public static void main(String[] args){
        Scanner tecladoN = new Scanner(System.in);
        Scanner tecladoT = new Scanner(System.in);

        int size = 99;
        Curso array [] = new Curso [size];
        int indiceCurso =0;
        int opcion = 0; 
        
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
            System.out.println();
            System.out.print("-> Ingrese la opcion que desee (1 a 7): "); 
            opcion = tecladoN.nextInt(); 
            System.out.println();

            if(opcion>=1 && opcion<=7){
                if(opcion == 1){
                    System.out.print("-> Ingrese el codigo del curso: ");
                    String codigo = tecladoT.nextLine();
                    int repetido = 0;  
                    for (int i = 0; i < array.length; i++) {
                        if (array[i]!=null && array[i].getCodigo().equals(codigo)){
                            repetido++;
                        }
                    }

                    if(repetido==0){
                        System.out.print("-> Ingrese el nombre del curso "); 
                        String nombre = tecladoT.nextLine(); 

                        System.out.print("-> Ingrese el area de conocimento del curso "); 
                        String area = tecladoT.nextLine(); 

                        System.out.print("-> Ingrese la duracion en horas del curso "); 
                        int duracion = tecladoN.nextInt(); 

                        System.out.print("-> Ingrese la cantidad de temas del curso (max 15) "); 
                        int cant = tecladoN.nextInt(); 

                        Curso curso = new Curso(codigo,nombre,area,duracion);

                        for(int i =0; i < cant; i++){
                            System.out.print("-> Ingrese un tema del curso "); 
                            String tema = tecladoT.nextLine(); 
                            curso.agregarTema(tema);
                        }

                        array[indiceCurso]=curso;
                        indiceCurso++;
                        System.out.println();

                    }else if (repetido!=0){
                        System.out.println("-> El codigo del curso no es valido ");
                        System.out.println();
                    }
                    
                }else if(opcion == 2){
                    System.out.println();
                    System.out.println("|--------------------------------------|");
                    System.out.println("|           DETALLE LISTADO            |");
                    System.out.println("|--------------------------------------|");
                    System.out.println("|                                      |");
                    System.out.println("|  Codigo      Nombre     Duracion hr  |");
                    System.out.println("|                                      |");
                    for(int i =0; i<array.length; i++){
                        if(array[i]!=null){
                            System.out.println("|  "+array[i].codigo+"       "+array[i].nombre+"         "+array[i].duracionHoras+"      |");
                        }
                    } 
                    System.out.println("|--------------------------------------|");
                    System.out.println();
                }else if(opcion == 3){
                    System.out.print("-> Ingrese el codigo del curso para imprimir el datalle: ");
                    String codigo = tecladoT.nextLine();

                    for(int i=0; i<array.length; i++){
                        if (array[i]!=null && array[i].getCodigo().equals(codigo)){
                            array[i].imprimir();
                        }
                    }
                }else if(opcion == 4){
                    System.out.print("-> Ingrese el codigo del curso para ediatarlo: ");
                    String codigo = tecladoT.nextLine();

                    for(int i=0; i<array.length; i++){
                        if (array[i]!=null && array[i].getCodigo().equals(codigo)){
                            System.out.print("-> Ingrese el nuevo nombre del curso "); 
                            String nombre = tecladoT.nextLine(); 

                            System.out.print("-> Ingrese el nuevo area de conocimento del curso "); 
                            String area = tecladoT.nextLine(); 

                            System.out.print("-> Ingrese la nueva duracion en horas del curso "); 
                            int duracion = tecladoN.nextInt(); 

                            array[i].editar(nombre,area,duracion);
                            System.out.println();
                        }
                    }
                }else if(opcion == 5){
                    System.out.print("-> Ingrese el codigo del curso al que desea agregarle un tema: ");
                    String codigo = tecladoT.nextLine();

                    for(int i=0; i<array.length; i++){
                        if (array[i]!=null && array[i].getCodigo().equals(codigo)){
                            System.out.print("-> Ingrese un tema del curso "); 
                            String tema = tecladoT.nextLine();
                            array[i].agregarTema(tema);
                        }
                    }
                }else if(opcion == 6){
                    System.out.print("Ingrese el codigo del curso a eliminar: ");
                    String codigo = tecladoT.nextLine();

                    for (int i = 0; i < array.length; i++) {
                        if (array[i] != null && array[i].getCodigo().equals(codigo)) {
                            array[i] = null;
                            System.out.println("Curso ha sido eliminado");
                        }
                    }
                }else if(opcion == 7){
                    System.out.println("-> Ha salido con exito del programa "); 
                }
            }else{
                System.out.println("-> Ingrese una opcion correcta, intentelo nuevamente: "); 
            }
        }while(opcion!=7);
        
    } 

}