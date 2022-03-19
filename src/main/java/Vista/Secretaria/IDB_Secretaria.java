package Vista.Secretaria;
import Vista.I_Inicio;

public class IDB_Secretaria extends javax.swing.JFrame {

    /**
     * Creates new form IDB_Secretaria
     */
    public IDB_Secretaria() {
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

        secretariaDashboard_title__label = new javax.swing.JLabel();
        registrarPaciente__btn = new javax.swing.JButton();
        crearCita__btn = new javax.swing.JButton();
        modificarCita__btn = new javax.swing.JButton();
        cancelarCita__btn = new javax.swing.JButton();
        inicio__btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 255));

        secretariaDashboard_title__label.setText("Dashboard");

        registrarPaciente__btn.setText("Registrar Paciente");
        registrarPaciente__btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarPaciente__btnActionPerformed(evt);
            }
        });

        crearCita__btn.setText("Crear Cita");
        crearCita__btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearCita__btnActionPerformed(evt);
            }
        });

        modificarCita__btn.setText("Modificar Cita");
        modificarCita__btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarCita__btnActionPerformed(evt);
            }
        });

        cancelarCita__btn.setText("Cancelar Cita");
        cancelarCita__btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarCita__btnActionPerformed(evt);
            }
        });

        inicio__btn.setText("Inicio");
        inicio__btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inicio__btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(secretariaDashboard_title__label, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(registrarPaciente__btn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(crearCita__btn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(modificarCita__btn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cancelarCita__btn, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(inicio__btn)))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(secretariaDashboard_title__label)
                .addGap(27, 27, 27)
                .addComponent(registrarPaciente__btn)
                .addGap(26, 26, 26)
                .addComponent(crearCita__btn)
                .addGap(33, 33, 33)
                .addComponent(modificarCita__btn)
                .addGap(26, 26, 26)
                .addComponent(cancelarCita__btn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(inicio__btn)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearCita__btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearCita__btnActionPerformed
        I_SolicitarCita solicitarC = new I_SolicitarCita();
        solicitarC.setVisible(true);
        IDB_Secretaria.this.setVisible(false);
        dispose();
    }//GEN-LAST:event_crearCita__btnActionPerformed

    private void inicio__btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inicio__btnActionPerformed
        I_Inicio inicio = new I_Inicio();
        inicio.setVisible(true);
        IDB_Secretaria.this.setVisible(false);
        dispose();
    }//GEN-LAST:event_inicio__btnActionPerformed

    private void registrarPaciente__btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarPaciente__btnActionPerformed
        I_RegistrarPaciente RegistrarP = new I_RegistrarPaciente();
        RegistrarP.setVisible(true);
        IDB_Secretaria.this.setVisible(false);
        dispose();
    }//GEN-LAST:event_registrarPaciente__btnActionPerformed

    private void modificarCita__btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarCita__btnActionPerformed
        I_ModificarCita modificarC = new I_ModificarCita();
        modificarC.setVisible(true);
        IDB_Secretaria.this.setVisible(false);
        dispose();
    }//GEN-LAST:event_modificarCita__btnActionPerformed

    private void cancelarCita__btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarCita__btnActionPerformed
        I_CancelarCita cancelarC = new I_CancelarCita();
        cancelarC.setVisible(true);
        IDB_Secretaria.this.setVisible(false);
        dispose();
    }//GEN-LAST:event_cancelarCita__btnActionPerformed

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
            java.util.logging.Logger.getLogger(IDB_Secretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IDB_Secretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IDB_Secretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IDB_Secretaria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IDB_Secretaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelarCita__btn;
    private javax.swing.JButton crearCita__btn;
    private javax.swing.JButton inicio__btn;
    private javax.swing.JButton modificarCita__btn;
    private javax.swing.JButton registrarPaciente__btn;
    private javax.swing.JLabel secretariaDashboard_title__label;
    // End of variables declaration//GEN-END:variables
}
