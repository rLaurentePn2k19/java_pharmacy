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

/**
 *
 * @author laurentera_sd2022
 */
public class PurchasedMedicines extends javax.swing.JFrame {

    // Dapat siya ray maka kita sa iya purchase history, it means kung pag register pa nimo wla pakay purchase history
    CustomerOperation co = new CustomerOperation();
    CustomerTransaction ct = new CustomerTransaction();
    int user_id;
    /**
     * Creates new form ViewHistory
     */
    public PurchasedMedicines() {
        initComponents();
        Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
        int x = (int) ((dimension.getWidth() - this.getWidth()) / 2);
        int y = (int) ((dimension.getHeight() - this.getHeight()) / 2);
        this.setLocation(x, y);
        medNav.setSelectedItem("Medicine For Cough");
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePurchased = new javax.swing.JTable();
        medNav = new javax.swing.JComboBox<>();
        jMenuBar1 = new javax.swing.JMenuBar();
        Purchase = new javax.swing.JMenu();
        PurchasedMedBtn = new javax.swing.JMenu();
        Logout = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Rangie Drug Store");

        jPanel1.setBackground(new java.awt.Color(255, 153, 204));

        tablePurchased.setModel(new javax.swing.table.DefaultTableModel(
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
                "Brandname", "Generic name", "Quantity", "Amount paid", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablePurchased);
        if (tablePurchased.getColumnModel().getColumnCount() > 0) {
            tablePurchased.getColumnModel().getColumn(0).setResizable(false);
            tablePurchased.getColumnModel().getColumn(1).setResizable(false);
            tablePurchased.getColumnModel().getColumn(2).setResizable(false);
            tablePurchased.getColumnModel().getColumn(3).setResizable(false);
            tablePurchased.getColumnModel().getColumn(4).setResizable(false);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(medNav, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(medNav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        Purchase.setText("Dashboard");
        Purchase.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PurchaseMouseClicked(evt);
            }
        });
        jMenuBar1.add(Purchase);

        PurchasedMedBtn.setText("Purchased Medicines");
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        Login login = new Login();
        int input = JOptionPane.showConfirmDialog(null, "Do you want to logout?");
        // 0=yes, 1=no, 2=cancel
        if (input == 0) {
            login.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_LogoutMouseClicked

    private void PurchaseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PurchaseMouseClicked
        AdultDashboard customer = new AdultDashboard(0);
        customer.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_PurchaseMouseClicked

    private void medNavComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_medNavComponentShown

    }//GEN-LAST:event_medNavComponentShown

    private void medNavActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medNavActionPerformed
        Object selected = medNav.getSelectedItem();

        if (selected.equals("Medicine For Headache")) {
            tablePurchased.setModel(ct.purchasedMedHeadache(user_id));
        } else if (selected.equals("Medicine For Cough")) {
            tablePurchased.setModel(ct.purchasedMedCough(user_id));
        } else if (selected.equals("Medicine For Allergies")) {
            tablePurchased.setModel(ct.purchasedMedAllergies(user_id));
        } else if (selected.equals("Medicine For Body pain")) {
            tablePurchased.setModel(ct.purchasedMedBodyPain(user_id));
        }
    }//GEN-LAST:event_medNavActionPerformed

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
            java.util.logging.Logger.getLogger(PurchasedMedicines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PurchasedMedicines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PurchasedMedicines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PurchasedMedicines.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new PurchasedMedicines().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Logout;
    private javax.swing.JMenu Purchase;
    private javax.swing.JMenu PurchasedMedBtn;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> medNav;
    private javax.swing.JTable tablePurchased;
    // End of variables declaration//GEN-END:variables
}
