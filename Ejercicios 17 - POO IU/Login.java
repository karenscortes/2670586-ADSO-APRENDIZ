import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*; 
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame {
    JPanel contenedor; 
    GridLayout capa; 
    JLabel etiquetaUser; 
    JLabel etiquetaPass; 
    JTextField campoUser;
    JPasswordField campoPass; 
    JButton bthIngresar; 
    JButton btnSalir; 

    public Login (){
        initComponents();  
    } 

    public void initComponents(){
        setVisible(true);
        setTitle("Primera");
        setLocationRelativeTo(null); 
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        contenedor = new JPanel(); 
        capa = new GridLayout(3,2); 
        contenedor.setLayout(capa);
        contenedor.setBorder(new EmptyBorder(10,10,10,10));

        etiquetaUser = new JLabel("Usuario:  ");
        etiquetaPass = new JLabel("Password:  ");
        campoUser = new JTextField(); 
        campoPass = new JPasswordField(); 
        bthIngresar = new JButton("Inicio");
        btnSalir = new JButton("Salir");

        contenedor.add(etiquetaUser); 
        contenedor.add(campoUser); 
        contenedor.add(etiquetaPass); 
        contenedor.add(campoPass); 
        contenedor.add(bthIngresar); 
        contenedor.add(btnSalir); 

        add(contenedor); 
        pack();

        ActionListener eventoIngresar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                validarDatosSesion();
            }
        };

        ActionListener eventoCerrar = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                cerrarSesion();
            }
        };

        bthIngresar.addActionListener(eventoIngresar); 

        btnSalir.addActionListener(eventoCerrar); 
    }

    public void validarDatosSesion(){
        String textoUser = campoUser.getText();  
        String textoPass = campoPass.getText(); 

        System.out.println("Usuario: "+textoPass);
        System.out.println("Password: "+textoPass);

    } 

    public void cerrarSesion(){
        System.out.println("Aplicacion cerrada");
        dispose();
    }
}










