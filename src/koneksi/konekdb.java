/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import uts.jFomUTS;

/**
 *
 * @author VAIO
 */
public class konekdb extends javax.swing.JFrame {

    /**
     * Creates new form konekdb
     */
    public konekdb() {
        initComponents();
        
    }
    
    public void getKoneksi (){
    String db = txtdb.getText();
        String nama = txtnama.getText();
        String pass = txtpass.getText();
        
        try {
                   String host        = "jdbc:mysql://localhost/"+ db,
                              user        = nama,
                              password        = pass;
                   Connection con = (Connection) DriverManager.getConnection(host, user, password);
                   JOptionPane.showMessageDialog(null, "Koneksi Berhasil");
                   
                   jFomUTS out = new jFomUTS();
                   out.setLocationRelativeTo(null);
                   out.setVisible(true);
                  
           }catch(SQLException err){
                   JOptionPane.showMessageDialog(null,"Error");
           }

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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtdb = new javax.swing.JTextField();
        txtnama = new javax.swing.JTextField();
        txtpass = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Nama Database");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, -1, -1));

        jLabel2.setText("Nama User");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 104, -1, 20));

        jLabel3.setText("Password User");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));
        getContentPane().add(txtdb, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 65, 102, -1));
        getContentPane().add(txtnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 103, 102, -1));
        getContentPane().add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(213, 141, 102, -1));

        jButton1.setText("Koneksikan");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(147, 179, -1, -1));

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/koneksi/foto-kenapa-keindahan-senja-berbeda-beda.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 300));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        getKoneksi();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField txtdb;
    private javax.swing.JTextField txtnama;
    private javax.swing.JTextField txtpass;
    // End of variables declaration//GEN-END:variables
}
