
package CineCorer;

import static CineCorer.main_Cine_core.dbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class delete_actor extends javax.swing.JFrame {
     int aid;
     String actorname;
     String actorgender;
     int    actorage;
    public delete_actor() {
        initComponents();
        mylist();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        da_roll_back = new javax.swing.JButton();
        confrim_da = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        da_combobox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        da_roll_back.setText("Πίσω");
        da_roll_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                da_roll_backActionPerformed(evt);
            }
        });

        confrim_da.setText("Επιβεβαίωση");
        confrim_da.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confrim_daActionPerformed(evt);
            }
        });

        jLabel1.setText("<html><center><strong>Παρακαλώ επιλέξτε τον/την ηθοποιό που θέλετε να διαγράψετε </html></center></strong>");

        da_combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                da_comboboxActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Gender", "Age"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

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
                .addGap(97, 97, 97)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(da_combobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(da_roll_back, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                        .addComponent(confrim_da)))
                .addGap(82, 82, 82))
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addComponent(da_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(da_roll_back)
                    .addComponent(confrim_da))
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void da_roll_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_da_roll_backActionPerformed
       new delete_data_rows().setVisible(true);
           dispose();
    }//GEN-LAST:event_da_roll_backActionPerformed

    private void da_comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_da_comboboxActionPerformed
    viewac();
    }//GEN-LAST:event_da_comboboxActionPerformed

    private void confrim_daActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confrim_daActionPerformed
        try{
         int response;
        
         if (da_combobox.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(
                    null,
                    "No record selected. Please select a record to delete.",
                    "Delete Error",
                JOptionPane.WARNING_MESSAGE
                );
         }else{
             actorname=(String)da_combobox.getSelectedItem();
             response = JOptionPane.showConfirmDialog(
                        null,  // Γονικό παράθυρο (μπορεί να είναι null αν δεν έχεις γονικό)
                        "Are you sure you want to delete this record from actor table?",  // Μήνυμα προειδοποίησης
                        "Warning",  // Τίτλος του παραθύρου
                        JOptionPane.YES_NO_OPTION,  // Επιλογές Yes/No
                        JOptionPane.WARNING_MESSAGE  // Τύπος μηνύματος: Warning
                        );
                if(response==JOptionPane.YES_OPTION){
                         delete_ac(aid);
                        JOptionPane.showMessageDialog(
                        null,  // Γονικό παράθυρο
                        "The record has been deleted successfully",  // Μήνυμα
                        "Table Delete Completed",  // Τίτλος διαλόγου
                        JOptionPane.INFORMATION_MESSAGE  // Είδος μηνύματος
                    );
                        da_combobox.setSelectedIndex(0);
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
    }//GEN-LAST:event_confrim_daActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new delete_actor().setVisible(true);
            }
        });
    }
    
    void mylist(){
        int i =0;
        String mynames[]=new String [50];
        try{
             da_combobox.removeAllItems();
             PreparedStatement stmt = dbConnection.prepareStatement("SELECT * from get_actors_names()");
             ResultSet rs =stmt.executeQuery();
             while(rs.next()){
                 mynames[i]=rs.getString("name");
                 i++;
               
             }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error fetching data: "  );
        }
        da_combobox.addItem("");
        for(int y=0;y<i;y++){
           da_combobox.addItem(mynames[y]);
        }
      
      }
    
    
    void viewac(){
        try{ 
             actorname=(String) da_combobox.getSelectedItem();
             DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
             model.setRowCount(0);
             PreparedStatement stmt = dbConnection.prepareStatement("SELECT * FROM get_an_actor(?)");
             stmt.setString(1, actorname);
             ResultSet rs =stmt.executeQuery();
             while (rs.next()) {
                aid=rs.getInt("acid");
                actorname = rs.getString("actname"); 
                actorgender = rs.getString("agender");
                actorage=rs.getInt("aage");
                model.addRow(new Object[]{actorname,actorgender,actorage});
             }
     } catch (SQLException e) {
         System.out.println("\n -- Numeric Exception on view_ac --- \n");
           
            JOptionPane.showMessageDialog(null, "Error fetching data: "  );
        }
    }
     
    
     void delete_ac(int id){
        try {    
               PreparedStatement stmt = dbConnection.prepareStatement("Call delete_actor(?)");
               stmt.setInt(1, id);
               stmt.executeUpdate();
               mylist();
               System.out.println("Stored Procedure  insert  actor executed successfully");
        } catch(SQLException ex) {
            System.out.println("\n -- SQL Exception on update_ac --- \n");
            
        }
      }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confrim_da;
    private javax.swing.JComboBox<String> da_combobox;
    private javax.swing.JButton da_roll_back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
