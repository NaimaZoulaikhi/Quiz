/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Project;
import java.sql.*;
import Connecter.ConnectionProvided;
import java.awt.*;
import java.awt.event.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/**
 *
 * @author HP
 */

public class quizExamStudent extends javax.swing.JFrame {
    public String questionId="0";
    public String answer;
    public int min=0;
    public int sec=0;
    public int marks=0;

    public void answerCheck(){
        String studentAnswer="";
    
        if(jRadioButton1.isSelected()){
            studentAnswer=jRadioButton1.getText();
    
        }else if(jRadioButton2.isSelected()){
            studentAnswer=jRadioButton2.getText();
    
        }else if(jRadioButton3.isSelected()){
            studentAnswer=jRadioButton3.getText();
    
        }else {
            studentAnswer=jRadioButton4.getText();
    
        }
        if(studentAnswer.equals(answer)){
            marks=marks+1;
            String marks1=String.valueOf(marks);
            //jLabel19.setText(marks1);
        
        
    
        }
    //question number change
        int questionId1=Integer.parseInt(questionId);
        questionId1=questionId1+1;
        questionId=String.valueOf(questionId1);
        
    //clear jRadioButton
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(false);
        
        
    
    //last question hide next button
        if(questionId.equals("10")){
            jButton1.setVisible(false);
    
        }

    }
    public void question(){
        try{
            Connection con=ConnectionProvided.getCon();
            Statement st=con.createStatement();
            ResultSet rs1=st.executeQuery("select * from question where id='"+questionId+"'");
            while(rs1.next()){
                jLabel17.setText(rs1.getString(1));
                jLabel20.setText(rs1.getString(2));
                jRadioButton1.setText(rs1.getString(4));
                jRadioButton2.setText(rs1.getString(5));
                jRadioButton3.setText(rs1.getString(6));
                jRadioButton4.setText(rs1.getString(7));
                answer=rs1.getString(3);
            
            
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        
        }

    }
    public void submit(){
        String cne=jLabel11.getText();
        answerCheck();
        try{
            Connection con=ConnectionProvided.getCon();
            Statement st=con.createStatement();
            st.executeUpdate("update student set marks='"+marks+"' where cne='"+cne+"'");
            String marks1=String.valueOf(marks);
            setVisible(false);
            new successfullySubmited(marks1).setVisible(true);
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            
        }


    }
    /**
     * Creates new form quizExamStudent
     */
    Timer time;
    public quizExamStudent() {
        initComponents();
       
    }
    
    
    public quizExamStudent(String cne) {
        initComponents();
        jLabel11.setText(cne);
        
         //date
        SimpleDateFormat dFormat=new SimpleDateFormat("dd-MM-yyyy");
        Date date=new Date();
        jLabel4.setText(dFormat.format(date));
        //time
         setLocationRelativeTo(this);
        time=new Timer(1000,new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jLabel9.setText(String.valueOf(sec));
                jLabel8.setText(String.valueOf(min));
                
                if(sec==60){
                    sec=0;
                    min++;
                    if(min==10){
                        time.stop();
                        answerCheck();
                        submit();
                    }
                }
                sec++;
                
                
                }
        });
        time.start();
        
         
        
        
        
        
       
        
        //first question and student Details
        try{
            Connection con=ConnectionProvided.getCon();
            Statement st=con.createStatement();
            ResultSet rs=st.executeQuery("select * from student where cne='"+cne+"'");
            while(rs.next()){
                
                jLabel13.setText(rs.getString(2));
                jLabel21.setText(rs.getString(2));
            }
            ResultSet rs1=st.executeQuery("select * from question where id='"+questionId+"'");
            while(rs1.next()){
                jLabel17.setText(rs1.getString(1));
                jLabel20.setText(rs1.getString(2));
                jRadioButton1.setText(rs1.getString(4));
                jRadioButton2.setText(rs1.getString(5));
                jRadioButton3.setText(rs1.getString(6));
                jRadioButton4.setText(rs1.getString(7));
                answer=rs1.getString(3);
            
            
            }
            
        
        
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        
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

        jLabel20 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("*********** ?");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, -1, -1));

        jRadioButton1.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("**********");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, -1, -1));

        jRadioButton2.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("**********");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, -1, -1));

        jRadioButton3.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("**********");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, -1, -1));

        jRadioButton4.setFont(new java.awt.Font("Sylfaen", 0, 24)); // NOI18N
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("**********");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 450, -1, -1));

        jButton1.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 0, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/Next.png"))); // NOI18N
        jButton1.setText("Suivant");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 580, 150, 50));

        jButton2.setFont(new java.awt.Font("Showcard Gothic", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(51, 0, 204));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/submitt.png"))); // NOI18N
        jButton2.setText("Submit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 580, 150, 50));

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));

        jLabel2.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 204));
        jLabel2.setText("  Bienvenue");

        jLabel5.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 0, 153));
        jLabel5.setText("Temps total :");

        jLabel7.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(204, 0, 153));
        jLabel7.setText("Temps passé :");

        jLabel8.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 51, 0));
        jLabel8.setText("00");

        jLabel6.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 0, 153));
        jLabel6.setText("10 min");

        jLabel9.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 51, 0));
        jLabel9.setText("00");

        jLabel4.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 0, 153));
        jLabel4.setText("jLabel4");

        jLabel3.setFont(new java.awt.Font("Snap ITC", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 153));
        jLabel3.setText("DATE :");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/indexStudent.png"))); // NOI18N

        jLabel21.setFont(new java.awt.Font("Showcard Gothic", 1, 36)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 0, 153));
        jLabel21.setText("jLabel21");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 93, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(25, 25, 25)
                        .addComponent(jLabel6))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel8)
                        .addGap(10, 10, 10)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel4)))
                .addGap(65, 65, 65))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel21))
                            .addComponent(jLabel1)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel9))))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))))))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1370, 140));

        jPanel2.setBackground(new java.awt.Color(255, 255, 204));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Stencil", 0, 20)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 0, 255));
        jLabel11.setText("jLabel10");

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Stencil", 0, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 0, 255));
        jLabel13.setText("jLabel10");

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Stencil", 0, 20)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(51, 0, 255));
        jLabel15.setText("10");

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Stencil", 0, 20)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(51, 0, 255));
        jLabel17.setText("00");

        jLabel16.setFont(new java.awt.Font("Stencil", 0, 20)); // NOI18N
        jLabel16.setText("Question numéro :");

        jLabel14.setFont(new java.awt.Font("Stencil", 0, 20)); // NOI18N
        jLabel14.setText("Total des questions :");

        jLabel12.setFont(new java.awt.Font("Stencil", 0, 20)); // NOI18N
        jLabel12.setText("Nom & Prénom :");

        jLabel10.setFont(new java.awt.Font("Stencil", 0, 20)); // NOI18N
        jLabel10.setText("C.N.E :");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(jLabel12)
                            .addComponent(jLabel10))
                        .addGap(85, 85, 85)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel15)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel13))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(167, 245, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addGap(54, 54, 54))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 600, 490, 150));

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Project/Student2 (1).jpg"))); // NOI18N
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int a=JOptionPane.showConfirmDialog(null, "voulez-vous vraiment Submit!!","Select",JOptionPane.YES_NO_OPTION);
        if(a==0){
           answerCheck ();
           submit();
           
        }else{
        
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        answerCheck();
        question();
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton1.isSelected()){
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(false);
        
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton2.isSelected()){
        jRadioButton1.setSelected(false);
        jRadioButton3.setSelected(false);
        jRadioButton4.setSelected(false);
        
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton3.isSelected()){
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton4.setSelected(false);
        
        }
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
        if(jRadioButton4.isSelected()){
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);
        jRadioButton3.setSelected(false);
        
        }
    }//GEN-LAST:event_jRadioButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(quizExamStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(quizExamStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(quizExamStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(quizExamStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new quizExamStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    // End of variables declaration//GEN-END:variables
}
