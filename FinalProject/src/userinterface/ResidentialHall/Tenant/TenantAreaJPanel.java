/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.ResidentialHall.Tenant;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.CanteenOrganization;
import Business.Organization.TenantOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Complaints_Suggestions_Request;
import Business.WorkQueue.StatusRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author anamikabharali
 */

public class TenantAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private TenantOrganization organization;
    private Enterprise enterprise;
    private UserAccount userAccount;
    private EcoSystem business;
    private Network network;
    /**
     * Creates new form DoctorWorkAreaJPanel
     */
    public TenantAreaJPanel(JPanel userProcessContainer, UserAccount account, TenantOrganization organization, Enterprise enterprise,EcoSystem business,Network network) {
        initComponents();
        this.business=business;
        this.network=network;    
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.userAccount = account;
        valueLabel.setText(enterprise.getName());
        populateReqTable();
        populateRequestTable();
    }
    
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();
        
        model.setRowCount(0);
        for (StatusRequest request : userAccount.getStatusQueue().getStatusRequestList()){
            if(request.getType()!=null)
            {
            Object[] row = new Object[5];
            row[0] = request;
            row[1] = request.getType();
            row[2] = request.getReceiver();
            row[3] = request.getStatus();
            String result = ((Complaints_Suggestions_Request) request).getResponse();
            row[4] = result == null ? "Waiting" : result;
            
            model.addRow(row);
            }
        }
    }

     private void populateReqTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable1.getModel();
        
        model.setRowCount(0);
        for (StatusRequest request : userAccount.getStatusQueue().getStatusRequestList()){
            if (request instanceof Complaints_Suggestions_Request)
                
            {
            Object[] row = new Object[4];
            row[0] = request;
           
            row[1] = request.getReceiver();
            row[2] = request.getStatus();
            String result = ((Complaints_Suggestions_Request) request).getResponse();
            row[3] = result == null ? "Waiting" : result;
            
            model.addRow(row);
        }
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

        addcomplaintbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        workRequestJTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        workRequestJTable1 = new javax.swing.JTable();
        addcomplaint = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        enterpriseLabel = new javax.swing.JLabel();
        refreshTestJButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(76, 89, 115));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addcomplaintbtn.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        addcomplaintbtn.setText("Add a Compalint/Suggestion");
        addcomplaintbtn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addcomplaintbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcomplaintbtnActionPerformed(evt);
            }
        });
        add(addcomplaintbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, -1, -1));

        workRequestJTable.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Message", "Type", "Receiver", "Status", "Response"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(workRequestJTable);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 660, 92));

        workRequestJTable1.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        workRequestJTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Message", "Receiver", "Status", "Response"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(workRequestJTable1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, 650, 90));

        addcomplaint.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        addcomplaint.setText("Add Complaint");
        addcomplaint.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        addcomplaint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addcomplaintActionPerformed(evt);
            }
        });
        add(addcomplaint, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 200, 20));

        jLabel2.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("For Police:");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, -1, -1));

        jLabel1.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("For Residential Management:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        valueLabel.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        valueLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        add(valueLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 120, 158, 26));

        enterpriseLabel.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        enterpriseLabel.setForeground(new java.awt.Color(255, 255, 255));
        enterpriseLabel.setText("Enterprise :");
        add(enterpriseLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 127, 30));

        refreshTestJButton.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        refreshTestJButton.setText("Refresh");
        refreshTestJButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        refreshTestJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshTestJButtonActionPerformed(evt);
            }
        });
        add(refreshTestJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 160, 80, -1));

        jButton1.setFont(new java.awt.Font("Optima", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 0, 0));
        jButton1.setText("Emergency!!");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 140, 30));

        jLabel4.setFont(new java.awt.Font("Optima", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("COMPLAINT REGISTRATION");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 50, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon("/Users/anamikabharali/Downloads/imageedit_1_4791170951.jpg")); // NOI18N
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-210, 0, 1060, 110));
    }// </editor-fold>//GEN-END:initComponents

    private void addcomplaintbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcomplaintbtnActionPerformed

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("StudentCompalinJPanel", new Tenant_Complain_Suggest_JPanel(userProcessContainer, userAccount, enterprise));
        layout.next(userProcessContainer);

    }//GEN-LAST:event_addcomplaintbtnActionPerformed

    private void addcomplaintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addcomplaintActionPerformed
        // TODO add your handling code here:

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("StudentComplaintJPanel", new TenantComplaintJPanel(userProcessContainer, userAccount, enterprise,network));
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_addcomplaintActionPerformed

    private void refreshTestJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshTestJButtonActionPerformed

        populateRequestTable();

    }//GEN-LAST:event_refreshTestJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("StudentemergencyrequestJpanel", new TenantEmergencyRequestJPanel(userProcessContainer, userAccount, enterprise,network));
        layout.next(userProcessContainer);

    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addcomplaint;
    private javax.swing.JButton addcomplaintbtn;
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton refreshTestJButton;
    private javax.swing.JLabel valueLabel;
    private javax.swing.JTable workRequestJTable;
    private javax.swing.JTable workRequestJTable1;
    // End of variables declaration//GEN-END:variables
}