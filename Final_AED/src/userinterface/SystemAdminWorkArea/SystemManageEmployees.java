/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Employee.EmployeeDirectory;
import Business.Pharmacy.Pharmacy;
import Business.Role.AdminRole;

import Business.Role.DeliveryManRole;
import Business.SupplierEmp.SupplierEmp;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pratik Poojari
 */
public class SystemManageEmployees extends javax.swing.JPanel {

    /**
     * Creates new form SystemManageEmployees
     */
    private JPanel userProcessContainer;
    private Pharmacy pharmacy;
    private EcoSystem ecosystem;
    public SystemManageEmployees(JPanel userProcessContainer, Pharmacy pharmacy, EcoSystem ecosystem) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.pharmacy = pharmacy;
        this.ecosystem = ecosystem;
        txtUsername.setEnabled(false);
        txtPassword.setEnabled(false);
        txtConfirmPassword.setEnabled(false);
        txtName.setEnabled(false);
        txtPhoneNumber.setEnabled(false);
        txtAddress.setEnabled(false);
        btnSubmit.setEnabled(false);
        btnDeleteEmployee.setEnabled(false);
        btnManageEmployee.setEnabled(false);
        radioBtnDelivery.setEnabled(false);
        radioBtnManager.setEnabled(false);
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblPhoneNumber = new javax.swing.JLabel();
        txtConfirmPassword = new javax.swing.JTextField();
        lblAddress = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        lblRole = new javax.swing.JLabel();
        lblConfirmPassword = new javax.swing.JLabel();
        radioBtnManager = new javax.swing.JRadioButton();
        btnBack = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        radioBtnDelivery = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProfileSME = new javax.swing.JTable();
        btnManageEmployee = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        btnDeleteEmployee = new javax.swing.JButton();
        lblName = new javax.swing.JLabel();
        btnCreateEmployee = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtPhoneNumber = new javax.swing.JTextField();
        txtPassword = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 255, 255));
        setBorder(new javax.swing.border.MatteBorder(null));
        setLayout(null);

        lblPhoneNumber.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPhoneNumber.setText("Phone Number:");
        add(lblPhoneNumber);
        lblPhoneNumber.setBounds(200, 460, 130, 30);

        txtConfirmPassword.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtConfirmPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtConfirmPassword);
        txtConfirmPassword.setBounds(450, 360, 390, 30);

        lblAddress.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblAddress.setText("Address:");
        add(lblAddress);
        lblAddress.setBounds(250, 510, 70, 30);

        lblUsername.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblUsername.setText("Username: ");
        add(lblUsername);
        lblUsername.setBounds(240, 260, 90, 25);

        txtAddress.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtAddress.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtAddress);
        txtAddress.setBounds(450, 510, 390, 30);

        lblPassword.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPassword.setText("Password: ");
        add(lblPassword);
        lblPassword.setBounds(240, 310, 90, 30);

        lblRole.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblRole.setText("Role:");
        add(lblRole);
        lblRole.setBounds(280, 560, 50, 21);

        lblConfirmPassword.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblConfirmPassword.setText("Confirm Password:");
        add(lblConfirmPassword);
        lblConfirmPassword.setBounds(170, 370, 160, 27);

        buttonGroup1.add(radioBtnManager);
        radioBtnManager.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        radioBtnManager.setText("Pharmacy Manager");
        radioBtnManager.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnManagerActionPerformed(evt);
            }
        });
        add(radioBtnManager);
        radioBtnManager.setBounds(450, 560, 200, 19);

        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Back Button.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        add(btnBack);
        btnBack.setBounds(40, 40, 100, 40);

        btnSubmit.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit);
        btnSubmit.setBounds(450, 660, 120, 50);

        buttonGroup1.add(radioBtnDelivery);
        radioBtnDelivery.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        radioBtnDelivery.setText("Delivery Man");
        radioBtnDelivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radioBtnDeliveryActionPerformed(evt);
            }
        });
        add(radioBtnDelivery);
        radioBtnDelivery.setBounds(450, 600, 200, 25);

        tblProfileSME.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tblProfileSME.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee No.", "Employee Name", "Role"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProfileSME.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProfileSMEMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblProfileSME);

        add(jScrollPane1);
        jScrollPane1.setBounds(200, 90, 740, 140);

        btnManageEmployee.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnManageEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/View Button.png"))); // NOI18N
        btnManageEmployee.setText("View");
        btnManageEmployee.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManageEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageEmployeeActionPerformed(evt);
            }
        });
        add(btnManageEmployee);
        btnManageEmployee.setBounds(20, 130, 131, 42);

        lblTitle.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitle.setText("Manage Employees");
        add(lblTitle);
        lblTitle.setBounds(320, 30, 445, 29);

        btnDeleteEmployee.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDeleteEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Delete Button.png"))); // NOI18N
        btnDeleteEmployee.setText("Delete");
        btnDeleteEmployee.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDeleteEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteEmployeeActionPerformed(evt);
            }
        });
        add(btnDeleteEmployee);
        btnDeleteEmployee.setBounds(20, 190, 131, 44);

        lblName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblName.setText("Name:");
        add(lblName);
        lblName.setBounds(270, 420, 60, 21);

        btnCreateEmployee.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCreateEmployee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Create Button.png"))); // NOI18N
        btnCreateEmployee.setText("Create");
        btnCreateEmployee.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCreateEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateEmployeeActionPerformed(evt);
            }
        });
        add(btnCreateEmployee);
        btnCreateEmployee.setBounds(20, 260, 130, 46);

        txtName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtName);
        txtName.setBounds(450, 410, 390, 30);

        txtUsername.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtUsername.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtUsername);
        txtUsername.setBounds(450, 260, 390, 30);

        txtPhoneNumber.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtPhoneNumber.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtPhoneNumber);
        txtPhoneNumber.setBounds(450, 460, 390, 30);

        txtPassword.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtPassword.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtPassword);
        txtPassword.setBounds(450, 310, 390, 30);
    }// </editor-fold>//GEN-END:initComponents

    private void radioBtnManagerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnManagerActionPerformed
        // TODO add your handling code here:
        radioBtnDelivery.setSelected(false);
    }//GEN-LAST:event_radioBtnManagerActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
         if(validateThis())
        {
                       // SupplierEmp se = ecosystem.getSupplierEmpDirectory().createSupplierEmp(txtNameSME.getText(), txtAddressSME.getText(), txtPhoneSME.getText());

            Employee e = pharmacy.getEmployeeDirectory().createEmployee(txtName.getText(), txtAddress.getText(), txtPhoneNumber.getText());
            if(e == null)
            {
                JOptionPane.showMessageDialog(null,"Employee " + txtName.getText() + " already exists!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            else
            {
                if(radioBtnManager.isSelected())
                {
                    UserAccount ua = ecosystem.getUserAccountDirectory().createUserAccount(txtUsername.getText(), txtPassword.getText(), e, new AdminRole());
                    if(ua != null)
                    {
                        JOptionPane.showMessageDialog(null, "Manager account created successfully for " + e.getName());
                    }
                    else
                    {
                        pharmacy.getEmployeeDirectory().deleteEmployee(e);
                        JOptionPane.showMessageDialog(null,"Username " + txtUsername.getText() + " already exists!", "Warning", JOptionPane.WARNING_MESSAGE);
                        return;
                    }
                }
                else
                {
                    UserAccount ua = ecosystem.getUserAccountDirectory().createUserAccount(txtUsername.getText(), txtPassword.getText(), e, new DeliveryManRole());
                    if(ua != null)
                    {
                        DeliveryMan dm = pharmacy.getDeliveryManDirectory().createDeliveryMan(txtName.getText(), txtAddress.getText(), txtPhoneNumber.getText());
                        JOptionPane.showMessageDialog(null, "Delivery Man account created successfully for " + e.getName());
                    }
                    else
                    {
                        pharmacy.getEmployeeDirectory().deleteEmployee(e);
                        JOptionPane.showMessageDialog(null,"Username " + txtUsername.getText() + " already exists!", "Warning", JOptionPane.WARNING_MESSAGE);
                        return;
                    }

                }
                btnCreateEmployee.setEnabled(true);
                txtUsername.setText("");
                txtUsername.setEnabled(false);
                txtPassword.setText("");
                txtPassword.setEnabled(false);
                txtConfirmPassword.setText("");
                txtConfirmPassword.setEnabled(false);
                txtName.setText("");
                txtName.setEnabled(false);
                txtPhoneNumber.setText("");
                txtPhoneNumber.setEnabled(false);
                txtAddress.setText("");
                txtAddress.setEnabled(false);
                btnSubmit.setEnabled(false);
                radioBtnDelivery.setSelected(false);
                radioBtnDelivery.setEnabled(false);
                radioBtnManager.setSelected(false);
                radioBtnManager.setEnabled(false);
            }
            populateTable();
        }
        else
        {
            return;
        }
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void radioBtnDeliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radioBtnDeliveryActionPerformed
        // TODO add your handling code here:
        radioBtnManager.setSelected(false);
    }//GEN-LAST:event_radioBtnDeliveryActionPerformed

    private void tblProfileSMEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProfileSMEMouseClicked
        // TODO add your handling code here:
        int selectedRow = tblProfileSME.getSelectedRow();
        if (selectedRow >= 0)
        {
            btnDeleteEmployee.setEnabled(true);
            btnManageEmployee.setEnabled(true);
        }
    }//GEN-LAST:event_tblProfileSMEMouseClicked

    private void btnManageEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageEmployeeActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblProfileSME.getSelectedRow();
        if (selectedRow >= 0)
        {
            Employee selectedEmployee = (Employee) tblProfileSME.getValueAt(selectedRow, 1);
            SystemUpdateEmployee fs = new SystemUpdateEmployee(userProcessContainer, selectedEmployee, ecosystem);
            userProcessContainer.add("SysAdminUpdateEmployees", fs);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnManageEmployeeActionPerformed

    private void btnDeleteEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteEmployeeActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblProfileSME.getSelectedRow();
        if (selectedRow >= 0)
        {
            Employee selectedEmployee = (Employee) tblProfileSME.getValueAt(selectedRow, 1);
            pharmacy.getEmployeeDirectory().deleteEmployee(selectedEmployee);
            JOptionPane.showMessageDialog(null, "Employee " + selectedEmployee.getName()+ " deleted successfully!");
            populateTable();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnDeleteEmployeeActionPerformed

    private void btnCreateEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateEmployeeActionPerformed
        // TODO add your handling code here:
        btnCreateEmployee.setEnabled(false);
        txtUsername.setEnabled(true);
        txtPassword.setEnabled(true);
        txtConfirmPassword.setEnabled(true);
        txtName.setEnabled(true);
        txtPhoneNumber.setEnabled(true);
        txtAddress.setEnabled(true);
        btnSubmit.setEnabled(true);
        radioBtnDelivery.setEnabled(true);
        radioBtnManager.setEnabled(true);
    }//GEN-LAST:event_btnCreateEmployeeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreateEmployee;
    private javax.swing.JButton btnDeleteEmployee;
    private javax.swing.JButton btnManageEmployee;
    private javax.swing.JButton btnSubmit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblConfirmPassword;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblRole;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JRadioButton radioBtnDelivery;
    private javax.swing.JRadioButton radioBtnManager;
    private javax.swing.JTable tblProfileSME;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtConfirmPassword;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

     private void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel)tblProfileSME.getModel();
        dtm.setRowCount(0);
        if(pharmacy.getEmployeeDirectory().getEmployeeList() != null)
        {
            for(Employee e : pharmacy.getEmployeeDirectory().getEmployeeList())
            {
                Object[] row = new Object[dtm.getColumnCount()];
                row[0]= e.getId();
                row[1]= e;
                UserAccount ua = ecosystem.getUserAccountDirectory().findEmployee(e);
                row[2] = ua.getRole().toString().substring(14).replace("Role", "");
                dtm.addRow(row);
            }
        }
        if(dtm.getRowCount() == 0)
            {
                btnDeleteEmployee.setEnabled(false);
                btnManageEmployee.setEnabled(false);
            }
    }

    private boolean validateThis() {
        String regex = "\\d{10}";
        EmployeeDirectory ua=this.ecosystem.getEmployeeDirectory();
        if(("".equals(txtUsername.getText())) || ("".equals(txtPassword.getText())) || ("".equals(txtConfirmPassword.getText())) 
                || ("".equals(txtName.getText())) || ("".equals(txtPhoneNumber.getText())) || ("".equals(txtAddress.getText()))
                || ((radioBtnDelivery.isEnabled() == false) && (radioBtnManager.isEnabled() == false)))
        {
            JOptionPane.showMessageDialog(null,"Please fill all details!", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else if(!(txtPassword.getText().equals(txtConfirmPassword.getText())))
        {
            JOptionPane.showMessageDialog(null,"Passwords do not match!", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else if(!(txtPhoneNumber.getText().matches(regex)))
        {
            JOptionPane.showMessageDialog(null,"Phone number must have only 10 digits!", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        
          else if (ua.checkIfEmployeeIsUnique(txtUsername.getText())==false){
              JOptionPane.showMessageDialog(null, "Sorry credentials are taken.");
      return false;
          }
          
        else
        {
            return true;
        }
    }
}
