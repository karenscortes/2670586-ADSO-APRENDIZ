import java.util.Scanner;

public class Principal{

    public static void main(String[] args){
        Scanner tecladoN = new Scanner(System.in);
        Scanner tecladoT = new Scanner(System.in);

        Perro array [] = new Perro [10]; 

        array[0] = new Perro("Roxi","Bella",24,"Shih tzu",30.6,10,60); 
        array[1] = new Perro("Remi","Karen",60,"Pastor aleman",49.4,65,50); 
        array[2] = new Perro("Levi","Dayanna",120,"Golden retriever",59.4,85,80); 
        array[3] = new Perro("Luna","Ana",12,"Pomerania",29.9,90,30);  

        /* System.out.print("-> Ingrese el nombre de su perro "); 
        String nombre = tecladoT.nextLine();

        System.out.print("-> Ingrese su nombre "); 
        String propietario = tecladoT.nextLine();

        System.out.print("-> Ingrese la edad de su perro "); 
        int edad = tecladoN.nextInt();

        System.out.print("-> Ingrese la raza de su perro "); 
        String raza = tecladoT.nextLine();

        System.out.print("-> Ingrese el peso de su perro "); 
        double peso = tecladoN.nextDouble();

        System.out.print("-> Ingrese la energia de su perro "); 
        int energia = tecladoN.nextInt();

        System.out.print("-> Ingrese el hambre de su perro "); 
        int hambre = tecladoN.nextInt();

        array[4] = new Perro(nombre,propietario,edad,raza,peso,energia,hambre); */


        for(int i = 0; i<array.length; i++){
            if(array[i]!=null){
               array[i].imprimir();
            }
        } 

        Perro pesado = array[0]; 

        if(pesado!=null){
            for(int i = 0; i<array.length; i++){
    
                if(array[i]!=null){ 
                
                    if(array[i].getPeso() >= pesado.getPeso()){
                        pesado = array[i];
                    }
                
               
                }
            } 

            System.out.print("-> Perro mas pesado: "+pesado.getNombre()+" con "+pesado.getPeso()+" Kg");

        }


    }
}