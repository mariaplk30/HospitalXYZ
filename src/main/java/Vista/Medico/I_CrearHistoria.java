package Vista.Medico;
import Controlador.Ctrl_Historia;
import Vista.Errores.I_Error1;
import Vista.Errores.I_Error6;
import Vista.Exito.I_OperacionOK;

public class I_CrearHistoria extends javax.swing.JFrame{
    
    private IDB_Medico MedicoDB = new IDB_Medico();
    private Ctrl_Historia control = new Ctrl_Historia();
    
    /**
     * Creates new form I_CrearHistoria
     */
    public I_CrearHistoria(){
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

        crearHistoria_title__label = new javax.swing.JLabel();
        crearHistoria_patient__label = new javax.swing.JLabel();
        crearHistoria_patient__field = new javax.swing.JTextField();
        crearHistoria_weight__label = new javax.swing.JLabel();
        crearHistoria_weight__field = new javax.swing.JTextField();
        crearHistoria_height__label = new javax.swing.JLabel();
        crearHistoria_height__field = new javax.swing.JTextField();
        crearHistoria_bmi__label = new javax.swing.JLabel();
        crearHistoria_bmi__field = new javax.swing.JTextField();
        crearHistoria_bpm__label = new javax.swing.JLabel();
        crearHistoria_bpm__field = new javax.swing.JTextField();
        crearHistoria_tMax__label = new javax.swing.JLabel();
        crearHistoria_tMax__field = new javax.swing.JTextField();
        crearHistoria_tMin__label = new javax.swing.JLabel();
        crearHistoria_tMin__field = new javax.swing.JTextField();
        crearHistoria_evolution__label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        crearHistoria_evolution__textArea = new javax.swing.JTextArea();
        crearHistoria_apptControl__label = new javax.swing.JLabel();
        cancel__btn = new javax.swing.JButton();
        confirm__btn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        crearHistoria_apptControl__textArea = new javax.swing.JTextArea();
        crearHistoria_branch__label = new javax.swing.JLabel();
        crearHistoria_branch__field = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        crearHistoria_title__label.setText("Crear Historia");

        crearHistoria_patient__label.setText("Paciente:");

        crearHistoria_weight__label.setText("Peso:");

        crearHistoria_weight__field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearHistoria_weight__fieldActionPerformed(evt);
            }
        });

        crearHistoria_height__label.setText("Talla:");

        crearHistoria_height__field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearHistoria_height__fieldActionPerformed(evt);
            }
        });

        crearHistoria_bmi__label.setText("IMC:");

        crearHistoria_bmi__field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearHistoria_bmi__fieldActionPerformed(evt);
            }
        });

        crearHistoria_bpm__label.setText("PPM:");

        crearHistoria_tMax__label.setText("Tensión Max:");

        crearHistoria_tMax__field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearHistoria_tMax__fieldActionPerformed(evt);
            }
        });

        crearHistoria_tMin__label.setText("Tensión Min:");

        crearHistoria_tMin__field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearHistoria_tMin__fieldActionPerformed(evt);
            }
        });

        crearHistoria_evolution__label.setText("Evolución:");

        crearHistoria_evolution__textArea.setColumns(20);
        crearHistoria_evolution__textArea.setRows(5);
        jScrollPane1.setViewportView(crearHistoria_evolution__textArea);

        crearHistoria_apptControl__label.setText("Control de Cita:");

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

        crearHistoria_apptControl__textArea.setColumns(20);
        crearHistoria_apptControl__textArea.setRows(5);
        jScrollPane2.setViewportView(crearHistoria_apptControl__textArea);

        crearHistoria_branch__label.setText("Sucursal:");

        crearHistoria_branch__field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crearHistoria_branch__fieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cancel__btn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(confirm__btn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(crearHistoria_weight__label, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(143, 143, 143)
                                .addComponent(crearHistoria_height__label, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(78, 78, 78))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(crearHistoria_bmi__field, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(crearHistoria_bmi__label, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(78, 78, 78)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(crearHistoria_bpm__field, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(crearHistoria_bpm__label, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(78, 78, 78))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(crearHistoria_tMax__field, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(crearHistoria_tMax__label, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(78, 78, 78)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(crearHistoria_tMin__field, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(crearHistoria_tMin__label, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(78, 78, 78))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(crearHistoria_evolution__label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(crearHistoria_apptControl__label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(crearHistoria_patient__label, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(135, 135, 135))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(crearHistoria_weight__field, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(53, 53, 53))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(crearHistoria_patient__field, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(38, 38, 38)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(crearHistoria_branch__label, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(crearHistoria_height__field, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                                            .addComponent(crearHistoria_branch__field))))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(215, 215, 215)
                        .addComponent(crearHistoria_title__label)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(crearHistoria_title__label)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(crearHistoria_patient__label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(crearHistoria_patient__field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(crearHistoria_branch__label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(crearHistoria_branch__field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crearHistoria_weight__label)
                    .addComponent(crearHistoria_height__label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(crearHistoria_weight__field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(crearHistoria_height__field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(crearHistoria_bpm__label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(crearHistoria_bpm__field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(crearHistoria_bmi__label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(crearHistoria_bmi__field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(crearHistoria_tMin__label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(crearHistoria_tMin__field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(crearHistoria_tMax__label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(crearHistoria_tMax__field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(crearHistoria_evolution__label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(crearHistoria_apptControl__label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel__btn)
                    .addComponent(confirm__btn))
                .addContainerGap(65, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void crearHistoria_weight__fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearHistoria_weight__fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crearHistoria_weight__fieldActionPerformed

    private void crearHistoria_bmi__fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearHistoria_bmi__fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crearHistoria_bmi__fieldActionPerformed

    private void crearHistoria_tMax__fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearHistoria_tMax__fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crearHistoria_tMax__fieldActionPerformed

    private void crearHistoria_height__fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearHistoria_height__fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crearHistoria_height__fieldActionPerformed

    private void crearHistoria_tMin__fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearHistoria_tMin__fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crearHistoria_tMin__fieldActionPerformed

    private void confirm__btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirm__btnActionPerformed
        String paciente = crearHistoria_patient__field.getText();
        String peso = crearHistoria_weight__field.getText();
        String talla = crearHistoria_height__field.getText();
        String IMC = crearHistoria_bmi__field.getText();
        String PPM = crearHistoria_bpm__field.getText();
        String tensionMax = crearHistoria_tMax__field.getText();
        String tensionMin = crearHistoria_tMin__field.getText();
        String evolucion = crearHistoria_evolution__textArea.getText();
        String control = crearHistoria_apptControl__textArea.getText();
        String sucursal = crearHistoria_branch__field.getText();
        if(Ctrl_Historia.VerificarDatosHistoria(paciente, peso, talla, IMC, PPM, tensionMax, tensionMin, evolucion, control, sucursal)){
            if(this.control.CrearHistoria(paciente, peso, talla, IMC, tensionMax, tensionMin, sucursal)){
                I_OperacionOK OK = new I_OperacionOK("IDB_Medico");
                OK.setVisible(true);
                dispose();
            }else{
                I_Error6 error = new I_Error6();
                error.setVisible(true);
            }
        }else{
            I_Error1 error = new I_Error1();
            error.setVisible(true);
        }
    }//GEN-LAST:event_confirm__btnActionPerformed

    private void cancel__btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel__btnActionPerformed
        MedicoDB.setVisible(true);
        I_CrearHistoria.this.setVisible(false);
        dispose();
    }//GEN-LAST:event_cancel__btnActionPerformed

    private void crearHistoria_branch__fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crearHistoria_branch__fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_crearHistoria_branch__fieldActionPerformed

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
            java.util.logging.Logger.getLogger(I_CrearHistoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(I_CrearHistoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(I_CrearHistoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(I_CrearHistoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new I_CrearHistoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel__btn;
    private javax.swing.JButton confirm__btn;
    private javax.swing.JLabel crearHistoria_apptControl__label;
    private javax.swing.JTextArea crearHistoria_apptControl__textArea;
    private javax.swing.JTextField crearHistoria_bmi__field;
    private javax.swing.JLabel crearHistoria_bmi__label;
    private javax.swing.JTextField crearHistoria_bpm__field;
    private javax.swing.JLabel crearHistoria_bpm__label;
    private javax.swing.JTextField crearHistoria_branch__field;
    private javax.swing.JLabel crearHistoria_branch__label;
    private javax.swing.JLabel crearHistoria_evolution__label;
    private javax.swing.JTextArea crearHistoria_evolution__textArea;
    private javax.swing.JTextField crearHistoria_height__field;
    private javax.swing.JLabel crearHistoria_height__label;
    private javax.swing.JTextField crearHistoria_patient__field;
    private javax.swing.JLabel crearHistoria_patient__label;
    private javax.swing.JTextField crearHistoria_tMax__field;
    private javax.swing.JLabel crearHistoria_tMax__label;
    private javax.swing.JTextField crearHistoria_tMin__field;
    private javax.swing.JLabel crearHistoria_tMin__label;
    private javax.swing.JLabel crearHistoria_title__label;
    private javax.swing.JTextField crearHistoria_weight__field;
    private javax.swing.JLabel crearHistoria_weight__label;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
