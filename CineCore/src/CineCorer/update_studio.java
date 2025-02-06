
package CineCorer;

import static CineCorer.main_Cine_core.dbConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class update_studio extends javax.swing.JFrame {
     int sid;
     String sname;
     String stname;
     String stlocation;
    public update_studio() {
        initComponents();
        mylist();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Τοποθεσία = new javax.swing.JLabel();
        st_name = new javax.swing.JTextField();
        st_location = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        is_rollback = new javax.swing.JButton();
        confrim_istudio = new javax.swing.JButton();
        us_combobox = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("<html><center><strong> Παρακαλώ επιλέξτε Studio</html></center></strong>");

        jLabel2.setText("Όνομα  Studio:");

        Τοποθεσία.setText("Τοποθεσία  :");

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

        is_rollback.setText("Πίσω");
        is_rollback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                is_rollbackActionPerformed(evt);
            }
        });

        confrim_istudio.setText("Ενημέρωση");
        confrim_istudio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confrim_istudioActionPerformed(evt);
            }
        });

        us_combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                us_comboboxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(st_name, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(73, 73, 73)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(st_location, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Τοποθεσία, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(us_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(42, 42, 42)))
                .addGap(29, 29, 29))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(18, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(is_rollback, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(confrim_istudio)
                        .addGap(30, 30, 30))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5)
                .addComponent(us_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(Τοποθεσία))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(st_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(st_location, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(is_rollback)
                    .addComponent(confrim_istudio))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void is_rollbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_is_rollbackActionPerformed
        new update_table().setVisible(true);
            dispose();
    }//GEN-LAST:event_is_rollbackActionPerformed

    private void us_comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_us_comboboxActionPerformed
       viewst();
    }//GEN-LAST:event_us_comboboxActionPerformed

    private void confrim_istudioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confrim_istudioActionPerformed
       try {  
           int response;
           if(st_name.getText().length()<=0 && st_location.getText().length()<=0)
           {JOptionPane.showMessageDialog(
                    null,
                    "Error: You must fill in at least one field to update the record.",
                    "Update Error",
                JOptionPane.WARNING_MESSAGE
                );
           }
           else{
               if(st_location.getText().length()>0){
                  stlocation= st_location.getText();
               }
               if(st_name.getText().length()>0){
                  stname=st_name.getText();
               }
              response = JOptionPane.showConfirmDialog(
                        null,  // Γονικό παράθυρο (μπορεί να είναι null αν δεν έχεις γονικό)
                        "Are you sure you want to update Studio table?",  // Μήνυμα προειδοποίησης
                        "Warning",  // Τίτλος του παραθύρου
                        JOptionPane.YES_NO_OPTION,  // Επιλογές Yes/No
                        JOptionPane.WARNING_MESSAGE  // Τύπος μηνύματος: Warning
                        );
                if(response==JOptionPane.YES_OPTION){
                         update_st(sid,stname,stlocation);
                        JOptionPane.showMessageDialog(
                        null,  // Γονικό παράθυρο
                        "The Studio has been update successfully",  // Μήνυμα
                        "Table Updated Completed",  // Τίτλος διαλόγου
                        JOptionPane.INFORMATION_MESSAGE  // Είδος μηνύματος
                    );
                        st_name.setText("");
                        st_location.setText("");
                 } 
           }
        }  catch(NullPointerException e){
            System.out.println("\n -- Null Pointer Exception --- \n");
            JOptionPane.showMessageDialog(
                    null,
                    "All fields must be filled.",
                    "Input Error",
                JOptionPane.WARNING_MESSAGE
                );
        }
    }//GEN-LAST:event_confrim_istudioActionPerformed

   
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new update_studio().setVisible(true);
            }
        });
    }

    
    
     void mylist(){
        int i =0;
        String mynames[]=new String [50];
        try{
             us_combobox.removeAllItems();
             PreparedStatement stmt = dbConnection.prepareStatement("SELECT * from get_studio_names()");
             ResultSet rs =stmt.executeQuery();
             while(rs.next()){
                 mynames[i]=rs.getString("name");
                 i++;
               
             }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "Error fetching data: "  );
        }
          us_combobox.addItem("");
        for(int y=0;y<i;y++){
            us_combobox.addItem(mynames[y]);
        }
      
      }
     
     
      void viewst(){
        try{ 
             stname=(String) us_combobox.getSelectedItem();
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
      
      
      void update_st(int id,String name,String location){
        try {    
               PreparedStatement stmt = dbConnection.prepareStatement("Call update_studio(?,?,?)");
               stmt.setInt(1, id);
               stmt.setString(2, name);
               stmt.setString(3, location);
               stmt.executeUpdate();
               mylist();
               System.out.println("Stored Procedure  update studio  executed successfully");
        } catch(SQLException ex) {
            System.out.println("\n -- SQL Exception on update_st  --- \n");
            
        }
      }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confrim_istudio;
    private javax.swing.JButton is_rollback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField st_location;
    private javax.swing.JTextField st_name;
    private javax.swing.JComboBox<String> us_combobox;
    private javax.swing.JLabel Τοποθεσία;
    // End of variables declaration//GEN-END:variables
}
