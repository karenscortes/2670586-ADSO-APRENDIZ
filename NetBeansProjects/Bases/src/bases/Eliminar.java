
package bases;

import utils.BaseDatos;
import utils.Persona;

public class Eliminar extends javax.swing.JFrame {
    BaseDatos datos = new BaseDatos();
    public Eliminar(BaseDatos datos) {
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
        campoNombres = new javax.swing.JLabel();
        etqApellidos = new javax.swing.JLabel();
        campoApellidos = new javax.swing.JLabel();
        etqTelefono = new javax.swing.JLabel();
        campoTelefono = new javax.swing.JLabel();
        etqDireccion = new javax.swing.JLabel();
        campoDireccion = new javax.swing.JLabel();
        etqCorreo = new javax.swing.JLabel();
        campoCorreo = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contPrincipal.setBackground(new java.awt.Color(204, 255, 204));

        etqTitulo.setFont(new java.awt.Font("Sitka Small", 1, 36)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(0, 153, 102));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("Eliminar");

        etqCedula.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        etqCedula.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqCedula.setText("Cedula:");

        campoCedula.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N

        btnBuscar.setBackground(new java.awt.Color(0, 153, 102));
        btnBuscar.setFont(new java.awt.Font("Sitka Small", 1, 16)); // NOI18N
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

        campoNombres.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N

        etqApellidos.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        etqApellidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqApellidos.setText("Apellidos:");

        campoApellidos.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N

        etqTelefono.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        etqTelefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTelefono.setText("Telefono:");

        campoTelefono.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N

        etqDireccion.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        etqDireccion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqDireccion.setText("Direccion:");

        campoDireccion.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N

        etqCorreo.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        etqCorreo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqCorreo.setText("Correo:");

        campoCorreo.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N

        btnEliminar.setBackground(new java.awt.Color(0, 153, 102));
        btnEliminar.setFont(new java.awt.Font("Sitka Small", 1, 24)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
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
                    .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(contPrincipalLayout.createSequentialGroup()
                        .addGroup(contPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(contPrincipalLayout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(etqCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contPrincipalLayout.createSequentialGroup()
                                .addComponent(etqNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contPrincipalLayout.createSequentialGroup()
                                .addComponent(etqApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contPrincipalLayout.createSequentialGroup()
                                .addComponent(etqTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contPrincipalLayout.createSequentialGroup()
                                .addComponent(etqDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(campoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(contPrincipalLayout.createSequentialGroup()
                                .addComponent(etqCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(contPrincipalLayout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(btnEliminar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        contPrincipalLayout.setVerticalGroup(
            contPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(etqTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(etqCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqNombres)
                    .addComponent(campoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(contPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqApellidos)
                    .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(contPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqTelefono)
                    .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(etqDireccion)
                    .addComponent(campoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(contPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqCorreo)
                    .addComponent(campoCorreo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        String cedula = campoCedula.getText();
        datos.eliminarPersona(cedula);

        campoCedula.setText("");
        campoNombres.setText("");
        campoApellidos.setText("");
        campoTelefono.setText("");
        campoDireccion.setText("");
        campoCorreo.setText("");
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String cedula = campoCedula.getText();
        
        Persona temp = datos.buscarPersonas(cedula);
        
        campoNombres.setText(temp.getNombres());
        campoApellidos.setText(temp.getApellidos());
        campoDireccion.setText(temp.getTelefono());
        campoTelefono.setText(temp.getDireccion());
        campoCorreo.setText(temp.getCorreo());
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JLabel campoApellidos;
    private javax.swing.JTextField campoCedula;
    private javax.swing.JLabel campoCorreo;
    private javax.swing.JLabel campoDireccion;
    private javax.swing.JLabel campoNombres;
    private javax.swing.JLabel campoTelefono;
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
