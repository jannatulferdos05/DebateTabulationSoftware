
package DebateTabulation;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class MainJFrame extends javax.swing.JFrame {

    public MainJFrame() {
        initComponents();
        // Icon resize codes
        Icon i=myImage.getIcon();
        ImageIcon icon =(ImageIcon)i;
        Image image=icon.getImage().getScaledInstance(myImage.getWidth(),myImage.getHeight(),Image.SCALE_SMOOTH);
        myImage.setIcon(new ImageIcon(image));
        
        Icon i1=myImage1.getIcon();
        ImageIcon icon1 =(ImageIcon)i1;
        Image image1=icon1.getImage().getScaledInstance(myImage1.getWidth(),myImage1.getHeight(),Image.SCALE_SMOOTH);
        myImage1.setIcon(new ImageIcon(image1));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        myImage = new javax.swing.JButton();
        myImage1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(300, 150, 500, 500));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DebateTabulation/images/header.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        myImage.setBackground(new java.awt.Color(255, 255, 255));
        myImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DebateTabulation/images/add.png"))); // NOI18N
        myImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myImageActionPerformed(evt);
            }
        });

        myImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/DebateTabulation/images/people.png"))); // NOI18N
        myImage1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myImage1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(263, Short.MAX_VALUE)
                .addComponent(myImage, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addComponent(myImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(250, 250, 250))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(myImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(myImage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 86, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void myImage1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myImage1ActionPerformed
        
        PeopleForm pf= new PeopleForm();
        pf.show();
        dispose();
    }//GEN-LAST:event_myImage1ActionPerformed

    private void myImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myImageActionPerformed
        
        NewJFrame njf= new NewJFrame();
        njf.show();
        dispose();
    }//GEN-LAST:event_myImageActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
                new MainJFrame().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton myImage;
    private javax.swing.JButton myImage1;
    // End of variables declaration//GEN-END:variables
}
