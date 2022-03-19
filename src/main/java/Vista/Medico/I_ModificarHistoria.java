package Vista.Medico;

public class I_ModificarHistoria extends javax.swing.JFrame {

    /**
     * Creates new form I_ModificarHistoria
     */
    public I_ModificarHistoria() {
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

        modificarHistoria_title__label = new javax.swing.JLabel();
        modificarHistoria_patient__label = new javax.swing.JLabel();
        modificarHistoria_patient__field = new javax.swing.JTextField();
        modificarHistoria_weight__label = new javax.swing.JLabel();
        modificarHistoria_weight__field = new javax.swing.JTextField();
        modificarHistoria_height__label = new javax.swing.JLabel();
        modificarHistoria_height__field = new javax.swing.JTextField();
        modificarHistoria_bmi__label = new javax.swing.JLabel();
        modificarHistoria_bmi__field = new javax.swing.JTextField();
        modificarHistoria_bpm__label = new javax.swing.JLabel();
        modificarHistoria_bpm__field = new javax.swing.JTextField();
        modificarHistoria_tMax__label = new javax.swing.JLabel();
        modificarHistoria_tMax__field = new javax.swing.JTextField();
        modificarHistoria_tMin__label = new javax.swing.JLabel();
        modificarHistoria_tMin__field = new javax.swing.JTextField();
        modificarHistoria_evolution__label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        modificarHistoria_evolution__textArea = new javax.swing.JTextArea();
        modificarHistoria_apptControl__label = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        modificarHistoria_apptControl__textArea = new javax.swing.JTextArea();
        cancel__btn = new javax.swing.JButton();
        confirm__btn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        modificarHistoria_title__label.setText("Modificar Historia");

        modificarHistoria_patient__label.setText("Paciente:");

        modificarHistoria_weight__label.setText("Peso:");

        modificarHistoria_weight__field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarHistoria_weight__fieldActionPerformed(evt);
            }
        });

        modificarHistoria_height__label.setText("Talla:");

        modificarHistoria_height__field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarHistoria_height__fieldActionPerformed(evt);
            }
        });

        modificarHistoria_bmi__label.setText("IMC:");

        modificarHistoria_bmi__field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarHistoria_bmi__fieldActionPerformed(evt);
            }
        });

        modificarHistoria_bpm__label.setText("PPM:");

        modificarHistoria_tMax__label.setText("Tensión Max:");

        modificarHistoria_tMax__field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarHistoria_tMax__fieldActionPerformed(evt);
            }
        });

        modificarHistoria_tMin__label.setText("Tensión Min:");

        modificarHistoria_tMin__field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarHistoria_tMin__fieldActionPerformed(evt);
            }
        });

        modificarHistoria_evolution__label.setText("Evolución:");

        modificarHistoria_evolution__textArea.setColumns(20);
        modificarHistoria_evolution__textArea.setRows(5);
        jScrollPane1.setViewportView(modificarHistoria_evolution__textArea);

        modificarHistoria_apptControl__label.setText("Control de Cita:");

        modificarHistoria_apptControl__textArea.setColumns(20);
        modificarHistoria_apptControl__textArea.setRows(5);
        jScrollPane2.setViewportView(modificarHistoria_apptControl__textArea);

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
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(modificarHistoria_patient__label, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(cancel__btn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(confirm__btn, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(modificarHistoria_patient__field, javax.swing.GroupLayout.PREFERRED_SIZE, 405, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(modificarHistoria_weight__label, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(143, 143, 143)
                                    .addComponent(modificarHistoria_height__label, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(78, 78, 78))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(modificarHistoria_weight__field, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(modificarHistoria_height__field, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(modificarHistoria_bmi__field, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(modificarHistoria_bmi__label, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(78, 78, 78)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(modificarHistoria_bpm__field, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(modificarHistoria_bpm__label, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(78, 78, 78))))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(modificarHistoria_tMax__field, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(modificarHistoria_tMax__label, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(78, 78, 78)))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(modificarHistoria_tMin__field, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(modificarHistoria_tMin__label, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(78, 78, 78))))
                                .addComponent(modificarHistoria_evolution__label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(modificarHistoria_apptControl__label, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(206, 206, 206)
                        .addComponent(modificarHistoria_title__label)))
                .addContainerGap(56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(modificarHistoria_title__label)
                .addGap(18, 18, 18)
                .addComponent(modificarHistoria_patient__label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(modificarHistoria_patient__field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modificarHistoria_weight__label)
                    .addComponent(modificarHistoria_height__label))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modificarHistoria_weight__field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modificarHistoria_height__field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(modificarHistoria_bpm__label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modificarHistoria_bpm__field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(modificarHistoria_bmi__label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modificarHistoria_bmi__field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(modificarHistoria_tMin__label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modificarHistoria_tMin__field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(modificarHistoria_tMax__label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(modificarHistoria_tMax__field, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(modificarHistoria_evolution__label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(modificarHistoria_apptControl__label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancel__btn)
                    .addComponent(confirm__btn))
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void modificarHistoria_weight__fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarHistoria_weight__fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarHistoria_weight__fieldActionPerformed

    private void modificarHistoria_height__fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarHistoria_height__fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarHistoria_height__fieldActionPerformed

    private void modificarHistoria_bmi__fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarHistoria_bmi__fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarHistoria_bmi__fieldActionPerformed

    private void modificarHistoria_tMax__fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarHistoria_tMax__fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarHistoria_tMax__fieldActionPerformed

    private void modificarHistoria_tMin__fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarHistoria_tMin__fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_modificarHistoria_tMin__fieldActionPerformed

    private void cancel__btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel__btnActionPerformed
        IDB_Medico MedicoDB = new IDB_Medico();
        MedicoDB.setVisible(true);
        I_ModificarHistoria.this.setVisible(false);
        dispose();
    }//GEN-LAST:event_cancel__btnActionPerformed

    private void confirm__btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirm__btnActionPerformed
        // Si datos válidos
        String paciente = modificarHistoria_patient__field.getText();
        String peso = modificarHistoria_weight__field.getText();
        String talla = modificarHistoria_height__field.getText();
        String IMC = modificarHistoria_bmi__field.getText();
        String PPM = modificarHistoria_bpm__field.getText();
        String tensionMax = modificarHistoria_tMax__field.getText();
        String tensionMin = modificarHistoria_tMin__field.getText();
        String evolucion = modificarHistoria_evolution__textArea.getText();
        String control = modificarHistoria_apptControl__textArea.getText();
        IDB_Medico MedicoDB = new IDB_Medico();
        MedicoDB.setVisible(true);
        I_ModificarHistoria.this.setVisible(false);
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
            java.util.logging.Logger.getLogger(I_ModificarHistoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(I_ModificarHistoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(I_ModificarHistoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(I_ModificarHistoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new I_ModificarHistoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel__btn;
    private javax.swing.JButton confirm__btn;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel modificarHistoria_apptControl__label;
    private javax.swing.JTextArea modificarHistoria_apptControl__textArea;
    private javax.swing.JTextField modificarHistoria_bmi__field;
    private javax.swing.JLabel modificarHistoria_bmi__label;
    private javax.swing.JTextField modificarHistoria_bpm__field;
    private javax.swing.JLabel modificarHistoria_bpm__label;
    private javax.swing.JLabel modificarHistoria_evolution__label;
    private javax.swing.JTextArea modificarHistoria_evolution__textArea;
    private javax.swing.JTextField modificarHistoria_height__field;
    private javax.swing.JLabel modificarHistoria_height__label;
    private javax.swing.JTextField modificarHistoria_patient__field;
    private javax.swing.JLabel modificarHistoria_patient__label;
    private javax.swing.JTextField modificarHistoria_tMax__field;
    private javax.swing.JLabel modificarHistoria_tMax__label;
    private javax.swing.JTextField modificarHistoria_tMin__field;
    private javax.swing.JLabel modificarHistoria_tMin__label;
    private javax.swing.JLabel modificarHistoria_title__label;
    private javax.swing.JTextField modificarHistoria_weight__field;
    private javax.swing.JLabel modificarHistoria_weight__label;
    // End of variables declaration//GEN-END:variables
}
