/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.awt.Color;
import java.awt.geom.RoundRectangle2D;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class stackop extends javax.swing.JFrame {
int k,index=-1;
ArrayList<JTextField> stack=new ArrayList(10);
    /**
     * Creates new form stackop
     */
    public stackop() {
        initComponents();setShape(new RoundRectangle2D.Double(0,0,getWidth(),getHeight(),20,20)); stack.add(T1);stack.add(T2);stack.add(T3);stack.add(T4);stack.add(T5);stack.add(T6);stack.add(T7);stack.add(T8);stack.add(T9);stack.add(T10);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        T1 = new javax.swing.JTextField();
        T3 = new javax.swing.JTextField();
        T4 = new javax.swing.JTextField();
        T5 = new javax.swing.JTextField();
        T6 = new javax.swing.JTextField();
        T7 = new javax.swing.JTextField();
        T8 = new javax.swing.JTextField();
        T9 = new javax.swing.JTextField();
        T10 = new javax.swing.JTextField();
        T2 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        popp = new javax.swing.JTextField();
        ele = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        setSize(new java.awt.Dimension(950, 600));

        jPanel1.setBackground(new java.awt.Color(136, 189, 188));

        jPanel2.setBackground(new java.awt.Color(128, 206, 215));
        jPanel2.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Kristen ITC", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 50, 73));
        jLabel1.setText("Stack");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(401, 6, 141, 59);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication10/Untitled design (18).png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(40, 240, 100, 330);

        T1.setEditable(false);
        T1.setBackground(new java.awt.Color(154, 209, 212));
        T1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        T1.setForeground(new java.awt.Color(0, 50, 73));
        T1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 4, 2, new java.awt.Color(17, 45, 50)));
        jPanel2.add(T1);
        T1.setBounds(200, 500, 50, 45);

        T3.setEditable(false);
        T3.setBackground(new java.awt.Color(154, 209, 212));
        T3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        T3.setForeground(new java.awt.Color(0, 50, 73));
        T3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 4, 2, new java.awt.Color(17, 45, 50)));
        jPanel2.add(T3);
        T3.setBounds(200, 400, 50, 45);

        T4.setEditable(false);
        T4.setBackground(new java.awt.Color(154, 209, 212));
        T4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        T4.setForeground(new java.awt.Color(0, 50, 73));
        T4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 4, 2, new java.awt.Color(17, 45, 50)));
        T4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                T4ActionPerformed(evt);
            }
        });
        jPanel2.add(T4);
        T4.setBounds(200, 350, 50, 45);

        T5.setEditable(false);
        T5.setBackground(new java.awt.Color(154, 209, 212));
        T5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        T5.setForeground(new java.awt.Color(0, 50, 73));
        T5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 4, 2, new java.awt.Color(17, 45, 50)));
        jPanel2.add(T5);
        T5.setBounds(200, 300, 50, 45);

        T6.setEditable(false);
        T6.setBackground(new java.awt.Color(154, 209, 212));
        T6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        T6.setForeground(new java.awt.Color(0, 50, 73));
        T6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T6.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 4, 2, new java.awt.Color(17, 45, 50)));
        jPanel2.add(T6);
        T6.setBounds(200, 250, 50, 45);

        T7.setEditable(false);
        T7.setBackground(new java.awt.Color(154, 209, 212));
        T7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        T7.setForeground(new java.awt.Color(0, 50, 73));
        T7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T7.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 4, 2, new java.awt.Color(17, 45, 50)));
        jPanel2.add(T7);
        T7.setBounds(200, 200, 50, 45);

        T8.setEditable(false);
        T8.setBackground(new java.awt.Color(154, 209, 212));
        T8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        T8.setForeground(new java.awt.Color(0, 50, 73));
        T8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 4, 2, new java.awt.Color(17, 45, 50)));
        jPanel2.add(T8);
        T8.setBounds(200, 150, 50, 45);

        T9.setEditable(false);
        T9.setBackground(new java.awt.Color(154, 209, 212));
        T9.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        T9.setForeground(new java.awt.Color(0, 50, 73));
        T9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 4, 2, new java.awt.Color(17, 45, 50)));
        jPanel2.add(T9);
        T9.setBounds(200, 100, 50, 45);

        T10.setEditable(false);
        T10.setBackground(new java.awt.Color(154, 209, 212));
        T10.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        T10.setForeground(new java.awt.Color(0, 50, 73));
        T10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 4, 2, new java.awt.Color(17, 45, 50)));
        jPanel2.add(T10);
        T10.setBounds(200, 50, 50, 45);

        T2.setEditable(false);
        T2.setBackground(new java.awt.Color(154, 209, 212));
        T2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        T2.setForeground(new java.awt.Color(0, 50, 73));
        T2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 2, 4, 2, new java.awt.Color(17, 45, 50)));
        jPanel2.add(T2);
        T2.setBounds(200, 450, 50, 45);

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 50, 73));
        jLabel3.setText("Element popped out:");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(390, 210, 170, 22);

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 50, 73));
        jLabel4.setText("Enter the Element  to push:");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(350, 140, 212, 22);

        popp.setEditable(false);
        popp.setBackground(new java.awt.Color(128, 206, 215));
        popp.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        popp.setForeground(new java.awt.Color(37, 78, 88));
        popp.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        popp.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(popp);
        popp.setBounds(590, 200, 60, 30);

        ele.setBackground(new java.awt.Color(128, 206, 215));
        ele.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        ele.setForeground(new java.awt.Color(37, 78, 88));
        ele.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        ele.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 0, 0)));
        jPanel2.add(ele);
        ele.setBounds(590, 133, 60, 30);

        jButton1.setBackground(new java.awt.Color(136, 189, 188));
        jButton1.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 50, 73));
        jButton1.setText("Push");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 50, 73), 2, true));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);
        jButton1.setBounds(390, 350, 110, 50);

        jButton2.setBackground(new java.awt.Color(136, 189, 188));
        jButton2.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 50, 73));
        jButton2.setText("Pop");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 50, 73), 2, true));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2);
        jButton2.setBounds(550, 350, 110, 50);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication10/icons8-macos-close-24.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel5);
        jLabel5.setBounds(920, 0, 30, 30);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication10/icons8-about-30.png"))); // NOI18N
        jLabel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel6);
        jLabel6.setBounds(530, 20, 30, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication10/icons8-reset-48.png"))); // NOI18N
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel7);
        jLabel7.setBounds(520, 490, 50, 50);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication10/icons8-go-back-48.png"))); // NOI18N
        jLabel8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel8);
        jLabel8.setBounds(440, 490, 50, 50);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 950, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 950, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void T4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_T4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_T4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          k=Integer.parseInt(ele.getText());
    ele.setText("");
    popp.setText("");
    if(index>=9)
    {
        JOptionPane.showMessageDialog(null,"STACK is Full!");
    }
    else
    { index++;
        stack.get(index).setText(""+k);
       
        for(int i=0;i<10;i++)
            stack.get(i).setBackground(new Color(154,209,212));
        stack.get(index).setBackground(new Color(154,159,209));
        
    }// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       if(index<0)
    JOptionPane.showMessageDialog(null,"STACK is empty!");
else
    
{
    popp.setText(stack.get(index).getText());
    stack.get(index).setText("");
    index--;
     for(int i=0;i<10;i++)
            stack.get(i).setBackground(new Color(154,209,212));
     if(index!=-1)
        stack.get(index).setBackground(new Color(154,159,209));
} // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked

this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
stackop s=new stackop();
s.setVisible(true);
this.dispose();
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
  
this.dispose();      // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
aboutstack a=new aboutstack();
a.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

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
            java.util.logging.Logger.getLogger(stackop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stackop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stackop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stackop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stackop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField T1;
    private javax.swing.JTextField T10;
    private javax.swing.JTextField T2;
    private javax.swing.JTextField T3;
    private javax.swing.JTextField T4;
    private javax.swing.JTextField T5;
    private javax.swing.JTextField T6;
    private javax.swing.JTextField T7;
    private javax.swing.JTextField T8;
    private javax.swing.JTextField T9;
    private javax.swing.JTextField ele;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField popp;
    // End of variables declaration//GEN-END:variables
}
