import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
import java.text.DecimalFormat;
import java.awt.*;

public class Ventana extends JFrame{

    JLabel listaLabels[];
    Materia listaMaterias[];
    JTextField campo_nota;
    JTextField campo_credito; 
    JTextField campo_materia;
    JLabel campo_total;
    float suma_notas =0;
    float suma_creditos =0;
    int indice_agregar =0;
    GridBagConstraints restriccion;
    GridBagConstraints condiciones;
    JPanel contItems;
    JLabel etq_temporal;
    Materia lisMateria [];

    public Ventana (Materia [] lisMateria){
        this.lisMateria = lisMateria;
        initComponents();
    }
    
    public void initComponents(){
        this.listaLabels = new JLabel[50];

        setSize(600,599);
        setTitle("Promedio ponderado");
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel contPrincipal = new JPanel();
        GridBagLayout layout = new GridBagLayout();
        contPrincipal.setLayout(layout);
        contPrincipal.setBackground( Color.white);
        contPrincipal.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
        setIconImage(getToolkit().createImage(ClassLoader.getSystemResource("imagenes/icono_promedio.png")));

        GridBagConstraints restriccion = new GridBagConstraints();

        JLabel etq_titulo = new JLabel();
        etq_titulo.setText("CALCULAR PROMEDIO");
        etq_titulo.setFont(new Font("Arial", Font.BOLD, 35));
        etq_titulo.setHorizontalAlignment(JLabel.CENTER);
        restriccion.gridy=0;
        restriccion.gridx=0;
        restriccion.gridwidth=4;
        restriccion.gridheight=1;
        restriccion.weighty=1;
        restriccion.weightx=100;
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add(etq_titulo,restriccion);

        JPanel conte2 = new JPanel();
        conte2.setSize(500, 500);
        GridBagLayout layout2 = new GridBagLayout();
        conte2.setLayout(layout2);
        conte2.setBackground( new Color(240,240,240));

        int paddingInterno = 20;
        conte2.setBorder(BorderFactory.createEmptyBorder(paddingInterno, paddingInterno, paddingInterno, paddingInterno));
        conte2.setBorder(BorderFactory.createEmptyBorder(20, 1, paddingInterno, 0));

        JLabel etq_materia = new JLabel();
        etq_materia.setText("Materia: ");
        etq_materia.setFont(new Font("Arial", Font.BOLD, 20));
        etq_materia.setHorizontalAlignment(JLabel.LEFT);
        restriccion.gridy=0;
        restriccion.gridx=0;
        restriccion.gridwidth=1;
        restriccion.gridheight=1;
        restriccion.weighty=1;
        restriccion.weightx=1;
        restriccion.insets = new Insets(0, 0, 5, 0);
        restriccion.fill = GridBagConstraints.BOTH;
        conte2.add(etq_materia,restriccion);
        restriccion.insets = new Insets(0, 0, 0, 0);

        campo_materia = new JTextField();
        campo_materia.setColumns(15);
        campo_materia.setMargin(new Insets(5, 5, 5, 5));
        campo_materia.setFont(new Font("Arial", Font.BOLD, 12));
        restriccion.gridy=0;
        restriccion.gridx=1;
        restriccion.gridwidth=1;
        restriccion.gridheight=1;
        restriccion.weighty=1;
        restriccion.weightx=1;
        restriccion.fill = GridBagConstraints.HORIZONTAL;
        conte2.add(campo_materia, restriccion);

        JLabel etq_creditos = new JLabel();
        etq_creditos.setText("Creditos: ");
        etq_creditos.setFont(new Font("Arial", Font.BOLD, 20));
        etq_creditos.setHorizontalAlignment(JLabel.LEFT);
        restriccion.gridy=0;
        restriccion.gridx=2;
        restriccion.gridwidth=1;
        restriccion.gridheight=1;
        restriccion.weighty=1;
        restriccion.weightx=1;
        restriccion.fill = GridBagConstraints.BOTH;
        conte2.add(etq_creditos,restriccion);

        campo_credito = new JTextField();
        campo_credito.setColumns(15);
        campo_credito.setMargin(new Insets(5, 5, 5, 5));
        campo_credito.setFont(new Font("Arial", Font.BOLD, 12));
        restriccion.gridy=0;
        restriccion.gridx=3;
        restriccion.gridwidth=1;
        restriccion.gridheight=1;
        restriccion.weighty=1;
        restriccion.weightx=1;
        restriccion.fill = GridBagConstraints.HORIZONTAL;
        conte2.add(campo_credito, restriccion);

        JLabel etq_nota = new JLabel();
        etq_nota.setText("Nota: ");
        etq_nota.setFont(new Font("Arial", Font.BOLD, 20));
        etq_nota.setHorizontalAlignment(JLabel.CENTER);
        restriccion.gridy=1;
        restriccion.gridx=0;
        restriccion.gridwidth=1;
        restriccion.gridheight=1;
        restriccion.weighty=1;
        restriccion.weightx=1;
        restriccion.insets = new Insets(0, 0, 5, 0);
        restriccion.fill = GridBagConstraints.BOTH;
        conte2.add(etq_nota,restriccion);
        restriccion.insets = new Insets(0, 0, 0, 0);

        
        campo_nota = new JTextField();
        campo_nota.setColumns(15);
        campo_nota.setMargin(new Insets(5, 5, 5, 5));
        campo_nota.setFont(new Font("Arial", Font.BOLD, 12));
        restriccion.gridy=1;
        restriccion.gridx=1;
        restriccion.gridwidth=1;
        restriccion.gridheight=1;
        restriccion.weighty=0;
        restriccion.weightx=1;
        restriccion.fill = GridBagConstraints.HORIZONTAL;
        conte2.add(campo_nota, restriccion);

        Button btn_registrar = new Button("Registrar");
        btn_registrar.setBackground(new Color(30,155,250));
        restriccion.gridy=1;
        restriccion.gridx=2;
        restriccion.gridwidth=1;
        restriccion.gridheight=1;
        restriccion.weighty=1;
        restriccion.weightx=50;
        restriccion.insets = new Insets(0, 15, 2, 10);
        restriccion.fill = GridBagConstraints.BOTH;
        conte2.add(btn_registrar,restriccion);
        restriccion.insets = new Insets(0, 0, 0, 0);
        

        restriccion.gridy = 1;
        restriccion.gridx = 1;
        restriccion.gridwidth=4;
        restriccion.gridheight=1;
        restriccion.weighty=1;
        restriccion.weightx=1;
        contPrincipal.add(conte2,restriccion);

        JLabel etq_resumen = new JLabel();
        etq_resumen.setText("RESUMEN");
        etq_resumen.setFont(new Font("Arial", Font.BOLD, 20));
        etq_resumen.setHorizontalAlignment(JLabel.CENTER);
        restriccion.gridy=2;
        restriccion.gridx=0;
        restriccion.gridwidth=4;
        restriccion.gridheight=1;
        restriccion.weighty=1;
        restriccion.weightx=1;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(15, 5, 5, 5);
        contPrincipal.add(etq_resumen,restriccion);
        restriccion.insets = new Insets(0, 0, 0, 0);


        contItems = new JPanel();
        contItems.setSize(100, 100);
        contItems.setLayout( new GridBagLayout() );
        contItems.setBackground(Color.WHITE);
        JScrollPane scrollPane = new JScrollPane(contItems);
        scrollPane.setBorder(null);

        condiciones = new GridBagConstraints();

        Border borderColor = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.decode("#D5D5D5"));
        Border borderPadding = new EmptyBorder(3,10,3,10);
        Border borderGris = new CompoundBorder(borderColor, borderPadding);

        restriccion.gridy = 3;
        restriccion.gridx = 1;
        restriccion.gridheight = 1;
        restriccion.gridwidth = 4;
        restriccion.weighty = 89;
        restriccion.weightx = 100;
        restriccion.fill = GridBagConstraints.BOTH;
        restriccion.insets = new Insets(10, 1, 1, 10);
        contPrincipal.add( scrollPane, restriccion );
        

        for (int i=0; i<this.listaLabels.length; i++) {
            etq_temporal = new JLabel(" ");
            etq_temporal.setHorizontalAlignment( JLabel.CENTER );
            etq_temporal.setFont( new Font("Arial", Font.PLAIN, 18) );
            etq_temporal.setOpaque(true);
            etq_temporal.setBackground( Color.white );
            etq_temporal.setBorder( borderGris );
            this.listaLabels[i] = etq_temporal;
            condiciones.gridy = i;
            condiciones.gridx = 0;
            condiciones.gridheight = 1;
            condiciones.gridwidth = 1;
            condiciones.weighty = 1;
            condiciones.weightx = 1;
            condiciones.fill = GridBagConstraints.HORIZONTAL;
            condiciones.anchor = GridBagConstraints.NORTH;
            condiciones.insets = new Insets(0, 0, 0, 0);
            contItems.add(this.listaLabels[i], condiciones);
        }

        
        campo_total = new JLabel();
        campo_total.setText("");
        campo_total.setFont(new Font("Arial", Font.BOLD, 20));
        campo_total.setHorizontalAlignment(JLabel.CENTER);
        restriccion.gridy=4;
        restriccion.gridx=1;
        restriccion.gridwidth=2;
        restriccion.gridheight=1;
        restriccion.weighty=1;
        restriccion.weightx=1;
        restriccion.fill = GridBagConstraints.BOTH;
        contPrincipal.add(campo_total,restriccion);

        Button btn_limpiar = new Button("LIMPIAR");
        btn_limpiar.setBackground(new Color(250, 50, 50));
        restriccion.gridy=5;
        restriccion.gridx=1;
        restriccion.gridwidth=1;
        restriccion.gridheight=1;
        restriccion.weighty=1;
        restriccion.weightx=1;
        restriccion.fill = GridBagConstraints.BOTH;
        condiciones.insets = new Insets(0, 0, 0, 0);
        contPrincipal.add(btn_limpiar,restriccion);

        ActionListener evento_click_registrar = new ActionListener() {
			public void actionPerformed(ActionEvent event){
				registrar();
                System.out.println("hola");
			}
		};
		btn_registrar.addActionListener(evento_click_registrar);

        ActionListener evento_click_limpiar = new ActionListener() {
			public void actionPerformed(ActionEvent event){
				limpiar();
			}
		};
		btn_limpiar.addActionListener(evento_click_limpiar);

        KeyListener eventoKey_materia = new KeyListener(){
			public void keyPressed(KeyEvent e){
			}
	
			public void keyReleased(KeyEvent e){
				int tecla = e.getKeyCode(); 
				if(tecla == 10){
					registrar();
				}
				
			}
	
			public void keyTyped(KeyEvent e){
			}
		};
	
		campo_nota.addKeyListener( eventoKey_materia );

        KeyListener eventoKey_credito = new KeyListener(){
			public void keyPressed(KeyEvent e){
			}
	
			public void keyReleased(KeyEvent e){

				int tecla = e.getKeyCode(); 
				if(tecla == 10){
					autocomp();
				}
			}
	
			public void keyTyped(KeyEvent e){
			}
		};
        campo_materia.addKeyListener( eventoKey_credito ); 

        this.add(contPrincipal);
        setVisible(true);
        revalidate();
        repaint();

    }

    public void registrar(){
        float nota = Float.parseFloat(campo_nota.getText());
        float credito = Float.parseFloat(campo_credito.getText());
        String materia = campo_materia.getText();

        suma_notas= suma_notas + (nota*credito);
        suma_creditos = suma_creditos + credito; 
        float total = suma_notas / suma_creditos;

        DecimalFormat formato = new DecimalFormat("#.##");
        String total_formato = formato.format(total);

        String text = materia+" -> Creditos: "+credito+" -> Nota: "+nota;
        listaLabels[indice_agregar].setText(text); 
		indice_agregar++;

		campo_total.setText("Total: "+total_formato);
        campo_materia.setText("");
        campo_credito.setText("");
        campo_nota.setText("");
		campo_materia.requestFocus();

    } 

    public void limpiar(){
        for (int i = 0; i < this.listaLabels.length; i++) {
            if (this.listaLabels[i] == null) {
                this.listaLabels[i] = new JLabel(" ");
                this.listaLabels[i].setHorizontalAlignment(JLabel.RIGHT);
                this.listaLabels[i].setFont(new Font("Arial", Font.PLAIN, 18));
                this.listaLabels[i].setOpaque(true);
                this.listaLabels[i].setBackground(Color.white);
                condiciones.gridy = i;
                condiciones.gridx = 0;
                condiciones.gridheight = 1;
                condiciones.gridwidth = 1;
                condiciones.weighty = 1;
                condiciones.weightx = 1;
                condiciones.fill = GridBagConstraints.HORIZONTAL;
                condiciones.anchor = GridBagConstraints.NORTH;
                condiciones.insets = new Insets(0, 0, 0, 0);
                contItems.add(this.listaLabels[i], condiciones);
            } else {
               
                this.listaLabels[i].setText(" ");  
                campo_total.setText("Total: ");
            }
        }
    }
    
    public void autocomp(){
        String materia = campo_materia.getText();

		for(int i = 0; i<lisMateria.length; i++){
			if(lisMateria[i] != null && lisMateria[i].getNombre().equals(materia)){
                float credito = lisMateria[i].getCredito();
                String creditoString = String.valueOf(credito);
				campo_credito.setText(creditoString);
				campo_nota.requestFocus();
			}
		}
    }
}