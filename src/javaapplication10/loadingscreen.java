/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

import java.awt.geom.RoundRectangle2D;
import javax.swing.JOptionPane;
import java.lang.Exception;
import java.lang.Thread;

/**
 *
 * @author User
 */
public class loadingscreen extends javax.swing.JFrame {

    /**
     * Creates new form loadingscreen
     */
    public loadingscreen() {
        initComponents();setShape(new RoundRectangle2D.Double(0,0,getWidth(),getHeight(),20,20));
    }
    
    public static void m(loadingscreen ls)
    {
         try{
            
            for(int i=0;i<=100;i++)
            {
                Thread.sleep(100);
                ls.LoadingValue.setText(i+ " %");
                if(i==10)
                    ls.LoadingLabel.setText("Turning On Modules...");
                if(i==20)
                    ls.LoadingLabel.setText("Loading Modules...");
                if(i==50)
                    ls.LoadingLabel.setText("Connecting to Server...");
                if(i==70)
                    ls.LoadingLabel.setText("Connection Successful !");
                if(i==80)
                {ls.LoadingLabel.setText("Launching Application...");
                    
                }
                ls.jProgressBar1.setValue(i);
                 }
            
        }
        catch(Exception e)
        {
        JOptionPane.showMessageDialog(null,e);}
                
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
        LoadingLabel = new javax.swing.JLabel();
        jProgressBar1 = new javax.swing.JProgressBar();
        jLabel1 = new javax.swing.JLabel();
        LoadingValue = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 387));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(600, 381));
        setSize(new java.awt.Dimension(600, 381));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(147, 212, 250));
        jPanel1.setBorder(null);
        jPanel1.setMinimumSize(new java.awt.Dimension(600, 381));
        jPanel1.setPreferredSize(new java.awt.Dimension(600, 387));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LoadingLabel.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        LoadingLabel.setForeground(new java.awt.Color(0, 50, 73));
        LoadingLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        LoadingLabel.setText("Loading...");
        jPanel1.add(LoadingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 380, -1));

        jProgressBar1.setBackground(new java.awt.Color(154, 209, 212));
        jProgressBar1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 366, 600, 11));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\User\\Downloads\\Untitled design (31).png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 321, 330));

        LoadingValue.setFont(new java.awt.Font("Candara Light", 1, 14)); // NOI18N
        LoadingValue.setForeground(new java.awt.Color(0, 50, 73));
        LoadingValue.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LoadingValue.setText("0 %");
        jPanel1.add(LoadingValue, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 350, 41, 16));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 381);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        loadingscreen ls=new loadingscreen();
        ls.setVisible(true);
        m(ls);
        ls.dispose();
        NewJFrame n=new NewJFrame();
        n.setVisible(true);
       
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LoadingLabel;
    private javax.swing.JLabel LoadingValue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}