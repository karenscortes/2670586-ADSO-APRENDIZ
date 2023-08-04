import java.util.Scanner;

public class Ejercicio03{

    public static void main(String [] arg){ 
        Scanner teclado = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Bienvenido a nuestro sistema");   
        boolean rep = true;
        int size = 100;
        int opcion, repetido =0;
        String array [] = new String [100]; 
        String palabra , nuevo;
        int e = 0;


        do{
            System.out.println("                Memoria disponible: "+size+" registros"); 
            System.out.println(); 
            System.out.println("1. Registrar cliente");
            System.out.println("2. Ver lista de clientes");
            System.out.println("3. Editar cliente"); 
            System.out.println("4. Eliminar cliente");
            System.out.println("5. Salir");

            System.out.print("-> Ingrese la opcion que desee "); 
            opcion = teclado.nextInt(); 

            switch(opcion){
                case 1: 
                    
                    System.out.print("-> Ingrese el nombre completo del cliente "); 
                    palabra = entrada.nextLine(); 
                    array[e] = palabra;
                    e++;
                    size = size -1;

                    for(int i =1; i<size; i++){
                        if (array[e]!=array[i] && array[i+1].equals(palabra)){
                            repetido++;
                        }
                    }
                    
                    if(repetido!=0){
                        System.out.print("No se aceptan valores repetidos");  
                    }
                    break;
                case 2: 
                    for(int i =0; i<size; i++){
                        System.out.print(array[i]+" ");  
                    }
                    break;
                case 3: 
                    System.out.print("-> Ingrese un nombre que desea buscar en el array "); 
                    String nombre = entrada.nextLine(); 

                    for(int i =0; i<size; i++){
                        if (array[i]!=null &&  array[i].equals(nombre)){
                            System.out.println("Ingrese el nuevo dato  ");
                            nuevo = entrada.nextLine(); 
                            array [i]= nuevo;
                        }
                    }
                    break;
                case 4: 
                    System.out.print("-> Ingrese el nombre que desea eliminar en el array "); 
                    String eliminar = entrada.nextLine(); 
                    String aux;
                    for(int i =0; i<size; i++){
                        if (array[i]!=null &&  array[i].equals(eliminar)){
                            array[i]=null; 

                            for(int a =i; a<size-1; a++ ){
                                array[a]=array[a+1]; 
                            }
                            array[size-1]=null;
                        }

                    }
                    size = size +1;
                    break;

                case 5: 
                    System.out.println("Ha salido con exito del sistema "); 
                    rep = false; 
                    break;
                default:
                    System.out.println("Digite una opcion correcta "); 

            }
        }while(rep==true);
    }
}