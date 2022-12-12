/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Facilities.Canteen;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.FelonyOrganization;
import Business.Organization.CanteenOrganization;
import Business.Organization.SupervisorOrganization;
import Business.Organization.MisconductOrganization;
import Business.Organization.Organization;
import Business.Organization.TheftOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EmergencyRequest;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author srivaishnaviaekkati
 */
public class CanteenEmergencyRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CanteenEmergencyRequestJPanel
     */
    
    public String message1 = null;
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount userAccount; 
    private Network network;
    public CanteenEmergencyRequestJPanel(JPanel userProcessContainer, UserAccount userAccount, Enterprise enterprise,Network network) {
        initComponents();
       this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.userAccount = userAccount;
        this.network=network;
     populateComboBox();
    }

    EmergencyRequest  erequest = new EmergencyRequest();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        locationlbl = new javax.swing.JLabel();
        sendemergency = new javax.swing.JButton();
        combo = new javax.swing.JComboBox();
        backJButton = new javax.swing.JButton();
        locationfiield = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(76, 89, 115));
        setMaximumSize(new java.awt.Dimension(750, 750));
        setMinimumSize(new java.awt.Dimension(750, 750));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Emergency Type");
        add(jLabel1);
        jLabel1.setBounds(190, 260, 101, 18);

        locationlbl.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        locationlbl.setForeground(new java.awt.Color(255, 255, 255));
        locationlbl.setText("Location");
        add(locationlbl);
        locationlbl.setBounds(230, 350, 53, 18);

        sendemergency.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        sendemergency.setText("Send Emergency");
        sendemergency.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sendemergency.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sendemergencyActionPerformed(evt);
            }
        });
        add(sendemergency);
        sendemergency.setBounds(480, 510, 105, 22);

        combo.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        combo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        add(combo);
        combo.setBounds(340, 250, 190, 23);

        backJButton.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        backJButton.setText("Back");
        backJButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton);
        backJButton.setBounds(160, 510, 34, 22);

        locationfiield.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        locationfiield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                locationfiieldActionPerformed(evt);
            }
        });
        add(locationfiield);
        locationfiield.setBounds(340, 340, 190, 23);

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Canteen Emergency Request");
        add(jLabel2);
        jLabel2.setBounds(220, 110, 340, 29);
    }// </editor-fold>//GEN-END:initComponents

    private void sendemergencyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sendemergencyActionPerformed
        // TODO add your handling code here:
       
        
        String location = null;
        erequest.setLocation(location);
        erequest.setEmergencytype((Organization.Type) combo.getSelectedItem());
        erequest.setEmail(userAccount.getEmail());
         Organization org = null;
         Organization.Type sel = (Organization.Type) combo.getSelectedItem();
      if(location != null)
      {   
        if(sel.equals(Organization.Type.Theft))
        {   
         for (Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList())
            {
                  for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList())
                  {
            if (organization instanceof TheftOrganization){
                org = organization;
                break;
            } 
        }}
        if (org!=null){
            org.getStatusQueue().getStatusRequestList().add(erequest);
            userAccount.getStatusQueue().getStatusRequestList().add(erequest);
        }
        }
          else if(sel.equals(Organization.Type.Felony))
        {
        
         for (Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList())
            {
                  for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList())
                  {
            if (organization instanceof FelonyOrganization){
                org = organization;
                break;
            } 
                  }
        }
        if (org!=null){
            org.getStatusQueue().getStatusRequestList().add(erequest);
            userAccount.getStatusQueue().getStatusRequestList().add(erequest);
        }
        }
        
          else if(sel.equals(Organization.Type.Misconduct))
        {
        
        for (Enterprise enterprise: network.getEnterpriseDirectory().getEnterpriseList())
            {
                  for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList())
                  {
            if (organization instanceof MisconductOrganization){
                org = organization;
                break;
            } 
                  }
        }
        if (org!=null){
            org.getStatusQueue().getStatusRequestList().add(erequest);
            userAccount.getStatusQueue().getStatusRequestList().add(erequest);
        }
      }
        
         JOptionPane.showMessageDialog(null,"Your emergency request has been sent! An officer will notify you shortly");
        
    }
        
        else
        {
            System.out.println("Inside else block of sendComplaintActionPerformed ");
            JOptionPane.showMessageDialog(null,"Location field is empty");
        }
        
    }//GEN-LAST:event_sendemergencyActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        CanteenWorkAreaJPanel dwajp = (CanteenWorkAreaJPanel) component;
        dwajp.populateRequestTable();
        CardLayout layout = (CardLayout)userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    private void locationfiieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_locationfiieldActionPerformed
        // TODO add your handling code here:
        
        if(locationfiield.getText()!=""){
        message1 = locationfiield.getText();
        System.out.println("sendComplaintActionPerformed 'messageJTextField' " + message1);
        }
        else JOptionPane.showMessageDialog(null,"Location field is empty");
        
    }//GEN-LAST:event_locationfiieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JComboBox combo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField locationfiield;
    private javax.swing.JLabel locationlbl;
    private javax.swing.JButton sendemergency;
    // End of variables declaration//GEN-END:variables

    private void populateComboBox() {
        
         combo.removeAllItems();
        combo.addItem(Organization.Type.Theft);
        combo.addItem(Organization.Type.Felony);
        combo.addItem(Organization.Type.Misconduct);
       
    }
}
