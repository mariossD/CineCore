/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CineCorer;

import static CineCorer.main_Cine_core.dbConnection;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class delete_table extends javax.swing.JFrame {
     int index;
     int response;
     JFrame delete_table=new JFrame();
   
    public delete_table() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        dl_roll_back = new javax.swing.JButton();
        dl_confrim = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("<html><strong><center> Επιλέξτε τον/τους πίνκακες που θέλετε να διαγράψετε.</center></strong></html");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Διαγραφή Πίνακα Ηθοποιοί.", "Διαγραφή Πίνακα Ταινίες.", "Διαγραφή Πίνακα Studio.", "ΔιαγραφήΠίνακα Δημιουργική Ομάδα.", "Διαγραφή Όλων." }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        dl_roll_back.setText("Πίσω");
        dl_roll_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dl_roll_backActionPerformed(evt);
            }
        });

        dl_confrim.setText("Επιβεβαίωση");
        dl_confrim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dl_confrimActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dl_roll_back, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dl_confrim, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dl_roll_back)
                    .addComponent(dl_confrim))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
          index=jComboBox1.getSelectedIndex();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void dl_roll_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dl_roll_backActionPerformed
       new table_action().setVisible(true);
           dispose();
    }//GEN-LAST:event_dl_roll_backActionPerformed

    private void dl_confrimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dl_confrimActionPerformed
        switch(index){
            case 0:
                response = JOptionPane.showConfirmDialog(
                        delete_table,  // Γονικό παράθυρο (μπορεί να είναι null αν δεν έχεις γονικό)
                        "Are you sure you want to delete the ACTOR table?",  // Μήνυμα προειδοποίησης
                        "Warning",  // Τίτλος του παραθύρου
                        JOptionPane.YES_NO_OPTION,  // Επιλογές Yes/No
                        JOptionPane.WARNING_MESSAGE  // Τύπος μηνύματος: Warning
                        );
                if(response==JOptionPane.YES_OPTION){
                         deleteAc();
                        JOptionPane.showMessageDialog(
                        delete_table,  // Γονικό παράθυρο
                        "The ACTOR has been deleted successfully",  // Μήνυμα
                        "Table Deletion Completed",  // Τίτλος διαλόγου
                        JOptionPane.INFORMATION_MESSAGE  // Είδος μηνύματος
                    );
                }
                break;
            case 1 :
                 response = JOptionPane.showConfirmDialog(
                        delete_table,  // Γονικό παράθυρο (μπορεί να είναι null αν δεν έχεις γονικό)
                        "Are you sure you want to delete the MOVIES table?",  // Μήνυμα προειδοποίησης
                        "Warning",  // Τίτλος του παραθύρου
                        JOptionPane.YES_NO_OPTION,  // Επιλογές Yes/No
                        JOptionPane.WARNING_MESSAGE  // Τύπος μηνύματος: Warning
                        );
                if(response==JOptionPane.YES_OPTION){
                        deleteMv();
                        JOptionPane.showMessageDialog(
                        delete_table,  // Γονικό παράθυρο
                        "The table MOVIES has been deleted successfully",  // Μήνυμα
                        "Table Deletion Completed",  // Τίτλος διαλόγου
                        JOptionPane.INFORMATION_MESSAGE  // Είδος μηνύματος
                    );
                }
                break;
            case 2:
                response = JOptionPane.showConfirmDialog(
                        delete_table,  // Γονικό παράθυρο (μπορεί να είναι null αν δεν έχεις γονικό)
                        "Are you sure you want to delete the STUDIO table?",  // Μήνυμα προειδοποίησης
                        "Warning",  // Τίτλος του παραθύρου
                        JOptionPane.YES_NO_OPTION,  // Επιλογές Yes/No
                        JOptionPane.WARNING_MESSAGE  // Τύπος μηνύματος: Warning
                        );
                if(response==JOptionPane.YES_OPTION){
                        deleteSt();
                        JOptionPane.showMessageDialog(
                        delete_table,  // Γονικό παράθυρο
                        "The table STUDIO has been deleted successfully",  // Μήνυμα
                        "Table Deletion Completed",  // Τίτλος διαλόγου
                        JOptionPane.INFORMATION_MESSAGE  // Είδος μηνύματος
                    );
                }
                break;
            case 3:
                response = JOptionPane.showConfirmDialog(
                        delete_table,  // Γονικό παράθυρο (μπορεί να είναι null αν δεν έχεις γονικό)
                        "Are you sure you want to delete the Creative Team table?",  // Μήνυμα προειδοποίησης
                        "Warning",  // Τίτλος του παραθύρου
                        JOptionPane.YES_NO_OPTION,  // Επιλογές Yes/No
                        JOptionPane.WARNING_MESSAGE  // Τύπος μηνύματος: Warning
                        );
                if(response==JOptionPane.YES_OPTION){
                        deleteCr();
                        JOptionPane.showMessageDialog(
                        delete_table,  // Γονικό παράθυρο
                        "The table Creative Team has been deleted successfully",  // Μήνυμα
                        "Table Deletion Completed",  // Τίτλος διαλόγου
                        JOptionPane.INFORMATION_MESSAGE  // Είδος μηνύματος
                    );
                }
                break;
            case 4:
                response = JOptionPane.showConfirmDialog(
                        delete_table,  // Γονικό παράθυρο (μπορεί να είναι null αν δεν έχεις γονικό)
                        "Are you sure you want to delete all tables?",  // Μήνυμα προειδοποίησης
                        "Warning",  // Τίτλος του παραθύρου
                        JOptionPane.YES_NO_OPTION,  // Επιλογές Yes/No
                        JOptionPane.WARNING_MESSAGE  // Τύπος μηνύματος: Warning
                        );
                if(response==JOptionPane.YES_OPTION){
                        deleteAc();
                        deleteMv();
                        deleteSt();
                        deleteCr();
                        JOptionPane.showMessageDialog(
                        delete_table,  // Γονικό παράθυρο
                        "All tables has been deleted successfully",  // Μήνυμα
                        "Table Deletion Completed",  // Τίτλος διαλόγου
                        JOptionPane.INFORMATION_MESSAGE  // Είδος μηνύματος
                    );
                }
                break;
            }
    }//GEN-LAST:event_dl_confrimActionPerformed


    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new delete_table().setVisible(true);
            }
        });
    }
    
    void deleteCr(){
        try {    
               PreparedStatement stmt = dbConnection.prepareStatement("call drop_crew()");
               stmt.execute();
               System.out.println("Stored Procedure  drop crew executed successfully");
        } catch(SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            
        }
      }
    
    void deleteMv(){
        try {    
               PreparedStatement stmt = dbConnection.prepareStatement("call drop_movie()");
               stmt.execute();
               System.out.println("Stored Procedure  drop movie executed successfully");
        } catch(SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            
        }
      }
    
    void deleteAc(){
        try {    
               PreparedStatement stmt = dbConnection.prepareStatement("call drop_actor()");
               stmt.execute();
               System.out.println("Stored Procedure  drop actor executed successfully");
        } catch(SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            
        }
      }
    
    void deleteSt(){
        try {    
               PreparedStatement stmt = dbConnection.prepareStatement("call drop_studio()");
               stmt.execute();
               System.out.println("Stored Procedure  drop studio executed successfully");
        } catch(SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            
        }
      }
    
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dl_confrim;
    private javax.swing.JButton dl_roll_back;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
