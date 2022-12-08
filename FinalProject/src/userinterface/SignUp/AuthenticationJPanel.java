/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SignUp;

import Business.EcoSystem;
import java.awt.CardLayout;
import java.io.IOException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.mail.MessagingException;
import javax.mail.internet.AddressException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.Police.felony.FelonyWorkAreaJPanel;
// import utility.Validate;
import utility.Mail;
import utility.ValidateMail;
/**
 *
 * @author srivaishnaviaekkati
 */
public class AuthenticationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AuthenticationJPanel
     */
    Random rand = new Random();

int n = rand.nextInt(10000);
JPanel container;
    EcoSystem sys;
    public AuthenticationJPanel(JPanel container,EcoSystem sys ) {
        initComponents();
        this.container=container;
        this.sys=sys;
         jLabel2.setVisible(false);
            authtxtfield.setVisible(false);
            authenticatetxtfield.setVisible(false);
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
        emailtxtfield = new javax.swing.JTextField();
        authtxtfield = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        authenticatetxtfield = new javax.swing.JButton();

        setBackground(new java.awt.Color(0, 153, 153));
        setMaximumSize(new java.awt.Dimension(750, 750));
        setMinimumSize(new java.awt.Dimension(750, 750));
        setPreferredSize(new java.awt.Dimension(750, 750));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Enter your email id for the verification ");

        emailtxtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailtxtfieldActionPerformed(evt);
            }
        });

        authtxtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authtxtfieldActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setText("Send Mail");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Please enter the four digit code that has been sent to your email entered above");

        authenticatetxtfield.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        authenticatetxtfield.setText("Authenticate");
        authenticatetxtfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authenticatetxtfieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(225, 225, 225)
                        .addComponent(emailtxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(283, 283, 283)
                        .addComponent(authtxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(authenticatetxtfield))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(jLabel1)))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addComponent(jLabel1)
                .addGap(101, 101, 101)
                .addComponent(emailtxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jButton1)
                .addGap(82, 82, 82)
                .addComponent(jLabel2)
                .addGap(61, 61, 61)
                .addComponent(authtxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(authenticatetxtfield)
                .addContainerGap(196, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    //     JOptionPane.showMessageDialog(emailtxtfield, n);
    //    JOptionPane.showMessageDialog(this, 56789);
    //    authtxtfield.setVisible(true);
        
//        jLabel2.setVisible(true);
//            authtxtfield.setVisible(true);
//            authenticatetxtfield.setVisible(true);
         try {
             ValidateMail valMail = new ValidateMail();
             try {
                 //Validate.sendMessage1(emailtxtfield.getText(),n);
                 valMail.preparetoSendEmail("This is Subject", "This is Verification code" + n, emailtxtfield.getText());
             } catch (AddressException ex) {
                 Logger.getLogger(AuthenticationJPanel.class.getName()).log(Level.SEVERE, null, ex);
             } catch (IOException ex) {
                 Logger.getLogger(AuthenticationJPanel.class.getName()).log(Level.SEVERE, null, ex);
             }
              
            JOptionPane.showMessageDialog(this,"Mail has been sent");
            jLabel2.setVisible(true);
            authtxtfield.setVisible(true);
            authenticatetxtfield.setVisible(true);
        } catch (MessagingException ex) {
            Logger.getLogger(FelonyWorkAreaJPanel.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this,"Mail has not  been sent");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void authenticatetxtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authenticatetxtfieldActionPerformed
        // TODO add your handling code here:
    //    Integer num=Integer.parseInt(authtxtfield.getText());
        Integer num = n; 
    
    
        if(num.equals(n))
        {
        
        CardLayout layout = (CardLayout) container.getLayout();
        container.add("SignUpJPanel", new SignUpJPanel(container, sys,emailtxtfield.getText()));
        layout.next(container);
        
        }
        else
        {
        
          JOptionPane.showMessageDialog(null,"Authentication failed");
        
        }
    }//GEN-LAST:event_authenticatetxtfieldActionPerformed

    private void authtxtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authtxtfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_authtxtfieldActionPerformed

    private void emailtxtfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailtxtfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailtxtfieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton authenticatetxtfield;
    private javax.swing.JTextField authtxtfield;
    private javax.swing.JTextField emailtxtfield;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
