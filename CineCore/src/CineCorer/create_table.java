/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CineCorer;


import static CineCorer.main_Cine_core.dbConnection;
import java.sql.*; 
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class create_table extends javax.swing.JFrame {
    int index;
    JFrame create_table=new JFrame();
    
    public create_table() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cr_roll_back = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("<html><strong>Επιλέξτε τον/τους πίνκακες που θέλετε<br><center> να δημιουργήσετε</center></strong></html>");

        cr_roll_back.setText("Πίσω");
        cr_roll_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cr_roll_backActionPerformed(evt);
            }
        });

        jButton2.setText("Επιβεβαίωση");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Δημιουργία Πίνακα Ηθοποιοί.", "Δημιουργία Πίνακα Ταινίες.", "Δημιουργία Πίνακα Studio.", "Δημιουργία Πίνακα Δημιουργική Ομάδα.", "Δημιουργία Όλων." }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cr_roll_back, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButton2))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cr_roll_back)
                    .addComponent(jButton2))
                .addGap(50, 50, 50))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cr_roll_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cr_roll_backActionPerformed
                new table_action().setVisible(true);
                dispose();
                  
    }//GEN-LAST:event_cr_roll_backActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       index=jComboBox1.getSelectedIndex();
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        switch(index){
            case 0:
                 createAc();
                 JOptionPane.showMessageDialog(
                        create_table,  // Γονικό παράθυρο
                        "The table ACTOR has been created successfully",  // Μήνυμα
                        "Table Creation Completed",  // Τίτλος διαλόγου
                        JOptionPane.INFORMATION_MESSAGE  // Είδος μηνύματος
                    );
                break;
            case 1:
                createMv();
                JOptionPane.showMessageDialog(
                        create_table,  // Γονικό παράθυρο
                        "The table MOVIE has been created successfully",  // Μήνυμα
                        "Table Creation Completed",  // Τίτλος διαλόγου
                        JOptionPane.INFORMATION_MESSAGE  // Είδος μηνύματος
                 );
                break;
            case 2:
                createSt();
                JOptionPane.showMessageDialog(
                        create_table,  // Γονικό παράθυρο
                        "The table STUDIO has been created successfully",  // Μήνυμα
                        "Table Creation Completed",  // Τίτλος διαλόγου
                        JOptionPane.INFORMATION_MESSAGE  // Είδος μηνύματος
                );        
                break;
            case 3:
                createCr();
                JOptionPane.showMessageDialog(
                        create_table,  // Γονικό παράθυρο
                        "The table CREATIVE TEAM has been created successfully",  // Μήνυμα
                        "Table Creation Completed",  // Τίτλος διαλόγου
                        JOptionPane.INFORMATION_MESSAGE  // Είδος μηνύματος
                    );
                break;
            case 4:
                createAc();
                createMv();
                createSt();
                createCr();
                JOptionPane.showMessageDialog(
                        create_table,  // Γονικό παράθυρο
                        "All tables has been created successfully",  // Μήνυμα
                        "Table Creation Completed",  // Τίτλος διαλόγου
                        JOptionPane.INFORMATION_MESSAGE  // Είδος μηνύματος
                    );
                
            }
    }//GEN-LAST:event_jButton2ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new create_table().setVisible(true);
            }
        });
    }
     void createAc(){
        try {    
               PreparedStatement stmt = dbConnection.prepareStatement("call create_actor()");
               stmt.execute();
               System.out.println("Stored Procedure create actor executed successfully");
        } catch(SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            
        }
      }
     
     void createSt(){
        try {    
               PreparedStatement stmt = dbConnection.prepareStatement("call create_studio()");
               stmt.execute();
               System.out.println("Stored Procedure  create studio executed successfully");
        } catch(SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            
        }
      }
     
      void createCr(){
        try {    
               PreparedStatement stmt = dbConnection.prepareStatement("call create_crew()");
               stmt.execute();
               System.out.println("Stored Procedure  create crew executed successfully");
        } catch(SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            
        }
      }
      
       void createMv(){
        try {    
               PreparedStatement stmt = dbConnection.prepareStatement("call create_movie()");
               stmt.execute();
               System.out.println("Stored Procedure  create movie executed successfully");
        } catch(SQLException ex) {
            System.out.println("\n -- SQL Exception --- \n");
            
        }
      }
       
       
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cr_roll_back;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
