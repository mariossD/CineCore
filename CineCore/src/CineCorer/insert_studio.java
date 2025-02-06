/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CineCorer;

import static CineCorer.main_Cine_core.dbConnection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class insert_studio extends javax.swing.JFrame {
     JFrame insert_studio=new JFrame();
   
    public insert_studio() {
        initComponents();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        is_rollback = new javax.swing.JButton();
        confrim_istudio = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        Τοποθεσία = new javax.swing.JLabel();
        st_name = new javax.swing.JTextField();
        st_location = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("<html><center><strong> Παρακαλώ εισάγεται τα στοιχεία του Studio</html></center></strong>");

        is_rollback.setText("Πίσω");
        is_rollback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                is_rollbackActionPerformed(evt);
            }
        });

        confrim_istudio.setText("Επιβεβαίωση");
        confrim_istudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confrim_istudioActionPerformed(evt);
            }
        });

        jLabel2.setText("Όνομα  Studio:");

        Τοποθεσία.setText("Τοποθεσία  :");

        st_location.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                st_locationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(is_rollback, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(confrim_istudio))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(st_name, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(73, 73, 73)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(st_location, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Τοποθεσία, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Τοποθεσία))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(st_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st_location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(is_rollback)
                    .addComponent(confrim_istudio))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void is_rollbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_is_rollbackActionPerformed
        new insert_selection().setVisible(true);
            dispose();
    }//GEN-LAST:event_is_rollbackActionPerformed

    private void confrim_istudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confrim_istudioActionPerformed
       try {  
            String stname = st_name.getText();
            String stloc  = st_location.getText();
            if (stname.length()<=0 || stloc.length()<=0) {
                     JOptionPane.showMessageDialog(
                        insert_studio,
                        "Error: Both name and location  must be provided.",
                        "Input Error",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                        insert_st(stname,stloc);
                        JOptionPane.showMessageDialog(
                        insert_studio,  // Γονικό παράθυρο
                        "The data has been successfully inserted into the STUDIO table.",  // Μήνυμα
                        "Record Added",  // Τίτλος διαλόγου
                        JOptionPane.INFORMATION_MESSAGE  // Είδος μηνύματος
                        );
                        st_name.setText("");
                        st_location.setText("");
            }    
            
        } catch(NullPointerException e){
            System.out.println("\n -- Null Pointer Exception --- \n");
            JOptionPane.showMessageDialog(
                    insert_studio,
                    "All fields must be filled.",
                    "Input Error",
                JOptionPane.WARNING_MESSAGE
                );
        }
    }//GEN-LAST:event_confrim_istudioActionPerformed

    private void st_locationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_st_locationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_st_locationActionPerformed

   
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
            java.util.logging.Logger.getLogger(insert_studio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(insert_studio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(insert_studio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(insert_studio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new insert_studio().setVisible(true);
            }
        });
    }
    
    
     void insert_st(String name,String location){
        try {    
               PreparedStatement stmt = dbConnection.prepareStatement("call insert_studio(?,?)");
               stmt.setString(1, name);
               stmt.setString(2,location );
               stmt.execute();
               System.out.println("Stored Procedure  insert studio executed successfully");
        } catch(SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            
        }
      }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confrim_istudio;
    private javax.swing.JButton is_rollback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField st_location;
    private javax.swing.JTextField st_name;
    private javax.swing.JLabel Τοποθεσία;
    // End of variables declaration//GEN-END:variables
}
