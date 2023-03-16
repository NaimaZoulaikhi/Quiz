/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Project;
import java.sql.*;
import Connecter.ConnectionProvided;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author HP
 */
public class allStudentResult extends javax.swing.JFrame {

    /**
     * Creates new form allStudentResult
     */
    public allStudentResult() {
        initComponents();
        try{
            Connection con=ConnectionProvided.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from student");
            //jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
        
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        
        }
        
        
        
    }
    private void updateTable(){
        String sql="select * from student";
        try{
            Connection con=ConnectionProvided.getCon();
            PreparedStatement ps=con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }}
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/AdminHomeBack (1).jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(150, 150));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/Resultat.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(146, 17, -1, -1));

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 204));
        jLabel2.setText("Résultats des étudiants");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(236, 36, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/Quitter.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(979, 6, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 99, 1020, 10));

        jLabel3.setFont(new java.awt.Font("Perpetua Titling MT", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("filtrer les étudiants par :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 121, -1, -1));

        jTextField1.setFont(new java.awt.Font("Perpetua Titling MT", 1, 16)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 290, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setEnabled(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(29, 152, 1020, 360));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Note", "CNE", "Nom&Prénom", " " }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/AdminHomeBack (1).jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, -70, -1, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        adminHome.open=0;
        setVisible(false);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        /*int marks=0;
        if(jTextField1.getText().equals("")){
            updateTable();
            
        }else
            marks=Integer.parseInt(jTextField1.getText());
            try{
            Connection con=ConnectionProvided.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from student where marks="+marks+" ");
            //jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            
        
        
        }catch(Exception e){
            JFrame jf=new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, e);
        
        }*/
        int marks=0;
        if(jComboBox1.getSelectedItem().equals("Note")){
            if(jTextField1.getText().equals("")){
                updateTable();            
            }else{
                marks=Integer.parseInt(jTextField1.getText());
                try{
                    Connection con=ConnectionProvided.getCon();
                    Statement st=con.createStatement();
                    ResultSet rs=st.executeQuery("select * from student where marks="+marks+" ");
                    //jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
                    jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                }catch(Exception e){
                    JFrame jf=new JFrame();
                    jf.setAlwaysOnTop(true);
                    JOptionPane.showMessageDialog(jf, e);}
                }
        }else if(jComboBox1.getSelectedItem().equals("CNE")){
            if(jTextField1.getText().equals("")){
                updateTable();            
            
            }else{
                String cne;
                cne=jTextField1.getText();
                    try{
                        Connection con=ConnectionProvided.getCon();
                        Statement st=con.createStatement();
                        ResultSet rs=st.executeQuery("select * from student where cne='"+cne+"' ");
                        //jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
                        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                    }catch(Exception e){
                        JFrame jf=new JFrame();
                        jf.setAlwaysOnTop(true);
                        JOptionPane.showMessageDialog(jf, e);}
            }
            }else{
            if(jTextField1.getText().equals("")){
                updateTable();            
            
            }else{
                String fullName;
                fullName=jTextField1.getText();
                    try{
                        Connection con=ConnectionProvided.getCon();
                        Statement st=con.createStatement();
                        ResultSet rs=st.executeQuery("select * from student where fullName='"+fullName+"' ");
                        //jTable1.setAutoResizeMode(jTable1.AUTO_RESIZE_OFF);
                        jTable1.setModel(DbUtils.resultSetToTableModel(rs));
                    }catch(Exception e){
                        JFrame jf=new JFrame();
                        jf.setAlwaysOnTop(true);
                        JOptionPane.showMessageDialog(jf, e);}
            }
        }
                     
        
        
        
    }//GEN-LAST:event_jTextField1KeyReleased

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTable1MouseClicked

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
            java.util.logging.Logger.getLogger(allStudentResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(allStudentResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(allStudentResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(allStudentResult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new allStudentResult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}