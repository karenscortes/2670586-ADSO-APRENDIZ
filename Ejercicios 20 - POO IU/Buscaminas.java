import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.NumberFormat;
import java.util.Locale;
import javax.swing.border.*;

public class Buscaminas extends JFrame {

    private JLabel etq_20_bombas; 
    private JLabel etq_000;
    private JButton btn_inicio;
    private JButton casillas [][];
    private JPanel tablero;

    public Buscaminas (){
        initComponent();
    }

    public void initComponent(){
        setTitle("BUSCAMINAS");
		setSize( 500, 600);
        setDefaultCloseOperation( EXIT_ON_CLOSE );
		setLocationRelativeTo(null);

        setIconImage( getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_bomba.png") ) );

		JPanel contPrincipal = new JPanel();
		contPrincipal.setLayout(new GridBagLayout());
		contPrincipal.setBorder( BorderFactory.createEmptyBorder(10, 10, 10, 10) );
        contPrincipal.setBackground(Color.WHITE);
		GridBagConstraints restriccion = new GridBagConstraints();

        etq_20_bombas = new JLabel("020");
        etq_20_bombas.setFont(new Font("Arial", Font.BOLD, 30) );
        etq_20_bombas.setHorizontalAlignment( JLabel.CENTER );
        etq_20_bombas.setBackground(Color.BLACK);
        etq_20_bombas.setForeground(Color.MAGENTA);
        etq_20_bombas.setOpaque(true); 
        etq_20_bombas.setBorder( BorderFactory.createEmptyBorder(5,10, 5, 5) );
		restriccion.gridy = 0;
		restriccion.gridx = 0;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 1;
		restriccion.weightx = 1;
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( etq_20_bombas, restriccion );

        btn_inicio = new JButton();
		btn_inicio.setFocusable(false);
		restriccion.gridy = 0;
		restriccion.gridx = 1;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 1;
		restriccion.weightx = 1;
		restriccion.fill = GridBagConstraints.BOTH;
        btn_inicio.setBorder( BorderFactory.createEmptyBorder(5,15, 5, 15) );
		contPrincipal.add( btn_inicio, restriccion );

      
       ImageIcon carita = new ImageIcon("imagenes/icono_happy.png"); 
       Image imagen = carita.getImage(); 
       Image nueva = imagen.getScaledInstance(30, 30, Image.SCALE_SMOOTH);
       carita = new ImageIcon(nueva);
       btn_inicio.setIcon(carita);


        etq_000 = new JLabel("000");
        etq_000.setFont(new Font("Arial", Font.BOLD, 30) );
        etq_000.setHorizontalAlignment( JLabel.CENTER );
        etq_000.setBackground(Color.BLACK);
        etq_000.setForeground(Color.MAGENTA);
        etq_000.setOpaque(true); 
        etq_000.setBorder( BorderFactory.createEmptyBorder(5,0, 5, 0) );
		restriccion.gridy = 0;
		restriccion.gridx = 2;
		restriccion.gridheight = 1;
		restriccion.gridwidth = 1;
		restriccion.weighty = 1;
		restriccion.weightx = 1;
		restriccion.fill = GridBagConstraints.BOTH;
		contPrincipal.add( etq_000, restriccion );

        tablero = new JPanel();
        tablero.setLayout( new GridBagLayout() );
        tablero.setBackground(Color.WHITE);
        restriccion.gridy = 1;
        restriccion.gridx = 0;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 4;
        restriccion.weighty = 90;
        restriccion.weightx = 100;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(10, 5, 0, 5);
        contPrincipal.add( tablero, restriccion );

        casillas = new JButton[9][9];

        for(int i=0; i<casillas.length; i++){
            for(int j=0; j<casillas.length; j++){
                casillas[i][j] = new JButton();
		        restriccion.gridy =j;
		        restriccion.gridx = i;
		        restriccion.gridheight = 1;
		        restriccion.gridwidth = 1;
		        restriccion.weighty = 1;
		        restriccion.weightx = 1;
		        restriccion.fill = GridBagConstraints.BOTH;
                restriccion.insets = new Insets(0, 0, 0, 0); 
                tablero.add(casillas[i][j], restriccion);
            }
        }

        add( contPrincipal );
		setResizable(false);
		setVisible(true);
		revalidate();
		repaint(); 
    }
    
}