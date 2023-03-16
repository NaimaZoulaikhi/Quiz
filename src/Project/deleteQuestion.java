/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Project;

import java.sql.*;
import Connecter.ConnectionProvided;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


/**
 *
 * @author HP
 */
public class deleteQuestion extends javax.swing.JFrame {

    public deleteQuestion() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(130, 150));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/delete Question.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 24, -1, -1));

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 204));
        jLabel2.setText("Supprimer question");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 43, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/Quitter.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 6, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 940, 10));

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 1, 21)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ID question :");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 150, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 1, 21)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Question :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 190, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 1, 21)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Réponse :");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Emoji", 1, 21)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Option 1 :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Emoji", 1, 21)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Opyion 2 :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Emoji", 1, 21)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Option 3 :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, -1, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 1, 21)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Option 4 :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 390, -1, -1));

        jTextField1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 310, -1));

        jTextField2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 180, 620, -1));

        jTextField3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 220, 620, -1));

        jTextField4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 620, -1));

        jTextField5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 620, -1));

        jTextField6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 340, 620, -1));

        jTextField7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        getContentPane().add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 380, 620, -1));

        jButton2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 0, 153));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/search.png"))); // NOI18N
        jButton2.setText("Rechercher");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 150, 30));

        jButton3.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 0, 153));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/clear.png"))); // NOI18N
        jButton3.setText("Annuler");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 450, 130, 40));

        jButton4.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(153, 0, 153));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/delete.png"))); // NOI18N
        jButton4.setText("Supprimer");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, 140, 40));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/AdminHomeBack (1).jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, -70, -1, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jTextField5.setText("");
        jTextField6.setText("");
        jTextField7.setText("");
        jTextField1.setEditable(true);
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         adminHome.open = 0;
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        String id=jTextField1.getText();
        try{
            Connection con=ConnectionProvided.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from question where id='"+id+"'");
            if(rs.first()){
                jTextField2.setText(rs.getString(2));
                jTextField3.setText(rs.getString(3));
                jTextField4.setText(rs.getString(4));
                jTextField5.setText(rs.getString(5));
                jTextField6.setText(rs.getString(6));
                jTextField7.setText(rs.getString(7));
                jTextField1.setEditable(false);
                
                
            
            
            }else{
                JFrame jf=new JFrame();
                jf.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(jf, "Aucune question avec cet identifiant!!");
            
            }
            
            
        }catch(Exception e){
            JFrame jf=new JFrame();
                jf.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(jf, e);
        
        
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
           String id=jTextField1.getText();
           try{
               Connection con=ConnectionProvided.getCon();
               PreparedStatement ps=con.prepareStatement("delete from question where id=?");
               ps.setString(1, id);
               ps.executeUpdate();
               JFrame jf=new JFrame();
               jf.setAlwaysOnTop(true);
               JOptionPane.showMessageDialog(jf, "Question bien supprimé!");
               setVisible(false);
               new deleteQuestion().setVisible(true);
           
           }catch(Exception e){
               JFrame jf=new JFrame();
                jf.setAlwaysOnTop(true);
                JOptionPane.showMessageDialog(jf, e);
        
           
           }
        
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new deleteQuestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
