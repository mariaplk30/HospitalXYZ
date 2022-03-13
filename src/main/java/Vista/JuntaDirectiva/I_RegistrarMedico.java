/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista.JuntaDirectiva;

/**
 *
 * @author Hogar
 */
public class I_RegistrarMedico extends javax.swing.JFrame {

    /**
     * Creates new form I_RegistrarMedico
     */
    public I_RegistrarMedico() {
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

        registrarMedico_title__label = new javax.swing.JLabel();
        registrarMedico_names__label = new javax.swing.JLabel();
        registrarMedico_names__field = new javax.swing.JTextField();
        registrarMedico_lastNames__label = new javax.swing.JLabel();
        registrarMedico_lastNames__field = new javax.swing.JTextField();
        registrarMedico_id__label = new javax.swing.JLabel();
        registrarMedico_id__field = new javax.swing.JTextField();
        registrarMedico_gender__label = new javax.swing.JLabel();
        registrarMedico_gender__field = new javax.swing.JTextField();
        registrarMedico_birthPlace__label = new javax.swing.JLabel();
        registrarMedico_birthPlace__field = new javax.swing.JTextField();
        registrarMedico_civilStatus__label = new javax.swing.JLabel();
        registrarMedico_civilStatus__field = new javax.swing.JTextField();
        registrarMedico_homeAddress__label = new javax.swing.JLabel();
        registrarMedico_homeAddress__field = new javax.swing.JTextField();
        registrarMedico_phone__label = new javax.swing.JLabel();
        registrarMedico_phone__field = new javax.swing.JTextField();
        registrarMedico_job__label = new javax.swing.JLabel();
        registrarMedico_job__field = new javax.swing.JTextField();
        cancel__btn = new javax.swing.JButton();
        confirm__btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        registrarMedico_title__label.setText("Registrar Médico");

        registrarMedico_names__label.setText("Nombres:");

        registrarMedico_names__field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarMedico_names__fieldActionPerformed(evt);
            }
        });

        registrarMedico_lastNames__label.setText("Apellidos:");

        registrarMedico_lastNames__field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarMedico_lastNames__fieldActionPerformed(evt);
            }
        });

        registrarMedico_id__label.setText("Cédula:");

        registrarMedico_gender__label.setText("Sexo:");

        registrarMedico_gender__field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarMedico_gender__fieldActionPerformed(evt);
            }
        });

        registrarMedico_birthPlace__label.setText("Lugar de Nacimiento:");

        registrarMedico_civilStatus__label.setText("Estado Civil:");

        registrarMedico_homeAddress__label.setText("Dirección de Habitación:");

        registrarMedico_phone__label.setText("Teléfono:");

        registrarMedico_job__label.setText("Especialidad:");

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
                        .addGap(210, 210, 210)
                        .addComponent(registrarMedico_title__label))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(registrarMedico_names__label, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registrarMedico_names__field)
                            .addComponent(registrarMedico_lastNames__label, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registrarMedico_lastNames__field)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(registrarMedico_id__label, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(registrarMedico_id__field, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(registrarMedico_gender__field, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(registrarMedico_gender__label, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(registrarMedico_birthPlace__field, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registrarMedico_civilStatus__field, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(registrarMedico_birthPlace__label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(registrarMedico_civilStatus__label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(registrarMedico_homeAddress__label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(registrarMedico_phone__label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(registrarMedico_job__label, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(287, 287, 287))
                            .addComponent(registrarMedico_homeAddress__field, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registrarMedico_phone__field, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(registrarMedico_job__field, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cancel__btn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(confirm__btn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(registrarMedico_title__label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(registrarMedico_names__label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registrarMedico_names__field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(registrarMedico_lastNames__label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registrarMedico_lastNames__field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrarMedico_id__label)
                    .addComponent(registrarMedico_gender__label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(registrarMedico_id__field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registrarMedico_gender__field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(registrarMedico_birthPlace__label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registrarMedico_birthPlace__field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(registrarMedico_civilStatus__label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registrarMedico_civilStatus__field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(registrarMedico_homeAddress__label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registrarMedico_homeAddress__field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(registrarMedico_phone__label, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registrarMedico_phone__field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(registrarMedico_job__label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registrarMedico_job__field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel__btn)
                    .addComponent(confirm__btn))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarMedico_names__fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarMedico_names__fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registrarMedico_names__fieldActionPerformed

    private void registrarMedico_lastNames__fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarMedico_lastNames__fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registrarMedico_lastNames__fieldActionPerformed

    private void registrarMedico_gender__fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarMedico_gender__fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_registrarMedico_gender__fieldActionPerformed

    private void cancel__btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel__btnActionPerformed
        IDB_JuntaDirectiva JuntaDB = new IDB_JuntaDirectiva();
        JuntaDB.setVisible(true);
        I_RegistrarMedico.this.setVisible(false);
        dispose();
    }//GEN-LAST:event_cancel__btnActionPerformed

    private void confirm__btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirm__btnActionPerformed
        // Si datos válidos     
        IDB_JuntaDirectiva JuntaDB = new IDB_JuntaDirectiva();
        JuntaDB.setVisible(true);
        I_RegistrarMedico.this.setVisible(false);
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
            java.util.logging.Logger.getLogger(I_RegistrarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(I_RegistrarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(I_RegistrarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(I_RegistrarMedico.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new I_RegistrarMedico().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel__btn;
    private javax.swing.JButton confirm__btn;
    private javax.swing.JTextField registrarMedico_birthPlace__field;
    private javax.swing.JLabel registrarMedico_birthPlace__label;
    private javax.swing.JTextField registrarMedico_civilStatus__field;
    private javax.swing.JLabel registrarMedico_civilStatus__label;
    private javax.swing.JTextField registrarMedico_gender__field;
    private javax.swing.JLabel registrarMedico_gender__label;
    private javax.swing.JTextField registrarMedico_homeAddress__field;
    private javax.swing.JLabel registrarMedico_homeAddress__label;
    private javax.swing.JTextField registrarMedico_id__field;
    private javax.swing.JLabel registrarMedico_id__label;
    private javax.swing.JTextField registrarMedico_job__field;
    private javax.swing.JLabel registrarMedico_job__label;
    private javax.swing.JTextField registrarMedico_lastNames__field;
    private javax.swing.JLabel registrarMedico_lastNames__label;
    private javax.swing.JTextField registrarMedico_names__field;
    private javax.swing.JLabel registrarMedico_names__label;
    private javax.swing.JTextField registrarMedico_phone__field;
    private javax.swing.JLabel registrarMedico_phone__label;
    private javax.swing.JLabel registrarMedico_title__label;
    // End of variables declaration//GEN-END:variables
}
