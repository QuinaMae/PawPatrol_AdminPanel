/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Admin;

import java.awt.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Quina Mae C. Charopang
 */
public class ShopServices extends javax.swing.JFrame {
    
    private static final String username = "root";
    private static final String password = "";
    private static final String sqlPath = "jdbc:mysql://localhost/teamhatdog";
    
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    int q, i, id, deleteItem;
    /**
     * Creates new form ShopServices
     */
    public ShopServices() {
        initComponents();
        updateDB();
    }
    
    /**
     * This method creates a connection towards the database specified in the parameters and executes a query prepared 
     * by a statement.
    */
    public void updateDB(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(sqlPath, username, password);
            ps = con.prepareStatement("select * from shop_services");
            
            rs = ps.executeQuery();
            ResultSetMetaData rsData = rs.getMetaData();
            
            q = rsData.getColumnCount();
            DefaultTableModel RecordTable = (DefaultTableModel)servicesTable.getModel();
            RecordTable.setRowCount(0);
            
            while (rs.next()){
                Vector columnData = new Vector();
                for (i=1; i <= q; i++){
                    columnData.add(rs.getString("id"));
                    columnData.add(rs.getString("title"));
                    columnData.add(rs.getString("descrip"));
                    columnData.add(rs.getString("price"));
                }
                RecordTable.addRow(columnData);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
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

        jPanel3 = new javax.swing.JPanel();
        appointmentsLabel = new javax.swing.JLabel();
        shopServicesLabel = new javax.swing.JLabel();
        paymentLogs = new javax.swing.JLabel();
        logOut = new javax.swing.JLabel();
        payments = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        titleLabel = new javax.swing.JLabel();
        titleInput = new javax.swing.JTextField();
        descriptionLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        priceInput = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        servicesTable = new javax.swing.JTable();
        addBtn = new javax.swing.JButton();
        updateBtn = new javax.swing.JButton();
        clearBtn = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        descriptionInput = new javax.swing.JTextArea();
        refreshBtn = new javax.swing.JButton();
        serviceID = new javax.swing.JLabel();
        serviceIDtxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(9, 64, 103));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        appointmentsLabel.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        appointmentsLabel.setForeground(new java.awt.Color(255, 255, 254));
        appointmentsLabel.setText("Appointments");
        appointmentsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appointmentsLabelMouseClicked(evt);
            }
        });
        jPanel3.add(appointmentsLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 18, -1, -1));

        shopServicesLabel.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        shopServicesLabel.setForeground(new java.awt.Color(255, 255, 254));
        shopServicesLabel.setText("Shop Services");
        shopServicesLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shopServicesLabelMouseClicked(evt);
            }
        });
        jPanel3.add(shopServicesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 56, -1, -1));

        paymentLogs.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        paymentLogs.setForeground(new java.awt.Color(255, 255, 254));
        paymentLogs.setText("Payment Logs");
        paymentLogs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymentLogsMouseClicked(evt);
            }
        });
        jPanel3.add(paymentLogs, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        logOut.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        logOut.setForeground(new java.awt.Color(255, 255, 254));
        logOut.setText("Log Out");
        logOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutMouseClicked(evt);
            }
        });
        jPanel3.add(logOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 650, -1, -1));

        payments.setFont(new java.awt.Font("Poppins", 0, 14)); // NOI18N
        payments.setForeground(new java.awt.Color(255, 255, 254));
        payments.setText("Payments");
        payments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymentsMouseClicked(evt);
            }
        });
        jPanel3.add(payments, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 94, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 130, 700));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleLabel.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        titleLabel.setText("Title");
        jPanel4.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        titleInput.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jPanel4.add(titleInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, 247, -1));

        descriptionLabel.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        descriptionLabel.setText("Description");
        jPanel4.add(descriptionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        priceLabel.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        priceLabel.setText("Price");
        jPanel4.add(priceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 32, -1));

        priceInput.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jPanel4.add(priceInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 90, 83, -1));

        servicesTable.setAutoCreateRowSorter(true);
        servicesTable.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        servicesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "title", "descrip", "price"
            }
        ));
        servicesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                servicesTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(servicesTable);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, 1030, 360));

        addBtn.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        addBtn.setText("ADD");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });
        jPanel4.add(addBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 280, -1, -1));

        updateBtn.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        updateBtn.setText("UPDATE");
        updateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBtnActionPerformed(evt);
            }
        });
        jPanel4.add(updateBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 280, -1, -1));

        clearBtn.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        clearBtn.setText("CLEAR");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });
        jPanel4.add(clearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, -1, -1));

        descriptionInput.setColumns(20);
        descriptionInput.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        descriptionInput.setRows(5);
        jScrollPane2.setViewportView(descriptionInput);

        jPanel4.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 940, 100));

        refreshBtn.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        refreshBtn.setText("Refresh");
        refreshBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshBtnActionPerformed(evt);
            }
        });
        jPanel4.add(refreshBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 280, -1, -1));

        serviceID.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        serviceID.setText("ID");
        jPanel4.add(serviceID, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        serviceIDtxt.setEditable(false);
        serviceIDtxt.setFont(new java.awt.Font("Poppins", 0, 12)); // NOI18N
        jPanel4.add(serviceIDtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 70, -1));

        jLabel9.setFont(new java.awt.Font("Poppins", 0, 36)); // NOI18N
        jLabel9.setText("PawPatrol ");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 210, -1));

        getContentPane().add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 1070, 700));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * This method resets the existing inputs in the text fields.
     * @param evt 
     */
    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
       
        serviceIDtxt.setText("");
        titleInput.setText("");
        descriptionInput.setText("");
        priceInput.setText("");
    }//GEN-LAST:event_clearBtnActionPerformed
    private JFrame frame;
    private void logOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutMouseClicked
        frame = new JFrame("Log Out");
        if(JOptionPane.showConfirmDialog(frame, "Are you sure you want to log out?", "Admin Panel", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
        {
            dispose();
            Login login = new Login();
            login.setVisible(true);
        }
    }//GEN-LAST:event_logOutMouseClicked

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

    private void paymentLogsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentLogsMouseClicked
        dispose();
        PaymentLogs log = new PaymentLogs();
        log.setVisible(true);
    }//GEN-LAST:event_paymentLogsMouseClicked
    
    /**
     * This method performs an insert query towards a specified table.
    */
    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        if (titleInput.getText().isEmpty() | descriptionInput.getText().isEmpty() | priceInput.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing Component!");
        } else {
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(sqlPath, username, password);
                ps = con.prepareStatement("INSERT INTO shop_services(title, descrip, price) VALUES(?,?,?)");
                ps.setString(1, titleInput.getText()); //title
                ps.setString(2, descriptionInput.getText()); //descrip
                ps.setInt(3, Integer.valueOf(priceInput.getText())); //price

                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Successfully Added");
                con.close();
                updateDB();

            }catch(ClassNotFoundException | SQLException e){
                java.util.logging.Logger.getLogger(ShopServices.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
            }
        }
        
    }//GEN-LAST:event_addBtnActionPerformed
    /**
     * This method updates and saves an edit or modifications made from an existing record.
     * @param evt 
     */
    private void updateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBtnActionPerformed
        if (titleInput.getText().isEmpty() | descriptionInput.getText().isEmpty() | priceInput.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Missing Component!");
        } else { 
             try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection(sqlPath, username, password);
                ps = con.prepareStatement("UPDATE shop_services SET title = '"+titleInput.getText()+"', descrip = '"+descriptionInput.getText()+"', price = '"+priceInput.getText()+"' WHERE id = '"+serviceIDtxt.getText()+"' ");
                ps.executeUpdate();
                JOptionPane.showMessageDialog(this, "Successfully Updated");
                con.close();
                updateDB();

            }catch(ClassNotFoundException e){
                java.util.logging.Logger.getLogger(ShopServices.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
            }catch(SQLException e){
                java.util.logging.Logger.getLogger(ShopServices.class.getName()).log(java.util.logging.Level.SEVERE, null, e);
            }
        }

    }//GEN-LAST:event_updateBtnActionPerformed
    /**
     * This method allows the user to select a row and display its information respective to its field components.
     * @param evt 
     */
    private void servicesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_servicesTableMouseClicked
        DefaultTableModel tm = (DefaultTableModel)servicesTable.getModel();
        i = servicesTable.getSelectedRow();
        serviceIDtxt.setText(tm.getValueAt(i, 0).toString());
        titleInput.setText(tm.getValueAt(i, 1).toString());
        descriptionInput.setText(tm.getValueAt(i, 2).toString());
        priceInput.setText(tm.getValueAt(i, 3).toString());
    }//GEN-LAST:event_servicesTableMouseClicked

    /**
     * This method refreshes the displayed table by fetching the latest of its records.
     * @param evt 
     */
    private void refreshBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshBtnActionPerformed
        try{
            con = DriverManager.getConnection(sqlPath, username, password);
            ps = con.prepareStatement("SELECT * FROM shop_services");
            rs = ps.executeQuery();
            DefaultTableModel tm = (DefaultTableModel)servicesTable.getModel();
            tm.setRowCount(0);
            
            while(rs.next()){
                Object o[] = {rs.getInt("id"), rs.getString("title"), rs.getString("descrip"), rs.getInt("price")};
                tm.addRow(o);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
        
    }//GEN-LAST:event_refreshBtnActionPerformed

    private void paymentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentsMouseClicked
        // TODO add your handling code here:
        dispose();
        Payments pay = new Payments();
        pay.setVisible(true);
    }//GEN-LAST:event_paymentsMouseClicked

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
            java.util.logging.Logger.getLogger(ShopServices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShopServices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShopServices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShopServices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShopServices().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JLabel appointmentsLabel;
    private javax.swing.JButton clearBtn;
    private javax.swing.JTextArea descriptionInput;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel logOut;
    private javax.swing.JLabel paymentLogs;
    private javax.swing.JLabel payments;
    private javax.swing.JTextField priceInput;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JButton refreshBtn;
    private javax.swing.JLabel serviceID;
    private javax.swing.JTextField serviceIDtxt;
    private javax.swing.JTable servicesTable;
    private javax.swing.JLabel shopServicesLabel;
    private javax.swing.JTextField titleInput;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JButton updateBtn;
    // End of variables declaration//GEN-END:variables
}
