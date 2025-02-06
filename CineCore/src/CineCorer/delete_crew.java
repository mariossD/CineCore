
package CineCorer;
 
import static CineCorer.main_Cine_core.dbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class delete_crew extends javax.swing.JFrame {
     int cid;
     String crewname;
     String crewrole;
     int    crewage;
    public delete_crew() {
        initComponents();
        mylist();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dc_combobox = new javax.swing.JComboBox<>();
        dc_roll_back = new javax.swing.JButton();
        confrim_dc = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dc_combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dc_comboboxActionPerformed(evt);
            }
        });

        dc_roll_back.setText("Πίσω");
        dc_roll_back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dc_roll_backActionPerformed(evt);
            }
        });

        confrim_dc.setText("Επιβεβαίωση");
        confrim_dc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confrim_dcActionPerformed(evt);
            }
        });

        jLabel1.setText("<html><center><strong>Παρακαλώ επιλέξτε τo ονομα του ατόμου απο την δημιουργίκη ομάδα που θέλετε να διαγράψετε </html></center></strong>");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ονοματεπώνυμο", "Ρόλος", "Ηλικία"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false
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
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(dc_roll_back, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confrim_dc))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 8, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dc_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)))))
                .addGap(30, 30, 30))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(dc_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dc_roll_back)
                    .addComponent(confrim_dc))
                .addGap(52, 52, 52))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void dc_roll_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dc_roll_backActionPerformed
        new delete_data_rows().setVisible(true);
            dispose();
    }//GEN-LAST:event_dc_roll_backActionPerformed

    private void dc_comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dc_comboboxActionPerformed
      viewcr();
    }//GEN-LAST:event_dc_comboboxActionPerformed

    private void confrim_dcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confrim_dcActionPerformed
         try{
         int response;
        
         if (dc_combobox.getSelectedIndex()==0){
            JOptionPane.showMessageDialog(
                    null,
                    "No record selected. Please select a record to delete.",
                    "Delete Error",
                JOptionPane.WARNING_MESSAGE
                );
         }else{
             crewname=(String)dc_combobox.getSelectedItem();
             response = JOptionPane.showConfirmDialog(
                        null,  // Γονικό παράθυρο (μπορεί να είναι null αν δεν έχεις γονικό)
                        "Are you sure you want to delete this record from Creative team table?",  // Μήνυμα προειδοποίησης
                        "Warning",  // Τίτλος του παραθύρου
                        JOptionPane.YES_NO_OPTION,  // Επιλογές Yes/No
                        JOptionPane.WARNING_MESSAGE  // Τύπος μηνύματος: Warning
                        );
                if(response==JOptionPane.YES_OPTION){
                         delete_cr(cid);
                        JOptionPane.showMessageDialog(
                        null,  // Γονικό παράθυρο
                        "The record has been deleted successfully",  // Μήνυμα
                        "Table Delete Completed",  // Τίτλος διαλόγου
                        JOptionPane.INFORMATION_MESSAGE  // Είδος μηνύματος
                    );
                        dc_combobox.setSelectedIndex(0);
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
    }//GEN-LAST:event_confrim_dcActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new delete_crew().setVisible(true);
            }
        });
    }

    void mylist(){
        int i =0;
        String mynames[]=new String [50];
        try{
             dc_combobox.removeAllItems();
             PreparedStatement stmt = dbConnection.prepareStatement("SELECT * from get_crew_names()");
             ResultSet rs =stmt.executeQuery();
             while(rs.next()){
                 mynames[i]=rs.getString("name");
                 i++;
               
             }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error fetching data: "  );
        }
         dc_combobox.addItem("");
        for(int y=0;y<i;y++){
            dc_combobox.addItem(mynames[y]);
        }
      
      }
    
    
     void viewcr(){
        try{ 
             crewname=(String) dc_combobox.getSelectedItem();
             DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
             model.setRowCount(0);
             PreparedStatement stmt = dbConnection.prepareStatement("SELECT * FROM get_a_crew(?)");
             stmt.setString(1, crewname);
             ResultSet rs =stmt.executeQuery();
             while (rs.next()) {
                cid=rs.getInt("crid");
                crewname = rs.getString("crname"); 
                crewrole = rs.getString("crrole");
                crewage=rs.getInt("crage");
                model.addRow(new Object[]{crewname,crewrole , crewage});
             }
     } catch (SQLException e) {
         System.out.println("\n -- Numeric Exception on view_cr --- \n");
           
            JOptionPane.showMessageDialog(null, "Error fetching data: "  );
        }
    }
     
     
    void delete_cr(int id){
        try {    
               PreparedStatement stmt = dbConnection.prepareStatement("Call delete_crew(?)");
               stmt.setInt(1, id);
               stmt.executeUpdate();
               mylist();
               System.out.println("Stored Procedure  update crew successfully");
        } catch(SQLException ex) {
            System.out.println("\n -- SQL Exception on update_cr --- \n");
            
        }
      }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confrim_dc;
    private javax.swing.JComboBox<String> dc_combobox;
    private javax.swing.JButton dc_roll_back;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
