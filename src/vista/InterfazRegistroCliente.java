package vista;

import java.awt.HeadlessException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Controlador;
import modelo.GuardarToXML;
import modelo.OperacionInvalidaException;
import modelo.UsuarioCliente;
import static vista.InterfazLoginAdmin.controlador;

public class InterfazRegistroCliente extends javax.swing.JFrame {

    public InterfazRegistroCliente() {

        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelPassword = new javax.swing.JLabel();
        jLabelCuit = new javax.swing.JLabel();
        jTextFieldDireccion = new javax.swing.JTextField();
        jLabelLocalidad = new javax.swing.JLabel();
        jLabelTelefono = new javax.swing.JLabel();
        jTextFieldPassword = new javax.swing.JTextField();
        jTextFieldLocalidad = new javax.swing.JTextField();
        jButtonRegistrar = new javax.swing.JButton();
        jTextFieldTelefono = new javax.swing.JTextField();
        jTextFieldCuit1 = new javax.swing.JTextField();
        jButtonVolver = new javax.swing.JButton();
        jLabelDireccion = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        jPanel1.setBackground(new java.awt.Color(42, 157, 143));
        jPanel1.setForeground(new java.awt.Color(38, 70, 83));

        jTextFieldNombre.setBackground(new java.awt.Color(233, 196, 106));
        jTextFieldNombre.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextFieldNombre.setForeground(new java.awt.Color(38, 70, 83));

        jLabelPassword.setBackground(new java.awt.Color(0, 153, 153));
        jLabelPassword.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelPassword.setForeground(new java.awt.Color(38, 70, 83));
        jLabelPassword.setText("PASSWORD:");

        jLabelCuit.setBackground(new java.awt.Color(0, 153, 153));
        jLabelCuit.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelCuit.setForeground(new java.awt.Color(38, 70, 83));
        jLabelCuit.setText("CUIT:");

        jTextFieldDireccion.setBackground(new java.awt.Color(233, 196, 106));
        jTextFieldDireccion.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextFieldDireccion.setForeground(new java.awt.Color(38, 70, 83));

        jLabelLocalidad.setBackground(new java.awt.Color(0, 153, 153));
        jLabelLocalidad.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelLocalidad.setForeground(new java.awt.Color(38, 70, 83));
        jLabelLocalidad.setText("LOCALIDAD:");

        jLabelTelefono.setBackground(new java.awt.Color(0, 153, 153));
        jLabelTelefono.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelTelefono.setForeground(new java.awt.Color(38, 70, 83));
        jLabelTelefono.setText("TELEFONO:");

        jTextFieldPassword.setBackground(new java.awt.Color(233, 196, 106));
        jTextFieldPassword.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextFieldPassword.setForeground(new java.awt.Color(38, 70, 83));
        jTextFieldPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldPasswordActionPerformed(evt);
            }
        });

        jTextFieldLocalidad.setBackground(new java.awt.Color(233, 196, 106));
        jTextFieldLocalidad.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextFieldLocalidad.setForeground(new java.awt.Color(38, 70, 83));
        jTextFieldLocalidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldLocalidadActionPerformed(evt);
            }
        });

        jButtonRegistrar.setBackground(new java.awt.Color(231, 111, 81));
        jButtonRegistrar.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButtonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/accept.png"))); // NOI18N
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });

        jTextFieldTelefono.setBackground(new java.awt.Color(233, 196, 106));
        jTextFieldTelefono.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextFieldTelefono.setForeground(new java.awt.Color(38, 70, 83));

        jTextFieldCuit1.setBackground(new java.awt.Color(233, 196, 106));
        jTextFieldCuit1.setFont(new java.awt.Font("Century Gothic", 0, 18)); // NOI18N
        jTextFieldCuit1.setForeground(new java.awt.Color(38, 70, 83));
        jTextFieldCuit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldCuit1ActionPerformed(evt);
            }
        });

        jButtonVolver.setBackground(new java.awt.Color(231, 111, 81));
        jButtonVolver.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jButtonVolver.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel.png"))); // NOI18N
        jButtonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVolverActionPerformed(evt);
            }
        });

        jLabelDireccion.setBackground(new java.awt.Color(0, 153, 153));
        jLabelDireccion.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelDireccion.setForeground(new java.awt.Color(38, 70, 83));
        jLabelDireccion.setText("DIRECCIÓN:");

        jLabelNombre.setBackground(new java.awt.Color(0, 153, 153));
        jLabelNombre.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(38, 70, 83));
        jLabelNombre.setText("NOMBRE COMPLETO:");

        jLabel1.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(231, 111, 81));
        jLabel1.setText("Registrate");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/signup.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(0, 179, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelPassword)
                    .addComponent(jLabelNombre)
                    .addComponent(jLabelCuit)
                    .addComponent(jLabelTelefono)
                    .addComponent(jLabelDireccion)
                    .addComponent(jLabelLocalidad))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(jTextFieldPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(jTextFieldCuit1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                    .addComponent(jTextFieldLocalidad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                .addGap(161, 161, 161))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(378, 378, 378))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(53, 53, 53)
                        .addComponent(jLabel3)
                        .addGap(267, 267, 267))))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jTextFieldCuit1, jTextFieldDireccion, jTextFieldLocalidad, jTextFieldNombre, jTextFieldPassword, jTextFieldTelefono});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel3)))
                .addGap(62, 62, 62)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldCuit1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCuit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelPassword))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelTelefono))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelDireccion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldLocalidad, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelLocalidad))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(233, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jTextFieldCuit1, jTextFieldDireccion, jTextFieldLocalidad, jTextFieldNombre, jTextFieldPassword, jTextFieldTelefono});

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 967, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 6, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed

        String cuit = jTextFieldCuit1.getText();
        String password = jTextFieldPassword.getText();
        String nombre = jTextFieldNombre.getText();
        String telefono = jTextFieldTelefono.getText();
        String localidad = jTextFieldLocalidad.getText();
        String direccion = jTextFieldDireccion.getText();

        if (!cuit.equals("") && !password.equals("") && !nombre.equals("") && !telefono.equals("") && !localidad.equals("") && !direccion.equals("")) {
            if (controlador.getListaUsuarios().esCUIT(cuit)) {
                if (controlador.getListaUsuarios().nombreCorrecto(nombre)) {
                    if (controlador.getListaUsuarios().esTelefono(telefono)) {
                        if (controlador.getListaUsuarios().localidadCorrecta(localidad)) {
                           

                                try {
                                    controlador.getListaUsuarios().agregarUser(new UsuarioCliente(nombre, localidad, direccion, telefono, cuit, password, "cliente"));
                                    
                                    
                                    
                                    JOptionPane.showMessageDialog(this, "Su registro se completo correctamente.", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);

                                    
        try {
            GuardarToXML.guardar(controlador);
        } catch (FileNotFoundException ex) {
            System.out.println("Error al guardar");

        }
                                    
                                    
                                    InterfazLogin log = new InterfazLogin();

                                    log.setVisible(true);
                                    this.setVisible(false);

                                } catch (OperacionInvalidaException ex) {
                                    JOptionPane.showMessageDialog(this, "Ya existe un usuario registrado con el cuit " + cuit, "ERROR", JOptionPane.ERROR_MESSAGE);
                                }
                          

                        } else {
                            JOptionPane.showMessageDialog(this, "Por favor, ingrese correctamente la localidad.", "ERROR", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "Por favor, ingrese correctamente el telefono.", "ERROR", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Por favor, ingrese correctamente el nombre.", "ERROR", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Por favor, ingrese correctamente el CUIT.", "ERROR", JOptionPane.ERROR_MESSAGE);
            }

        } else {
            JOptionPane.showMessageDialog(this, "Faltan completar campos", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jTextFieldPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldPasswordActionPerformed

    }//GEN-LAST:event_jTextFieldPasswordActionPerformed

    private void jButtonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVolverActionPerformed
        InterfazLogin log = new InterfazLogin();

        log.setVisible(true);
        this.setVisible(false);

        try {
            GuardarToXML.guardar(controlador);
        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "No se pudieron exportar los datos\n" + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonVolverActionPerformed

    private void jTextFieldCuit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldCuit1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldCuit1ActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:   

        if (JOptionPane.showConfirmDialog(this, "Desea guardar los datos?", "GUARDAR", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            try {
                GuardarToXML.guardar(controlador);
                JOptionPane.showMessageDialog(this, "Los datos se guardaron correctamente.", "EXITO", JOptionPane.INFORMATION_MESSAGE);
            } catch (FileNotFoundException ex) {
                JOptionPane.showMessageDialog(this, "No se pudieron exportar los datos\n" + ex.getMessage(), "ERROR", JOptionPane.ERROR_MESSAGE);

            }

        }
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened

    }//GEN-LAST:event_formWindowOpened

    private void jTextFieldLocalidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldLocalidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldLocalidadActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazRegistroCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JButton jButtonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelCuit;
    private javax.swing.JLabel jLabelDireccion;
    private javax.swing.JLabel jLabelLocalidad;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelPassword;
    private javax.swing.JLabel jLabelTelefono;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextFieldCuit1;
    private javax.swing.JTextField jTextFieldDireccion;
    private javax.swing.JTextField jTextFieldLocalidad;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JTextField jTextFieldPassword;
    private javax.swing.JTextField jTextFieldTelefono;
    // End of variables declaration//GEN-END:variables
}
