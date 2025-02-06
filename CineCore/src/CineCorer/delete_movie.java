
package CineCorer;

import static CineCorer.main_Cine_core.dbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class delete_movie extends javax.swing.JFrame {
     int mvid;
     String mvname;
     String mvgenre;
    
    public delete_movie() {
        initComponents();
        mylist();
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dm_roll_back = new javax.swing.JButton();
        confrim_dm = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        dm_combobox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dm_roll_back.setText("Πίσω");
        dm_roll_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dm_roll_backActionPerformed(evt);
            }
        });

        confrim_dm.setText("Επιβεβαίωση");
        confrim_dm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confrim_dmActionPerformed(evt);
            }
        });

        jLabel1.setText("<html><center><strong>Παρακαλώ επιλέξτε την ταινία που θέλετε να διαγράψετε </html></center></strong>");

        dm_combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dm_comboboxActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Τίτλος", "Είδος"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(dm_roll_back, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confrim_dm))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(63, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20)))
                .addGap(36, 36, 36))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(dm_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dm_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(dm_roll_back)
                        .addGap(32, 32, 32))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(confrim_dm)
                        .addGap(24, 24, 24))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dm_roll_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dm_roll_backActionPerformed
       new delete_data_rows().setVisible(true);
           dispose();
    }//GEN-LAST:event_dm_roll_backActionPerformed

    private void dm_comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dm_comboboxActionPerformed
       viewmv();
    }//GEN-LAST:event_dm_comboboxActionPerformed

    private void confrim_dmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confrim_dmActionPerformed
     try{
         int response;
        
         if (dm_combobox.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(
                    null,
                    "No record selected. Please select a record to delete.",
                    "Delete Error",
                JOptionPane.WARNING_MESSAGE
                );
         }else{
             mvname=(String)dm_combobox.getSelectedItem();
             response = JOptionPane.showConfirmDialog(
                        null,  // Γονικό παράθυρο (μπορεί να είναι null αν δεν έχεις γονικό)
                        "Are you sure you want to delete this record from movie table?",  // Μήνυμα προειδοποίησης
                        "Warning",  // Τίτλος του παραθύρου
                        JOptionPane.YES_NO_OPTION,  // Επιλογές Yes/No
                        JOptionPane.WARNING_MESSAGE  // Τύπος μηνύματος: Warning
                        );
                if(response==JOptionPane.YES_OPTION){
                         delete_mv(mvid);
                        JOptionPane.showMessageDialog(
                        null,  // Γονικό παράθυρο
                        "The record has been deleted successfully",  // Μήνυμα
                        "Table Delete Completed",  // Τίτλος διαλόγου
                        JOptionPane.INFORMATION_MESSAGE  // Είδος μηνύματος
                    );
                        dm_combobox.setSelectedIndex(0);
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
    }//GEN-LAST:event_confrim_dmActionPerformed

  
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new delete_movie().setVisible(true);
            }
        });
    }
    
    void mylist(){
        int i =0;
        String mynames[]=new String [50];
        try{
             dm_combobox.removeAllItems();
             PreparedStatement stmt = dbConnection.prepareStatement("SELECT * from get_movie_names()");
             ResultSet rs =stmt.executeQuery();
             while(rs.next()){
                 mynames[i]=rs.getString("name");
                 i++;
               
             }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error fetching data: "  );
        }
          dm_combobox.addItem("");
        for(int y=0;y<i;y++){
            dm_combobox.addItem(mynames[y]);
        }
      
      }
    
    
    void viewmv(){
        try{ 
             mvname=(String) dm_combobox.getSelectedItem();
             DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
             model.setRowCount(0);
             PreparedStatement stmt = dbConnection.prepareStatement("SELECT * FROM get_a_movie(?)");
             stmt.setString(1, mvname);
             ResultSet rs =stmt.executeQuery();
             while (rs.next()) {
                mvid=rs.getInt("mvid");
                mvname = rs.getString("mvname"); 
                mvgenre = rs.getString("mvgenre");
                model.addRow(new Object[]{mvname , mvgenre});
             }
     } catch (SQLException e) {
         System.out.println("\n -- Numeric Exception on view_mv --- \n");
           
            JOptionPane.showMessageDialog(null, "Error fetching data: "  );
        }
    }
    
     void delete_mv(int id){
        try {    
               PreparedStatement stmt = dbConnection.prepareStatement("Call delete_movie(?)");
               stmt.setInt(1, id);
               stmt.executeUpdate();
               mylist();
               System.out.println("Stored Procedure  delete movie  executed successfully");
        } catch(SQLException ex) {
            System.out.println("\n -- SQL Exception on delete_mv  --- \n");
            
        }
      }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confrim_dm;
    private javax.swing.JComboBox<String> dm_combobox;
    private javax.swing.JButton dm_roll_back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
