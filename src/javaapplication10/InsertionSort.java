/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.awt.Color;
import java.awt.geom.RoundRectangle2D;
import static java.lang.System.exit;
import java.util.ArrayList;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author User
 */
public class InsertionSort extends javax.swing.JFrame {
 ArrayList <JTextField>  T=new ArrayList(10);
 int i=0;
int n,j=1;
    /**
     * Creates new form InsertionSort
     */
    public InsertionSort() {
        initComponents();N.setEditable(true);setShape(new RoundRectangle2D.Double(0,0,getWidth(),getHeight(),20,20));
          T.add(T2);T.add(T3);T.add(T4);T.add(T5);T.add(T6);T.add(T7);T.add(T8);T.add(T9);T.add(T10);T.add(T11);
           for(int i=0;i<10;i++)
            T.get(i).setEditable(false);
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        passno = new javax.swing.JTextField();
        T2 = new javax.swing.JTextField();
        T3 = new javax.swing.JTextField();
        T4 = new javax.swing.JTextField();
        T5 = new javax.swing.JTextField();
        T6 = new javax.swing.JTextField();
        T7 = new javax.swing.JTextField();
        T8 = new javax.swing.JTextField();
        T9 = new javax.swing.JTextField();
        T10 = new javax.swing.JTextField();
        T11 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        N = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setUndecorated(true);
        setSize(new java.awt.Dimension(950, 600));

        jPanel1.setBackground(new java.awt.Color(154, 209, 212));
        jPanel1.setMinimumSize(new java.awt.Dimension(950, 600));
        jPanel1.setPreferredSize(new java.awt.Dimension(950, 600));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication10/Untitled design (28).png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 258, 270));

        jLabel2.setFont(new java.awt.Font("Kristen ITC", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 50, 73));
        jLabel2.setText("Insertion Sort");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 6, -1, -1));

        passno.setEditable(false);
        passno.setBackground(jPanel1.getBackground());
        passno.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        passno.setForeground(new java.awt.Color(0, 50, 73));
        passno.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        passno.setText("0");
        passno.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 50, 73), 2, true));
        jPanel1.add(passno, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 410, 40, 40));

        T2.setEditable(false);
        T2.setBackground(new java.awt.Color(154, 209, 212));
        T2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        T2.setForeground(new java.awt.Color(0, 50, 73));
        T2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 50, 73), 2, true));
        jPanel1.add(T2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 110, 40, 40));

        T3.setEditable(false);
        T3.setBackground(jPanel1.getBackground());
        T3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        T3.setForeground(new java.awt.Color(0, 50, 73));
        T3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 50, 73), 2, true));
        jPanel1.add(T3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, 40, 40));

        T4.setEditable(false);
        T4.setBackground(jPanel1.getBackground());
        T4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        T4.setForeground(new java.awt.Color(0, 50, 73));
        T4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 50, 73), 2, true));
        jPanel1.add(T4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 110, 40, 40));

        T5.setEditable(false);
        T5.setBackground(jPanel1.getBackground());
        T5.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        T5.setForeground(new java.awt.Color(0, 50, 73));
        T5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 50, 73), 2, true));
        jPanel1.add(T5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 110, 40, 40));

        T6.setEditable(false);
        T6.setBackground(jPanel1.getBackground());
        T6.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        T6.setForeground(new java.awt.Color(0, 50, 73));
        T6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 50, 73), 2, true));
        jPanel1.add(T6, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 110, 40, 40));

        T7.setEditable(false);
        T7.setBackground(jPanel1.getBackground());
        T7.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        T7.setForeground(new java.awt.Color(0, 50, 73));
        T7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 50, 73), 2, true));
        jPanel1.add(T7, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 110, 40, 40));

        T8.setEditable(false);
        T8.setBackground(jPanel1.getBackground());
        T8.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        T8.setForeground(new java.awt.Color(0, 50, 73));
        T8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 50, 73), 2, true));
        jPanel1.add(T8, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 110, 40, 40));

        T9.setEditable(false);
        T9.setBackground(jPanel1.getBackground());
        T9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        T9.setForeground(new java.awt.Color(0, 50, 73));
        T9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 50, 73), 2, true));
        jPanel1.add(T9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, 40, 40));

        T10.setEditable(false);
        T10.setBackground(jPanel1.getBackground());
        T10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        T10.setForeground(new java.awt.Color(0, 50, 73));
        T10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T10.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 50, 73), 2, true));
        jPanel1.add(T10, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 110, 40, 40));

        T11.setEditable(false);
        T11.setBackground(jPanel1.getBackground());
        T11.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        T11.setForeground(new java.awt.Color(0, 50, 73));
        T11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        T11.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(48, 17, 13), 2, true));
        jPanel1.add(T11, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 110, 40, 40));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 50, 73));
        jLabel3.setText("PASS number:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 420, -1, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 50, 73));
        jLabel4.setText("Enter the number of elements (<=10) :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 220, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 50, 73));
        jLabel5.setText("Enter the elements then click on \"Load\"");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, -1, -1));

        N.setBackground(jPanel1.getBackground());
        N.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        N.setForeground(new java.awt.Color(0, 50, 73));
        N.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        N.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(0, 50, 73)));
        jPanel1.add(N, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 220, 60, -1));

        jButton1.setBackground(new java.awt.Color(128, 206, 215));
        jButton1.setFont(new java.awt.Font("Kristen ITC", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 50, 73));
        jButton1.setText("Next Pass");
        jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 50, 73), 2, true));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 510, 160, 50));

        jButton2.setBackground(new java.awt.Color(128, 206, 215));
        jButton2.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 50, 73));
        jButton2.setText("Enter");
        jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 50, 73), 2, true));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 200, 100, 50));

        jButton3.setBackground(new java.awt.Color(128, 206, 215));
        jButton3.setFont(new java.awt.Font("Kristen ITC", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(0, 50, 73));
        jButton3.setText("Load");
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 50, 73), 2, true));
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 280, 100, 50));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication10/icons8-go-back-48.png"))); // NOI18N
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 510, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication10/icons8-reset-48.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 520, -1, -1));

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication10/icons8-macos-close-24.png"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 10, -1, -1));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication10/icons8-about-30.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, -1));

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
n=Integer.parseInt(N.getText());
if(n>10)
    JOptionPane.showMessageDialog(null,"Please enter a number leass than 10!");
else
{ for(int i=0;i<n;i++)
{T.get(i).setBackground(Color.white);T.get(i).setEditable(true);  }
T.get(j-1).setBackground(new Color(137,218,89));
N.setEditable(false);
}      // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
  T.add(T2);T.add(T3);T.add(T4);T.add(T5);T.add(T6);T.add(T7);T.add(T8);T.add(T9);T.add(T10);T.add(T11);      // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
this.dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked

        InsertionSort s=new InsertionSort();
s.setVisible(true); this.dispose();       // TODO add your handling code here:
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
if(j<n)
{
    passno.setText(""+j);
String key=T.get(j).getText();
int i=j-1;
while(i>=0 && Integer.parseInt(key)<Integer.parseInt(T.get(i).getText()))
{
    T.get(i+1).setText(T.get(i).getText());
    i--;
}
T.get(i+1).setText(key);
T.get(j).setBackground(new Color(137,218,89));

}

else
{
JOptionPane.showMessageDialog(null,"DONE !!");
}
j++;
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
this.dispose();      // TODO add your handling code here:
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
aboutinsertionsort s=new aboutinsertionsort();
s.setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jLabel9MouseClicked

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
            java.util.logging.Logger.getLogger(InsertionSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InsertionSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InsertionSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InsertionSort.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InsertionSort().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField N;
    private javax.swing.JTextField T10;
    private javax.swing.JTextField T11;
    private javax.swing.JTextField T2;
    private javax.swing.JTextField T3;
    private javax.swing.JTextField T4;
    private javax.swing.JTextField T5;
    private javax.swing.JTextField T6;
    private javax.swing.JTextField T7;
    private javax.swing.JTextField T8;
    private javax.swing.JTextField T9;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField passno;
    // End of variables declaration//GEN-END:variables
}
