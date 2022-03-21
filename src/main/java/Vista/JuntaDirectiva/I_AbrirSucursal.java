package Vista.JuntaDirectiva;
import Controlador.Ctrl_JuntaDirectiva;
import Vista.Errores.*;
import Vista.Exito.I_OperacionOK;

public class I_AbrirSucursal extends javax.swing.JFrame {

    private Ctrl_JuntaDirectiva control = new Ctrl_JuntaDirectiva();
    
    /**
     * Creates new form I_AbrirSucursal
     */
    public I_AbrirSucursal() {
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

        abrirSucursal_title__label = new javax.swing.JLabel();
        abrirSucursal_name__label = new javax.swing.JLabel();
        abrirSucursal_name__field = new javax.swing.JTextField();
        abrirSucursal_location__label = new javax.swing.JLabel();
        abrirSucursal_location__field = new javax.swing.JTextField();
        cancel__btn = new javax.swing.JButton();
        confirm__btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        abrirSucursal_title__label.setText("Abrir Sucursal");

        abrirSucursal_name__label.setText("Nombre:");

        abrirSucursal_location__label.setText("Ubicación:");

        cancel__btn.setText("Cancelar");
        cancel__btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel__btnActionPerformed(evt);
            }
        });

        confirm__btn.setText("Aceptar");
        confirm__btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirm__btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(abrirSucursal_title__label)
                .addGap(213, 213, 213))
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(abrirSucursal_name__label, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(abrirSucursal_name__field, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(abrirSucursal_location__label, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(abrirSucursal_location__field, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancel__btn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(111, 111, 111)
                        .addComponent(confirm__btn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(abrirSucursal_title__label)
                .addGap(27, 27, 27)
                .addComponent(abrirSucursal_name__label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(abrirSucursal_name__field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addComponent(abrirSucursal_location__label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(abrirSucursal_location__field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel__btn)
                    .addComponent(confirm__btn))
                .addGap(56, 56, 56))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void confirm__btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirm__btnActionPerformed
        String nombre = abrirSucursal_name__field.getText();
        String ubicacion = abrirSucursal_location__field.getText();
        if(Ctrl_JuntaDirectiva.VerificarDatosSucursal(nombre, ubicacion)){
            if(control.AbrirSucursal(nombre)){
                I_OperacionOK OK = new I_OperacionOK("IDB_JuntaDirectiva");
                OK.setVisible(true);
                dispose();
            }else{
                I_Error3 error = new I_Error3();
                error.setVisible(true);
            }
        }else{
            I_Error1 DatosInvalidos = new I_Error1();
            DatosInvalidos.setVisible(true);
        }
    }//GEN-LAST:event_confirm__btnActionPerformed

    private void cancel__btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel__btnActionPerformed
        IDB_JuntaDirectiva JuntaDB = new IDB_JuntaDirectiva();
        JuntaDB.setVisible(true);
        I_AbrirSucursal.this.setVisible(false);
        dispose();
    }//GEN-LAST:event_cancel__btnActionPerformed

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
            java.util.logging.Logger.getLogger(I_AbrirSucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(I_AbrirSucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(I_AbrirSucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(I_AbrirSucursal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new I_AbrirSucursal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField abrirSucursal_location__field;
    private javax.swing.JLabel abrirSucursal_location__label;
    private javax.swing.JTextField abrirSucursal_name__field;
    private javax.swing.JLabel abrirSucursal_name__label;
    private javax.swing.JLabel abrirSucursal_title__label;
    private javax.swing.JButton cancel__btn;
    private javax.swing.JButton confirm__btn;
    // End of variables declaration//GEN-END:variables
}
