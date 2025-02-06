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

/**
 *
 * @author mario
 */
public class insert_cast extends javax.swing.JFrame {

   JFrame insert_cast=new JFrame();
    public insert_cast() {
        initComponents();
        actor_mylist();
        movie_mylist();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ic_roll_back = new javax.swing.JButton();
        confrim_icast = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        mv_combo = new javax.swing.JComboBox<>();
        ac_combo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ic_roll_back.setText("Πίσω");
        ic_roll_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ic_roll_backActionPerformed(evt);
            }
        });

        confrim_icast.setText("Επιβεβαίωση");
        confrim_icast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confrim_icastActionPerformed(evt);
            }
        });

        jLabel1.setText("<html><center><strong> Παρακαλώ επιλέξτε την ταινία και στην συνεχεία καταχωρείστε τους ηθοποιούς.</html></center></strong>");

        mv_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mv_comboActionPerformed(evt);
            }
        });

        ac_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ac_comboActionPerformed(evt);
            }
        });

        jLabel2.setText("Ταινία :");

        jLabel3.setText("Ηθοποιοί :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ic_roll_back, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mv_combo, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ac_combo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(confrim_icast, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(103, 103, 103)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(127, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(mv_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ac_combo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ic_roll_back)
                    .addComponent(confrim_icast))
                .addGap(54, 54, 54))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ic_roll_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ic_roll_backActionPerformed
        new insert_selection().setVisible(true);
        dispose();
    }//GEN-LAST:event_ic_roll_backActionPerformed

    private void mv_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mv_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mv_comboActionPerformed

    private void ac_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ac_comboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ac_comboActionPerformed

    private void confrim_icastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confrim_icastActionPerformed
       try {  
            String mvname = (String) mv_combo.getSelectedItem();
            String acname= (String) ac_combo.getSelectedItem();
            if (mvname.length()<=0 || acname.length()<=0) {
                     JOptionPane.showMessageDialog(
                        insert_cast,
                        "Error:All fields must be filled.",
                        "Input Error",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                        insert_cast(mvname,acname);             
            }    
            
        } catch(NullPointerException e){
            System.out.println("\n -- Null Pointer Exception --- \n");
            JOptionPane.showMessageDialog(
                    insert_cast,
                    "All fields must be filled.",
                    "Input Error",
                JOptionPane.WARNING_MESSAGE
                );
        }
    }//GEN-LAST:event_confrim_icastActionPerformed

 
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new insert_cast().setVisible(true);
            }
        });
    }
    
    
     void actor_mylist(){
        int i =0;
        String mynames[]=new String [50];
        try{
             PreparedStatement stmt = dbConnection.prepareStatement("SELECT * from get_actors_names()");
             ResultSet rs =stmt.executeQuery();
             while(rs.next()){
                 mynames[i]=rs.getString("name");
                 i++;
               
             }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error fetching data: "  );
        }
        ac_combo.addItem("");
        for(int y=0;y<i;y++){
           ac_combo.addItem(mynames[y]);
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
     
     
     void insert_cast(String mv_name,String ac_name){
        try {    
             
               PreparedStatement stmt = dbConnection.prepareStatement("call insert_movie_cast(?,?)");
               stmt.setString(1, mv_name);
               stmt.setString(2,ac_name ); 
               stmt.executeUpdate(); 
               JOptionPane.showMessageDialog(
                        insert_cast,  // Γονικό παράθυρο
                        "The data has been successfully inserted into the CAST table.",  // Μήνυμα
                        "Record Added",  // Τίτλος διαλόγου
                        JOptionPane.INFORMATION_MESSAGE  // Είδος μηνύματος
                        );
               System.out.println("Stored Procedure  insert movie  cast executed successfully");
        } catch(SQLException ex) { 
             JOptionPane.showMessageDialog(
                        insert_cast,  // Γονικό παράθυρο
                        "This record already exists into the CAST table.",  // Μήνυμα
                        "Record  Not Added",  // Τίτλος διαλόγου
                        JOptionPane.WARNING_MESSAGE  // Είδος μηνύματος
                        );
            System.out.println("\n -- SQL Exception --- \n");
            
        }
      }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ac_combo;
    private javax.swing.JButton confrim_icast;
    private javax.swing.JButton ic_roll_back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JComboBox<String> mv_combo;
    // End of variables declaration//GEN-END:variables
}
