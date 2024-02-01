package promedioponderado;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.text.DecimalFormat;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;


public class CalcularPromedio extends javax.swing.JFrame {
   
    public CalcularPromedio (){
        initComponents();
        initAlternComponent();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contTitulo = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        contVariables = new javax.swing.JPanel();
        etqMateria = new javax.swing.JLabel();
        etqCreditos = new javax.swing.JLabel();
        etqNota = new javax.swing.JLabel();
        campoMateria = new javax.swing.JTextField();
        campoCreditos = new javax.swing.JTextField();
        campoNota = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        scrollJL = new javax.swing.JScrollPane();
        contItems = new javax.swing.JPanel();
        contResumen = new javax.swing.JPanel();
        etqResumen = new javax.swing.JLabel();
        contFinal = new javax.swing.JPanel();
        etqTotal = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        contTitulo.setBackground(new java.awt.Color(204, 204, 204));

        etqTitulo.setBackground(new java.awt.Color(204, 204, 204));
        etqTitulo.setFont(new java.awt.Font("Sitka Text", 1, 36)); // NOI18N
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("Calcular Promedio");

        javax.swing.GroupLayout contTituloLayout = new javax.swing.GroupLayout(contTitulo);
        contTitulo.setLayout(contTituloLayout);
        contTituloLayout.setHorizontalGroup(
            contTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        contTituloLayout.setVerticalGroup(
            contTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        contVariables.setBackground(new java.awt.Color(204, 204, 204));

        etqMateria.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        etqMateria.setText("Materia:");

        etqCreditos.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        etqCreditos.setText("Creditos:");

        etqNota.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        etqNota.setText("Nota:");

        btnCalcular.setBackground(new java.awt.Color(0, 153, 153));
        btnCalcular.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcular.setText("Registrar");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contVariablesLayout = new javax.swing.GroupLayout(contVariables);
        contVariables.setLayout(contVariablesLayout);
        contVariablesLayout.setHorizontalGroup(
            contVariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contVariablesLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(contVariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(contVariablesLayout.createSequentialGroup()
                        .addComponent(etqNota)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(campoNota, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contVariablesLayout.createSequentialGroup()
                        .addComponent(etqMateria)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(contVariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(contVariablesLayout.createSequentialGroup()
                        .addComponent(etqCreditos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCalcular, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(29, 29, 29))
        );
        contVariablesLayout.setVerticalGroup(
            contVariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contVariablesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(contVariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqMateria)
                    .addComponent(etqCreditos)
                    .addComponent(campoMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCreditos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contVariablesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqNota)
                    .addComponent(campoNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcular))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout contItemsLayout = new javax.swing.GroupLayout(contItems);
        contItems.setLayout(contItemsLayout);
        contItemsLayout.setHorizontalGroup(
            contItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 513, Short.MAX_VALUE)
        );
        contItemsLayout.setVerticalGroup(
            contItemsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 232, Short.MAX_VALUE)
        );

        scrollJL.setViewportView(contItems);

        etqResumen.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        etqResumen.setForeground(new java.awt.Color(0, 153, 153));
        etqResumen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqResumen.setText("Resumen");

        javax.swing.GroupLayout contResumenLayout = new javax.swing.GroupLayout(contResumen);
        contResumen.setLayout(contResumenLayout);
        contResumenLayout.setHorizontalGroup(
            contResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contResumenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqResumen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        contResumenLayout.setVerticalGroup(
            contResumenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contResumenLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqResumen)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        etqTotal.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        etqTotal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTotal.setText("Total: ");

        btnLimpiar.setBackground(new java.awt.Color(204, 0, 0));
        btnLimpiar.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contFinalLayout = new javax.swing.GroupLayout(contFinal);
        contFinal.setLayout(contFinalLayout);
        contFinalLayout.setHorizontalGroup(
            contFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contFinalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contFinalLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(155, 155, 155))
        );
        contFinalLayout.setVerticalGroup(
            contFinalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contFinalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLimpiar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(contVariables, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contResumen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scrollJL)
                    .addComponent(contFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contVariables, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contResumen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(scrollJL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void initAlternComponent(){
        setVisible(true);
        setLocationRelativeTo(null);
        listaLabels = new JLabel[50];
        Border borderColor = BorderFactory.createMatteBorder(0, 0, 1, 0, Color.decode("#D5D5D5"));
        Border borderPadding = new EmptyBorder(3,10,3,10);
        Border borderGris = new CompoundBorder(borderColor, borderPadding);
        condiciones = new GridBagConstraints();
        contItems.setLayout(new GridLayout(0, 1));
        for (int i=0; i<this.listaLabels.length; i++) {
            etq_temporal = new JLabel(" ");
            etq_temporal.setHorizontalAlignment(JLabel.CENTER);
            etq_temporal.setFont(new Font("Arial", Font.PLAIN, 18));
            etq_temporal.setOpaque(true);
            etq_temporal.setBackground(Color.white);
            etq_temporal.setBorder(borderGris);
            
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
    }
    
    
    
    
    
    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        float nota = Float.parseFloat(campoNota.getText());
        float credito = Float.parseFloat(campoCreditos.getText());
        String materia = campoMateria.getText();

        suma_notas= suma_notas + (nota*credito);
        suma_creditos = suma_creditos + credito; 
        float total = suma_notas / suma_creditos;

        DecimalFormat formato = new DecimalFormat("#.##");
        String total_formato = formato.format(total);

        String text = materia+" -> Creditos: "+credito+" -> Nota: "+nota;
        listaLabels[indice].setText(text); 
	indice++;

	etqTotal.setText("Total: "+total_formato);
        campoMateria.setText("");
        campoCreditos.setText("");
        campoNota.setText("");
	campoMateria.requestFocus();
    }//GEN-LAST:event_btnCalcularActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
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
                etqTotal.setText("Total: ");
            }
        }
    }//GEN-LAST:event_btnLimpiarActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JTextField campoCreditos;
    private javax.swing.JTextField campoMateria;
    private javax.swing.JTextField campoNota;
    private javax.swing.JPanel contFinal;
    private javax.swing.JPanel contItems;
    private javax.swing.JPanel contResumen;
    private javax.swing.JPanel contTitulo;
    private javax.swing.JPanel contVariables;
    private javax.swing.JLabel etqCreditos;
    private javax.swing.JLabel etqMateria;
    private javax.swing.JLabel etqNota;
    private javax.swing.JLabel etqResumen;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JLabel etqTotal;
    private javax.swing.JScrollPane scrollJL;
    // End of variables declaration//GEN-END:variables
    float suma_notas =0;
    float suma_creditos =0;
    private JLabel[] listaLabels;
    int indice = 0;
    private JLabel etq_temporal;
    GridBagConstraints condiciones;
    Materia listaMateria[];

}
