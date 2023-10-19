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
            System.out.print("-> Ingrese la opcion que desee (1 a 7): "); 
            opcion = tecladoN.nextInt(); 

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

                        Curso curso = (codigo,nombre,area,duracion)

                        for(int i =0; i <= cant; i++){
                            System.out.print("-> Ingrese un tema del curso "); 
                            String tema = tecladoT.nextLine(); 
                            curso.agregarTema(tema);
                        }


                    }else if (repetido!=0){
                        System.out.println("-> El codigo del curso no es valido ");
                    }
                    
                }else if(opcion == 2){
                    
                }else if(opcion == 3){

                    
                }else if(opcion == 4){
                    
                }else if(opcion == 5){
                    
                }else if(opcion == 6){
                    
                }else if(opcion == 7){
                    System.out.println("-> Ha salido con exito del programa "); 
                }
            }else{
                System.out.println("-> Ingrese una opcion correcta, intentelo nuevamente: "); 
            }
        }while(opcion!=7);
        
    } 

}