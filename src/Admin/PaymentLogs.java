/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Admin;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Acer
 */
public class PaymentLogs extends javax.swing.JFrame {

    /**
     * Creates new form PaymentLogs
     */
    public PaymentLogs() {
        initComponents();
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
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        paymentsTable = new javax.swing.JTable();
        refreshBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        exportBtn = new javax.swing.JButton();

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
        jPanel2.add(shopServicesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 58, -1, -1));

        payments.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        payments.setForeground(new java.awt.Color(255, 255, 254));
        payments.setText("Payments");
        payments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymentsMouseClicked(evt);
            }
        });
        jPanel2.add(payments, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 98, -1, -1));

        logOut.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        logOut.setForeground(new java.awt.Color(255, 255, 254));
        logOut.setText("Log Out");
        logOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutMouseClicked(evt);
            }
        });
        jPanel2.add(logOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, -1, -1));

        paymentLogs.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        paymentLogs.setForeground(new java.awt.Color(255, 255, 254));
        paymentLogs.setText("Payment Logs");
        paymentLogs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymentLogsMouseClicked(evt);
            }
        });
        jPanel2.add(paymentLogs, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 138, -1, -1));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        paymentsTable.setAutoCreateRowSorter(true);
        paymentsTable.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        paymentsTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "app_id", "service", "service_price", "status", "date_paid"
            }
        ));
        paymentsTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymentsTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(paymentsTable);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 99, 830, 550));

        refreshBtn.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        refreshBtn.setText("refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });
        jPanel1.add(refreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 60, -1, -1));

        jLabel9.setFont(new java.awt.Font("Poppins", 0, 36)); // NOI18N
        jLabel9.setText("PawPatrol ");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 10, 210, -1));

        exportBtn.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        exportBtn.setText("Export ");
        exportBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exportBtnMouseClicked(evt);
            }
        });
        jPanel1.add(exportBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 60, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
        public void updatepaymentRecordDB(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(sqlPath, username, password);
            ps = con.prepareStatement("SELECT * FROM payments1");    
            rs = ps.executeQuery();
            ResultSetMetaData rsData = rs.getMetaData();
            
            q = rsData.getColumnCount();
            DefaultTableModel RT = (DefaultTableModel)paymentsTable.getModel();
            RT.setRowCount(0);
            
            while (rs.next()){
                Vector columnData = new Vector();
                for (i=1; i <= q; i++){
                    columnData.add(rs.getString("id"));
                    columnData.add(rs.getString("app_id"));
                    columnData.add(rs.getString("service"));
                    columnData.add(rs.getString("service_price"));
                    columnData.add(rs.getString("status"));
                    columnData.add(rs.getString("date_paid"));
                }
                RT.addRow(columnData);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    private void appointmentsLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointmentsLabelMouseClicked
        dispose();
        Dashboard dboard = new Dashboard();
        dboard.setVisible(true);
    }//GEN-LAST:event_appointmentsLabelMouseClicked

    private void shopServicesLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shopServicesLabelMouseClicked
        dispose();
        ShopServices shopServices = new ShopServices();
        shopServices.setVisible(true);
    }//GEN-LAST:event_shopServicesLabelMouseClicked

    private void logOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMouseClicked
        JFrame frame = new JFrame("Log Out");
        if(JOptionPane.showConfirmDialog(frame, "Are you sure you want to log out?", "Admin Panel", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
        {
            dispose();
            Login login = new Login();
            login.setVisible(true);
        }
    }//GEN-LAST:event_logOutMouseClicked

    private void paymentsTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentsTableMouseClicked
        // TODO add your handling code here:

    }//GEN-LAST:event_paymentsTableMouseClicked

    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        try {
            // TODO add your handling code here:
            con.close();
            updatepaymentRecordDB();
        } catch (SQLException ex) {
            Logger.getLogger(PaymentLogs.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_refreshBtnActionPerformed

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

    private void exportBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exportBtnMouseClicked

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(sqlPath, username, password);
            StringBuilder sb = new StringBuilder();
            
            String query = "SELECT * from payments1";
            ResultSet rs = null;
            rs = ps.executeQuery();
            
            
            while (rs.next()){
                sb.append(rs.getString("id"));
                sb.append(",");
                sb.append(rs.getString("app_id"));
                sb.append(",");
                sb.append(rs.getString("service"));
                sb.append(",");
                sb.append(rs.getString("service_price"));
                sb.append(",");
                sb.append(rs.getString("status"));
                sb.append(",");
                sb.append(rs.getDate("date_paid")); 
                sb.append("\r\n");
            }
            
            JFileChooser fileChooser = new JFileChooser();
            
            FileFilter filter = new FileNameExtensionFilter("CSV File", "csv");fileChooser.addChoosableFileFilter(filter);fileChooser.setFileFilter(filter);
          
            int returnVal = fileChooser.showSaveDialog(null);
            
            if (returnVal == fileChooser.APPROVE_OPTION) {
            
            File outputFile = fileChooser.getSelectedFile();
         
            if (!outputFile.getAbsolutePath().toLowerCase().endsWith(".csv")) {
              outputFile = new File(outputFile.getAbsolutePath() + ".csv");
            }
            try {
            
            FileOutputStream fout = new FileOutputStream(outputFile);
            fout.write(sb.toString().getBytes());
            fout.close();
          } catch (FileNotFoundException e) {
            
            e.printStackTrace();
            return;
          } catch (IOException e) {
            
            e.printStackTrace();
            return;
          }
               }
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
            java.util.logging.Logger.getLogger(PaymentLogs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PaymentLogs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PaymentLogs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PaymentLogs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PaymentLogs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel appointmentsLabel;
    private javax.swing.JButton exportBtn;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logOut;
    private javax.swing.JLabel paymentLogs;
    private javax.swing.JLabel payments;
    private javax.swing.JTable paymentsTable;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JLabel shopServicesLabel;
    // End of variables declaration//GEN-END:variables
}
