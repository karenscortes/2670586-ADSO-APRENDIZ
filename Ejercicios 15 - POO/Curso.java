public class Curso {
    public String codigo; 
    public String nombre; 
    public String areaConocimiento; 
    public int duracionHoras; 
    public String temas []; 

    public Curso(String codigo, String nombre, String areaConocimiento, int duracionHoras){
        this.codigo = codigo; 
        this.nombre = nombre; 
        this.areaConocimiento = areaConocimiento; 
        this.duracionHoras = duracionHoras;
        this.temas = new String [15]; 
    }

    public String getCodigo(){
        return codigo;
    } 

    public String getNombre(){
        return nombre;
    } 

    public String getAreaConocimiento(){
        return areaConocimiento;
    } 

    public int getDuracionHoras(){
        return duracionHoras;
    }



    public void setCodigo(String dato){
        codigo = dato; 
    }

    public void setNombre(String dato){
        nombre = dato; 
    }

    public void setAreaConocimiento(String dato){
        areaConocimiento = dato; 
    } 

    public void setDuracionHoras(int dato){
        duracionHoras = dato; 
    } 

    int indiceTema = 0; 
    

    public void imprimir(){
        System.out.println();
        System.out.println("|--------------------------------------|");
        System.out.println("|            DETALLE CURSO             |");
        System.out.println("|--------------------------------------|");
        System.out.println("|                                      |");
        System.out.println("|  Codigo: "+codigo +"                      |");
        System.out.println("|  Nombre: "+nombre +"                        |");
        System.out.println("|  Area conocimiento: "+areaConocimiento +"       |");
        System.out.println("|  Duracion: "+duracionHoras+"                      |");
        System.out.println("|  Temas:                              |");
        for(int i=0; i<temas.length; i++){
            if(temas[i]!=null){
               System.out.println("|            "+temas[i]+"              |");
            }
        }
        System.out.println("|--------------------------------------|");
        System.out.println();
    } 

    

    public void editar(String newnombre, String area, int duracion){
        nombre = newnombre; 
        areaConocimiento = area; 
        duracionHoras = duracion; 
        System.out.println();
        System.out.println("La informacion del curso ha sido actualizada exitosamente");
        System.out.println();
    }

    public void agregarTema(String tema){
        temas[indiceTema]=tema;
        indiceTema++;
    } 

    
    
}