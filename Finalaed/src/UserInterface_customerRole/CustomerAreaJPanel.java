/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface_customerRole;

import Business.EcoSystem;
import Business.Employee.Employee;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import Business.Customer.Customer;
import Business.Pharmacy.Pharmacy;

/**
 *
 * @author Pratik Poojari
 */
public class CustomerAreaJPanel extends javax.swing.JPanel {
 private JPanel userProcessContainer;
    private UserAccount userAccount;
    Pharmacy pharmacy;
    EcoSystem system;
    Customer customer;
    /**
     * Creates new form CustomerAreaJPanel
     */
    public CustomerAreaJPanel(JPanel userProcessContainer, UserAccount useraccount, EcoSystem system) {
        initComponents();
         this.userProcessContainer = userProcessContainer;  
        this.userAccount = useraccount;
        this.system = system;
        
        for(Customer c : system.getCustomerDirectory().getCustomerList() )
        {
            
                if(c.getName() == null ? useraccount.getEmployee().getName() == null : c.getName().equals(useraccount.getEmployee().getName()))
                {
                    this.customer = c;
                }
           
        }
        
        txtName.setText(this.customer.getName());
        txtAddress.setText(this.customer.getAddress());
        txtPhone.setText(this.customer.getPhone());
        
        lblValue.setText(this.customer.getName());
        comboPharmacy.addItem("");
        for(Pharmacy p : system.getPharmacyDirectory().getPharmacyList())
        {
            comboPharmacy.addItem(p.getName());
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

        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        comboPharmacy = new javax.swing.JComboBox<>();
        lblWelcome = new javax.swing.JLabel();
        lblUpdate = new javax.swing.JLabel();
        lblValue = new javax.swing.JLabel();
        btnReviewOrders = new javax.swing.JButton();
        lblSelectPharmacy = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setLayout(null);

        lblAddress.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblAddress.setText("Address:");
        add(lblAddress);
        lblAddress.setBounds(350, 400, 69, 20);

        txtAddress.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtAddress);
        txtAddress.setBounds(470, 390, 270, 40);

        lblTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Customer Work Area");
        add(lblTitle);
        lblTitle.setBounds(400, 40, 270, 29);

        lblName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblName.setText("Name:");
        add(lblName);
        lblName.setBounds(360, 270, 60, 21);

        comboPharmacy.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        comboPharmacy.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        comboPharmacy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboPharmacyActionPerformed(evt);
            }
        });
        add(comboPharmacy);
        comboPharmacy.setBounds(470, 150, 270, 40);

        lblWelcome.setBackground(new java.awt.Color(255, 255, 255));
        lblWelcome.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblWelcome.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblWelcome.setText("Welcome! ");
        add(lblWelcome);
        lblWelcome.setBounds(430, 80, 120, 29);

        lblUpdate.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblUpdate.setText("Update Details");
        add(lblUpdate);
        lblUpdate.setBounds(470, 200, 120, 50);

        lblValue.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblValue.setText("<value>");
        add(lblValue);
        lblValue.setBounds(570, 80, 310, 30);

        btnReviewOrders.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnReviewOrders.setText("Review Orders");
        btnReviewOrders.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReviewOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReviewOrdersActionPerformed(evt);
            }
        });
        add(btnReviewOrders);
        btnReviewOrders.setBounds(380, 490, 140, 40);

        lblSelectPharmacy.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblSelectPharmacy.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblSelectPharmacy.setText("Select a Pharmacy:");
        add(lblSelectPharmacy);
        lblSelectPharmacy.setBounds(260, 160, 180, 21);

        lblPhone.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPhone.setText("Phone:");
        add(lblPhone);
        lblPhone.setBounds(360, 330, 60, 21);

        txtName.setEditable(false);
        txtName.setBackground(new java.awt.Color(255, 255, 255));
        txtName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtName);
        txtName.setBounds(470, 260, 270, 40);

        txtPhone.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtPhone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtPhone);
        txtPhone.setBounds(470, 320, 270, 40);

        btnSubmit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit);
        btnSubmit.setBounds(590, 490, 120, 40);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/7e8e8c57497d2627fa7923f20188fa5d.jpg"))); // NOI18N
        add(lblBackground);
        lblBackground.setBounds(0, 0, 1030, 820);
    }// </editor-fold>//GEN-END:initComponents

    private void comboPharmacyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboPharmacyActionPerformed
     // TODO add your handling code here:
        if(comboPharmacy.getSelectedItem() != "")
        {
            String phar = comboPharmacy.getSelectedItem().toString();
            pharmacy = system.getPharmacyDirectory().findPharmacy(phar);
            CustomerOrderAction cpo = new CustomerOrderAction(userProcessContainer, customer, pharmacy);
            userProcessContainer.add("CustomerOrder", cpo);
            CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
    }//GEN-LAST:event_comboPharmacyActionPerformed

    private void btnReviewOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReviewOrdersActionPerformed
  // TODO add your handling code here:
        CustomerSummaryJPanell lcj = new CustomerSummaryJPanell(userProcessContainer, userAccount, system);
        userProcessContainer.add("CustomerOrder", lcj);
        CardLayout layout = (CardLayout)this.userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnReviewOrdersActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        if((txtAddress.getText() == "") || (txtPhone.getText() == "") )
        {
            JOptionPane.showMessageDialog(null,"Please fill all values!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        else
        {
            customer.setAddress(txtAddress.getText());
            customer.setPhone(txtPhone.getText());
          
                    
        }
        lblValue.setText(pharmacy.getName());
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReviewOrders;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> comboPharmacy;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JLabel lblSelectPharmacy;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUpdate;
    private javax.swing.JLabel lblValue;
    private javax.swing.JLabel lblWelcome;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}