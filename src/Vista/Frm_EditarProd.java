package Vista;

import Controlador.RegistroProducto;
import Modelo.Producto;
import javax.swing.JOptionPane;

/**
 * @author opazo-oses-pincheira-sanchez nov 2024
 */
public class Frm_EditarProd extends javax.swing.JFrame {

    /**
     * Creates new form jfrm_editarProd
     */
    public Frm_EditarProd() {
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
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jtxt_idProdUpdate = new javax.swing.JTextField();
        jbtn_guardarUpdateProd = new javax.swing.JButton();
        jbtn_volverUpdateProd = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        jLabel3.setFont(new java.awt.Font("Candara Light", 1, 24)); // NOI18N
        jLabel3.setText("Actualizar Producto");

        jLabel1.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        jLabel1.setText("ID Producto:");

        jbtn_guardarUpdateProd.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        jbtn_guardarUpdateProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/editar.png"))); // NOI18N
        jbtn_guardarUpdateProd.setText("Editar");
        jbtn_guardarUpdateProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_guardarUpdateProdActionPerformed(evt);
            }
        });

        jbtn_volverUpdateProd.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        jbtn_volverUpdateProd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagen/devolver.png"))); // NOI18N
        jbtn_volverUpdateProd.setText("Volver");
        jbtn_volverUpdateProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_volverUpdateProdActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(jtxt_idProdUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbtn_guardarUpdateProd)
                        .addGap(18, 18, 18)
                        .addComponent(jbtn_volverUpdateProd)
                        .addGap(23, 23, 23)))
                .addContainerGap(51, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtxt_idProdUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_guardarUpdateProd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbtn_volverUpdateProd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 27, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbtn_volverUpdateProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_volverUpdateProdActionPerformed
        dispose();
    }//GEN-LAST:event_jbtn_volverUpdateProdActionPerformed

    private void jbtn_guardarUpdateProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_guardarUpdateProdActionPerformed
        
        String id_prod = this.jtxt_idProdUpdate.getText().trim();

        if (id_prod.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un ID válido", "Validación", JOptionPane.WARNING_MESSAGE);
            this.jtxt_idProdUpdate.requestFocus();
            return;
        }

        RegistroProducto reg = new RegistroProducto();

        Producto producto = reg.buscarPorId(id_prod); // Implementa este método para obtener un producto de la BD

        if (producto == null) {
            JOptionPane.showMessageDialog(null, "Producto no encontrado con el ID ingresado", "Error", JOptionPane.ERROR_MESSAGE);
            this.jtxt_idProdUpdate.requestFocus();
            return;
        }

        // Edición de los datos 
        String nuevoNombre = JOptionPane.showInputDialog(null, "Editar nombre del producto:", producto.getNombre_prod());
        if (nuevoNombre != null && !nuevoNombre.trim().isEmpty()) {
            producto.setNombre_prod(nuevoNombre.trim());
        }

        try {
            int nuevoPrecio = Integer.parseInt(JOptionPane.showInputDialog(null, "Editar precio del producto:", producto.getPrecio_prod()));
            producto.setPrecio_prod(nuevoPrecio);

            

            // Actualización del total
            
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Valores numéricos inválidos", "Validación", JOptionPane.WARNING_MESSAGE);
            return;
        }

        // Método actualizarProducto para guardar los cambios
        boolean actualizado = reg.actualizarProducto(producto);

        if (actualizado) {
            JOptionPane.showMessageDialog(null, "Producto actualizado correctamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error al actualizar el producto en la base de datos", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_jbtn_guardarUpdateProdActionPerformed

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
            java.util.logging.Logger.getLogger(Frm_EditarProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frm_EditarProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frm_EditarProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frm_EditarProd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frm_EditarProd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton jbtn_guardarUpdateProd;
    private javax.swing.JButton jbtn_volverUpdateProd;
    private javax.swing.JTextField jtxt_idProdUpdate;
    // End of variables declaration//GEN-END:variables
}