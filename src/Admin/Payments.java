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
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
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
//        updatepaymentDB();
        updatepaymentRecordDB();
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
        payments = new javax.swing.JLabel();
        logOut = new javax.swing.JLabel();
        paymentLogs = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        saveBtn = new javax.swing.JButton();
        paymentID = new javax.swing.JLabel();
        idInput = new javax.swing.JTextField();
        appID = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        dateInput = new com.toedter.calendar.JDateChooser();
        paydate = new javax.swing.JLabel();
        serviceInput = new javax.swing.JTextField();
        serviceTxt = new javax.swing.JLabel();
        status = new javax.swing.JLabel();
        statusInput = new javax.swing.JComboBox<>();
        amount = new javax.swing.JLabel();
        amountInput = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        paymentsTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        refreshBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(9, 64, 103));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        appointmentsLabel.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        appointmentsLabel.setForeground(new java.awt.Color(255, 255, 254));
        appointmentsLabel.setText("Appointments");
        appointmentsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appointmentsLabelMouseClicked(evt);
            }
        });
        jPanel2.add(appointmentsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 18, -1, -1));

        shopServicesLabel.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        shopServicesLabel.setForeground(new java.awt.Color(255, 255, 254));
        shopServicesLabel.setText("Shop Services");
        shopServicesLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shopServicesLabelMouseClicked(evt);
            }
        });
        jPanel2.add(shopServicesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 56, -1, -1));

        payments.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        payments.setForeground(new java.awt.Color(255, 255, 254));
        payments.setText("Payments");
        payments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymentsMouseClicked(evt);
            }
        });
        jPanel2.add(payments, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 94, -1, -1));

        logOut.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        logOut.setForeground(new java.awt.Color(255, 255, 254));
        logOut.setText("Log Out");
        logOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutMouseClicked(evt);
            }
        });
        jPanel2.add(logOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, -1, -1));

        paymentLogs.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        paymentLogs.setForeground(new java.awt.Color(255, 255, 254));
        paymentLogs.setText("Payment Logs");
        paymentLogs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymentLogsMouseClicked(evt);
            }
        });
        jPanel2.add(paymentLogs, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 132, -1, -1));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        saveBtn.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });
        jPanel3.add(saveBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 100, -1, -1));

        paymentID.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        paymentID.setText("App ID");
        jPanel3.add(paymentID, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, -1));

        idInput.setEditable(false);
        idInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idInputActionPerformed(evt);
            }
        });
        jPanel3.add(idInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 100, -1));
        jPanel3.add(appID, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));

        jLabel9.setFont(new java.awt.Font("Poppins", 0, 36)); // NOI18N
        jLabel9.setText("PawPatrol ");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 0, 240, -1));

        dateInput.setDateFormatString("yyyy-MM-dd");
        jPanel3.add(dateInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, 130, -1));

        paydate.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        paydate.setText("Pay Date");
        jPanel3.add(paydate, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 100, -1, -1));
        jPanel3.add(serviceInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 140, -1));

        serviceTxt.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        serviceTxt.setText("Service");
        jPanel3.add(serviceTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        status.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        status.setText("Payment Status");
        jPanel3.add(status, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 70, 100, -1));

        statusInput.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        statusInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--", "paid", "cancelled" }));
        jPanel3.add(statusInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, 110, -1));

        amount.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        amount.setText("Amount");
        jPanel3.add(amount, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, -1, -1));

        amountInput.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jPanel3.add(amountInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 103, -1));

        paymentsTable.setAutoCreateRowSorter(true);
        paymentsTable.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        paymentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "app_id", "client name", "pet name", "service", "price", "app_status"
            }
        ));
        paymentsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymentsTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(paymentsTable);

        jPanel3.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, 1050, 440));

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 0, 12)); // NOI18N
        jLabel2.setText("Pending Payments");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        refreshBtn.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        refreshBtn.setText("refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });
        jPanel3.add(refreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 170, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
    
    /**
     * This method builds a connection to the database and executes a prepared statement or SQL query.
     * The data fetches from the appointments and shop services table to display the list of accepted appointments but pending service payments.
     */
    public void updatepaymentRecordDB(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(sqlPath, username, password);
            ps = con.prepareStatement("SELECT * FROM `pending_invoice_view`");
            // app_id, username, pet_name, service, price, status, invoice_stat
            
            rs = ps.executeQuery();
            ResultSetMetaData rsData = rs.getMetaData();
            
            q = rsData.getColumnCount();
            DefaultTableModel RT = (DefaultTableModel)paymentsTable.getModel();
            RT.setRowCount(0);
            
            while (rs.next()){
                Vector columnData = new Vector();
                for (i=1; i <= q; i++){
                    
                    columnData.add(rs.getString("app_id"));
                    columnData.add(rs.getString("client"));
                    columnData.add(rs.getString("pet_name"));
                    columnData.add(rs.getString("service"));
                    columnData.add(rs.getString("price"));
                    columnData.add(rs.getString("app_status"));
                }
                RT.addRow(columnData);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    public void clear(){
        idInput.setText("");
        serviceInput.setText("");
        amountInput.setText("");
        dateInput.setCalendar(null);
        statusInput.setSelectedIndex(0);
    }

    private void shopServicesLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shopServicesLabelMouseClicked
        dispose();
        ShopServices shopServices = new ShopServices();
        shopServices.setVisible(true);
    }//GEN-LAST:event_shopServicesLabelMouseClicked

    private void appointmentsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointmentsLabelMouseClicked
        dispose();
        Dashboard dboard = new Dashboard();
        dboard.setVisible(true);
    }//GEN-LAST:event_appointmentsLabelMouseClicked

    private void logOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMouseClicked
        JFrame frame = new JFrame("Log Out");
        if(JOptionPane.showConfirmDialog(frame, "Are you sure you want to log out?", "Admin Panel", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
        {
            dispose();
            Login login = new Login();
            login.setVisible(true);
        }
    }//GEN-LAST:event_logOutMouseClicked

    /**
     * This method updates the modification made and reflects it to the database.
    */
    Statement sm;
    private void paymentLogsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentLogsMouseClicked
        // TODO add your handling code here:
        dispose();
        PaymentLogs log = new PaymentLogs();
        log.setVisible(true);
    }//GEN-LAST:event_paymentLogsMouseClicked

    private void paymentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentsMouseClicked
        // TODO add your handling code here:
        dispose();
        Payments pay = new Payments();
        pay.setVisible(true);
    }//GEN-LAST:event_paymentsMouseClicked

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(sqlPath, username, password);
            con.close();
            updatepaymentRecordDB();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void paymentsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentsTableMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tm = (DefaultTableModel)paymentsTable.getModel();
        i = paymentsTable.getSelectedRow();
        idInput.setText(tm.getValueAt(i, 0).toString());
        serviceInput.setText(tm.getValueAt(i,3).toString());
        amountInput.setText(tm.getValueAt(i, 4).toString());
    }//GEN-LAST:event_paymentsTableMouseClicked

    private void idInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idInputActionPerformed

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(sqlPath, username, password);
            try{
                
                ps = con.prepareStatement("INSERT INTO `payments1` (`app_id`, `service`, `service_price`, `status`, `date_paid`) VALUES (?, ?, ?, ?, ?)");
                ps.setString(1, idInput.getText());
                ps.setString(2, serviceInput.getText());
                ps.setString(3, amountInput.getText());
                ps.setObject(4, statusInput.getSelectedItem());
                ps.setString(5, ((JTextField)dateInput.getDateEditor().getUiComponent()).getText());
                ps.executeUpdate();

                JOptionPane.showMessageDialog(this, "Successfully Updated");
                con.close();
                updatepaymentRecordDB();
                
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            
            try{
                ps = con.prepareStatement("UPDATE `appointments` SET `is_updated` = '1' WHERE `appointments`.`id` = '"+idInput.getText()+"'");
                ps.executeUpdate();
                con.close();
                updatepaymentRecordDB();
                
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            clear();
            
        }catch(ClassNotFoundException e){
            java.util.logging.Logger.getLogger(ShopServices.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }catch(SQLException e){
            java.util.logging.Logger.getLogger(ShopServices.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
        }
    }//GEN-LAST:event_saveBtnActionPerformed

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
    private javax.swing.JLabel amount;
    private javax.swing.JTextField amountInput;
    private javax.swing.JLabel appID;
    private javax.swing.JLabel appointmentsLabel;
    private com.toedter.calendar.JDateChooser dateInput;
    private javax.swing.JTextField idInput;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logOut;
    private javax.swing.JLabel paydate;
    private javax.swing.JLabel paymentID;
    private javax.swing.JLabel paymentLogs;
    private javax.swing.JLabel payments;
    public javax.swing.JTable paymentsTable;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JButton saveBtn;
    private javax.swing.JTextField serviceInput;
    private javax.swing.JLabel serviceTxt;
    private javax.swing.JLabel shopServicesLabel;
    private javax.swing.JLabel status;
    private javax.swing.JComboBox<String> statusInput;
    // End of variables declaration//GEN-END:variables
}
