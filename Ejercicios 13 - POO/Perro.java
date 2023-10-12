public class Perro {

    private String nombre; 
    private String propietario; 
    private int edad; 
    private String raza; 
    private double peso; 
    private int energia; 

    public Perro(String nombre, String propietario, int edad, String raza, double peso, int energia){
        this.nombre = nombre; 
        this.propietario = propietario; 
        this.edad = edad; 
        this.raza = raza; 
        this.peso = peso; 
        this.energia = energia;
    }

    public void imprimir(){
        System.out.println("|-----------------------------|");
        System.out.println("|                              ");
        System.out.println("|   Nombre: "+nombre);
        System.out.println("|   Propietario: "+propietario);
        System.out.println("|   edad: "+edad+" meses");
        System.out.println("|   raza: "+raza);
        System.out.println("|   peso: "+peso+" Kg");
        System.out.println("|   energia: "+energia);
        System.out.println("|                               ");
        System.out.println("|------------------------------|");
        
    }

    public String getNombre(){
        return nombre;
    }

    public String getPropietario(){
        return propietario;
    }

    public int getEdad(){
        return edad;
    }

    public String getRaza(){
        return raza;
    }

    public double getPeso(){
        return peso;
    }

    public int getEnergia(){
        return energia;
    } 


    public void setNombre(String dato){
        nombre = dato;
    }

    public void setPropietario(String dato){
        propietario = dato;
    }

    public void setEdad(int dato){
        edad = dato;
    }

    public void setRaza(String dato){
        raza = dato;
    }

    public void setPeso(double dato){
        peso = dato;
    } 

    public void setEnergia(int dato){
        energia = dato;
    }

    public void comer(int gramos){

        peso = peso + ((double)gramos/1000); 

        if(gramos<=250){
            energia = energia + (gramos/100);
        }else if(gramos>=250){
            energia = energia - (gramos/100);
        } 

        if(energia>100){
            energia = 100; 
        }
        if(energia<11){
            System.out.println("|-----------------------------------|");
            System.out.println(" SU PERRO ESTA RENDIDO DEJELO DORMIR ");
            System.out.println("|-----------------------------------|");
        }
        if(energia<=0){
            energia = 1;
        }
    } 

    public void jugar(int minutos){

        energia = energia + (minutos/60);

        if(energia>100){
            energia = 100; 
        }
        if(energia<11){
            System.out.println("|-----------------------------------|");
            System.out.println(" SU PERRO ESTA RENDIDO DEJELO DORMIR ");
            System.out.println("|-----------------------------------|");
        }
        if(energia<=0){
            energia = 1;
        }
    
    }

    public void defecar(int gramos){
        peso = peso - ((double)gramos/1000); 
    }
    
    public void dormir(int minutos){
        minutos = minutos / 60; 
        if(minutos>20 || minutos<12){
            energia = energia - minutos; 
        }else if(minutos<=20 && minutos>=12){
            energia = energia + minutos; 
        }

        if(energia>100){
            energia = 100; 
        }
        if(energia<11){
            System.out.println("|-----------------------------------|");
            System.out.println(" SU PERRO ESTA RENDIDO DEJELO DORMIR ");
            System.out.println("|-----------------------------------|");
        }
        if(energia<=0){
            energia = 1;
        }
    }

    public void ladrar(int ladridos){
        energia = energia - ladridos;

        if(energia<11){
            System.out.println("|-----------------------------------|");
            System.out.println(" SU PERRO ESTA RENDIDO DEJELO DORMIR ");
            System.out.println("|-----------------------------------|");
        }
        if(energia<=0){
            energia = 1;
        }
    }



}