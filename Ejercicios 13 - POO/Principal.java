public class Principal{

    public static void main(String[] args){
        /* clases: definen nuevos tipos de datos. 
                   una clase es una plantilla que se 
                   usara para crear objetos/variables */ 

            /* atributos: datos propios de la clase definida. 
                          caracteristicas de la clases.
                          son varibles globales. */ 

            /* metodos: acciones que pueden realizar un objeto. 
                        pertenece a la clase.
                        se representan como funciones  */ 

        Perro perro1= new Perro("Roxi","Bella",24,"Shih tzu",30.6,85); 
        Perro perro2= new Perro("Remi","Karen",60,"Pastor aleman",49.4,65);

        perro1.comer(800);

        perro1.imprimir(); 
    }
}