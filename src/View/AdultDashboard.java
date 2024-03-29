/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.CustomerTransaction;
import Model.CustomerOperation;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author laurentera_sd2022
 */
public class AdultDashboard extends javax.swing.JFrame {

    CustomerOperation co = new CustomerOperation();
    CustomerTransaction ct = new CustomerTransaction();
    int user_id;

    /**
     * Creates new form CustomerDashboard
     *
     * @param acc_id
     */
    public AdultDashboard(int acc_id) {
        initComponents();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y);
        medNav.setSelectedItem("Medicine For Cough");
        user_id = acc_id;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        OuterContainer = new javax.swing.JPanel();
        purchaseBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCustomer = new javax.swing.JTable();
        medNav = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        Purchase = new javax.swing.JMenu();
        PurchasedMedBtn = new javax.swing.JMenu();
        Logout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rangie Drug Store");

        OuterContainer.setBackground(new java.awt.Color(255, 153, 204));

        purchaseBtn.setText("Purchase");
        purchaseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                purchaseBtnMouseClicked(evt);
            }
        });

        tableCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Brand name", "Generic name", "Price", "Type", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tableCustomer);
        if (tableCustomer.getColumnModel().getColumnCount() > 0) {
            tableCustomer.getColumnModel().getColumn(0).setResizable(false);
            tableCustomer.getColumnModel().getColumn(1).setResizable(false);
        }

        medNav.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Medicine For Cough", "Medicine For Headache", "Medicine For Body pain", "Medicine For Allergies" }));
        medNav.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                medNavComponentShown(evt);
            }
        });
        medNav.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medNavActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout OuterContainerLayout = new javax.swing.GroupLayout(OuterContainer);
        OuterContainer.setLayout(OuterContainerLayout);
        OuterContainerLayout.setHorizontalGroup(
            OuterContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OuterContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OuterContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 445, Short.MAX_VALUE)
                    .addGroup(OuterContainerLayout.createSequentialGroup()
                        .addComponent(purchaseBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(medNav, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        OuterContainerLayout.setVerticalGroup(
            OuterContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OuterContainerLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(OuterContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(purchaseBtn)
                    .addComponent(medNav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        Purchase.setText("Dashboard");
        jMenuBar1.add(Purchase);

        PurchasedMedBtn.setText("Purchased Medicines");
        PurchasedMedBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PurchasedMedBtnMouseClicked(evt);
            }
        });
        jMenuBar1.add(PurchasedMedBtn);

        Logout.setText("Logout");
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });
        jMenuBar1.add(Logout);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(OuterContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OuterContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PurchasedMedBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PurchasedMedBtnMouseClicked
        PurchasedMedicines view = new PurchasedMedicines();
        view.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_PurchasedMedBtnMouseClicked

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        Login login = new Login();
        int input = JOptionPane.showConfirmDialog(null, "Do you want to logout?");
        // 0=yes, 1=no, 2=cancel
        if (input == 0) {
            login.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_LogoutMouseClicked

    private void purchaseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchaseBtnMouseClicked

        JTextField Brandname = new JTextField();
        JTextField Genericname = new JTextField();
        JTextField Type = new JTextField();
        JTextField Quantity = new JTextField();
        Object[] message = {
            "Brand name:", Brandname,
            "Generic name:", Genericname,
            "Type:", Type,
            "Quantity:", Quantity
        };

        JOptionPane.showConfirmDialog(null, message, "Purchase Medicine", JOptionPane.OK_CANCEL_OPTION);

        String brandname = Brandname.getText();
        String genericname = Genericname.getText();
        String quantity = Quantity.getText();
        String type = Type.getText();

        System.out.println(this.user_id + " Purchase btn");
        if (medNav.getSelectedItem().equals("Medicine For Cough")) {
            ct.purchaseMedicineForCough(brandname, genericname, type, quantity, this.user_id);
            medNav.setSelectedItem("Medicine For Cough");
        } else if (medNav.getSelectedItem().equals("Medicine For Headache")) {
            ct.purchaseMedicineForHeadache(brandname, genericname, type, quantity, this.user_id);
            medNav.setSelectedItem("Medicine For Headache");
        } else if (medNav.getSelectedItem().equals("Medicine For Body pain")) {
            ct.purchaseMedicineForBodyPain(brandname, genericname, type, quantity, this.user_id);
            medNav.setSelectedItem("Medicine For Body pain");
        } else if (medNav.getSelectedItem().equals("Medicine For Allergies")) {
            ct.purchaseMedicineForAllergies(brandname, genericname, type, quantity, this.user_id);
            medNav.setSelectedItem("Medicine For Allergies");
        }
    }//GEN-LAST:event_purchaseBtnMouseClicked

    private void medNavComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_medNavComponentShown

    }//GEN-LAST:event_medNavComponentShown

    private void medNavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medNavActionPerformed
        Object selected = medNav.getSelectedItem();

        if (selected.equals("Medicine For Headache")) {
            tableCustomer.setModel(ct.viewMedicinesForHeadache());
        } else if (selected.equals("Medicine For Cough")) {
            tableCustomer.setModel(ct.viewMedicinesForCough());
        } else if (selected.equals("Medicine For Allergies")) {
            tableCustomer.setModel(ct.viewMedicinesForAllergies());
        } else if (selected.equals("Medicine For Body pain")) {
            tableCustomer.setModel(ct.viewMedicinesForBodyPain());
        }
    }//GEN-LAST:event_medNavActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdultDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdultDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdultDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdultDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AdultDashboard(0).setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Logout;
    private javax.swing.JPanel OuterContainer;
    private javax.swing.JMenu Purchase;
    private javax.swing.JMenu PurchasedMedBtn;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> medNav;
    private javax.swing.JButton purchaseBtn;
    private javax.swing.JTable tableCustomer;
    // End of variables declaration//GEN-END:variables
}
