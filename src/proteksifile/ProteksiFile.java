package proteksifile;

import java.io.File;
import javax.swing.ButtonGroup;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class ProteksiFile extends javax.swing.JFrame {

    private static String fileNameInput;
    private static String fileNameOutput;
    
    
    public ProteksiFile() {
        initComponents();
        
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioProtect);
        buttonGroup.add(radioUnProtect);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textOutput = new java.awt.TextField();
        btnInput = new javax.swing.JButton();
        btnOutput = new javax.swing.JButton();
        labelPassword = new javax.swing.JLabel();
        radioProtect = new javax.swing.JRadioButton();
        radioUnProtect = new javax.swing.JRadioButton();
        checkHapus = new javax.swing.JCheckBox();
        btnProses = new javax.swing.JButton();
        btnKeluar = new javax.swing.JButton();
        textPassword = new javax.swing.JTextField();
        textInput = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("JONI PRIANTO - PROTEKSI FILE");

        btnInput.setText("Input");
        btnInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInputActionPerformed(evt);
            }
        });

        btnOutput.setText("Output");
        btnOutput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOutputActionPerformed(evt);
            }
        });

        labelPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        labelPassword.setText("Password");

        radioProtect.setText("Protect");

        radioUnProtect.setText("UnProtect");

        checkHapus.setText("Hapus file asli");

        btnProses.setText("Proses");
        btnProses.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProsesActionPerformed(evt);
            }
        });

        btnKeluar.setText("Keluar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(radioProtect)
                .addGap(26, 26, 26)
                .addComponent(radioUnProtect)
                .addGap(34, 34, 34)
                .addComponent(checkHapus)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnProses, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(btnKeluar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textOutput, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                            .addComponent(textPassword)
                            .addComponent(textInput))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnOutput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnInput, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(labelPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(50, 50, 50))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(btnInput))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(textInput, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(btnOutput))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(textOutput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radioProtect)
                    .addComponent(radioUnProtect)
                    .addComponent(checkHapus))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProses)
                    .addComponent(btnKeluar))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInputActionPerformed
        JFileChooser inputFileChooser = new JFileChooser();
        inputFileChooser.showOpenDialog(null);
        fileNameInput = inputFileChooser.getSelectedFile().getAbsolutePath();
        if(fileNameInput != null){
            textInput.setText(fileNameInput);
        }
    }//GEN-LAST:event_btnInputActionPerformed

    private void btnOutputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOutputActionPerformed
        JFileChooser outputFileChooser = new JFileChooser();
        outputFileChooser.showOpenDialog(null);
        fileNameOutput = outputFileChooser.getSelectedFile().getAbsolutePath();
        if(fileNameOutput != null){
            textOutput.setText(fileNameOutput);
        }
    }//GEN-LAST:event_btnOutputActionPerformed

    private void btnProsesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProsesActionPerformed
        String strPassword = textPassword.getText().toString();
        File fInput = new File(fileNameInput);
        File fOutput = new File(fileNameOutput);
        if(radioProtect.isSelected()){
            try{
               CryptoUtils.encrypt(strPassword,fInput, fOutput);
               JOptionPane.showMessageDialog(null, "Proteksi berhasil");
            } catch (Exception e){
               e.printStackTrace();   
            }
            
        } else {
            try{
                CryptoUtils.decrypt(strPassword, fInput, fOutput);
                 JOptionPane.showMessageDialog(null, "UnProtect berhasil");
            } catch (Exception e){
                e.printStackTrace();
            }
           
        }
        if(checkHapus.isSelected()){
            fInput.delete();
            checkHapus.setSelected(false);
        }
        textInput.setText("");
        textOutput.setText("");
        textPassword.setText("");
        
    }//GEN-LAST:event_btnProsesActionPerformed

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
            java.util.logging.Logger.getLogger(ProteksiFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProteksiFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProteksiFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProteksiFile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProteksiFile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInput;
    private javax.swing.JButton btnKeluar;
    private javax.swing.JButton btnOutput;
    private javax.swing.JButton btnProses;
    private javax.swing.JCheckBox checkHapus;
    private javax.swing.JLabel labelPassword;
    private javax.swing.JRadioButton radioProtect;
    private javax.swing.JRadioButton radioUnProtect;
    private javax.swing.JTextField textInput;
    private java.awt.TextField textOutput;
    private javax.swing.JTextField textPassword;
    // End of variables declaration//GEN-END:variables
}
