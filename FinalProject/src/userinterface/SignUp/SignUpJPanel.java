/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SignUp;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.Organization.Type;
import Business.Role.Role;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import utility.Validate;

/**
 *
 * @author srivaishnaviaekkati 
 */
public class SignUpJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SignUpPanel
     */
    JPanel Component;
    EcoSystem sys;
    String email;
    public SignUpJPanel(JPanel Component,EcoSystem sys,String email ) {
        initComponents();
        this.Component=Component;
        this.sys=sys;
               this.email=email;  
        PopNetworkCombo();
        emailtextfield.setText(email);
        
    }
         
         
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    public void PopNetworkCombo()
           
    { 
        
        
        if(sys.getNetworkList().size()>0)
    {
        
          combonetwork.removeAllItems();
       for(Network net: sys.getNetworkList())
       {
             
           combonetwork.addItem(net); 
       
       
       }
       comboenterprise.setEnabled(true);
        
       
    }
    else 
    {
            
        JOptionPane.showMessageDialog(null,"No network available ");
       
     }
    }
    
     public void PopEnterpriseCombo(Network network)
    {        
       comboenterprise.removeAllItems();
             //Network network = (Network) combonetwork.getSelectedItem();
         
           if(network.getEnterpriseDirectory().getEnterpriseList().size()>0)
           {
               
               
           for(Enterprise en: network.getEnterpriseDirectory().getEnterpriseList())
           {
                comboenterprise.addItem(en);
           }
  
          
           }
           
           else
           {
                combo_organization.setEnabled(false);
                comborole.setEnabled(false);
                JOptionPane.showMessageDialog(null,"Sorry !No enterprise available for this network");
           
               
           }
    }
     
       
  public void PopOrganizationCombo(Enterprise ent)
    { 
        
         combo_organization.removeAllItems();
        
          combo_organization.setEnabled(true);
                  
             if (ent.getOrganizationDirectory().getOrganizationList().size() > 0) {
                for (Organization organization : ent.getOrganizationDirectory().getOrganizationList()) {
                    combo_organization.addItem(organization);
                }
            }
             else
             {
             
                  comborole.setEnabled(false);
                 JOptionPane.showMessageDialog(null,"Sorry !No organization available for this network");
             
             }
           
    
    }
    
     public void PopRoleCombo(Organization org)
    { 
        
            comborole.removeAllItems();
             comborole.setEnabled(true);
     
             
                  
             if (org.getSupportedRole().size()>0) {
                for (Role role : org.getSupportedRole()) {
                    comborole.addItem(role);
                }
            }
           
    
    }
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        signupbtn = new javax.swing.JButton();
        emailtextfield = new javax.swing.JTextField();
        combonetwork = new javax.swing.JComboBox();
        comboenterprise = new javax.swing.JComboBox();
        combo_organization = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        usernametxtfield = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        passwordtxtfield = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        emptxtfield = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        comborole = new javax.swing.JComboBox();

        jScrollPane1.setViewportView(jEditorPane1);

        setBackground(new java.awt.Color(0, 153, 153));
        setMaximumSize(new java.awt.Dimension(750, 750));
        setMinimumSize(new java.awt.Dimension(750, 750));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Sign Up Form");

        jLabel2.setText("Network");

        jLabel3.setText("Enterprise");

        jLabel4.setText("Organization");

        jLabel5.setText("Email ID");

        signupbtn.setText("Sign Up");
        signupbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupbtnActionPerformed(evt);
            }
        });

        emailtextfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailtextfieldActionPerformed(evt);
            }
        });

        combonetwork.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combonetwork.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combonetworkActionPerformed(evt);
            }
        });

        comboenterprise.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        comboenterprise.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboenterpriseActionPerformed(evt);
            }
        });

        combo_organization.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        combo_organization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_organizationActionPerformed(evt);
            }
        });

        jLabel6.setText("UserName");

        jLabel7.setText("Password");

        jLabel8.setText("Name");

        jLabel9.setText("Role");

        comborole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel5)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 359, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(combonetwork, 0, 91, Short.MAX_VALUE)
                    .addComponent(emailtextfield)
                    .addComponent(comboenterprise, 0, 91, Short.MAX_VALUE)
                    .addComponent(combo_organization, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(usernametxtfield)
                    .addComponent(passwordtxtfield)
                    .addComponent(emptxtfield)
                    .addComponent(comborole, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(121, 121, 121))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(304, 304, 304)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(signupbtn)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(combonetwork, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(comboenterprise, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(combo_organization, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(comborole, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(emptxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(emailtextfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(usernametxtfield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(passwordtxtfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(signupbtn)
                .addGap(93, 93, 93))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void combo_organizationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_organizationActionPerformed
        // TODO add your handling code here:
         Organization org = (Organization) combo_organization.getSelectedItem();
        if (org != null){
            PopRoleCombo(org);
         
        }
        
    }//GEN-LAST:event_combo_organizationActionPerformed

    private void emailtextfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailtextfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailtextfieldActionPerformed

    private void combonetworkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combonetworkActionPerformed
        // TODO add your handling code here:
    Network network = (Network) combonetwork.getSelectedItem();
        if (network != null){
            PopEnterpriseCombo(network);
      
        }
            
            
        
        
    }//GEN-LAST:event_combonetworkActionPerformed

    private void signupbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupbtnActionPerformed
        // TODO add your handling code here:
        
        Network network = (Network) combonetwork.getSelectedItem();
        Enterprise enterprise = (Enterprise) comboenterprise.getSelectedItem();
        Organization organization = (Organization)combo_organization.getSelectedItem();
        Role role = (Role) comborole.getSelectedItem();
        
        for(Network net : sys.getNetworkList() )
        {
            if(net.equals(network))
            {
                for(Enterprise ent : net.getEnterpriseDirectory().getEnterpriseList())
                {
                    if(ent.equals(enterprise))
                    {
                         for(Organization org: ent.getOrganizationDirectory().getOrganizationList())
                         {
                                  
                             if(org.equals(organization))
                             { 
                                 if(emptxtfield.getText()!=null)
                                 { Employee emp= new Employee();
                                    emp.setName(emptxtfield.getText());
                                  
                                 if(emailtextfield.getText()!=null)
                                 {
                                        if(Validate.validateEmail(emailtextfield.getText()))
                                        {
                                             if(usernametxtfield.getText()!=null)
                                             {  
                                                 if(!EcoSystem.checkIfUsernameIsUnique(usernametxtfield.getText(),net))
                                                 {
                                                     
                                                     JOptionPane.showMessageDialog(null, usernametxtfield.getText() + " " + "is already taken please enter new username");
                                                     return;
                                                 }
                                                   if(passwordtxtfield.getText()!=null)
                                                   {
                                                       if (!Validate.validatePassword(passwordtxtfield.getText())) {
                                JOptionPane.showMessageDialog(null, "Password should Contain \n"
                                        + "       - At least one digit\n"
                                        + "       - At least one lower case letter\n"
                                        + "       - At least one upper case letter\n"
                                        + "       - At least one special character(!@#$%^&+=~|?)\n"
                                        + "       - no whitespace allowed in the entire string\n"
                                        + "       - at least eight characters");
                                passwordtxtfield.setText("");
                                return;
                            }organization.getUserAccountDirectory().createUserAccount(usernametxtfield.getText(), passwordtxtfield.getText(),emailtextfield.getText() ,emp, role);
                                                                   JOptionPane.showMessageDialog(null, "Account created succesfull");
                                                                     usernametxtfield.setText("");
                                                                        passwordtxtfield.setText("");
                                                                        emailtextfield.setText("");
                                                                        emptxtfield.setText("");
                                                                        
                                                                        
                                                        
                                                        
                                                   }
                                                   else
                                                   {
                                                      JOptionPane.showMessageDialog(null,"Please enter password");
                                                   
                                                   }
                                             }
                                             
                                             else
                                             {
                                                
                                                 JOptionPane.showMessageDialog(null,"Please enter username");
                                             
                                             }
                                        
                                        }
                                     else
                                        {
                                             JOptionPane.showMessageDialog(null,"Please enter valid email id");
                                        }
                                 }
                                 else
                                 {
                                      
                                     JOptionPane.showMessageDialog(null,"Please enter name");
                                     
                                 }
                                 }
                                 else
                                 {
                                      JOptionPane.showMessageDialog(null,"Please enter email id");
                                 }
                                      
                             
                             }
                         
                         }
                         
                    }
                
                
                }
               
            }
        
        
        }
        
        
        
        
    }//GEN-LAST:event_signupbtnActionPerformed

    private void comboenterpriseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboenterpriseActionPerformed
        // TODO add your handling code here:
        Enterprise  ent = (Enterprise) comboenterprise.getSelectedItem();
        if (ent != null){
            PopOrganizationCombo(ent);
            
        }
       
    }//GEN-LAST:event_comboenterpriseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox combo_organization;
    private javax.swing.JComboBox comboenterprise;
    private javax.swing.JComboBox combonetwork;
    private javax.swing.JComboBox comborole;
    private javax.swing.JTextField emailtextfield;
    private javax.swing.JTextField emptxtfield;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField passwordtxtfield;
    private javax.swing.JButton signupbtn;
    private javax.swing.JTextField usernametxtfield;
    // End of variables declaration//GEN-END:variables
}
