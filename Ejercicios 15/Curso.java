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
    int indiceCurso = 0;
    int size = 99;
    Curso array [] = new Curso [size];

    public void agrgarCurso(Curso curso){
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && array[i].getCodigo().equals(curso.getCodigo())) {
                System.out.println("-> El código ya corresponde a un curso existente");
            
            }else{
                array[posicionInsercion] = curso;
                indiceCurso++;
                size--;

                System.out.println("-> El curso ha sido agregado correctamente");
            }
        }

        /* array[posicionInsercion] = curso;
        indiceCurso++;
        size--;

        System.out.println("-> El curso ha sido agregado correctamente"); */

      /*   si lo pongo por fuera del for aunque este repetido el codigo lo agrega y dentro del for lo agrega en todas las posiciones del array */
        
    }

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

    public void imprimirListado(){
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

    public void eliminarCurso(String codigo){
        for(int i=0; i<array.length; i++){
            if(array[i]!=null){
                if(array[i].codigo.equals(codigo)){
                    array[i]= null;
                    System.out.println();
                    System.out.println("-> El curso ha sido eliminado correctamente");
                    System.out.println();
                }else{
                    System.out.println();
                    System.out.println("-> El codigo no corresponde a ningun curso");
                    System.out.println();
                }
            }
        }
    }
    
}