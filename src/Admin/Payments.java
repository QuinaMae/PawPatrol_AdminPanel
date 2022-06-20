/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Admin;

import java.beans.Statement;
import java.io.File;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Acer
 */
public class Payments extends javax.swing.JFrame {

    /**
     * Creates new form Logs
     */
    public Payments() {
        initComponents();
        updateDB();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        appointmentsLabel = new javax.swing.JLabel();
        shopServicesLabel = new javax.swing.JLabel();
        activityLogLabel = new javax.swing.JLabel();
        logOut = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        paymentsTable = new javax.swing.JTable();
        exportBtn = new javax.swing.JButton();
        saveBtn = new javax.swing.JButton();
        paymentID = new javax.swing.JLabel();
        idInput = new javax.swing.JTextField();
        appidInput = new javax.swing.JTextField();
        appID = new javax.swing.JLabel();
        amount = new javax.swing.JLabel();
        amountInput = new javax.swing.JTextField();
        paydateInput = new javax.swing.JTextField();
        paydate = new javax.swing.JLabel();
        userID = new javax.swing.JLabel();
        useridInput = new javax.swing.JTextField();
        status = new javax.swing.JLabel();
        statusInput = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        appointmentsLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        appointmentsLabel.setText("Appointments");
        appointmentsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appointmentsLabelMouseClicked(evt);
            }
        });

        shopServicesLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        shopServicesLabel.setText("Shop Services");
        shopServicesLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shopServicesLabelMouseClicked(evt);
            }
        });

        activityLogLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        activityLogLabel.setText("Payments");

        logOut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logOut.setText("Log Out");
        logOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(appointmentsLabel)
                    .addComponent(shopServicesLabel)
                    .addComponent(activityLogLabel)
                    .addComponent(logOut))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(appointmentsLabel)
                .addGap(18, 18, 18)
                .addComponent(shopServicesLabel)
                .addGap(18, 18, 18)
                .addComponent(activityLogLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logOut)
                .addGap(17, 17, 17))
        );

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel9.setText("Payments");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 13, 373, -1));

        paymentsTable.setAutoCreateRowSorter(true);
        paymentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "app_id", "pay_date", "amount", "user_id", "status"
            }
        ));
        paymentsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymentsTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(paymentsTable);

        jPanel3.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 201, 879, 410));

        exportBtn.setText("Export ");
        exportBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exportBtnMouseClicked(evt);
            }
        });
        jPanel3.add(exportBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(821, 36, -1, -1));

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        jPanel3.add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(731, 36, -1, -1));

        paymentID.setText("ID");
        jPanel3.add(paymentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        idInput.setEditable(false);
        idInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idInputActionPerformed(evt);
            }
        });
        jPanel3.add(idInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 70, 100, -1));

        appidInput.setEditable(false);
        jPanel3.add(appidInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 103, -1));

        appID.setText("Appointment ID");
        jPanel3.add(appID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        amount.setText("Amount");
        jPanel3.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 71, -1, -1));

        amountInput.setEditable(false);
        jPanel3.add(amountInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(467, 68, 103, -1));

        paydateInput.setEditable(false);
        jPanel3.add(paydateInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 120, -1));

        paydate.setText("Pay Date");
        jPanel3.add(paydate, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        userID.setText("User ID");
        jPanel3.add(userID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        useridInput.setEditable(false);
        jPanel3.add(useridInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, 103, -1));

        status.setText("Status");
        jPanel3.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));

        statusInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "pending", "paid", "cancelled" }));
        jPanel3.add(statusInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 100, 100, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 905, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private static final String username = "root";
    private static final String password = "";
    private static final String sqlPath = "jdbc:mysql://localhost/teamhatdog";
    
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    int q, i, id, deleteItem;
    
    public void updateDB(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(sqlPath, username, password);
            ps = con.prepareStatement("SELECT * FROM payment");
            
            rs = ps.executeQuery();
            ResultSetMetaData rsData = rs.getMetaData();
            
            q = rsData.getColumnCount();
            DefaultTableModel RecordTable = (DefaultTableModel)paymentsTable.getModel();
            RecordTable.setRowCount(0);
            
            while (rs.next()){
                Vector columnData = new Vector();
                for (i=1; i <= q; i++){
                    columnData.add(rs.getString("id"));
                    columnData.add(rs.getString("app_id"));
                    columnData.add(rs.getString("pay_date"));
                    columnData.add(rs.getString("amount"));
                    columnData.add(rs.getString("user_id"));
                    columnData.add(rs.getString("status"));
                }
                RecordTable.addRow(columnData);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void shopServicesLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shopServicesLabelMouseClicked
        // TODO add your handling code here:
        dispose();
        ShopServices shopServices = new ShopServices();
        shopServices.setVisible(true);
    }//GEN-LAST:event_shopServicesLabelMouseClicked

    private void appointmentsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointmentsLabelMouseClicked
        // TODO add your handling code here:
        dispose();
        Dashboard dboard = new Dashboard();
        dboard.setVisible(true);
    }//GEN-LAST:event_appointmentsLabelMouseClicked

    private void logOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMouseClicked
        // TODO add your handling code here:
        JFrame frame = new JFrame("Log Out");
        if(JOptionPane.showConfirmDialog(frame, "Are you sure you want to log out?", "Admin Panel", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
        {
            dispose();
            Login login = new Login();
            login.setVisible(true);
        }
    }//GEN-LAST:event_logOutMouseClicked

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
             try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(sqlPath, username, password);
                ps = con.prepareStatement("UPDATE payment SET status = '"+statusInput.getSelectedItem().toString()+"' WHERE id = "+idInput.getText()+" ");
                ps.executeUpdate();              
                JOptionPane.showMessageDialog(this, "Successfully Updated");
                con.close();
                updateDB();


            }catch(ClassNotFoundException e){
                java.util.logging.Logger.getLogger(ShopServices.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
            }catch(SQLException e){
                java.util.logging.Logger.getLogger(ShopServices.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
            }
    }//GEN-LAST:event_saveBtnActionPerformed

    private void idInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idInputActionPerformed

    private void paymentsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentsTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tm = (DefaultTableModel)paymentsTable.getModel();
        i = paymentsTable.getSelectedRow();
        idInput.setText(tm.getValueAt(i, 0).toString());
        appidInput.setText(tm.getValueAt(i, 1).toString());
        paydateInput.setText(tm.getValueAt(i, 2).toString());
        amountInput.setText(tm.getValueAt(i, 3).toString());
        useridInput.setText(tm.getValueAt(i, 4).toString());
        statusInput.setSelectedItem(tm.getValueAt(i, 5).toString());
    }//GEN-LAST:event_paymentsTableMouseClicked

    private void exportBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportBtnMouseClicked
        // TODO add your handling code here:
        
        try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection(sqlPath, username, password);
        
        PrintWriter pw = new PrintWriter (new File("C:/csv/Payment_Table.txt"));
        StringBuilder sb = new StringBuilder();
        
        String query = "SELECT * from payment";
        ResultSet rs = null;
        rs = ps.executeQuery();
        
        while (rs.next()){
           sb.append(rs.getString("id"));
           sb.append(",");
           sb.append(rs.getString("app_id"));
           sb.append(",");
           sb.append(rs.getString("pay_date"));
           sb.append(",");
           sb.append(rs.getString("amount"));
           sb.append(",");
           sb.append(rs.getString("user_id"));
           sb.append(",");
           sb.append(rs.getString("status"));
           sb.append("\r\n");
        }
        
        pw.write(sb.toString());
        pw.close();
        
        
        } catch (Exception e){
             e.printStackTrace();
        }
        
        JOptionPane.showMessageDialog(this, "Successfully Exported");
    }//GEN-LAST:event_exportBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Payments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel activityLogLabel;
    private javax.swing.JLabel amount;
    private javax.swing.JTextField amountInput;
    private javax.swing.JLabel appID;
    private javax.swing.JTextField appidInput;
    private javax.swing.JLabel appointmentsLabel;
    private javax.swing.JButton exportBtn;
    private javax.swing.JTextField idInput;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logOut;
    private javax.swing.JLabel paydate;
    private javax.swing.JTextField paydateInput;
    private javax.swing.JLabel paymentID;
    private javax.swing.JTable paymentsTable;
    private javax.swing.JButton saveBtn;
    private javax.swing.JLabel shopServicesLabel;
    private javax.swing.JLabel status;
    private javax.swing.JComboBox<String> statusInput;
    private javax.swing.JLabel userID;
    private javax.swing.JTextField useridInput;
    // End of variables declaration//GEN-END:variables
}
