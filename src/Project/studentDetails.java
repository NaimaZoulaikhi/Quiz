
package Project;

import Connecter.ConnectionProvided;
import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.ImageIcon;



public class studentDetails extends javax.swing.JFrame {

    /**
     * Creates new form studentDetails
     */
    public studentDetails() {
        initComponents();
        jTextArea1.setEditable(false);
        
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/indexStudent.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(151, 37, -1, -1));

        jLabel2.setFont(new java.awt.Font("Snap ITC", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 204));
        jLabel2.setText("remplir le formulaire :");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 45, -1, 56));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/Quitter.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 10, -1, -1));

        jButton2.setFont(new java.awt.Font("Snap ITC", 0, 12)); // NOI18N
        jButton2.setForeground(new java.awt.Color(153, 0, 153));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/BACK1.png"))); // NOI18N
        jButton2.setText("Retour");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 10, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(25, 107, 1317, 10));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 21)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Nom & Prénom           :");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 240, -1, -1));
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 196, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 21)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Sexe                             :");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 306, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 21)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Email                            :");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 360, -1, -1));

        jTextField1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(204, 204, 204));
        jTextField1.setText("Entrer votre nom et prénom");
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 240, 320, -1));

        jTextField2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(204, 204, 204));
        jTextField2.setText("Entrer votre email");
        jTextField2.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField2FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField2FocusLost(evt);
            }
        });
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 360, 316, -1));

        jComboBox1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Masculin", "Féminin" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 306, 144, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 21)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Numéro de téléphone :");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 415, -1, -1));

        jTextField3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jTextField3.setForeground(new java.awt.Color(204, 204, 204));
        jTextField3.setText("Entrer votre numéro de téléphone");
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField3FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 415, 316, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 21)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Niveau d'études          :");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(127, 470, -1, -1));

        jComboBox2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Deug", "Deust", "Licence", "Master" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 470, 144, -1));

        jButton3.setFont(new java.awt.Font("Snap ITC", 0, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(153, 0, 153));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/save.png"))); // NOI18N
        jButton3.setText("Suivant");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(443, 537, 144, 49));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Simplified Arabic Fixed", 1, 24)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(204, 0, 153));
        jTextArea1.setRows(5);
        jTextArea1.setText("\n***Le système de gestion des examens\ngère toutes les activités liées \nà la gestion des examens.\n \nDès la réception des formulaires \nd'inscription, des certificats et des\nrapports de notation.***");
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 240, 570, 260));

        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 1, 21)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("C.N.E                           :");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, -1));

        jTextField4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jTextField4.setForeground(new java.awt.Color(204, 204, 204));
        jTextField4.setText("Entrer votre code d'étudiant");
        jTextField4.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField4FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField4FocusLost(evt);
            }
        });
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 190, 320, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/Student2 (1).jpg"))); // NOI18N
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        new index().setVisible(true);
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         int a = JOptionPane.showConfirmDialog(null, "voulez-vous vraiment quitter l'application?", "QUITTER", JOptionPane.YES_NO_OPTION);
        if (a == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusGained
        if(jTextField1.getText().equals("Entrer votre nom et prénom")){
            jTextField1.setText("");
            jTextField1.setForeground(new Color(0,0,0));
        
        }
        
        
        
    }//GEN-LAST:event_jTextField1FocusGained

    private void jTextField2FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusGained
        if(jTextField2.getText().equals("Entrer votre email")){
            jTextField2.setText("");
            jTextField2.setForeground(new Color(0,0,0));
        
        }
        
        
        
    }//GEN-LAST:event_jTextField2FocusGained

    private void jTextField3FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusGained
         if(jTextField3.getText().equals("Entrer votre numéro de téléphone")){
            jTextField3.setText("");
            jTextField3.setForeground(new Color(0,0,0));
        
        }
        
        
        
        
    }//GEN-LAST:event_jTextField3FocusGained

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
         if(jTextField1.getText().equals("")){
            jTextField1.setText("Entrer votre nom et prénom");
            jTextField1.setForeground(new Color(153,153,153));
        
        }
        
    }//GEN-LAST:event_jTextField1FocusLost

    private void jTextField2FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField2FocusLost
        if(jTextField2.getText().equals("")){
            jTextField2.setText("Entrer votre email");
            jTextField2.setForeground(new Color(153,153,153));
        
        }
        
        
    }//GEN-LAST:event_jTextField2FocusLost

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost
        if(jTextField3.getText().equals("")){
            jTextField3.setText("Entrer votre numéro de téléphone");
            jTextField3.setForeground(new Color(153,153,153));
        
        }
        
        
    }//GEN-LAST:event_jTextField3FocusLost

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      String cne=jTextField4.getText();
      String fullName=jTextField1.getText();
      String sexe=(String)jComboBox1.getSelectedItem();
      String email=jTextField2.getText();
      String numberPhone=jTextField3.getText();
      String education=(String)jComboBox2.getSelectedItem();
      String marks ="0";
      
      if(( fullName.equals("Entrer votre nom et prénom")) ||(cne.equals("Entrer votre code d'étudiant")) || (email.equals("Entrer votre email"))  || (numberPhone.equals("Entrer votre numéro de téléphone"))){
           ImageIcon icon=new ImageIcon("error.png");
           JOptionPane.showMessageDialog(null,"<html><b style=\"color: red; font-size:15px\">Votre données <br>sont incomplètes!</b></html>","Attention!",JOptionPane.INFORMATION_MESSAGE,icon );
           setVisible(false);
           new studentDetails().setVisible(true);
      
      }else{
     
      
      try{
          Connection con=ConnectionProvided.getCon();
          PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?,?,?,?)");
          Statement st=con.createStatement();
          ResultSet rs=st.executeQuery("select count(*) from student where cne='"+cne+"'");
          rs.next();
          int nb=rs.getInt(1);
          if(nb==0){
          
           ps.setString(1, cne);
           ps.setString(2, fullName);
           ps.setString(3, sexe);
           ps.setString(4, email);
           ps.setString(5, numberPhone);
           ps.setString(6, education);
           ps.setString(7, marks);
           ps.executeUpdate();
           
           ImageIcon icon=new ImageIcon("done.png");
           JOptionPane.showMessageDialog(null,"<html><b style=\"color: red; font-size:15px\">Votre formulaire <br>bien enregistré</b></html>","Bravo",JOptionPane.INFORMATION_MESSAGE,icon );
           setVisible(false);
           new instructionStudent(cne).setVisible(true);
          }else{
              
           ImageIcon icon=new ImageIcon("error.png");
           JOptionPane.showMessageDialog(null,"<html><b style=\"color: red; font-size:15px\">Vous avez déjà <br>passé l'examen!</b></html>","Bravo",JOptionPane.INFORMATION_MESSAGE,icon );
           setVisible(false);
           new index().setVisible(true);
          
          
          }
       
           
           
      }catch(Exception e){
          JOptionPane.showMessageDialog(null, e);
      
      }}
      
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField4FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusGained
       
         if(jTextField4.getText().equals("Entrer votre code d'étudiant")){
            jTextField4.setText("");
            jTextField4.setForeground(new Color(0,0,0));
        
        }    
    }//GEN-LAST:event_jTextField4FocusGained

    private void jTextField4FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField4FocusLost
        if(jTextField4.getText().equals("")){
            jTextField4.setText("Entrer votre code d'étudiant");
            jTextField4.setForeground(new Color(153,153,153));
        
        }
    }//GEN-LAST:event_jTextField4FocusLost

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
         
        
    }//GEN-LAST:event_jButton3MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

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
            java.util.logging.Logger.getLogger(studentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}