
package appregistro;

public class Tabla extends javax.swing.JFrame {

    public Tabla() {
        initComponents();
        initAlternComponent();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contTitulo = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        contBarraDatos = new javax.swing.JPanel();
        etqTabla = new javax.swing.JLabel();
        etqMultiplos = new javax.swing.JLabel();
        campoNumero = new javax.swing.JTextField();
        campoMultiplos = new javax.swing.JTextField();
        btnCalcular = new javax.swing.JButton();
        scrollJL = new javax.swing.JScrollPane();
        etqTablas = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contTitulo.setBackground(new java.awt.Color(204, 0, 204));

        etqTitulo.setBackground(new java.awt.Color(255, 255, 255));
        etqTitulo.setFont(new java.awt.Font("Sitka Small", 1, 36)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(255, 255, 255));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("TABLAS DE MULTIPLICAR");

        javax.swing.GroupLayout contTituloLayout = new javax.swing.GroupLayout(contTitulo);
        contTitulo.setLayout(contTituloLayout);
        contTituloLayout.setHorizontalGroup(
            contTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        contTituloLayout.setVerticalGroup(
            contTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contTituloLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                .addContainerGap())
        );

        contBarraDatos.setBackground(new java.awt.Color(102, 0, 102));

        etqTabla.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        etqTabla.setForeground(new java.awt.Color(255, 255, 255));
        etqTabla.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTabla.setText("Tabla:");

        etqMultiplos.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        etqMultiplos.setForeground(new java.awt.Color(255, 255, 255));
        etqMultiplos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqMultiplos.setText("Multiplos:");

        campoNumero.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N

        campoMultiplos.setFont(new java.awt.Font("Sitka Text", 0, 14)); // NOI18N

        btnCalcular.setBackground(new java.awt.Color(255, 153, 255));
        btnCalcular.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        btnCalcular.setForeground(new java.awt.Color(102, 0, 102));
        btnCalcular.setText("Calcular");
        btnCalcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contBarraDatosLayout = new javax.swing.GroupLayout(contBarraDatos);
        contBarraDatos.setLayout(contBarraDatosLayout);
        contBarraDatosLayout.setHorizontalGroup(
            contBarraDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contBarraDatosLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(etqTabla)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(etqMultiplos)
                .addGap(18, 18, 18)
                .addComponent(campoMultiplos, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCalcular)
                .addGap(39, 39, 39))
        );
        contBarraDatosLayout.setVerticalGroup(
            contBarraDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contBarraDatosLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(contBarraDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqTabla)
                    .addComponent(etqMultiplos)
                    .addComponent(campoNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoMultiplos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalcular))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        scrollJL.setBackground(new java.awt.Color(255, 153, 255));

        etqTablas.setBackground(new java.awt.Color(255, 153, 255));
        etqTablas.setFont(new java.awt.Font("Sitka Text", 1, 24)); // NOI18N
        etqTablas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        scrollJL.setViewportView(etqTablas);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(scrollJL)
                    .addComponent(contTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contBarraDatos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contBarraDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollJL, javax.swing.GroupLayout.DEFAULT_SIZE, 270, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCalcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcularActionPerformed
        int numero = Integer.parseInt(campoNumero.getText());
        int multiplos = Integer.parseInt(campoMultiplos.getText());
        int resultado=0;
        
       String html = "<html>"; 
       for(int i = 0; i<= multiplos; i++){
           resultado = numero * i;
           html += numero + " x " + i + " = " + resultado + "<br>";
       }
       html += "</html>";
       
       etqTablas.setText(html);
    }//GEN-LAST:event_btnCalcularActionPerformed
    
    public void initAlternComponent(){
        setVisible(true);
        setLocationRelativeTo(null);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCalcular;
    private javax.swing.JTextField campoMultiplos;
    private javax.swing.JTextField campoNumero;
    private javax.swing.JPanel contBarraDatos;
    private javax.swing.JPanel contTitulo;
    private javax.swing.JLabel etqMultiplos;
    private javax.swing.JLabel etqTabla;
    private javax.swing.JLabel etqTablas;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JScrollPane scrollJL;
    // End of variables declaration//GEN-END:variables
}
