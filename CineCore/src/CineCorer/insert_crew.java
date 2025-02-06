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

/**
 *
 * @author mario
 */
public class insert_crew extends javax.swing.JFrame {

    JFrame insert_crew=new JFrame();
    String role;
    public insert_crew() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        ic_roll_back = new javax.swing.JButton();
        confrim_icrew = new javax.swing.JButton();
        cr_name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        age = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cr_age = new javax.swing.JTextField();
        cr_role = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("<html><center><strong> Παρακαλώ εισάγεται τα στοιχεία του ατόμου της δημιουργικής ομάδας</html></center></strong>");

        ic_roll_back.setText("Πίσω");
        ic_roll_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ic_roll_backActionPerformed(evt);
            }
        });

        confrim_icrew.setText("Επιβεβαίωση");
        confrim_icrew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confrim_icrewActionPerformed(evt);
            }
        });

        cr_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cr_nameActionPerformed(evt);
            }
        });

        jLabel2.setText("Ονοματεπώνυμο :");

        age.setText("Ηλικία :");

        jLabel3.setText("Ρόλος :");

        cr_age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cr_ageActionPerformed(evt);
            }
        });

        cr_role.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Διευθυντής Πραγωγής", "Σεναριογράφος", "Σκηνοθέτης", " " }));
        cr_role.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cr_roleActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cr_name, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cr_age, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(36, 36, 36))
                                    .addComponent(cr_role, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ic_roll_back, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(confrim_icrew, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(age)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cr_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cr_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cr_role, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ic_roll_back)
                    .addComponent(confrim_icrew))
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ic_roll_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ic_roll_backActionPerformed
        new insert_selection().setVisible(true);
            dispose();
    }//GEN-LAST:event_ic_roll_backActionPerformed

    private void cr_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cr_nameActionPerformed
      
    }//GEN-LAST:event_cr_nameActionPerformed

    private void confrim_icrewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confrim_icrewActionPerformed
       try {  
            String crname = cr_name.getText();
            role = (String) cr_role.getSelectedItem();
            int crage = Integer.parseInt(cr_age.getText());
            if (crage>=18 && crage<=100) {
                if (crname.length()<=0) {
                     JOptionPane.showMessageDialog(
                        insert_crew,
                        "Error: Both name and age  must be provided.",
                        "Input Error",
                        JOptionPane.ERROR_MESSAGE);
                } else {
                        insert_cr(crname,crage,role);
                        JOptionPane.showMessageDialog(
                        insert_crew,  // Γονικό παράθυρο
                        "The data has been successfully inserted into the Creative team table.",  // Μήνυμα
                        "Record Added",  // Τίτλος διαλόγου
                        JOptionPane.INFORMATION_MESSAGE  // Είδος μηνύματος
                        );
                        cr_name.setText("");
                        cr_age.setText("");
                }    
            } else {
               JOptionPane.showMessageDialog(
                    insert_crew,
                    "Age must be within the range of 18 to 100.",
                    "Invalid Age",
                JOptionPane.WARNING_MESSAGE
                );
            }   
        } catch(NumberFormatException e){
            System.out.println("\n -- Numeric Exception --- \n");
            JOptionPane.showMessageDialog(
                    insert_crew,
                    "Age must be a valid number.",
                    "Invalid Age",
                JOptionPane.WARNING_MESSAGE
                );
        }
    }//GEN-LAST:event_confrim_icrewActionPerformed

    private void cr_roleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cr_roleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cr_roleActionPerformed

    private void cr_ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cr_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cr_ageActionPerformed

    
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
            java.util.logging.Logger.getLogger(insert_crew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(insert_crew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(insert_crew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(insert_crew.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new insert_crew().setVisible(true);
            }
        });
    }
    
    
    void insert_cr(String name,int age,String role){
        try {    
               PreparedStatement stmt = dbConnection.prepareStatement("call insert_crew(?,?,?)");
               stmt.setString(1, name);
               stmt.setInt(2, age);
               stmt.setString(3,role );
               stmt.execute();
               System.out.println("Stored Procedure  insert  crew executed successfully");
        } catch(SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            
        }
      }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel age;
    private javax.swing.JButton confrim_icrew;
    private javax.swing.JTextField cr_age;
    private javax.swing.JTextField cr_name;
    private javax.swing.JComboBox<String> cr_role;
    private javax.swing.JButton ic_roll_back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
