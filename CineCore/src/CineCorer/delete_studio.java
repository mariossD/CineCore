/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package CineCorer;

import static CineCorer.main_Cine_core.dbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class delete_studio extends javax.swing.JFrame {
     int sid;
     String stname;
     String stlocation;
    public delete_studio() {
        initComponents();
        mylist();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ds_combobox = new javax.swing.JComboBox<>();
        ds_roll_back = new javax.swing.JButton();
        confrim_ds = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ds_combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ds_comboboxActionPerformed(evt);
            }
        });

        ds_roll_back.setText("Πίσω");
        ds_roll_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ds_roll_backActionPerformed(evt);
            }
        });

        confrim_ds.setText("Επιβεβαίωση");
        confrim_ds.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confrim_dsActionPerformed(evt);
            }
        });

        jLabel1.setText("<html><center><strong>Παρακαλώ επιλέξτε τo studio που θέλετε να διαγράψετε </html></center></strong>");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Studio", "Location"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(ds_roll_back, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confrim_ds)
                .addGap(42, 42, 42))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 12, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(75, 75, 75))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ds_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(43, 43, 43))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ds_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ds_roll_back)
                    .addComponent(confrim_ds))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ds_roll_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ds_roll_backActionPerformed
       new delete_data_rows().setVisible(true);
           dispose();
    }//GEN-LAST:event_ds_roll_backActionPerformed

    private void ds_comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ds_comboboxActionPerformed
      viewst();
    }//GEN-LAST:event_ds_comboboxActionPerformed

    private void confrim_dsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confrim_dsActionPerformed
        try{
         int response;
        
         if (ds_combobox.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(
                    null,
                    "No record selected. Please select a record to delete.",
                    "Delete Error",
                JOptionPane.WARNING_MESSAGE
                );
         }else{
             stname=(String)ds_combobox.getSelectedItem();
             response = JOptionPane.showConfirmDialog(
                        null,  // Γονικό παράθυρο (μπορεί να είναι null αν δεν έχεις γονικό)
                        "Are you sure you want to delete this record from studio table?",  // Μήνυμα προειδοποίησης
                        "Warning",  // Τίτλος του παραθύρου
                        JOptionPane.YES_NO_OPTION,  // Επιλογές Yes/No
                        JOptionPane.WARNING_MESSAGE  // Τύπος μηνύματος: Warning
                        );
                if(response==JOptionPane.YES_OPTION){
                         delete_st(sid);
                        JOptionPane.showMessageDialog(
                        null,  // Γονικό παράθυρο
                        "The record has been deleted successfully",  // Μήνυμα
                        "Table Delete Completed",  // Τίτλος διαλόγου
                        JOptionPane.INFORMATION_MESSAGE  // Είδος μηνύματος
                    );
                        ds_combobox.setSelectedIndex(0);
         }
     
         }
     }
     catch(NullPointerException e){
            System.out.println("\n -- Null Pointer Exception --- \n");
            JOptionPane.showMessageDialog(
                    null,
                    "All fields must be filled.",
                    "Input Error",
                JOptionPane.WARNING_MESSAGE
                );
        }
    }//GEN-LAST:event_confrim_dsActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new delete_studio().setVisible(true);
            }
        });
    }
    
    void mylist(){
        int i =0;
        String mynames[]=new String [50];
        try{
             ds_combobox.removeAllItems();
             PreparedStatement stmt = dbConnection.prepareStatement("SELECT * from get_studio_names()");
             ResultSet rs =stmt.executeQuery();
             while(rs.next()){
                 mynames[i]=rs.getString("name");
                 i++;
               
             }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error fetching data: "  );
        }
          ds_combobox.addItem("");
        for(int y=0;y<i;y++){
            ds_combobox.addItem(mynames[y]);
        }
      
      }
    
    
      void viewst(){
        try{ 
             stname=(String) ds_combobox.getSelectedItem();
             DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
             model.setRowCount(0);
             PreparedStatement stmt = dbConnection.prepareStatement("SELECT * FROM get_a_studio(?)");
             stmt.setString(1, stname);
             ResultSet rs =stmt.executeQuery();
             while (rs.next()) {
                sid=rs.getInt("stid");
                stname = rs.getString("stname"); 
                stlocation = rs.getString("stlocation");
                model.addRow(new Object[]{stname , stlocation});
             }
     } catch (SQLException e) {
         System.out.println("\n -- Numeric Exception on view_cr --- \n");
           
            JOptionPane.showMessageDialog(null, "Error fetching data: "  );
        }
    }
      
       void delete_st(int id){
        try {    
               PreparedStatement stmt = dbConnection.prepareStatement("Call delete_studio(?)");
               stmt.setInt(1, id);
               stmt.executeUpdate();
               mylist();
               System.out.println("Stored Procedure  update studio  executed successfully");
        } catch(SQLException ex) {
            System.out.println("\n -- SQL Exception on update_st  --- \n");
            
        }
      }
     

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confrim_ds;
    private javax.swing.JComboBox<String> ds_combobox;
    private javax.swing.JButton ds_roll_back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
