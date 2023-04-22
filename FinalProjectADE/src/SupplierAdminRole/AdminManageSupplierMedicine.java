/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package SupplierAdminRole;

import SupplierManager.SupplierManager;
import Medicine.MedicineSupplier;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import userinterface.PharmacyAdminRole.AdminUpdateMedicineItem;
/**
 *
 * @author Cheng Yen Lai
 */
public class AdminManageSupplierMedicine extends javax.swing.JPanel {

  
    JPanel userProcessContainer;
    SupplierManager supplierManager;
    public AdminManageSupplierMedicine(JPanel userProcessContainer, SupplierManager supplierManager) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.supplierManager = supplierManager;
        btnDelete.setEnabled(false);
        btnManage.setEnabled(false);
        txtName.setEnabled(false);
        spinnerPrice.setEnabled(false);
        lblValue.setText(supplierManager.getSupplierManagerName());
        populateTable();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblValue = new javax.swing.JLabel();
        lblSupplier = new javax.swing.JLabel();
        spinnerPrice = new javax.swing.JSpinner();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMedicineCatalog = new javax.swing.JTable();
        lblMedicine = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        btnManage = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnSubmit = new javax.swing.JButton();
        lblBackground = new javax.swing.JLabel();

        setLayout(null);

        lblValue.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblValue.setText("<value>");
        add(lblValue);
        lblValue.setBounds(500, 100, 310, 40);

        lblSupplier.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblSupplier.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        lblSupplier.setText("Supplier");
        add(lblSupplier);
        lblSupplier.setBounds(400, 100, 70, 40);

        spinnerPrice.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        spinnerPrice.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(spinnerPrice);
        spinnerPrice.setBounds(500, 240, 200, 50);

        tblMedicineCatalog.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        tblMedicineCatalog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Item No.", "Name", "Price"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblMedicineCatalog.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMedicineCatalogMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMedicineCatalog);

        add(jScrollPane1);
        jScrollPane1.setBounds(280, 450, 620, 210);

        lblMedicine.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        lblMedicine.setText("Medicine");
        add(lblMedicine);
        lblMedicine.setBounds(440, 30, 110, 50);

        txtName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        add(txtName);
        txtName.setBounds(500, 170, 200, 50);

        lblName.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblName.setText("Name:");
        add(lblName);
        lblName.setBounds(370, 180, 51, 27);

        lblPrice.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblPrice.setText("Price:");
        add(lblPrice);
        lblPrice.setBounds(370, 240, 46, 40);

        btnDelete.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Delete Button.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        add(btnDelete);
        btnDelete.setBounds(30, 170, 170, 50);

        btnManage.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnManage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/View Button.png"))); // NOI18N
        btnManage.setText("View");
        btnManage.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnManage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageActionPerformed(evt);
            }
        });
        add(btnManage);
        btnManage.setBounds(30, 250, 170, 50);

        btnCreate.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        btnCreate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Add Medicine.png"))); // NOI18N
        btnCreate.setText("Add Medicine");
        btnCreate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });
        add(btnCreate);
        btnCreate.setBounds(30, 330, 170, 50);

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
        btnBack.setBounds(40, 40, 160, 50);

        btnSubmit.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        add(btnSubmit);
        btnSubmit.setBounds(490, 330, 110, 50);

        lblBackground.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/4cdd558652d6adfe5e9d4c5af515fc40.jpg"))); // NOI18N
        add(lblBackground);
        lblBackground.setBounds(-80, -120, 1460, 960);
    }// </editor-fold>//GEN-END:initComponents

    private void tblMedicineCatalogMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMedicineCatalogMouseClicked
        // TODO add your handling code here:
        int selectedRow = tblMedicineCatalog.getSelectedRow();
        if (selectedRow >= 0)
        {
            btnDelete.setEnabled(true);
            btnManage.setEnabled(true);
        }
    }//GEN-LAST:event_tblMedicineCatalogMouseClicked

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
       int selectedRow = tblMedicineCatalog.getSelectedRow();
        if (selectedRow >= 0)
        {
            MedicineSupplier medicineSupplier = (MedicineSupplier) tblMedicineCatalog.getValueAt(selectedRow, 1);
            supplierManager.getMedicineSupplierDirectory().deleteMedicineSupplier(medicineSupplier);
            JOptionPane.showMessageDialog(null, "Medicine " + medicineSupplier.getMedicineSupplierName()+ " deleted !");
            populateTable();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnManageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageActionPerformed
        int selectedRow = tblMedicineCatalog.getSelectedRow();
            if (selectedRow >= 0)
            {
                 MedicineSupplier smi = (MedicineSupplier) tblMedicineCatalog.getValueAt(selectedRow, 1);
                 AdminUpdateSupplierMedicineItem fs = new AdminUpdateSupplierMedicineItem(userProcessContainer, smi);
                 userProcessContainer.add("SysAdminManageEmployees", fs);
                 CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.next(userProcessContainer);
             }
        else
        {
            JOptionPane.showMessageDialog(null,"Please select a row!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
    }//GEN-LAST:event_btnManageActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        // TODO add your handling code here:
        btnCreate.setEnabled(false);
        txtName.setEnabled(true);
        spinnerPrice.setEnabled(true);
        btnSubmit.setEnabled(true);
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
      if(validateThis())
        {
            if(supplierManager.getMedicineSupplierDirectory().checkIfMedicineSupplierNameUniques(txtName.getText()))
            {
                MedicineSupplier smi = supplierManager.getMedicineSupplierDirectory().createMedicineSupplier(txtName.getText(), (Integer)spinnerPrice.getValue());
                JOptionPane.showMessageDialog(null, "Medicine Item " + smi.getMedicineSupplierName()+ " created !");
                populateTable();
                btnCreate.setEnabled(true);
                txtName.setText("");
                txtName.setEnabled(false);
                spinnerPrice.setValue(0);
                spinnerPrice.setEnabled(false);
                btnSubmit.setEnabled(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Medicine already exists!", "Warning", JOptionPane.WARNING_MESSAGE);
            }
        }
        else
        {
            return;
        }
    }//GEN-LAST:event_btnSubmitActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnManage;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblBackground;
    private javax.swing.JLabel lblMedicine;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblSupplier;
    private javax.swing.JLabel lblValue;
    private javax.swing.JSpinner spinnerPrice;
    private javax.swing.JTable tblMedicineCatalog;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables


public void populateTable() {
        DefaultTableModel dtm = (DefaultTableModel)tblMedicineCatalog.getModel();
        dtm.setRowCount(0);
        if(supplierManager.getMedicineSupplierDirectory().getMedicineSupplierList()!= null)
        {
            for(MedicineSupplier smi : supplierManager.getMedicineSupplierDirectory().getMedicineSupplierList())
            {
                Object[] row = new Object[dtm.getColumnCount()];
                row[0] = smi.getId();
                row[1] = smi;
                row[2] = smi.getPrice();
                dtm.addRow(row);
            }
        }
        if(dtm.getRowCount() == 0)
            {
                btnDelete.setEnabled(false);
                btnManage.setEnabled(false);
            }
    }

    private boolean validateThis() {
        if("".equals(txtName.getText()))
        {
            JOptionPane.showMessageDialog(null,"Name cannot be empty!", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else if((Integer)spinnerPrice.getValue() <= 0)
        {
            JOptionPane.showMessageDialog(null,"Price must be above 0!", "Warning", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else
        {
            return true;
        }
    }
}
