/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Acer
 */
public class Dashboard extends javax.swing.JFrame {

    private static final String username = "root";
    private static final String password = "";
    private static final String sqlPath = "jdbc:mysql://localhost/teamhatdog";
    
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    int q, i, id, deleteItem;
    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
        updateDB();
    }
    
    public void updateDB(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(sqlPath, username, password);
            ps = con.prepareStatement("select * from appointment_log");
            
            rs = ps.executeQuery();
            ResultSetMetaData rsData = rs.getMetaData();
            
            q = rsData.getColumnCount();
            DefaultTableModel RecordTable = (DefaultTableModel)appointmentLog.getModel();
            RecordTable.setRowCount(0);
            
            while (rs.next()){
                Vector columnData = new Vector();
                for (i=1; i <= q; i++){
                    columnData.add(rs.getString("id"));
                    columnData.add(rs.getString("app_id"));
                    columnData.add(rs.getString("user_id"));
                    columnData.add(rs.getString("date_booked"));
                    columnData.add(rs.getString("date_updated"));
                    columnData.add(rs.getString("status"));
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

        jPanel1 = new javax.swing.JPanel();
        appointmentsLabel = new javax.swing.JLabel();
        shopServicesLabel = new javax.swing.JLabel();
        activitLogLabel = new javax.swing.JLabel();
        logOut = new javax.swing.JLabel();
        acceptBtn = new javax.swing.JButton();
        declineBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        appointmentLog = new javax.swing.JTable();
        refreshButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

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

        activitLogLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        activitLogLabel.setText("Payments");
        activitLogLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                activitLogLabelMouseClicked(evt);
            }
        });

        logOut.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logOut.setText("Log Out");
        logOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(appointmentsLabel)
                    .addComponent(shopServicesLabel)
                    .addComponent(logOut)
                    .addComponent(activitLogLabel))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(appointmentsLabel)
                .addGap(18, 18, 18)
                .addComponent(shopServicesLabel)
                .addGap(18, 18, 18)
                .addComponent(activitLogLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logOut)
                .addGap(17, 17, 17))
        );

        acceptBtn.setText("Accept");
        acceptBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptBtnActionPerformed(evt);
            }
        });

        declineBtn.setText("Decline");
        declineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                declineBtnActionPerformed(evt);
            }
        });

        appointmentLog.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(appointmentLog);

        refreshButton.setText("Refresh");
        refreshButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 848, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 20, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(acceptBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(declineBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(refreshButton)
                        .addGap(29, 29, 29))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(acceptBtn)
                    .addComponent(declineBtn)
                    .addComponent(refreshButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 492, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void acceptBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acceptBtnActionPerformed

    private void declineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_declineBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_declineBtnActionPerformed

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

    private void activitLogLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_activitLogLabelMouseClicked
        // TODO add your handling code here:
        dispose();
        Payments aLog = new Payments();
        aLog.setVisible(true);
    }//GEN-LAST:event_activitLogLabelMouseClicked

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

    private void refreshButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshButtonActionPerformed
        try{
            con = DriverManager.getConnection(sqlPath, username, password);
            ps = con.prepareStatement("SELECT * FROM appointment_log");
            rs = ps.executeQuery();
            DefaultTableModel tm = (DefaultTableModel)appointmentLog.getModel();
            tm.setRowCount(0);
            
            while(rs.next()){
                Object o[] = {rs.getInt("id"), rs.getString("app_id"), rs.getString("user_id"), rs.getInt("date_booked"), rs.getInt("date_updated"), rs.getInt("status")};
                tm.addRow(o);
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_refreshButtonActionPerformed

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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptBtn;
    private javax.swing.JLabel activitLogLabel;
    private javax.swing.JTable appointmentLog;
    private javax.swing.JLabel appointmentsLabel;
    private javax.swing.JButton declineBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel logOut;
    private javax.swing.JButton refreshButton;
    private javax.swing.JLabel shopServicesLabel;
    // End of variables declaration//GEN-END:variables
}
