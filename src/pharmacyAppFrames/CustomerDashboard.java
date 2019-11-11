/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacyAppFrames;

import Db.customerOperation;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author laurentera_sd2022
 */
public class CustomerDashboard extends javax.swing.JFrame {
    customerOperation co = new customerOperation();
    Object[][] medCough = co.viewMedicineForCough();
    String[] columns = {"Brand name", "Generic name", "Price", "Type", "Quantity"};

    DefaultTableModel tableMedCough = new DefaultTableModel(medCough, columns) {
        @Override
        public boolean isCellEditable(int row, int column) {
            //all ceisCellEditablells false
            return false;
        }
    };
    /**
     * Creates new form CustomerDashboard
     */
    public CustomerDashboard() {
        initComponents();
        tableCustomer.setModel(tableMedCough);
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
        medNav = new javax.swing.JComboBox<>();
        purchaseBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableCustomer = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        Profile = new javax.swing.JMenu();
        Purchase = new javax.swing.JMenu();
        ViewHistory = new javax.swing.JMenu();
        Logout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
                {null, null, null, null, null}
            },
            new String [] {
                "Brand name", "Generic name", "Price", "Type", "Quantity"
            }
        ));
        jScrollPane1.setViewportView(tableCustomer);

        javax.swing.GroupLayout OuterContainerLayout = new javax.swing.GroupLayout(OuterContainer);
        OuterContainer.setLayout(OuterContainerLayout);
        OuterContainerLayout.setHorizontalGroup(
            OuterContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OuterContainerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(OuterContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(OuterContainerLayout.createSequentialGroup()
                        .addComponent(purchaseBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(medNav, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(OuterContainerLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        OuterContainerLayout.setVerticalGroup(
            OuterContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, OuterContainerLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(OuterContainerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(medNav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(purchaseBtn))
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Profile.setText("Profile");
        Profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProfileMouseClicked(evt);
            }
        });
        jMenuBar1.add(Profile);

        Purchase.setText("Purchase");
        jMenuBar1.add(Purchase);

        ViewHistory.setText("View History");
        ViewHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ViewHistoryMouseClicked(evt);
            }
        });
        jMenuBar1.add(ViewHistory);

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
            .addComponent(OuterContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(OuterContainer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ProfileMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProfileMouseClicked
        ProfileCustomer profile = new ProfileCustomer();
        profile.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_ProfileMouseClicked

    private void ViewHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ViewHistoryMouseClicked
        ViewHistory view = new ViewHistory();
        view.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_ViewHistoryMouseClicked

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        Login login = new Login();
        int input = JOptionPane.showConfirmDialog(null, "Do you want to logout?");
        // 0=yes, 1=no, 2=cancel
        if (input == 0) {
            login.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_LogoutMouseClicked

    private void medNavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medNavActionPerformed
        Object selected = medNav.getSelectedItem();
        Object[][] medCough = co.viewMedicineForCough();
        Object[][] medHeadache = co.viewMedicineForHeadache();
        Object[][] medBodyPain = co.viewMedicineForBodyPain();
        Object[][] medAllergies = co.viewMedicineForAllergies();
        
        if (selected.equals("Medicine For Headache")) {
            DefaultTableModel tableMedHeadache = new DefaultTableModel(medHeadache, columns) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    //all ceisCellEditablells false
                    return false;
                }
            };
            tableCustomer.setModel(tableMedHeadache);
        } else if (selected.equals("Medicine For Cough")) {
            DefaultTableModel tableMedCough = new DefaultTableModel(medCough, columns) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    //all ceisCellEditablells false
                    return false;
                }
            };
            tableCustomer.setModel(tableMedCough);
        } else if (selected.equals("Medicine For Allergies")) {
            DefaultTableModel tableMedAllergies = new DefaultTableModel(medAllergies, columns) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    //all ceisCellEditablells false
                    return false;
                }
            };
            tableCustomer.setModel(tableMedAllergies);
        } else if (selected.equals("Medicine For Body pain")) {
            DefaultTableModel tableMedBodyPain = new DefaultTableModel(medBodyPain, columns) {
                @Override
                public boolean isCellEditable(int row, int column) {
                    //all ceisCellEditablells false
                    return false;
                }
            };
            tableCustomer.setModel(tableMedBodyPain);
        }
    }//GEN-LAST:event_medNavActionPerformed

    private void medNavComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_medNavComponentShown
           
    }//GEN-LAST:event_medNavComponentShown

    private void purchaseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_purchaseBtnMouseClicked
//        DefaultTableModel model = new DefaultTableModel();
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
    }//GEN-LAST:event_purchaseBtnMouseClicked

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(CustomerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerDashboard().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Logout;
    private javax.swing.JPanel OuterContainer;
    private javax.swing.JMenu Profile;
    private javax.swing.JMenu Purchase;
    private javax.swing.JMenu ViewHistory;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> medNav;
    private javax.swing.JButton purchaseBtn;
    private javax.swing.JTable tableCustomer;
    // End of variables declaration//GEN-END:variables
}
