/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.Customer.EmailValidation;
import Business.Hospital.Hospital;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.DeliveryManRole;
import Business.Role.HospitalAdminRole;
import Business.SupplierEmp.SupplierEmp;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Pratik Poojari
 */
public class SystemAdminManageHospitals extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminManageHospitals
     */
    
       private JPanel userProcessContainerSAMC;
       private EcoSystem ecosystem;
       
    public SystemAdminManageHospitals(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
         this.userProcessContainerSAMC = userProcessContainer;
        this.ecosystem = ecosystem;
        
        SystemAMHUsernameText.setEnabled(false);
        SystemAMHPasswordText.setEnabled(false);
        SystemAMHConfirmPasswordText.setEnabled(false);
        SystemAMHNameText.setEnabled(false);
        SystemAMHPhoneNumberText.setEnabled(false);
        SystemAMHAddressText.setEnabled(false);
        SystemAMHSubmitButton.setEnabled(false);
        SystemAMCDeleteButton.setEnabled(false);
        //SystemAMCViewButton.setEnabled(false);
         emailIDField.setEnabled(false);
        populateTableHM();
        
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        SystemAMHTable = new javax.swing.JTable();
        SystemAMCDeleteButton = new javax.swing.JButton();
        SystemAMHCreateButton = new javax.swing.JButton();
        SystemAMCLabel1 = new javax.swing.JLabel();
        SystemAMCBackButton = new javax.swing.JButton();
        SystemAMCNameLabel = new javax.swing.JLabel();
        SystemAMHNameText = new javax.swing.JTextField();
        SystemAMCPhoneNumberLabel = new javax.swing.JLabel();
        SystemAMHPhoneNumberText = new javax.swing.JTextField();
        SystemAMCAddressLabel = new javax.swing.JLabel();
        SystemAMHAddressText = new javax.swing.JTextField();
        SystemAMCAddressLabel1 = new javax.swing.JLabel();
        emailIDField = new javax.swing.JTextField();
        SendEmailButton = new javax.swing.JButton();
        SystemAMCUsernameLabel = new javax.swing.JLabel();
        SystemAMHUsernameText = new javax.swing.JTextField();
        SystemAMCPasswordLabel = new javax.swing.JLabel();
        SystemAMHPasswordText = new javax.swing.JTextField();
        SystemAMCConfirmPasswordLabel = new javax.swing.JLabel();
        SystemAMHConfirmPasswordText = new javax.swing.JTextField();
        SystemAMHSubmitButton = new javax.swing.JButton();

        SystemAMHTable.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SystemAMHTable.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        SystemAMHTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial No.", "Customer Name"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        SystemAMHTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SystemAMHTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(SystemAMHTable);

        SystemAMCDeleteButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SystemAMCDeleteButton.setText("Delete Hospital");
        SystemAMCDeleteButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SystemAMCDeleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SystemAMCDeleteButtonActionPerformed(evt);
            }
        });

        SystemAMHCreateButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SystemAMHCreateButton.setText("Add Hospital");
        SystemAMHCreateButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SystemAMHCreateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SystemAMHCreateButtonActionPerformed(evt);
            }
        });

        SystemAMCLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        SystemAMCLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SystemAMCLabel1.setText("Manage Hospitals");

        SystemAMCBackButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SystemAMCBackButton.setText("< Back");
        SystemAMCBackButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SystemAMCBackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SystemAMCBackButtonActionPerformed(evt);
            }
        });

        SystemAMCNameLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SystemAMCNameLabel.setText("Name:");

        SystemAMHNameText.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        SystemAMHNameText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SystemAMHNameText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SystemAMHNameTextActionPerformed(evt);
            }
        });

        SystemAMCPhoneNumberLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SystemAMCPhoneNumberLabel.setText("Phone Number:");

        SystemAMHPhoneNumberText.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        SystemAMHPhoneNumberText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        SystemAMCAddressLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SystemAMCAddressLabel.setText("Address:");

        SystemAMHAddressText.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        SystemAMHAddressText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        SystemAMHAddressText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SystemAMHAddressTextActionPerformed(evt);
            }
        });

        SystemAMCAddressLabel1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SystemAMCAddressLabel1.setText("Email:");

        emailIDField.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        emailIDField.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        emailIDField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailIDFieldActionPerformed(evt);
            }
        });

        SendEmailButton.setBackground(new java.awt.Color(255, 204, 153));
        SendEmailButton.setText("Get Credendials");
        SendEmailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SendEmailButtonActionPerformed(evt);
            }
        });

        SystemAMCUsernameLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SystemAMCUsernameLabel.setText("Username: ");

        SystemAMHUsernameText.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        SystemAMHUsernameText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        SystemAMCPasswordLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SystemAMCPasswordLabel.setText("Password: ");

        SystemAMHPasswordText.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        SystemAMHPasswordText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        SystemAMCConfirmPasswordLabel.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SystemAMCConfirmPasswordLabel.setText("Confirm Password:");

        SystemAMHConfirmPasswordText.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        SystemAMHConfirmPasswordText.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        SystemAMHSubmitButton.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        SystemAMHSubmitButton.setText("Register");
        SystemAMHSubmitButton.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        SystemAMHSubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SystemAMHSubmitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(SystemAMCBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(SystemAMCLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(SystemAMCUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(62, 62, 62)
                                .addComponent(SystemAMHUsernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(SystemAMCPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)
                                .addComponent(SystemAMHPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SystemAMCConfirmPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64)
                                .addComponent(SystemAMHConfirmPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(240, 240, 240)
                                .addComponent(SystemAMHSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(SystemAMCDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SystemAMHCreateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(68, 68, 68)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(SystemAMCNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SystemAMCPhoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SystemAMCAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SystemAMCAddressLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(SystemAMHPhoneNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SystemAMHAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(emailIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SystemAMHNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SendEmailButton, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1030, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SystemAMCLabel1)
                            .addComponent(SystemAMCBackButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(83, 83, 83)
                        .addComponent(SystemAMCDeleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SystemAMCNameLabel)
                            .addComponent(SystemAMHNameText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(SystemAMCPhoneNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(SystemAMHPhoneNumberText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(SystemAMCAddressLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SystemAMHAddressText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SystemAMHCreateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(SystemAMCAddressLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(emailIDField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(SendEmailButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SystemAMCUsernameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SystemAMHUsernameText, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SystemAMCPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SystemAMHPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(SystemAMCConfirmPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SystemAMHConfirmPasswordText, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(SystemAMHSubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void SystemAMHTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SystemAMHTableMouseClicked
        // TODO add your handling code here:
        int selectedRow = SystemAMHTable.getSelectedRow();
        if (selectedRow >= 0)
        {
            SystemAMCDeleteButton.setEnabled(true);
          //  SystemAMCViewButton.setEnabled(true);
        }
    }//GEN-LAST:event_SystemAMHTableMouseClicked

    private void SystemAMCDeleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SystemAMCDeleteButtonActionPerformed
        // TODO add your handling code here:
        int selectedRow = SystemAMHTable.getSelectedRow();
        if (selectedRow >= 0)
        {
            Hospital selectedHospital = (Hospital) SystemAMHTable.getValueAt(selectedRow, 1);
            ecosystem.getHospitalDirectory().deleteHospital(selectedHospital);
            JOptionPane.showMessageDialog(null, "Hospital " + selectedHospital.getHospitalName()+ " deleted successfully!");
            populateTableHM();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_SystemAMCDeleteButtonActionPerformed

    private void SystemAMHCreateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SystemAMHCreateButtonActionPerformed
        // TODO add your handling code here:
        SystemAMHCreateButton.setEnabled(false);
        //SystemAMCUsernameText.setEnabled(true);
        //SystemAMCPasswordText.setEnabled(true);
        //SystemAMCConfirmPasswordText.setEnabled(true);
        SystemAMHNameText.setEnabled(true);
        emailIDField.setEnabled(true);
        SystemAMHPhoneNumberText.setEnabled(true);
        SystemAMHAddressText.setEnabled(true);
        SystemAMHSubmitButton.setEnabled(true);
        SystemAMCDeleteButton.setEnabled(true);
        //SystemAMCViewButton.setEnabled(true);
    }//GEN-LAST:event_SystemAMHCreateButtonActionPerformed

    private void SystemAMCBackButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SystemAMCBackButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainerSAMC.remove(this);
        Component[] componentArray = userProcessContainerSAMC.getComponents();
        Component component = componentArray[componentArray.length - 1];
        SystemAdminWorkAreaJPanel dwjp = (SystemAdminWorkAreaJPanel) component;
        //dwjp.populateTree();
        CardLayout layout = (CardLayout) userProcessContainerSAMC.getLayout();
        layout.previous(userProcessContainerSAMC);
    }//GEN-LAST:event_SystemAMCBackButtonActionPerformed

    private void SystemAMHNameTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SystemAMHNameTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SystemAMHNameTextActionPerformed

    private void SystemAMHAddressTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SystemAMHAddressTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SystemAMHAddressTextActionPerformed

    private void emailIDFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailIDFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailIDFieldActionPerformed

    private void SendEmailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SendEmailButtonActionPerformed
        // TODO add your handling code here:
        SystemAMHUsernameText.setEnabled(true);
        SystemAMHPasswordText.setEnabled(true);
        SystemAMHConfirmPasswordText.setEnabled(true);
        String pass2 = "1234";
        String emailId = emailIDField.getText();
        String CustomerUserName = SystemAMHNameText.getText();

        String CustomerPassword = SystemAMHNameText.getText().concat(pass2);
        String str1 = "Your USERNAME is: " + CustomerUserName;
        String str2 = "Your PASSWORD is: " + CustomerPassword;
        String Emailmsg = str1.concat(str2);

        System.out.println("In between"+CustomerUserName+" "+CustomerPassword+" "+ emailId);
        // boolean emailSent = EmailValidation.sendEmail(Emailmsg, emailId,CustomerUserName,CustomerPassword);

        if(validateThisSAMC2())
        {
            try
            {
                boolean emailSent = EmailValidation.sendEmail(Emailmsg, emailId,CustomerUserName,CustomerPassword);

                if(!emailSent)
                {
                    JOptionPane.showMessageDialog(null, "Please Enter a valid Email address! ","warning", JOptionPane.WARNING_MESSAGE);
                    // organization.getPersonDirectory().getVolunteerList().remove((Volunteer)person);
                    return;
                }
            }
            catch(Exception e){
                System.out.println("Please put valid EmailID");
            }
            //System.out.println(emailSent);
        }

    }//GEN-LAST:event_SendEmailButtonActionPerformed

    private void SystemAMHSubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SystemAMHSubmitButtonActionPerformed
        String pass2 = "1234";
        String HospitalUserName = EmailValidation.generateUserName(SystemAMHNameText.getText());
        String HospitalPassword = EmailValidation.generatePassword(SystemAMHNameText.getText().concat(pass2));

        if(validateThisSAMC())
        {
            Employee e = ecosystem.getEmployeeDirectory().createEmployee(SystemAMHNameText.getText(), SystemAMHAddressText.getText(), SystemAMHPhoneNumberText.getText());
            // SupplierEmp se = ecosystem.getSupplierEmpDirectory().createSupplierEmp(txtNameSAMC.getText(), txtAddressSAMC.getText(), txtPhoneSAMC.getText());

            UserAccount ua = ecosystem.getUserAccountDirectory().createUserAccount(HospitalUserName, HospitalPassword, e, new HospitalAdminRole());
            if(ua != null)
            {

                Hospital c = ecosystem.getHospitalDirectory().createHospital(SystemAMHNameText.getText(), SystemAMHAddressText.getText(), SystemAMHPhoneNumberText.getText());
                JOptionPane.showMessageDialog(null, "Customer account created successfully for " + c.getHospitalName());
                populateTableHM();
                SystemAMHCreateButton.setEnabled(true);
                SystemAMHUsernameText.setText("");
                SystemAMHUsernameText.setEnabled(false);
                SystemAMHPasswordText.setText("");
                SystemAMHPasswordText.setEnabled(false);
                SystemAMHConfirmPasswordText.setText("");
                SystemAMHConfirmPasswordText.setEnabled(false);
                SystemAMHNameText.setText("");
                SystemAMHNameText.setEnabled(false);
                SystemAMHPhoneNumberText.setText("");
                SystemAMHPhoneNumberText.setEnabled(false);
                SystemAMHAddressText.setText("");
                SystemAMHAddressText.setEnabled(false);
                emailIDField.setEnabled(false);
                SystemAMHSubmitButton.setEnabled(false);
                emailIDField.setText("");
            }
            else
            {
                ecosystem.getEmployeeDirectory().deleteEmployee(e);
                JOptionPane.showMessageDialog(null,"Username " + HospitalUserName + " already exists!", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
        }

        else
        {
            return;
        }
    }//GEN-LAST:event_SystemAMHSubmitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SendEmailButton;
    private javax.swing.JLabel SystemAMCAddressLabel;
    private javax.swing.JLabel SystemAMCAddressLabel1;
    private javax.swing.JButton SystemAMCBackButton;
    private javax.swing.JLabel SystemAMCConfirmPasswordLabel;
    private javax.swing.JButton SystemAMCDeleteButton;
    private javax.swing.JLabel SystemAMCLabel1;
    private javax.swing.JLabel SystemAMCNameLabel;
    private javax.swing.JLabel SystemAMCPasswordLabel;
    private javax.swing.JLabel SystemAMCPhoneNumberLabel;
    private javax.swing.JLabel SystemAMCUsernameLabel;
    private javax.swing.JTextField SystemAMHAddressText;
    private javax.swing.JTextField SystemAMHConfirmPasswordText;
    private javax.swing.JButton SystemAMHCreateButton;
    private javax.swing.JTextField SystemAMHNameText;
    private javax.swing.JTextField SystemAMHPasswordText;
    private javax.swing.JTextField SystemAMHPhoneNumberText;
    private javax.swing.JButton SystemAMHSubmitButton;
    private javax.swing.JTable SystemAMHTable;
    private javax.swing.JTextField SystemAMHUsernameText;
    private javax.swing.JTextField emailIDField;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    private void populateTableHM() {
        DefaultTableModel dtmSAMC = (DefaultTableModel)SystemAMHTable.getModel();
        dtmSAMC.setRowCount(0);
        if(ecosystem.getHospitalDirectory().getHospitalList() != null)
        {
            for(Hospital h: ecosystem.getHospitalDirectory().getHospitalList())
            {
                Object[] row = new Object[dtmSAMC.getColumnCount()];
                row[0]= h.getHospitalId();
                row[1]= h;
                dtmSAMC.addRow(row);
            }
        }
        if(dtmSAMC.getRowCount() == 0)
            {
                SystemAMCDeleteButton.setEnabled(false);
                //SystemAMCViewButton.setEnabled(false);
            }
    }

    private boolean validateThisSAMC() {
        String regex = "\\d{10}";
        if(("".equals(SystemAMHUsernameText.getText())) || ("".equals(SystemAMHPasswordText.getText())) || ("".equals(SystemAMHConfirmPasswordText.getText())) 
                || ("".equals(SystemAMHNameText.getText())) || ("".equals(SystemAMHPhoneNumberText.getText())) || ("".equals(SystemAMHAddressText.getText())))
        {
            JOptionPane.showMessageDialog(null,"Please fill all details!", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else if(!(SystemAMHPasswordText.getText().equals(SystemAMHConfirmPasswordText.getText())))
        {
            JOptionPane.showMessageDialog(null,"Passwords do not match!", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else if(!(SystemAMHPhoneNumberText.getText().matches(regex)))
        {
            JOptionPane.showMessageDialog(null,"Mobile no. can have only 10 digits!", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else
        {
            return true;
        }
    }
    private boolean validateThisSAMC2() {
        String regex = "\\d{10}";
        if( ("".equals(SystemAMHNameText.getText())) || ("".equals(SystemAMHPhoneNumberText.getText())) || ("".equals(SystemAMHAddressText.getText())))
        {
            JOptionPane.showMessageDialog(null,"Please fill all details!", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
       
        else if(!(SystemAMHPhoneNumberText.getText().matches(regex)))
        {
            JOptionPane.showMessageDialog(null,"Mobile no. can have only 10 digits!", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else
        {
            return true;
        }
    }




}


