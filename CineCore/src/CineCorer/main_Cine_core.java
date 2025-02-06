/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CineCorer;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;



public class main_Cine_core extends javax.swing.JFrame {
 
    int index;
    static String     driverClassName = "org.postgresql.Driver" ;
    static String     url = "jdbc:postgresql://dblabs.iee.ihu.gr:5432/it144281" ;
    static Connection dbConnection    = null;
    static String     username = "it144281";
    static String     passwd = "Tsalapetinos23!";
    
    
    public main_Cine_core() throws Exception {
        initComponents();
        mycon();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        action_combox = new javax.swing.JComboBox<>();
        button_action_combox = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("<html>Καλωσορίσατε στην DMBS εφαρμοφή της <br>    <strong><center> CINE CORE PRODUCTION! </strong></center></html>");

        jLabel2.setText("Παρακαλώ επιλέξτε ενεργεία για να ξεκινήσουμε.");

        action_combox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Διαχείριση Πινάκων.", "Εισαγωγή Δεδομένων.", "Τροποποίηση Δεδομένων.", "Διαγραφή Δεδομένων.", "Προβόλη Πινάκων.", "Αναζήτηση με Βάση Δεδομένα.", "Log files." }));
        action_combox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                action_comboxActionPerformed(evt);
            }
        });

        button_action_combox.setText("Επιβεβαίωση");
        button_action_combox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button_action_comboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(button_action_combox)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 278, Short.MAX_VALUE)
                                .addComponent(action_combox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(action_combox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(button_action_combox)
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void action_comboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_action_comboxActionPerformed
     index=action_combox.getSelectedIndex();
    }//GEN-LAST:event_action_comboxActionPerformed

    private void button_action_comboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button_action_comboxActionPerformed
          switch(index){
              case 0:
                new  table_action().setVisible(true);
                 dispose();
                break;
              
              case 1:
                 new insert_selection().setVisible(true);
                 dispose();
                 break;
                 
              case 2:
                 new update_table().setVisible(true);
                 dispose();
                 break;
             
              case 3:
                 new delete_data_rows().setVisible(true);
                 dispose();
                 break;
                 
              case 4:
                 new view_table().setVisible(true);
                 dispose();
                 break;
                 
              case 5:
                 new dynamic_queries().setVisible(true);
                 dispose();
                 break;
                 
              case 6:
                 new log_files().setVisible(true);
                 dispose();
                 break;   
          }                               

    }//GEN-LAST:event_button_action_comboxActionPerformed

   
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
            java.util.logging.Logger.getLogger(main_Cine_core.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main_Cine_core.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main_Cine_core.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main_Cine_core.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new main_Cine_core().setVisible(true);
                } catch (Exception ex) {
                    Logger.getLogger(main_Cine_core.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        });
    };
     
    
     void mycon() throws Exception{
        try {
                Class.forName(driverClassName);
                System.out.println("Driver loaded successfully.");
            } catch (ClassNotFoundException e) {
                System.err.println("Error: Failed to load the driver. " );
   
            }

        try {
                dbConnection = DriverManager.getConnection(url, username, passwd);
                System.out.println("Successfully connected to the database.");
            }   catch (SQLException e) {
                System.err.println("Failed to connect to the database. Please check the connection details. " );
            } 
    
        }
       

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> action_combox;
    private javax.swing.JButton button_action_combox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
