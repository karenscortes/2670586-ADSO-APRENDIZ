
package bases;

import utils.BaseDatos;
import utils.Persona;


public class Editar extends javax.swing.JFrame {
    
    BaseDatos datos = new BaseDatos();
    
    public Editar(BaseDatos datos ) {
        this.datos = datos;
        initComponents();
        initAlternComponent();
    }
    
    public void initAlternComponent(){
        setVisible(true);
        setLocationRelativeTo(null);
        setTitle("MENU");
        setResizable(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contPrincipal = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        etqCedula = new javax.swing.JLabel();
        campoCedula = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        etqNombres = new javax.swing.JLabel();
        campoNombres = new javax.swing.JTextField();
        etqApellidos = new javax.swing.JLabel();
        campoApellidos = new javax.swing.JTextField();
        etqTelefono = new javax.swing.JLabel();
        campoTelefono = new javax.swing.JTextField();
        etqDireccion = new javax.swing.JLabel();
        campoDireccion = new javax.swing.JTextField();
        etqCorreo = new javax.swing.JLabel();
        campoCorreo = new javax.swing.JTextField();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contPrincipal.setBackground(new java.awt.Color(204, 255, 204));

        etqTitulo.setFont(new java.awt.Font("Sitka Small", 1, 36)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(0, 153, 102));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("Editar persona");

        etqCedula.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        etqCedula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqCedula.setText("Cedula:");

        campoCedula.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N

        btnBuscar.setBackground(new java.awt.Color(0, 153, 102));
        btnBuscar.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(255, 255, 255));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        etqNombres.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        etqNombres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqNombres.setText("Nombres:");

        campoNombres.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N

        etqApellidos.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        etqApellidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqApellidos.setText("Apellidos:");

        campoApellidos.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N

        etqTelefono.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        etqTelefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTelefono.setText("Telefono:");

        campoTelefono.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N

        etqDireccion.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        etqDireccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqDireccion.setText("Direccion:");

        campoDireccion.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N

        etqCorreo.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        etqCorreo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqCorreo.setText("Correo:");

        campoCorreo.setFont(new java.awt.Font("Sitka Small", 1, 14)); // NOI18N

        btnEditar.setBackground(new java.awt.Color(0, 153, 102));
        btnEditar.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        btnEditar.setForeground(new java.awt.Color(255, 255, 255));
        btnEditar.setText("Editar");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contPrincipalLayout = new javax.swing.GroupLayout(contPrincipal);
        contPrincipal.setLayout(contPrincipalLayout);
        contPrincipalLayout.setHorizontalGroup(
            contPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(contPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(contPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contPrincipalLayout.createSequentialGroup()
                        .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(contPrincipalLayout.createSequentialGroup()
                        .addComponent(etqCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar)
                        .addGap(25, 25, 25))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contPrincipalLayout.createSequentialGroup()
                        .addGroup(contPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contPrincipalLayout.createSequentialGroup()
                                .addComponent(etqCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoCorreo))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contPrincipalLayout.createSequentialGroup()
                                .addComponent(etqDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoDireccion))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, contPrincipalLayout.createSequentialGroup()
                                .addGroup(contPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(etqTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(etqNombres, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                    .addComponent(etqApellidos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(contPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(campoApellidos)
                                    .addComponent(campoNombres, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                                    .addComponent(campoTelefono))))
                        .addGap(110, 110, 110))))
            .addGroup(contPrincipalLayout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        contPrincipalLayout.setVerticalGroup(
            contPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(contPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqCedula)
                    .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqNombres)
                    .addComponent(campoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqApellidos)
                    .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqTelefono)
                    .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqDireccion)
                    .addComponent(campoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqCorreo)
                    .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(contPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String cedula = campoCedula.getText();
        Persona temp = datos.buscarPersonas(cedula);

        campoNombres.setText(temp.getNombres());
        campoApellidos.setText(temp.getApellidos());
        campoTelefono.setText(temp.getTelefono());
        campoDireccion.setText(temp.getDireccion());
        campoCorreo.setText(temp.getCorreo());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        String cedula = campoCedula.getText();
        String nombres = campoNombres.getText();
        String apellidos = campoApellidos.getText();
        String telefono = campoTelefono.getText();
        String direccion = campoDireccion.getText();
        String correo = campoCorreo.getText();

        datos.actualizarPersona(cedula, nombres, apellidos, direccion, telefono, cedula);
    }//GEN-LAST:event_btnEditarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JTextField campoApellidos;
    private javax.swing.JTextField campoCedula;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoDireccion;
    private javax.swing.JTextField campoNombres;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JPanel contPrincipal;
    private javax.swing.JLabel etqApellidos;
    private javax.swing.JLabel etqCedula;
    private javax.swing.JLabel etqCorreo;
    private javax.swing.JLabel etqDireccion;
    private javax.swing.JLabel etqNombres;
    private javax.swing.JLabel etqTelefono;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
