
package principal;

import javax.swing.table.DefaultTableModel;

public class TablaBasica extends javax.swing.JFrame {

    DefaultTableModel modelo; 
    private Persona listaPersona[];
    
    public TablaBasica() {
 
        listaPersona = new Persona [100];
        listaPersona[0]= new Persona("12349","Lisa","Monobal","34928382","lisala@gmail");
        listaPersona[1]= new Persona("12349","Patricio","ROjas","3443382","parojas@gmail");
        listaPersona[2]= new Persona("38404","La MOL","Mole","3245245","mole@gmail");
        listaPersona[3]= new Persona("10437","Sofia","Perez","343523582","perezosa@gmail");
        listaPersona[4]= new Persona("17239","Bernardo","Campos","30962384","labernis@gmail");
        initComponents();
        initAlternComponents();
        imprimirPerosnas();
    }
    
    public void initAlternComponents(){
        setVisible(true);
        setTitle("Tabla Basica");
        setLocationRelativeTo(null);
        
        modelo = (DefaultTableModel) tablaDatos.getModel();
    }
    
    public void imprimirPerosnas(){
        modelo.setRowCount(0);
        for (int i = 0; listaPersona[i] !=null ; i++) {
            String documento = listaPersona[i].getDocumento();
            String nombres = listaPersona[i].getNombres();
            String apellidos = listaPersona[i].getApellidos(); 
            String telefono = listaPersona[i].getTelefono(); 
            String correo = listaPersona[i].getCorreo();
            
            Object data [] = new Object[]{documento, nombres, apellidos, telefono, correo};
            modelo.addRow(data); 
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contTitulo = new javax.swing.JPanel();
        etqTitulo = new javax.swing.JLabel();
        contFormulario = new javax.swing.JPanel();
        etqDocument = new javax.swing.JLabel();
        campoDocument = new javax.swing.JTextField();
        etqNombres = new javax.swing.JLabel();
        campoNombres = new javax.swing.JTextField();
        etqApellidos = new javax.swing.JLabel();
        campoApellidos = new javax.swing.JTextField();
        etqTelefono = new javax.swing.JLabel();
        campoTelefono = new javax.swing.JTextField();
        etqCorreo = new javax.swing.JLabel();
        campoCorreo = new javax.swing.JTextField();
        btnAgregar = new javax.swing.JButton();
        contDatos = new javax.swing.JPanel();
        scrollTabla = new javax.swing.JScrollPane();
        tablaDatos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        contTitulo.setBackground(new java.awt.Color(204, 255, 204));

        etqTitulo.setFont(new java.awt.Font("Sitka Small", 1, 36)); // NOI18N
        etqTitulo.setForeground(new java.awt.Color(0, 153, 102));
        etqTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTitulo.setText("Tabla Basica");

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
                .addComponent(etqTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        contFormulario.setBackground(new java.awt.Color(153, 255, 153));

        etqDocument.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        etqDocument.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqDocument.setText("Documento:");

        campoDocument.setFont(new java.awt.Font("Sitka Heading", 0, 14)); // NOI18N

        etqNombres.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        etqNombres.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqNombres.setText("Nombres");

        campoNombres.setFont(new java.awt.Font("Sitka Heading", 0, 14)); // NOI18N

        etqApellidos.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        etqApellidos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqApellidos.setText("Apellidos");

        campoApellidos.setFont(new java.awt.Font("Sitka Heading", 0, 14)); // NOI18N

        etqTelefono.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        etqTelefono.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqTelefono.setText("Telefono:");

        campoTelefono.setFont(new java.awt.Font("Sitka Heading", 0, 14)); // NOI18N

        etqCorreo.setFont(new java.awt.Font("Sitka Heading", 1, 18)); // NOI18N
        etqCorreo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        etqCorreo.setText("Correo:");

        campoCorreo.setFont(new java.awt.Font("Sitka Heading", 0, 14)); // NOI18N

        btnAgregar.setBackground(new java.awt.Color(0, 153, 102));
        btnAgregar.setFont(new java.awt.Font("Sitka Small", 1, 18)); // NOI18N
        btnAgregar.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout contFormularioLayout = new javax.swing.GroupLayout(contFormulario);
        contFormulario.setLayout(contFormularioLayout);
        contFormularioLayout.setHorizontalGroup(
            contFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contFormularioLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(contFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(contFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(campoTelefono)
                        .addComponent(etqTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(campoDocument)
                        .addComponent(etqDocument, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addGroup(contFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, contFormularioLayout.createSequentialGroup()
                        .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(91, 91, 91))
                    .addGroup(contFormularioLayout.createSequentialGroup()
                        .addGroup(contFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(etqCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etqNombres, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(contFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(etqApellidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoApellidos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );
        contFormularioLayout.setVerticalGroup(
            contFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contFormularioLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(contFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contFormularioLayout.createSequentialGroup()
                        .addComponent(etqDocument)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoDocument, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(contFormularioLayout.createSequentialGroup()
                        .addGroup(contFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etqNombres)
                            .addComponent(etqApellidos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(contFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(contFormularioLayout.createSequentialGroup()
                        .addGroup(contFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(etqTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(etqCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(contFormularioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(contFormularioLayout.createSequentialGroup()
                        .addComponent(btnAgregar)
                        .addGap(3, 3, 3)))
                .addGap(12, 12, 12))
        );

        contDatos.setBackground(new java.awt.Color(204, 255, 204));

        scrollTabla.setBackground(new java.awt.Color(204, 255, 204));

        tablaDatos.setBackground(new java.awt.Color(204, 255, 204));
        tablaDatos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Documento", "Nombres", "Apellidos", "Telefono", "Correo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        scrollTabla.setViewportView(tablaDatos);

        javax.swing.GroupLayout contDatosLayout = new javax.swing.GroupLayout(contDatos);
        contDatos.setLayout(contDatosLayout);
        contDatosLayout.setHorizontalGroup(
            contDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollTabla)
                .addContainerGap())
        );
        contDatosLayout.setVerticalGroup(
            contDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(contDatosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollTabla, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(contDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contTitulo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(contFormulario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(contTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contFormulario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(contDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
        String documento = campoDocument.getText();
        String nombres = campoNombres.getText(); 
        String apellidos = campoApellidos.getText(); 
        String telefono = campoTelefono.getText(); 
        String correo = campoCorreo.getText();
        
        if(!documento.equals("") && !nombres.equals("") && !apellidos.equals("") && !telefono.equals("") && !correo.equals("")){
            
            int posicion = -1;
            for (int i = 0; i < listaPersona.length; i++) {
                
                if(listaPersona[i].getDocumento().equals(documento)|| listaPersona[i].getCorreo().equals(correo)){
                    Alerta ventana = new Alerta();
                    break;
                }else{
                    if(listaPersona[i]==null){
                        posicion = i;
                        break;
                    }
                }   
            }
            
            if(posicion != -1){
                listaPersona[posicion] = new Persona(documento,nombres,apellidos,telefono,correo);
                Object data [] = new Object[]{documento, nombres, apellidos, telefono, correo};
                modelo.addRow(data);
            
                campoDocument.setText("");
                campoNombres.setText("");
                campoApellidos.setText("");
                campoTelefono.setText("");
                campoCorreo.setText("");
                campoDocument.requestFocus();
            }
           
        }else{
            System.out.println("no se puede agregar");
            Alerta ventana = new Alerta();
        }
    }//GEN-LAST:event_btnAgregarActionPerformed

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JTextField campoApellidos;
    private javax.swing.JTextField campoCorreo;
    private javax.swing.JTextField campoDocument;
    private javax.swing.JTextField campoNombres;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JPanel contDatos;
    private javax.swing.JPanel contFormulario;
    private javax.swing.JPanel contTitulo;
    private javax.swing.JLabel etqApellidos;
    private javax.swing.JLabel etqCorreo;
    private javax.swing.JLabel etqDocument;
    private javax.swing.JLabel etqNombres;
    private javax.swing.JLabel etqTelefono;
    private javax.swing.JLabel etqTitulo;
    private javax.swing.JScrollPane scrollTabla;
    private javax.swing.JTable tablaDatos;
    // End of variables declaration//GEN-END:variables
}
