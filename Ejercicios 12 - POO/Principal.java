import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        
        Scanner entradaNum = new Scanner (System.in);
        Scanner entradaTexto = new Scanner (System.in);

        int opcion = 0;
        Persona arreglo_per [] = new Persona[99]; 
        int indice_persona =0;
        int disponible = 99-indice_persona;

        arreglo_per[0]= new Persona (1137674323,"karen","cortes",18,152,65.3);
        arreglo_per[1]= new Persona (1783245623,"stephanie","diaz",98,152,55.3);
        arreglo_per[2]= new Persona (1987421344,"diana","cortes",15,152,75.3);
        arreglo_per[3]= new Persona (1548958342,"harold","cortes",38,172,85.3);
        
        while (opcion!=11){
            System.out.println();
            System.out.println("|--------------------------------------|");
            System.out.println("|           MENU DE PERSONAS           |");
            System.out.println("|--------------------------------------|");
            System.out.println("|              Espacio disponible: "+disponible+"  |");
            System.out.println("|  1.Registrar Persona                 |");
            System.out.println("|  2.Ver lista de Persona              |");
            System.out.println("|  3.Editar Persona                    |");
            System.out.println("|  4.Eliminar Persona                  |");
            System.out.println("|  5.Persona de menor edad             |");
            System.out.println("|  6.Persona de mayor edad             |");
            System.out.println("|  7.Promedio de edades                |");
            System.out.println("|  8.Persona de menor peso             |");
            System.out.println("|  9.Persona de mayor peso             |");
            System.out.println("|  10.Promedio de peso                 |");
            System.out.println("|  11.Salir                            |");
            System.out.println("|--------------------------------------|");

            System.out.print("Ingrese una opcion ");
            opcion = entradaNum.nextInt();


            if(opcion==1){
                System.out.println();
                System.out.println("|--------------------------------------|");
                System.out.println("|         REGISTRO DE PERSONAS         |");
                System.out.println("|--------------------------------------|");
                System.out.println();
                System.out.print("Ingrese la cedula del usuario ");
                int cedula = entradaNum.nextInt();
                System.out.println();

                System.out.print("Ingrese el nombre del usuario ");
                String nombres = entradaTexto.nextLine();
                System.out.println();

                System.out.print("Ingrese los apellidos del usuario ");
                String apellidos = entradaTexto.nextLine();
                System.out.println();

                System.out.print("Ingrese la edad del usuario ");
                int edad = entradaNum.nextInt();
                System.out.println();
                
                System.out.print("Ingrese la altura del usuario ");
                int altura = entradaNum.nextInt();
                System.out.println();

                System.out.print("Ingrese el peso del usuario ");
                double peso = entradaNum.nextDouble();

                Persona temp = new Persona(cedula,nombres,apellidos,edad,altura,peso);
                arreglo_per [indice_persona] = temp;
                indice_persona++; 
            }

            if(opcion==2){
                System.out.println();
                System.out.println("|--------------------------------------|");
                System.out.println("|           LISTA DE PERSONAS          |");
                System.out.println("|--------------------------------------|");
                System.out.println();
                for(int i=0; i<arreglo_per.length;i++){
                    if(arreglo_per[i] != null){
                        System.out.print("=> "+(i+1)+". "+arreglo_per[i].getNombres()+" "+arreglo_per[i].getApellidos()+" - "+arreglo_per[i].getCedula());
                        System.out.println();
                    }
                }
            }

            if(opcion==3){
                System.out.println();
                System.out.println("|--------------------------------------|");
                System.out.println("|            EDITAR PERSONA            |");
                System.out.println("|--------------------------------------|");
                System.out.println();
                System.out.print("Ingrese la cedula del usuario ");
                int cedula = entradaNum.nextInt();
                System.out.println();

                int indice_encontrada = -1; 
                for(int i=0; i<arreglo_per.length; i++){
                    if(arreglo_per[i] != null && arreglo_per[i].getCedula()==cedula){
                        indice_encontrada =i; 
                    }
                }

                if(indice_encontrada != -1){
                    System.out.print("Ingrese el nombre del usuario ");
                    String nombres = entradaTexto.nextLine();
                    System.out.println();

                    System.out.print("Ingrese los apellidos del usuario ");
                    String apellidos = entradaTexto.nextLine();
                    System.out.println();

                    System.out.print("Ingrese la edad del usuario ");
                    int edad = entradaNum.nextInt();
                    System.out.println();
                
                    System.out.print("Ingrese la altura del usuario ");
                    int altura = entradaNum.nextInt();
                    System.out.println();

                    System.out.print("Ingrese el peso del usuario ");
                    double peso = entradaNum.nextDouble();

                    Persona temp = new Persona(cedula,nombres,apellidos,edad,altura,peso);
                    arreglo_per [indice_encontrada] = temp;
        
                }else{
                    System.out.print("La cedula ingresada no ha sido encontrada en el sistema ");
                }

            }

            if(opcion==4){
                System.out.println();
                System.out.println("|--------------------------------------|");
                System.out.println("|           ELIMINAR PERSONA           |");
                System.out.println("|--------------------------------------|");
                System.out.println();
                System.out.print("Ingrese la cedula del usuario ");
                int cedula = entradaNum.nextInt();
                System.out.println();

                int indice_encontrado = -1; 
                for(int i=0; i<arreglo_per.length; i++){
                    if(arreglo_per[i] != null && arreglo_per[i].getCedula()==cedula){
                        indice_encontrado =i; 
                    }
                }

                if(indice_encontrado != -1){
                    for(int i=0; i<arreglo_per.length-1 ;i++){
                        arreglo_per[i] = arreglo_per[i+1]; 
                    }

                    arreglo_per[ arreglo_per.length-1 ]= null;
                    indice_persona = indice_persona-1; 
                    System.out.print("La persona ha sido eliminada con exito ");
                }else{
                   System.out.print("La cedula ingresada no ha sido encontrada en el sistema "); 
                }
            }

            if(opcion==5){
                int edad_menor = 200;
                int indice_menor = -1; 

                for (int i = 0; i < arreglo_per.length; i++) {
                    if (arreglo_per[i] != null && arreglo_per[i].getEdad() < edad_menor) {
                        edad_menor = arreglo_per[i].getEdad();
                        indice_menor = i;
                    }
                }

                if (indice_menor != -1) {
                    System.out.println("=> La persona con la edad menor es: " + arreglo_per[indice_menor].getNombres()+" "+arreglo_per[indice_menor].getApellidos());
                    System.out.println("=> la edad menor es: "+edad_menor);
                }
            } 

            if(opcion==6){
                int edad_mayor = 0;
                int indice_mayor = -1; 

                for (int i = 0; i < arreglo_per.length; i++) {
                    if (arreglo_per[i] != null && arreglo_per[i].getEdad() > edad_mayor) {
                        edad_mayor = arreglo_per[i].getEdad();
                        indice_mayor = i;
                    }
                }

                if (indice_mayor != -1) {
                    System.out.println("=> La persona con la edad menor es: " + arreglo_per[indice_mayor].getNombres()+" "+arreglo_per[indice_mayor].getApellidos());
                    System.out.println("=> la edad mayor es: "+edad_mayor);
                }
              
            }
            if(opcion==7){
                int suma = 0; 
                int prom_edad = 0;
                int cont = 0;
                for (int i = 0; i < arreglo_per.length; i++) {
                    if (arreglo_per[i] != null) {
                        suma = suma + arreglo_per[i].getEdad(); 
                        cont = cont +1; 
                    }
                } 
                prom_edad = (suma / cont);
                System.out.println("=> El promedio de edades es: "+prom_edad);
            }

            if(opcion==8){
                double peso_menor = 1000;
                int indice_menor = -1; 

                for (int i = 0; i < arreglo_per.length; i++) {
                    if (arreglo_per[i] != null && arreglo_per[i].getPeso() < peso_menor) {
                        peso_menor = arreglo_per[i].getPeso();
                        indice_menor = i;
                    }
                }

                if (indice_menor != -1) {
                    System.out.println("=> La persona con el peso menor es: " + arreglo_per[indice_menor].getNombres()+" "+arreglo_per[indice_menor].getApellidos());
                    System.out.println("=> el peso menor es: "+peso_menor);
                }

            }

            if(opcion==9){
                double peso_mayor = 0;
                int indice_mayor = -1; 

                for (int i = 0; i < arreglo_per.length; i++) {
                    if (arreglo_per[i] != null && arreglo_per[i].getPeso() > peso_mayor) {
                        peso_mayor = arreglo_per[i].getPeso();
                        indice_mayor = i;
                    }
                }

                if (indice_mayor != -1) {
                    System.out.println("=> La persona con el peso mayor es: " + arreglo_per[indice_mayor].getNombres()+" "+arreglo_per[indice_mayor].getApellidos());
                    System.out.println("=> el peso menor es: "+peso_mayor);
                }
            } 

            if(opcion==10){
                double suma = 0.0; 
                double prom_peso = 0.0;
                int cont = 0;
                for (int i = 0; i < arreglo_per.length; i++) {
                    if (arreglo_per[i] != null) {
                        suma = suma + arreglo_per[i].getPeso(); 
                        cont = cont +1; 
                    }
                } 
                prom_peso = (suma / cont);
                System.out.println("=> El promedio de peso es: "+prom_peso);
            }

            if(opcion==11){
                System.out.println("Ha salido con exito ");
            }
        }
    }
}