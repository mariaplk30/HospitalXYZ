package Vista.Secretaria;
import java.util.Date;

public class I_ModificarCita extends javax.swing.JFrame {

    /**
     * Creates new form I_ModificarCita
     */
    public I_ModificarCita() {
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

        jLabel1 = new javax.swing.JLabel();
        modificarCita_patient__label = new javax.swing.JLabel();
        modificarCita_patient__field = new javax.swing.JTextField();
        modificarCita_date__label = new javax.swing.JLabel();
        modificarCita_doctor__label = new javax.swing.JLabel();
        modificarCita_doctor__field = new javax.swing.JTextField();
        modificarCita_branch__label = new javax.swing.JLabel();
        modificarCita_branch__field = new javax.swing.JTextField();
        cancel__btn = new javax.swing.JButton();
        confirm__btn = new javax.swing.JButton();
        modificarCita_date__field = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Modificar Cita");

        modificarCita_patient__label.setText("Paciente:");

        modificarCita_date__label.setText("Fecha:");

        modificarCita_doctor__label.setText("Médico:");

        modificarCita_branch__label.setText("Sucursal:");

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
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(modificarCita_doctor__field, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(modificarCita_patient__label, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(modificarCita_date__label, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(modificarCita_doctor__label, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(modificarCita_branch__label, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(modificarCita_patient__field, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(modificarCita_date__field, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cancel__btn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(confirm__btn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(modificarCita_branch__field, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(jLabel1)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(modificarCita_patient__label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modificarCita_patient__field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(modificarCita_date__label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modificarCita_date__field, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(modificarCita_doctor__label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modificarCita_doctor__field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(modificarCita_branch__label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modificarCita_branch__field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel__btn)
                    .addComponent(confirm__btn))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancel__btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel__btnActionPerformed
        IDB_Secretaria SecretariaDB = new IDB_Secretaria();
        SecretariaDB.setVisible(true);
        I_ModificarCita.this.setVisible(false);
        dispose();
    }//GEN-LAST:event_cancel__btnActionPerformed

    private void confirm__btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirm__btnActionPerformed
        //Si datos válidos
        String paciente = modificarCita_patient__field.getText();
        Date fecha = modificarCita_date__field.getDate();
        String medico = modificarCita_doctor__field.getText();
        String sucursal = modificarCita_branch__field.getText();

        IDB_Secretaria SecretariaDB = new IDB_Secretaria();
        SecretariaDB.setVisible(true);
        I_ModificarCita.this.setVisible(false);
        dispose();
    }//GEN-LAST:event_confirm__btnActionPerformed

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
            java.util.logging.Logger.getLogger(I_ModificarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(I_ModificarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(I_ModificarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(I_ModificarCita.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new I_ModificarCita().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel__btn;
    private javax.swing.JButton confirm__btn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField modificarCita_branch__field;
    private javax.swing.JLabel modificarCita_branch__label;
    private com.toedter.calendar.JDateChooser modificarCita_date__field;
    private javax.swing.JLabel modificarCita_date__label;
    private javax.swing.JTextField modificarCita_doctor__field;
    private javax.swing.JLabel modificarCita_doctor__label;
    private javax.swing.JTextField modificarCita_patient__field;
    private javax.swing.JLabel modificarCita_patient__label;
    // End of variables declaration//GEN-END:variables
}
