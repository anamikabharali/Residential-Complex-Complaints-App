

package userinterface.Facilities.Admin;

import userinterface.Facilities.Admin.*;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author  srivaishnaviaekkati
 */
public class FacilitiesAdminWorkAreaJPanel extends javax.swing.JPanel {
     
    JPanel userProcessContainer;
    Network network;
    Enterprise enterprise;
    /** Creates new form AdminWorkAreaJPanel */
    public FacilitiesAdminWorkAreaJPanel(JPanel userProcessContainer, Enterprise enterprise,Network network) {
        initComponents();
        this.network=network;
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        valueLbl.setText(enterprise.getName());
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        userbtn = new javax.swing.JButton();
        manageEmployeebtn = new javax.swing.JButton();
        manageOrganizationBtn = new javax.swing.JButton();
        enterpriseLabel = new javax.swing.JLabel();
        valueLbl = new javax.swing.JLabel();

        setBackground(new java.awt.Color(76, 89, 115));
        setMaximumSize(new java.awt.Dimension(750, 750));
        setMinimumSize(new java.awt.Dimension(750, 750));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Optima", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Facilities Enterprise Panel");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, 70, 280, -1));

        userbtn.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        userbtn.setText("Manage User");
        userbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        userbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userbtnActionPerformed(evt);
            }
        });
        add(userbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 150, 60));

        manageEmployeebtn.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        manageEmployeebtn.setText("Manage Employee");
        manageEmployeebtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        manageEmployeebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeebtnActionPerformed(evt);
            }
        });
        add(manageEmployeebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 330, 150, 60));

        manageOrganizationBtn.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        manageOrganizationBtn.setText("Manage Organization");
        manageOrganizationBtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        manageOrganizationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationBtnActionPerformed(evt);
            }
        });
        add(manageOrganizationBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, -1, 60));

        enterpriseLabel.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseLabel.setText("EnterPrise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 120, 30));

        valueLbl.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        valueLbl.setForeground(new java.awt.Color(255, 255, 255));
        valueLbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        add(valueLbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 217, 200, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void userbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userbtnActionPerformed
        // TODO add your handling code here:
        FacilitiesManageUserAccountJPanel muajp = new FacilitiesManageUserAccountJPanel(userProcessContainer, enterprise,network);
        userProcessContainer.add("ManageUserAccountJPanel", muajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_userbtnActionPerformed

    private void manageEmployeebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeebtnActionPerformed

        FacilitiesManageEmployeeJPanel manageEmployeeJPanel = new FacilitiesManageEmployeeJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageEmployeeJPanel", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_manageEmployeebtnActionPerformed

    private void manageOrganizationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationBtnActionPerformed

        FacilitiesManageOrganizationJPanel manageOrganizationJPanel = new FacilitiesManageOrganizationJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationBtnActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageEmployeebtn;
    private javax.swing.JButton manageOrganizationBtn;
    private javax.swing.JButton userbtn;
    private javax.swing.JLabel valueLbl;
    // End of variables declaration//GEN-END:variables
    
}
