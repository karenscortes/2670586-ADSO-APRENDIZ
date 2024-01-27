
package appregistro;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Presentacion extends JFrame {
    public Presentacion (){
        initComponents(); 
    }
    
    public void initComponents(){
        setTitle("Presentacion");
        setSize(500, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        JPanel contenedor = new JPanel();
        contenedor.setLayout(new BoxLayout (contenedor,BoxLayout.Y_AXIS));
        
        JLabel titulo = new JLabel(); 
        titulo.setText("Formulario");
        titulo.setFont(new Font("Arial", Font.BOLD, 25));
        contenedor.add(titulo);
        titulo.setHorizontalAlignment(JLabel.CENTER);
        
        JTextField campo_nombre = new JTextField(); 
        contenedor.add(campo_nombre);
        
        JButton btn_iniciar = new JButton(); 
        btn_iniciar.setText("Inicio");
        contenedor.add(btn_iniciar); 
        
        JLabel etq_respuesta = new JLabel(); 
        contenedor.add(etq_respuesta);
        
        ActionListener evento_inicio = new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                String texto = campo_nombre.getText(); 
                etq_respuesta.setText(texto);
                campo_nombre.setText("");
            }
        };
        btn_iniciar.addActionListener(evento_inicio);
        
        
        add(contenedor);
        setVisible(true);
        revalidate();
    }
}
