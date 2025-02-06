/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CineCorer;

import static CineCorer.main_Cine_core.dbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class insert_syntelestes extends javax.swing.JFrame {
JFrame insert_movie_crew=new JFrame();
   
    public insert_syntelestes() {
        initComponents();
        movie_mylist();
        crew_mylist();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        confrim_isyntelestes = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        mv_combo = new javax.swing.JComboBox<>();
        cr_combo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        is_roll_back = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        confrim_isyntelestes.setText("Επιβεβαίωση");
        confrim_isyntelestes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confrim_isyntelestesActionPerformed(evt);
            }
        });

        jLabel1.setText("<html><center><strong> Παρακαλώ επιλέξτε την ταινία και στην συνεχεία καταχωρείστε τους συντελεστες.</html></center></strong>");

        mv_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mv_comboActionPerformed(evt);
            }
        });

        cr_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cr_comboActionPerformed(evt);
            }
        });

        jLabel2.setText("Ταινία :");

        jLabel3.setText("Συντελεστές :");

        is_roll_back.setText("Πίσω");
        is_roll_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                is_roll_backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(is_roll_back, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mv_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(cr_combo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confrim_isyntelestes, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mv_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cr_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(is_roll_back)
                    .addComponent(confrim_isyntelestes))
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void is_roll_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_is_roll_backActionPerformed
       new insert_selection().setVisible(true);
           dispose();
    }//GEN-LAST:event_is_roll_backActionPerformed

    private void mv_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mv_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mv_comboActionPerformed

    private void cr_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cr_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cr_comboActionPerformed

    private void confrim_isyntelestesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confrim_isyntelestesActionPerformed
      try {  
            String mvname = (String) mv_combo.getSelectedItem();
            String crname= (String) cr_combo.getSelectedItem();
            if (mvname.length()<=0 || crname.length()<=0) {
                     JOptionPane.showMessageDialog(
                        insert_movie_crew,
                        "Error:All fields must be filled.",
                        "Input Error",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                        insert_movie_crew(mvname,crname);             
            }    
            
        } catch(NullPointerException e){
            System.out.println("\n -- Null Pointer Exception --- \n");
            JOptionPane.showMessageDialog(
                    insert_movie_crew,
                    "All fields must be filled.",
                    "Input Error",
                JOptionPane.WARNING_MESSAGE
                );
        }
    }//GEN-LAST:event_confrim_isyntelestesActionPerformed

 
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
            java.util.logging.Logger.getLogger(insert_syntelestes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(insert_syntelestes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(insert_syntelestes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(insert_syntelestes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new insert_syntelestes().setVisible(true);
            }
        });
    }
    void crew_mylist(){
        int i =0;
        String mynames[]=new String [30];
        try{
             PreparedStatement stmt = dbConnection.prepareStatement("SELECT * from get_crew_names()");
             ResultSet rs =stmt.executeQuery();
             while(rs.next()){
                 mynames[i]=rs.getString("name");
                 i++;
               
             }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error fetching data: "  );
        }
         cr_combo.addItem("");
        for(int y=0;y<i;y++){
            cr_combo.addItem(mynames[y]);
        }
      
      }
    
    
    void movie_mylist(){
        int i =0;
        String mynames[]=new String [10];
        try{
             PreparedStatement stmt = dbConnection.prepareStatement("SELECT * from get_movie_names()");
             ResultSet rs =stmt.executeQuery();
             while(rs.next()){
                 mynames[i]=rs.getString("name");
                 i++;
               
             }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error fetching data: "  );
        }
          mv_combo.addItem("");
        for(int y=0;y<i;y++){
            mv_combo.addItem(mynames[y]);
        }
      
      }
    
     
    void insert_movie_crew(String mv_name,String cr_name){
        try {    
               PreparedStatement stmt = dbConnection.prepareStatement("call insert_movie_crew(?,?)");
               stmt.setString(1, mv_name);
               stmt.setString(2,cr_name );
               stmt.executeUpdate();
                JOptionPane.showMessageDialog(
                        insert_movie_crew,  // Γονικό παράθυρο
                        "The data has been successfully inserted into the Creative Team table.",  // Μήνυμα
                        "Record Added",  // Τίτλος διαλόγου
                        JOptionPane.INFORMATION_MESSAGE  // Είδος μηνύματος
                        );
               
               System.out.println("Stored Procedure  insert movie_crew executed successfully");
        } catch(SQLException ex) {
             JOptionPane.showMessageDialog(
                        insert_movie_crew,  // Γονικό παράθυρο
                        "This record already exists into the Cretive Team table.",  // Μήνυμα
                        "Record  Not Added",  // Τίτλος διαλόγου
                        JOptionPane.WARNING_MESSAGE  // Είδος μηνύματος
                        );
            System.out.println("\n -- SQL Exception --- \n");
            
        }
      }
      


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confrim_isyntelestes;
    private javax.swing.JComboBox<String> cr_combo;
    private javax.swing.JButton is_roll_back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> mv_combo;
    // End of variables declaration//GEN-END:variables
}
