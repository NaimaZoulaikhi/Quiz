
package Project;

import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;


public class Apropos extends javax.swing.JFrame {

    
    public Apropos() {
        initComponents();
        
      setResizable(false);
      setLocationRelativeTo(null);
      
      
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/aproposback (1).jpg"))); // NOI18N
        jLabel12.setText("jLabel12");

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/aproposback (1).jpg"))); // NOI18N

        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/aproposback (1).jpg"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);
        setLocation(new java.awt.Point(190, 150));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/clooose.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, -1, -1));

        jLabel1.setFont(new java.awt.Font("Kristen ITC", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("A PROPOS");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 6, -1, 26));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/info.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 6, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 43, 516, 10));

        jLabel3.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("Product version     :    Quiz System 1.0.0");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 269, 400, -1));
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 207, -1, -1));

        jLabel5.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 0));
        jLabel5.setText("Contact                 : ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 300, -1, -1));

        jLabel6.setFont(new java.awt.Font("Ink Free", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 0));
        jLabel6.setText("GitHub                  :  ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 335, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 368, 480, 10));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 247, 470, 10));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/mee.png"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, -1, -1));

        jLabel8.setFont(new java.awt.Font("Rockwell Extra Bold", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 153));
        jLabel8.setText("ZOULAIKHI NAIMA");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 200, -1));

        jLabel9.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 0, 255));
        jLabel9.setText("https://github.com/NaimaZoulaikhi");
        jLabel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 333, -1, -1));

        jLabel10.setFont(new java.awt.Font("Traditional Arabic", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 0, 255));
        jLabel10.setText("zoulnaima2002@gmail.com");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 298, -1, -1));

        jLabel11.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Copyright © 2023 FST@ZoulaikhiNaima . All rights reserved");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 384, -1, -1));

        jPanel2.setBackground(new java.awt.Color(255, 204, 204));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 500, 100));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/aproposback (1).jpg"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(-190, 0, 710, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        adminHome.open = 0;
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Apropos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
