import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

import java.awt.*;

public class Facturas extends JFrame {
    public Facturas() {
        initComponents();
    }

    public void initComponents() {
        setTitle("Factura");
        setIconImage(getToolkit().createImage( ClassLoader.getSystemResource("imagenes/icono_factura.png") ));

        setSize(500,650);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        JPanel contenedor = new JPanel();
        contenedor.setBackground(Color.GRAY);
        contenedor.setLayout(new GridBagLayout());
        contenedor.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));

        GridBagConstraints restricciones = new GridBagConstraints();

        JLabel dato_cliente = new JLabel();
        dato_cliente.setText("DATOS CLIENTE:");
        dato_cliente.setFont(new Font("Arial", Font.BOLD, 18));
        dato_cliente.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 0;
        restricciones.gridwidth = 4;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(0, 0, 10, 0);
        contenedor.add(dato_cliente, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);

        JLabel etq_cedula = new JLabel();
        etq_cedula.setText("Cedula: ");
        etq_cedula.setFont(new Font("Arial", Font.BOLD, 15));
        etq_cedula.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 1;
        restricciones.gridwidth = 1; 
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(10, 0, 5, 0);
        contenedor.add(etq_cedula, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);

        JTextField campo_texto = new JTextField();
        restricciones.gridx = 1;
        restricciones.gridy = 1;
        restricciones.gridwidth = 2; 
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(10, 0, 5, 15);
        contenedor.add(campo_texto, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);

        JButton boton_cliente = new JButton();
        boton_cliente.setText("BUSCAR");
        restricciones.gridx = 3;
        restricciones.gridy = 1;
        restricciones.gridwidth = 1; 
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(10, 0, 5, 0);
        contenedor.add(boton_cliente, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);

        JLabel etq_nombres = new JLabel();
        etq_nombres.setText("Nombres: ");
        etq_nombres.setFont(new Font("Arial", Font.BOLD, 15));
        etq_nombres.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 2;
        restricciones.gridwidth = 1; 
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(10, 0, 5, 0);
        contenedor.add(etq_nombres, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);

        JLabel etq_direccion = new JLabel();
        etq_direccion.setText("Direccion: ");
        etq_direccion.setFont(new Font("Arial", Font.BOLD, 15));
        etq_direccion.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 3;
        restricciones.gridwidth = 1; 
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(10, 0, 5, 0);
        contenedor.add(etq_direccion, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);

        JLabel dato_vendedor = new JLabel();
        dato_vendedor.setText("DATOS VENDEDOR:");
        dato_vendedor.setFont(new Font("Arial", Font.BOLD, 18));
        dato_vendedor.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 4;
        restricciones.gridwidth = 4;
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(10, 0, 10, 0);
        contenedor.add(dato_vendedor, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);

        JLabel etq_cedula_vendedor = new JLabel();
        etq_cedula_vendedor.setText("Cedula: ");
        etq_cedula_vendedor.setFont(new Font("Arial", Font.BOLD, 15));
        etq_cedula_vendedor.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 5;
        restricciones.gridwidth = 1; 
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(10, 0, 5, 0);
        contenedor.add(etq_cedula_vendedor, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);

        JTextField campo_texto_vendedor = new JTextField();
        restricciones.gridx = 1;
        restricciones.gridy = 5;
        restricciones.gridwidth = 2; 
        restricciones.gridheight = 1;
        restricciones.weightx = 100;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(10, 0, 5, 15);
        contenedor.add(campo_texto_vendedor, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);

        JButton boton_vendedor = new JButton();
        boton_vendedor.setText("BUSCAR");
        restricciones.gridx = 3;
        restricciones.gridy = 5;
        restricciones.gridwidth = 1; 
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(10, 0, 5, 0);
        contenedor.add(boton_vendedor, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);

        JLabel etq_nombres_vendedor = new JLabel();
        etq_nombres_vendedor.setText("Nombres: ");
        etq_nombres_vendedor.setFont(new Font("Arial", Font.BOLD, 15));
        etq_nombres_vendedor.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 6;
        restricciones.gridwidth = 1; 
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(10, 0, 5, 0);
        contenedor.add(etq_nombres_vendedor, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);

        JLabel etq_factura = new JLabel();
        etq_factura.setText("LISTA DE PRODUCTOS FACTURADOS: ");
        etq_factura.setFont(new Font("Arial", Font.BOLD, 18));
        etq_factura.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 7;
        restricciones.gridwidth = 4; 
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(10, 0, 5, 0);
        contenedor.add(etq_factura, restricciones); 
        restricciones.insets = new Insets(0, 0, 0, 0);

        JLabel etq_productos = new JLabel();
        etq_productos.setText("        ID               NOMBRE                   CANT ");
        etq_productos.setFont(new Font("Arial", Font.BOLD, 15));
        etq_productos.setHorizontalAlignment(JLabel.LEFT);
        restricciones.gridx = 0;
        restricciones.gridy = 8;
        restricciones.gridwidth = 4; 
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(10, 0, 5, 0);
        contenedor.add(etq_productos, restricciones); 
        restricciones.insets = new Insets(0, 0, 0, 0);

        JTextField campo_texto_id = new JTextField();
        restricciones.gridx = 0;
        restricciones.gridy = 9;
        restricciones.gridwidth = 1; 
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(10, 0, 5, 0);
        contenedor.add(campo_texto_id, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);

        JTextField campo_texto_nombre = new JTextField();
        restricciones.gridx = 1;
        restricciones.gridy = 9;
        restricciones.gridwidth = 1; 
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(10, 0, 5, 0);
        contenedor.add(campo_texto_nombre, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);

        JTextField campo_texto_cant = new JTextField();
        restricciones.gridx = 2;
        restricciones.gridy = 9;
        restricciones.gridwidth = 1; 
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(10, 0, 5, 15);
        contenedor.add(campo_texto_cant, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);

        JButton boton_agregar = new JButton();
        boton_agregar.setText("ADD");
        restricciones.gridx = 3;
        restricciones.gridy = 9;
        restricciones.gridwidth = 1; 
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(10, 0, 5, 0);
        contenedor.add(boton_agregar, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);

        JLabel etq_producto = new JLabel();
        etq_producto.setHorizontalAlignment(JLabel.CENTER);
        JScrollPane scroll = new JScrollPane(etq_producto);
        restricciones.gridx=0;
        restricciones.gridy=10;
        restricciones.gridwidth=4;
        restricciones.gridheight=1;
        restricciones.weightx=100;
        restricciones.weighty=90;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(10, 0, 5, 0);
        contenedor.add(scroll, restricciones);
        restricciones.insets = new Insets(0, 0, 0, 0);

        JLabel etq_total = new JLabel();
        etq_total.setText("Total $ 0");
        etq_total.setFont(new Font("Arial", Font.BOLD, 15));
        etq_total.setHorizontalAlignment(JLabel.RIGHT);
        restricciones.gridx = 3;
        restricciones.gridy = 11;
        restricciones.gridwidth = 1; 
        restricciones.gridheight = 1;
        restricciones.weightx = 1;
        restricciones.weighty = 1;
        restricciones.fill = GridBagConstraints.BOTH;
        restricciones.insets = new Insets(10, 0, 0, 0);
        contenedor.add(etq_total, restricciones);
        

        add(contenedor);
        setVisible(true);
        revalidate();
    }
}
