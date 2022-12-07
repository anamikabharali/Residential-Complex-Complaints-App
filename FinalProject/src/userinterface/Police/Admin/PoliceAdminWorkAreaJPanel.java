/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.Police.Admin;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.MiscellaneousOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;
/**
 *
 * @author anamikabharali
 */
public class PoliceAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PoliceAdminWorkAreaJPanel
     */
    public PoliceAdminWorkAreaJPanel() {
        initComponents();
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
        manageordbtn = new javax.swing.JButton();
        manageuserbtn = new javax.swing.JButton();
        manageempbtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        enterprisetxt = new javax.swing.JLabel();

        setBackground(new java.awt.Color(76, 89, 115));
        setMaximumSize(new java.awt.Dimension(788, 600));
        setMinimumSize(new java.awt.Dimension(788, 600));

        jLabel1.setFont(new java.awt.Font("Optima", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("POLICE ADMINISTRATION");

        manageordbtn.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        manageordbtn.setText("MANAGE ORGANISATION");
        manageordbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        manageordbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageordbtnActionPerformed(evt);
            }
        });

        manageuserbtn.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        manageuserbtn.setText("MANAGE USER");

        manageempbtn.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        manageempbtn.setText("MANAGE EMPLOYEE");
        manageempbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Optima", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enterprise:");

        enterprisetxt.setBackground(new java.awt.Color(255, 255, 255));
        enterprisetxt.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        enterprisetxt.setToolTipText("");
        enterprisetxt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(manageordbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addComponent(manageempbtn)
                        .addGap(83, 83, 83)
                        .addComponent(manageuserbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(262, 262, 262)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(36, 36, 36)
                                .addComponent(enterprisetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel1))))
                .addContainerGap(129, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(jLabel1)
                .addGap(89, 89, 89)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(enterprisetxt, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(manageordbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageuserbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageempbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(257, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageordbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageordbtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_manageordbtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterprisetxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton manageempbtn;
    private javax.swing.JButton manageordbtn;
    private javax.swing.JButton manageuserbtn;
    // End of variables declaration//GEN-END:variables
}
