package Vista;

import Controlador.RegistroTrabajador;
import Modelo.Trabajador;
import javax.swing.JOptionPane;

/**
 * @author opazo-oses-pincheira-sanchez nov 2024
 */
public class Frm_agregarGarzon extends javax.swing.JFrame {

    /**
     * Creates new form Frm_agregarGarzon
     */
    public Frm_agregarGarzon() {
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Jtxt_idGarzon = new javax.swing.JTextField();
        Jtxt_nombreGarzon = new javax.swing.JTextField();
        Jbtn_guardarGarzon = new javax.swing.JButton();
        Jbtn_volverGarzon = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        jLabel1.setText("ID:");

        jLabel2.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        jLabel2.setText("Nombre Garzon:");

        Jtxt_idGarzon.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        Jtxt_idGarzon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jtxt_idGarzonActionPerformed(evt);
            }
        });

        Jtxt_nombreGarzon.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        Jtxt_nombreGarzon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jtxt_nombreGarzonActionPerformed(evt);
            }
        });

        Jbtn_guardarGarzon.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        Jbtn_guardarGarzon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/guardar-el-archivo.png"))); // NOI18N
        Jbtn_guardarGarzon.setText("Guardar");
        Jbtn_guardarGarzon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_guardarGarzonActionPerformed(evt);
            }
        });

        Jbtn_volverGarzon.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        Jbtn_volverGarzon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/devolver.png"))); // NOI18N
        Jbtn_volverGarzon.setText("Volver");
        Jbtn_volverGarzon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Jbtn_volverGarzonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jLabel3.setText("Agregar Garzon");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(Jbtn_guardarGarzon)
                                .addGap(40, 40, 40)
                                .addComponent(Jbtn_volverGarzon))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Jtxt_nombreGarzon)
                                    .addComponent(Jtxt_idGarzon)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(jLabel3)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jtxt_idGarzon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Jtxt_nombreGarzon, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Jbtn_guardarGarzon)
                    .addComponent(Jbtn_volverGarzon))
                .addGap(43, 43, 43))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Jtxt_nombreGarzonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jtxt_nombreGarzonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Jtxt_nombreGarzonActionPerformed

    private void Jbtn_guardarGarzonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_guardarGarzonActionPerformed
        // TODO add your handling code here:

        // Crear una instancia del controlador RegistroTrabajador
        RegistroTrabajador registroTrabajador = new RegistroTrabajador();

        // Obtener los valores ingresados en el formulario
        String idGarzon = Jtxt_idGarzon.getText().trim(); // Suponiendo que hay un campo de texto para el ID
        String nombreGarzon = Jtxt_nombreGarzon.getText().trim(); // Campo de texto para el nombre

        // Validar los campos obligatorios
        if (idGarzon.isEmpty() || nombreGarzon.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe completar todos los campos obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Crear un nuevo objeto Trabajador con los datos ingresados
        Trabajador nuevoGarzon = new Trabajador();
        nuevoGarzon.setId_trab(idGarzon);
        nuevoGarzon.setNom_trab(nombreGarzon);
        nuevoGarzon.setAppat_trab(""); // No se solicita
        nuevoGarzon.setApmat_trab(""); // No se solicita
        nuevoGarzon.setTipo_trab("Garzon"); // Tipo predeterminado
        nuevoGarzon.setAlias(""); // No se solicita
        nuevoGarzon.setContraseña(""); // No se solicita

        // Intentar guardar el garzón en la base de datos
        boolean resultado = registroTrabajador.agregaTrabajador(nuevoGarzon);

        // Mostrar mensajes según el resultado
        if (resultado) {
            JOptionPane.showMessageDialog(this, "Garzón guardado con éxito.", "Éxito", JOptionPane.INFORMATION_MESSAGE);

            // Opcional: limpiar los campos después de guardar
            Jtxt_idGarzon.setText("");
            Jtxt_nombreGarzon.setText("");
        } else {
            JOptionPane.showMessageDialog(this, "Error al guardar el garzón. Verifique los datos y vuelva a intentarlo.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_Jbtn_guardarGarzonActionPerformed

    private void Jbtn_volverGarzonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jbtn_volverGarzonActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_Jbtn_volverGarzonActionPerformed

    private void Jtxt_idGarzonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Jtxt_idGarzonActionPerformed

    }//GEN-LAST:event_Jtxt_idGarzonActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_agregarGarzon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_agregarGarzon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_agregarGarzon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_agregarGarzon.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_agregarGarzon().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Jbtn_guardarGarzon;
    private javax.swing.JButton Jbtn_volverGarzon;
    private javax.swing.JTextField Jtxt_idGarzon;
    private javax.swing.JTextField Jtxt_nombreGarzon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

}
