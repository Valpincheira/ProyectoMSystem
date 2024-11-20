package Vista;

import BD.ConexionBD;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Modelo.Trabajador;
import java.util.UUID;
import java.awt.CardLayout;
import Controlador.RegistroTrabajador;
import javax.swing.JPasswordField;

/**
 * @author opazo-oses-pincheira-sanchez nov 2024
 */
public class Frm_RegistroTrabajador extends javax.swing.JFrame {

    /**
     * Creates new form Frm_RegistroTrabajador
     */
    public Frm_RegistroTrabajador() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jtxt_nombre = new javax.swing.JTextField();
        jtxt_materno = new javax.swing.JTextField();
        jtxt_paterno = new javax.swing.JTextField();
        jc_puesto = new javax.swing.JComboBox<>();
        jb_registrarse = new javax.swing.JButton();
        jtxt_alias = new javax.swing.JTextField();
        jtb_atras = new javax.swing.JButton();
        jp_contraseña = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setForeground(new java.awt.Color(204, 204, 204));

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registro", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Candara Light", 0, 24))); // NOI18N

        jtxt_nombre.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        jtxt_nombre.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Nombre", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Candara Light", 0, 14))); // NOI18N
        jtxt_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_nombreActionPerformed(evt);
            }
        });

        jtxt_materno.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        jtxt_materno.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Apellido Materno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Candara Light", 0, 14))); // NOI18N
        jtxt_materno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_maternoActionPerformed(evt);
            }
        });

        jtxt_paterno.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        jtxt_paterno.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Apellido Paterno", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Candara Light", 0, 14))); // NOI18N
        jtxt_paterno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_paternoActionPerformed(evt);
            }
        });

        jc_puesto.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        jc_puesto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Administrador", "Garzon" }));
        jc_puesto.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese puesto", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Candara Light", 0, 14))); // NOI18N
        jc_puesto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jc_puestoActionPerformed(evt);
            }
        });

        jb_registrarse.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        jb_registrarse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/editar.png"))); // NOI18N
        jb_registrarse.setText("Registro");
        jb_registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jb_registrarseActionPerformed(evt);
            }
        });

        jtxt_alias.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        jtxt_alias.setText("ej:Isanchez");
        jtxt_alias.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ingrese Alias", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Candara Light", 0, 14))); // NOI18N
        jtxt_alias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_aliasActionPerformed(evt);
            }
        });

        jtb_atras.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        jtb_atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/devolver.png"))); // NOI18N
        jtb_atras.setText("Atras");
        jtb_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtb_atrasActionPerformed(evt);
            }
        });

        jp_contraseña.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        jp_contraseña.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Candara Light", 0, 14))); // NOI18N
        jp_contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jp_contraseñaActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        jLabel1.setText("Contraseña:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jp_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jc_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jb_registrarse)
                                .addGap(37, 37, 37))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jtxt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxt_paterno))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jtxt_materno)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtxt_alias, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jtb_atras)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_paterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_materno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtxt_alias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jp_contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jc_puesto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jb_registrarse))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 131, Short.MAX_VALUE)
                .addComponent(jtb_atras)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jc_puestoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jc_puestoActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_jc_puestoActionPerformed

    private void jb_registrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jb_registrarseActionPerformed
        
        String nombre = jtxt_nombre.getText().trim();
        String apellidoPaterno = jtxt_paterno.getText().trim();
        String apellidoMaterno = jtxt_materno.getText().trim();
        String contraseña = String.valueOf(jp_contraseña.getPassword()).trim();
        String alias = jtxt_alias.getText().trim();
        String tipoTrabajador = (String) jc_puesto.getSelectedItem(); // Supongo que usas un JComboBox
 
        // Validar que todos los campos estén llenos
        if (nombre.isEmpty() || apellidoPaterno.isEmpty() || apellidoMaterno.isEmpty()|| contraseña.isEmpty() || alias.isEmpty() || tipoTrabajador == null) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.");
            return;
        }

        // Crear objeto Trabajador
        Trabajador trabajador = new Trabajador();
        trabajador.setId_trab(UUID.randomUUID().toString());
        trabajador.setNom_trab(nombre);
        trabajador.setAppat_trab(apellidoPaterno);
        trabajador.setApmat_trab(apellidoMaterno);
        trabajador.setTipo_trab(tipoTrabajador);
        trabajador.setAlias(alias);
        trabajador.setContraseña(contraseña);

        // Registrar en la base de datos
        RegistroTrabajador controlador = new RegistroTrabajador();
        boolean registrado = controlador.agregaTrabajador(trabajador);

        if (registrado) {
            JOptionPane.showMessageDialog(this, "Trabajador registrado exitosamente.");
            this.dispose();  // Cierra esta ventana comentado porque me tira error
            Frm_InicioSesion inicioSesion = new Frm_InicioSesion();
            inicioSesion.setVisible(true); 
        } else {
            JOptionPane.showMessageDialog(this, "Error al registrar el trabajador. Intente nuevamente.");
        }

    }//GEN-LAST:event_jb_registrarseActionPerformed

    private void jtxt_aliasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_aliasActionPerformed

        String alias = jtxt_alias.getText().trim();
        if (alias.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un alias.");
        }
    }//GEN-LAST:event_jtxt_aliasActionPerformed

    private void jtxt_paternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_paternoActionPerformed
        // TODO add your handling code here:
        String apellidoPaterno = jtxt_paterno.getText().trim();
        if (apellidoPaterno.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese el apellido paterno.");
        }
    }//GEN-LAST:event_jtxt_paternoActionPerformed

    private void jtxt_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_nombreActionPerformed
        // TODO add your handling code here:
        String nombre = jtxt_nombre.getText().trim();
        if (nombre.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese un nombre.");
        }
    }//GEN-LAST:event_jtxt_nombreActionPerformed

    private void jtxt_maternoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_maternoActionPerformed
        // TODO add your handling code here:
        String apellidoMaterno = jtxt_materno.getText().trim();
        if (apellidoMaterno.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese el apellido materno.");
        }
    }//GEN-LAST:event_jtxt_maternoActionPerformed

    private void jtb_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtb_atrasActionPerformed
        // TODO add your handling code here:
        Frm_InicioSesion inicioSesion = new Frm_InicioSesion();
        inicioSesion.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jtb_atrasActionPerformed

    private void jp_contraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jp_contraseñaActionPerformed
        // TODO add your handling code here:
        


        String contraseña = String.valueOf(jp_contraseña.getPassword()).trim();
        if (contraseña.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Por favor, ingrese una contraseña.");
        }

       
    }//GEN-LAST:event_jp_contraseñaActionPerformed

    

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frm_RegistroTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_RegistroTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_RegistroTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_RegistroTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_RegistroTrabajador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton jb_registrarse;
    private javax.swing.JComboBox<String> jc_puesto;
    private javax.swing.JPasswordField jp_contraseña;
    private javax.swing.JButton jtb_atras;
    private javax.swing.JTextField jtxt_alias;
    private javax.swing.JTextField jtxt_materno;
    private javax.swing.JTextField jtxt_nombre;
    private javax.swing.JTextField jtxt_paterno;
    // End of variables declaration//GEN-END:variables
}
