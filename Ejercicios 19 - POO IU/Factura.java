
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Factura extends JFrame {

    public Factura() {
        initComponents();
    }

    public void initComponents() {
        setTitle("Factura");
        setIconImage(getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_factura.png") ));

        setSize(550, 650);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        JPanel contenedor = new JPanel();
        contenedor.setBackground(Color.WHITE);
        contenedor.setLayout(new GridBagLayout());
        contenedor.setBorder(BorderFactory.createEmptyBorder(15, 15, 15, 15));

        GridBagConstraints restricciones = new GridBagConstraints();
        // restricciones.insets = new Insets(10, 5, 10, 5); 

        JLabel dato_cliente = new JLabel();
        dato_cliente.setText("DATOS CLIENTE:");
        dato_cliente.setFont(new Font("Arial", Font.BOLD, 18));
        dato_cliente.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 0;
        restricciones.gridwidth = 2;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.fill = GridBagConstraints.BOTH;

        contenedor.add(dato_cliente, restricciones);

        JLabel etq_cedula = new JLabel();
        etq_cedula.setText("Cedula: ");
        etq_cedula.setFont(new Font("Arial", Font.BOLD, 15));
        etq_cedula.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 1;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 0;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_cedula, restricciones);

        JTextField campo_cedula = new JTextField();
        campo_cedula.setColumns(20);
        restricciones.gridx = 1;
        restricciones.gridy = 1;
        restricciones.gridwidth = 1; 
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(campo_cedula, restricciones);

        JButton btn_cliente = new JButton();
        btn_cliente.setText("BUSCAR");
        btn_cliente.setFont(new Font("Arial", Font.BOLD, 12));
        btn_cliente.setBackground(Color.CYAN);
        restricciones.gridx = 4;
        restricciones.gridy = 1;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 0;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(btn_cliente, restricciones);
        

        JLabel etq_nombres = new JLabel();
        etq_nombres.setText("Nombres: ");
        etq_nombres.setFont(new Font("Arial", Font.BOLD, 15));
        etq_nombres.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 2;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 0;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(0, 0, 0, 10);
        contenedor.add(etq_nombres, restricciones);

        JLabel etq_direccion = new JLabel();
        etq_direccion.setText("Direccion: ");
        etq_direccion.setFont(new Font("Arial", Font.BOLD, 15));
        etq_direccion.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 3;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 0;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(0, 0, 0, 10);
        contenedor.add(etq_direccion, restricciones);

        JLabel dato_vendedor = new JLabel();
        dato_vendedor.setText("DATOS VENDEDOR:");
        dato_vendedor.setFont(new Font("Arial", Font.BOLD, 18));
        dato_vendedor.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 4;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 0;
        restricciones.fill = GridBagConstraints.BOTH;

        contenedor.add(dato_vendedor, restricciones);

        JLabel etq_cedula_vendedor = new JLabel();
        etq_cedula_vendedor.setText("Cedula: ");
        etq_cedula_vendedor.setFont(new Font("Arial", Font.BOLD, 15));
        etq_cedula_vendedor.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 5;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 50;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(etq_cedula_vendedor, restricciones);

        JTextField campo_cedula_vendedor = new JTextField();
        campo_cedula_vendedor.setColumns(20);
        restricciones.gridx = 1;
        restricciones.gridy = 5;
        restricciones.gridwidth = 3; 
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(campo_cedula_vendedor, restricciones);

        JButton btn_cliente_vendedor = new JButton();
        btn_cliente_vendedor.setText("BUSCAR");
        btn_cliente_vendedor.setFont(new Font("Arial", Font.BOLD, 12));
        btn_cliente_vendedor.setBackground(Color.CYAN);
        restricciones.gridx = 4;
        restricciones.gridy = 5;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 0;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(btn_cliente_vendedor, restricciones);

        JLabel etq_nombres_vendedor = new JLabel();
        etq_nombres_vendedor.setText("Nombres: ");
        etq_nombres_vendedor.setFont(new Font("Arial", Font.BOLD, 15));
        etq_nombres_vendedor.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 6;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 0;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(0, 0, 0, 10);
        contenedor.add(etq_nombres_vendedor, restricciones);

        JLabel titulo_lista = new JLabel();
        titulo_lista.setText("LISTA DE PRODUCTOS:");
        titulo_lista.setFont(new Font("Arial", Font.BOLD, 18));
        titulo_lista.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 7;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 0;
        restricciones.fill = GridBagConstraints.BOTH;

        contenedor.add(titulo_lista, restricciones);

        JLabel datos = new JLabel();
        datos.setText("         ID                NOMBRE                    CANT           ");
        datos.setFont(new Font("Arial", Font.BOLD, 15));
        datos.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 8;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty = 0;
        restricciones.fill = GridBagConstraints.BOTH;

        contenedor.add(datos, restricciones);

        JTextField campo_id = new JTextField();
        campo_id.setColumns(20);
        restricciones.gridx = 0;
        restricciones.gridy = 9;
        restricciones.gridwidth = 1; 
        restricciones.gridheight = 1;
        restricciones.weightx = 0.2;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(campo_id, restricciones);

        JTextField campo_producto = new JTextField();
        campo_producto.setColumns(20);
        restricciones.gridx = 1;
        restricciones.gridy = 9;
        restricciones.gridwidth = 1; 
        restricciones.gridheight = 1;
        restricciones.weightx = 0.6;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(campo_producto, restricciones);

        JTextField campo_cant = new JTextField();
        campo_cant.setColumns(20);
        restricciones.gridx = 2;
        restricciones.gridy = 9;
        restricciones.gridwidth = 1; 
        restricciones.gridheight = 1;
        restricciones.weightx = 0.2;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(campo_cant, restricciones);

        JButton btn_add_producto = new JButton();
        btn_add_producto.setText("ADD");
        btn_add_producto.setFont(new Font("Arial", Font.BOLD, 12));
        btn_add_producto.setBackground(Color.CYAN);
        restricciones.gridx = 3;
        restricciones.gridy = 9;
        restricciones.gridwidth = 1;
        restricciones.gridheight = 1;
        restricciones.weightx = 0;
        restricciones.fill = GridBagConstraints.BOTH;
        contenedor.add(btn_add_producto, restricciones);



        add(contenedor);
        setVisible(true);
        revalidate();
    }
} 





 


