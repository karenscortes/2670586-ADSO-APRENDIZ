
package principal;

import utils.BaseDatos;

public class Principal {
    public static void main(String[] args) {
        BaseDatos datos = new BaseDatos();
        Menu ventana = new Menu(datos);
        
    }    
}
