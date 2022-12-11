/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Facilities.Canteen;

import userinterface.Facilities.Canteen.CanteenEmergencyRequestJPanel;
import userinterface.Facilities.Canteen.CanteenComplaintJPanel;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.CanteenOrganization;

import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Complaints_Suggestions_Request;
import Business.WorkQueue.EmergencyRequest;
import Business.WorkQueue.StatusRequest;
import static com.db4o.internal.convert.Converter.instance;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author srivaishnaviaekkati
 */
public class CanteenWorkAreaJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private EcoSystem business;
    private UserAccount userAccount;
    private CanteenOrganization diningOrganization;
    private Enterprise enterprise;
    private Network network;
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public CanteenWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise ,EcoSystem business,Network network) {
        initComponents();
        this.network=network;
        this.userProcessContainer = userProcessContainer;
        this.userAccount = account;
        this.business = business;
        this.diningOrganization = (CanteenOrganization)organization;
        this.enterprise=enterprise;
     //   populateTable();
        populateRequestTable();
    }
    
//    public void populateTable(){
//        DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
//        
//        
//        // DefaultTableModel model = (DefaultTableModel)workRequestJTable.getModel();
//        model.setRowCount(0);
//        
//        for(StatusRequest request : diningOrganization.getStatusQueue().getStatusRequestList()){
//            Object[] row = new Object[4];
//            row[0] = request;
//            row[1] = request.getSender().getEmployee().getName();
//            row[2] = request.getReceiver() == null ? null : request.getReceiver().getEmployee().getName();
//            row[3] = request.getStatus();
//            
//            model.addRow(row);
//        }
//    }
      public void populateRequestTable(){
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

        jScrollPane2 = new javax.swing.JScrollPane();
        workRequestJTable1 = new javax.swing.JTable();
        emergencybtn = new javax.swing.JButton();
        complaintbtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 153, 153));
        setMaximumSize(new java.awt.Dimension(750, 750));
        setMinimumSize(new java.awt.Dimension(750, 750));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        workRequestJTable1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
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

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 140, -1, 90));

        emergencybtn.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        emergencybtn.setForeground(new java.awt.Color(255, 51, 0));
        emergencybtn.setText("Emergency!!");
        emergencybtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emergencybtnActionPerformed(evt);
            }
        });
        add(emergencybtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 190, -1));

        complaintbtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        complaintbtn.setText("Add Complaint");
        complaintbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                complaintbtnActionPerformed(evt);
            }
        });
        add(complaintbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 100, 130, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("Canteen Org Panel");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void complaintbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_complaintbtnActionPerformed
        // TODO add your handling code here:
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("DinerComplaintJpanel", new CanteenComplaintJPanel(userProcessContainer, userAccount, enterprise,network));
        layout.next(userProcessContainer);
        
        
        
    }//GEN-LAST:event_complaintbtnActionPerformed

    private void emergencybtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emergencybtnActionPerformed
        // TODO add your handling code here:
        
         CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("DineremergencyrequestJpanel", new CanteenEmergencyRequestJPanel(userProcessContainer, userAccount, enterprise,network));
        layout.next(userProcessContainer);
    }//GEN-LAST:event_emergencybtnActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton complaintbtn;
    private javax.swing.JButton emergencybtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable workRequestJTable1;
    // End of variables declaration//GEN-END:variables
}
